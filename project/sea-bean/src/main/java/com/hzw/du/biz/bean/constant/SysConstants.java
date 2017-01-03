/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：SysConstants.java
 * 修改时间：2016-7-21
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */


package com.hzw.du.biz.bean.constant;

public class SysConstants
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    /**
     * 
     * <一句话功能简述> 删除标志
     * <功能详细描述>
     * @author libb
     * @version V1.0[产品/模块版本]
     */
    public interface STATUS
    {
        /* 未删除 */
        public final static Integer STATUS_NORMAL = 0;
        /* 已删除 */
        public final static Integer STATUS_DELETE = 1;
        
    }
    
    /**
     * 
     * <一句话功能简述> 用户类型
     * <功能详细描述> 同时对应系统角色（roleId）
     * @author libb
     * @version V1.0[产品/模块版本]
     */
    public interface SYS_USER_TYPE 
    {
        /** 1：代理机构 */
        public static final Integer USER_TYPE_AGENCY = 1;
        /** 2：招标人 */
        public static final Integer USER_TYPE_TENDER_PERSON = 2;
        /** 3：供应商 */
        public static final Integer USER_TYPE_SUPPLIER = 3;
        /** 4：专家 */
        public static final Integer USER_TYPE_EXPERT = 4;
        /** 5：监管机构 */
        public static final Integer USER_TYPE_SUPERVISE = 5;
        /** 系统管理员 */
        public static final Integer USER_TYPE_ADMIN = 6;
        /** 信息员 */
        public static final Integer USER_TYPE_MESSENGER = 7;
        
    }
    
    /**
     * 
     * sys_user表中的状态
     * <功能详细描述>
     * @author libb
     * @version V1.0[产品/模块版本]
     */
    public interface SYS_USER_STATUS 
    {   /**
                             审核状态
    
        /** 0:已认证  */
        public final static Integer STATUS_0 = 0;
        /**  1：新注册  */
        public final static Integer STATUS_1 = 1;
        /**  2：待审核（注册）  */
        public final static Integer STATUS_2 = 2;
        /**  3：未通过（注册）  */
        public final static Integer STATUS_3 = 3;
        /**  4：待审核（变更） */
        public final static Integer STATUS_4 = 4;
        /**  5：未通过（变更） */
        public final static Integer STATUS_5 = 5;
        
        
        
        
            /**  登陆用状态            
        /**  6：停用 */
        public final static Integer STATUS_6 = 6;
        /**  7：锁定 */
        public final static Integer STATUS_7 = 7;
        /**  8：无效 */
        public final static Integer STATUS_8 = 8;
        /**  9：正常*/
        public final static Integer STATUS_9 = 9;
    }
    
    /**
     * 
     * <一句话功能简述> sys_organization表中的状态
     * <功能详细描述>
     * @author libb
     * @version V1.0[产品/模块版本]
     */
    public interface SYS_ORGANIZATION_STATUS
    {
        /** 0:已认证  */
        public final static Integer STATUS_0 = 0;
        /**  1：待审核（注册）  */
        public final static Integer STATUS_1 = 1;
        /**  2：未通过（注册）  */
        public final static Integer STATUS_2 = 2;
        /**  3：待审核（变更） */
        public final static Integer STATUS_3 = 3;
        /**  4：未通过（变更） */
        public final static Integer STATUS_4 = 4;
        /** 5：已废弃） */
        public final static Integer Status_5 = 5;
    }
    
    /**
     * 
     * <一句话功能简述> Input类操作类型
     * <功能详细描述>
     * @author libb
     * @version V1.0[产品/模块版本]
     */
    public interface OPERATE_TYPE
    {
        /* 新增 */
        public final static String OPERATE_ADD = "1";
        /* 修改 */
        public final static String OPERATE_MODIFY = "2";
        /* 删除 */
        public final static String OPERATE_DELETE = "3";
    }
    
    /**
     * 条件表达是符号
     * 用法：
     * 如果表示一段范围，用list包含每个单元
     * 每个单元包含两部分（条件符号|值）
     * 例如：表示小于值：（lt|值）
     * lte（小于等于）,gt（大于）,gte（大于等于）,eq（等于）
     */
    public interface EXPRESSION_TYPE
    {
        /* 小于 */
        public final static String LT = "lt";
        public final static String LT_SYMBOL = "<";
        
        /* 小于等于 */
        public final static String LTE = "lte";
        public final static String LTE_SYMBOL = "<=";
        
        /* 大于 */
        public final static String GT = "gt";
        public final static String GT_SYMBOL = ">";
        
        /* 大于 */
        public final static String GTE = "gte";
        public final static String GTE_SYMBOL = ">=";
        
        /* 大于 */
        public final static String EQ = "eq";
        public final static String EQ_SYMBOL = "=";
        
    }
    
    /**
     * boolean常量值
     */
    public interface BOOLEAN_TYPE {
        /* 0为否 */
        public final static String FALSE = "0";
        
        /* 1为是*/
        public final static String TRUE = "1";
    }
    
    /**
     * boolean常量值
     */
    public interface BOOLEAN_TYPE_INTEGER {
        /* 0为否 */
        public final static Integer FALSE = 0;
        
        /* 1为是*/
        public final static Integer TRUE = 1;
    }
    
    /**
     *  付款类型
     */
    public interface PAYMENT_TYPE {
        /* 1电汇*/
        public final static Integer WIRE_TRANSFER = 1;
        
    }
    
    /**
     *  付款标识(0：未付款，1：已付款)
     */
    public interface IS_PAYMENT {
        /* 0：未付款 */
        public final static Integer FALSE = 0;
        
        /* 1：已付款 */
        public final static Integer TRUE = 1;
        
    }
    
    /**
     *  邀请标识（0：否，1：是）
     */
    public interface IS_INVITE {
        /* 0：未付款 */
        public final static Integer FALSE = 0;
        
        /* 1：已付款 */
        public final static Integer TRUE = 1;
        
    }
    
    /**
     *  邀请标识（0：否，1：是）
     */
    public interface IS_DOWN_POWER {
        /* 0：未付款 */
        public final static Integer FALSE = 0;
        
        /* 1：已付款 */
        public final static Integer TRUE = 1;
        
    }
    /**
     *  收费类型 0：免费 1：收费
     */
    public interface CHARGING_TYPE {
        /* 0：未付款 */
        public final static Integer FREE = 0;
        
        /* 1：已付款 */
        public final static Integer NOT_FREE = 1;
        
    }
    
    
    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
