--===============================
--【会议室预定系统数据库用户数据】
-- 数据库服务器类型：oracle 11g
-- 数据库服务器主机：172.16.0.11
-- 数据库管理员用户名和密码：sys/sy
-- 数据库普通用户名和密码：mrbs/mrbs
--===============================


--===============================
--【数据库部署步骤】方式一：直接刷sql方法：
--===============================
--1: 使用oracle的Database Configuration Assistan创建数据库；
--2： 使用DBA身份登录ORACLE数据库；
--3： 使用该身份创建表空间；
--4: 创建用户并授权；
--5： 使用新创建的用户登录；
--6： 使用新用户建表、刷数据；

--使用SystemDBA用户操作

--=======================================--
--step 1 :使用DBA身份登录ORACLE数据库 （172.16.0.11 服务器oracle的DBA用户名和密码为：sa/system）
--=======================================--

--=======================================--
--step 2 :使用该身份创建表空间（注意：需要手动创建MRBS目录，但是不要创建TS_MRBS目录）
		  
--=======================================--
drop tablespace TS_DU;

create tablespace TS_DU  
datafile 'D:\app\Administrator\oradata\DU\TS\TS_DU' size 1024M
default storage (initial 500K   
Next 1024K 
minextents 1  
maxextents unlimited  
pctincrease 0); 

--=======================================--
--step 3 ：创建用户并授权
--=======================================--
create user du identified by du default tablespace TS_DU;       


--=====================================--
-- 授权
--=====================================--
grant CONNECT, RESOURCE to du ; 
grant unlimited tablespace to du;

--grant DBA to jxkh;
--revoke DBA from jxkh;

--=====================================--
-- step 4 :使用新创建的用户（mrbs）登录
--=====================================-- 

