/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：mybatis sql执行拦截器，主要做分页操作
 * 文件名称：PagePlugin.java
 * 修改时间：2016-3-7
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.page;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.ExecutorException;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.MappedStatement.Builder;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.scripting.defaults.DefaultParameterHandler;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.LoggerFactory;

import com.hzw.du.model.mapper.BaseBean;

import ch.qos.logback.classic.Logger;

/**
 * 
 * mybatis sql执行拦截器，主要做分页操作
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
@Intercepts({ @Signature(type = Executor.class, method = "query", args = { MappedStatement.class,
        Object.class, RowBounds.class, ResultHandler.class }) })
public class PagePlugin implements Interceptor {

    protected Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

    /**
     * 匹配用户自定义的查询SQL的ID，支持正则表达式进行匹配
     * 备注：对应的在mybatis-config.xml文件中配置的pageSqlId的属性值
     */
    private String pageSqlId = ".*ByPage.*";
    
    public Object intercept(Invocation invocation) throws Throwable {
        //当前环境 MappedStatement，BoundSql，及sql取得  
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        Object parameter = invocation.getArgs()[1];
        BoundSql boundSql = mappedStatement.getBoundSql(parameter);

        String originalSql = boundSql.getSql();
        Object parameterObject = boundSql.getParameterObject();

        if (mappedStatement.getId().matches(pageSqlId)) {
            Object params = boundSql.getParameterObject();
            if (params == null) {
                return invocation.proceed();
            }
            BaseBean baseParamBean = null;
            if (params instanceof BaseBean) {
                baseParamBean = (BaseBean) params;
            }

            //Page对象获取，“信使”到达拦截器！  
            MybatisPager page = baseParamBean.getPager();
            if (page != null) {
                //Page对象存在的场合，开始分页处理 
                if( page.isQueryTotalRowsFlag()){
                    int count = 0;
                    Connection connection = null;
                    PreparedStatement countStmt = null;
                    ResultSet rs = null;
                    try {
                        String countSql = getCountSql(originalSql);
                        connection = mappedStatement.getConfiguration().getEnvironment().getDataSource()
                                .getConnection();
                        countStmt = connection.prepareStatement(countSql);
                        BoundSql countBS = copyFromBoundSql(mappedStatement, boundSql, countSql);
                        DefaultParameterHandler parameterHandler = new DefaultParameterHandler(
                                mappedStatement, parameterObject, countBS);
                        parameterHandler.setParameters(countStmt);
                        rs = countStmt.executeQuery();
                        if (rs.next()) {
                            count = rs.getInt(1);
                        }
                    }
                    catch (Exception e) {
                        log.error("查询分页总记录数失败", e);
                        throw new ExecutorException("查询分页总记录数失败，sql=[" + originalSql + "]");
                    }
                    finally {
                        if (rs != null) {
                            rs.close();
                        }
                        if (countStmt != null) {
                            countStmt.close();
                        }
                        if (connection != null) {
                            connection.close();
                        }
                    }

                    //每页条数
                    int pageSize = page.getPageSize();
                    if (pageSize <= 0) {
                        pageSize = 10;
                    }
                    // 设置总条数
                    page.setTotalRows(count);
                    // 设置总页数
                    page.setTotalPages( (count + pageSize -1)/pageSize );
                }
                
                //对原始Sql追加limit  
                String pageSql = generatePageSql(originalSql, page);
                BoundSql newBoundSql = copyFromBoundSql(mappedStatement, boundSql, pageSql);
                MappedStatement newMs = copyFromMappedStatement(mappedStatement, new BoundSqlSqlSource(newBoundSql));
                invocation.getArgs()[0] = newMs;
            }
        }
        return invocation.proceed();

    }

    /** 
     * 复制MappedStatement对象 
     */
    private MappedStatement copyFromMappedStatement(MappedStatement ms, SqlSource newSqlSource) {
        Builder builder = new Builder(ms.getConfiguration(), ms.getId(), newSqlSource,
                ms.getSqlCommandType());

        builder.resource(ms.getResource());
        builder.fetchSize(ms.getFetchSize());
        builder.statementType(ms.getStatementType());
        builder.keyGenerator(ms.getKeyGenerator());
        String[] s = ms.getKeyProperties();
        if (s == null) {
            builder.keyProperty(null);
        }
        else {
            builder.keyProperty(s[0]);
        }
        builder.timeout(ms.getTimeout());
        builder.parameterMap(ms.getParameterMap());
        builder.resultMaps(ms.getResultMaps());
        builder.resultSetType(ms.getResultSetType());
        builder.cache(ms.getCache());
        builder.flushCacheRequired(ms.isFlushCacheRequired());
        builder.useCache(ms.isUseCache());

        return builder.build();
    }

    /** 
     * 复制BoundSql对象 
     */
    private BoundSql copyFromBoundSql(MappedStatement ms, BoundSql boundSql, String sql) {
        BoundSql newBoundSql = new BoundSql(ms.getConfiguration(), sql,
                boundSql.getParameterMappings(), boundSql.getParameterObject());
        for (ParameterMapping mapping : boundSql.getParameterMappings()) {
            String prop = mapping.getProperty();
            if (boundSql.hasAdditionalParameter(prop)) {
                newBoundSql.setAdditionalParameter(prop, boundSql.getAdditionalParameter(prop));
            }
        }
        return newBoundSql;
    }

    /**
     * 
     * 函数功能描述：根据数据库方言，生成特定的分页SQL
     * @param sql 用户自定义SQL
     * @param page 分页对象
     * @return 分页后的SQL
     */
    private String generatePageSql(String sql, MybatisPager page) {
        StringBuffer pageSql = new StringBuffer();

        pageSql.append(" select * from (select tmp_tb.*, ROWNUM row_id from ( ");
        pageSql.append(sql);
        pageSql.append(")  tmp_tb where ROWNUM <= ");
        pageSql.append(page.getEndRow());
        pageSql.append(" ) where row_id > ");
        pageSql.append(page.getStartRow());

        return pageSql.toString();
    }

    /** 
     * 根据原Sql语句获取对应的查询总记录数的Sql语句 
     */
    private String getCountSql(String sql) {
        return "SELECT COUNT(*) FROM (" + sql + ") alias_ForPage";
    }

    public class BoundSqlSqlSource implements SqlSource {
        BoundSql boundSql;

        public BoundSqlSqlSource(BoundSql boundSql) {
            this.boundSql = boundSql;
        }

        public BoundSql getBoundSql(Object parameterObject) {
            return boundSql;
        }
    }

    public Object plugin(Object arg0) {
        return Plugin.wrap(arg0, this);
    }

    public void setProperties(Properties arg0) {
    }

    /**
     * @return the pageSqlId
     */
    public String getPageSqlId() {
        return this.pageSqlId;
    }

    /**
     * @param pageSqlId the pageSqlId to set
     */
    public void setPageSqlId(String pageSqlId) {
        this.pageSqlId = pageSqlId;
    }

}
