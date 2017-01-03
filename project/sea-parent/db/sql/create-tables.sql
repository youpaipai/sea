/*==============================================================*/
/* DBMS name:      ORACLE Version 11g                           */
/* Created on:     2016/3/17 18:20:18                           */
/*==============================================================*/



-- Type package declaration
create or replace package PDTypes  
as
    TYPE ref_cursor IS REF CURSOR;
end;

-- Integrity package declaration
create or replace package IntegrityPackage AS
 procedure InitNestLevel;
 function GetNestLevel return number;
 procedure NextNestLevel;
 procedure PreviousNestLevel;
 end IntegrityPackage;
/

-- Integrity package definition
create or replace package body IntegrityPackage AS
 NestLevel number;

-- Procedure to initialize the trigger nest level
 procedure InitNestLevel is
 begin
 NestLevel := 0;
 end;


-- Function to return the trigger nest level
 function GetNestLevel return number is
 begin
 if NestLevel is null then
     NestLevel := 0;
 end if;
 return(NestLevel);
 end;

-- Procedure to increase the trigger nest level
 procedure NextNestLevel is
 begin
 if NestLevel is null then
     NestLevel := 0;
 end if;
 NestLevel := NestLevel + 1;
 end;

-- Procedure to decrease the trigger nest level
 procedure PreviousNestLevel is
 begin
 NestLevel := NestLevel - 1;
 end;

 end IntegrityPackage;
/


drop trigger "CompoundDeleteTrigger_mrbs_not"
/

drop trigger "CompoundInsertTrigger_mrbs_not"
/

drop trigger "CompoundUpdateTrigger_mrbs_not"
/

drop trigger "tib_mrbs_notice"
/

alter table MRBS_BOOK_MEET
   drop constraint FK_MRBS_BOO_REFERENCE_MRBS_MEE
/

alter table MRBS_BOOK_MEET
   drop constraint FK_MRBS_BOO_REFERENCE_MRBS_PRO
/

alter table MRBS_DICT_CHILD
   drop constraint FK_MRBS_DIC_REFERENCE_MRBS_DIC
/

alter table MRBS_NOTICE_USER
   drop constraint FK_MRBS_NOT_REFERENCE_MRBS_NOT
/

alter table MRBS_NOTICE_USER
   drop constraint FK_MRBS_NOT_REFERENCE_MRBS_USE
/

alter table MRBS_PRIVATE_MEET
   drop constraint FK_PRIVATE_REFERENCE_MEET
/

alter table MRBS_PRIVATE_MEET
   drop constraint FK_PRIVATE_REFERENCE_PROXY_OR
/

alter table MRBS_ROLE_MENU
   drop constraint FK_MRBS_ROL_REFERENCE_MRBS_MEN
/

alter table MRBS_ROLE_MENU
   drop constraint FK_MRBS_ROL_REFERENCE_MRBS_ROL
/

alter table MRBS_USER
   drop constraint FK_MRBS_USE_REFERENCE_MRBS_DEP
/

alter table MRBS_USER_ROLE
   drop constraint FK_MRBS_USE_REFERENCE_MRBS_ROL
/

alter table MRBS_USER_ROLE
   drop constraint FK_MRBS_USE_REFERENCE_MRBS_USE
/

drop table DEMO cascade constraints
/

drop table MRBS_BOOK_MEET cascade constraints
/

drop table MRBS_DEPMENT cascade constraints
/

drop table MRBS_DICT_CHILD cascade constraints
/

drop table MRBS_DICT_PARENT cascade constraints
/

drop table MRBS_LOG cascade constraints
/

drop table MRBS_MEET cascade constraints
/

drop table MRBS_MEET_COUNT cascade constraints
/

drop table MRBS_MENU cascade constraints
/

drop table MRBS_NOTICE cascade constraints
/

drop table MRBS_NOTICE_USER cascade constraints
/

drop table MRBS_PRIVATE_MEET cascade constraints
/

drop table MRBS_PROJECT cascade constraints
/

drop table MRBS_ROLE cascade constraints
/

drop table MRBS_ROLE_MENU cascade constraints
/

drop table MRBS_USER cascade constraints
/

drop table MRBS_USER_ROLE cascade constraints
/

drop sequence SEQ_BOOK_MEET
/

drop sequence SEQ_LOG
/

drop sequence SEQ_MRBS_BOOK_MEET
/

drop sequence SEQ_MRBS_DEPMENT
/

drop sequence SEQ_MRBS_DICT_CHILD
/

drop sequence SEQ_MRBS_DICT_PARENT
/

drop sequence SEQ_MRBS_MEET
/

drop sequence SEQ_MRBS_MEET_COUNT
/

drop sequence SEQ_MRBS_MENU
/

drop sequence SEQ_MRBS_NOTICE_USER
/

drop sequence SEQ_MRBS_PRIVATE_MEET
/

drop sequence SEQ_MRBS_PROJECT
/

drop sequence SEQ_MRBS_ROLE
/

drop sequence SEQ_MRBS_ROLE_MENU
/

drop sequence SEQ_MRBS_USER
/

drop sequence SEQ_MRBS_USER_ROLE
/

drop sequence SEQ_NOTICE
/

drop sequence SEQ_PROXY_ORG
/

drop sequence "Sequence_17"
/

drop sequence "Sequence_19"
/

create sequence SEQ_BOOK_MEET
/

create sequence SEQ_LOG
/

create sequence SEQ_MRBS_BOOK_MEET
/

create sequence SEQ_MRBS_DEPMENT
/

create sequence SEQ_MRBS_DICT_CHILD
/

create sequence SEQ_MRBS_DICT_PARENT
/

create sequence SEQ_MRBS_MEET
/

create sequence SEQ_MRBS_MEET_COUNT
/

create sequence SEQ_MRBS_MENU
/

create sequence SEQ_MRBS_NOTICE_USER
/

create sequence SEQ_MRBS_PRIVATE_MEET
/

create sequence SEQ_MRBS_PROJECT
/

create sequence SEQ_MRBS_ROLE
/

create sequence SEQ_MRBS_ROLE_MENU
/

create sequence SEQ_MRBS_USER
/

create sequence SEQ_MRBS_USER_ROLE
/

create sequence SEQ_NOTICE
/

create sequence SEQ_PROXY_ORG
/

create sequence "Sequence_17"
/

create sequence "Sequence_19"
/

/*==============================================================*/
/* Table: DEMO                                                  */
/*==============================================================*/
create table DEMO 
(
   CODE_ID              NUMBER(20)           not null,
   CODE                 VARCHAR2(200),
   CODE_NAME            VARCHAR2(100)
)
pctfree 10
initrans 1
storage
(
    initial 64K
    next 1024K
    minextents 1
    maxextents unlimited
)
tablespace TS_MRBS
logging
monitoring
 noparallel
/

/*==============================================================*/
/* Table: MRBS_BOOK_MEET                                        */
/*==============================================================*/
create table MRBS_BOOK_MEET 
(
   ID                   NUMBER(20)           not null,
   PROJECT_ID           NUMBER(20),
   MEET_FN_TYPE_ID      NUMBER(20),
   MEET_ID              NUMBER(20),
   MEET_USE_BEGIN_TIME  VARCHAR(20),
   MEET_USE_END_TIME    VARCHAR(20),
   IS_VALID             VARCHAR(10),
   IS_DEL               VARCHAR(10),
   CREATE_USER          VARCHAR(50),
   CREATE_TIME          DATE,
   UPDATE_USER          VARCHAR(50),
   UPDATE_TIME          DATE,
   constraint PK_MRBS_BOOK_MEET primary key (ID)
)
/

comment on table MRBS_BOOK_MEET is
'Ԥ����������Ϣ��'
/

comment on column MRBS_BOOK_MEET.ID is
'ID'
/

comment on column MRBS_BOOK_MEET.PROJECT_ID is
'��Ŀ��ϢID'
/

comment on column MRBS_BOOK_MEET.MEET_FN_TYPE_ID is
'�����ҹ�������(���������ֵ䣺��������ҡ���������ҡ����������)'
/

comment on column MRBS_BOOK_MEET.MEET_ID is
'������ID'
/

comment on column MRBS_BOOK_MEET.MEET_USE_BEGIN_TIME is
'������ʹ�ÿ�ʼʱ��'
/

comment on column MRBS_BOOK_MEET.MEET_USE_END_TIME is
'������ʹ�ý���ʱ��'
/

comment on column MRBS_BOOK_MEET.IS_VALID is
'�Ƿ���Ч'
/

comment on column MRBS_BOOK_MEET.IS_DEL is
'�Ƿ�ɾ��'
/

comment on column MRBS_BOOK_MEET.CREATE_USER is
'������'
/

comment on column MRBS_BOOK_MEET.CREATE_TIME is
'����ʱ��'
/

comment on column MRBS_BOOK_MEET.UPDATE_USER is
'�޸���'
/

comment on column MRBS_BOOK_MEET.UPDATE_TIME is
'�޸�ʱ��'
/

/*==============================================================*/
/* Table: MRBS_DEPMENT                                          */
/*==============================================================*/
create table MRBS_DEPMENT 
(
   ID                   NUMBER(20)           not null,
   DEPT_NUM             VARCHAR2(50),
   DEPT_NAME            VARCHAR2(50),
   DEPT_TYPE            VARCHAR2(50),
   DEPT_LINK_USER       VARCHAR2(50),
   MOBILE_PHONE         VARCHAR2(50),
   REMARK               VARCHAR2(200),
   IS_DEL               VARCHAR2(10),
   IS_VALID             VARCHAR2(10),
   CREATE_USER          VARCHAR2(50),
   CREATE_TIME          DATE,
   UPDATE_USER          VARCHAR2(50),
   UPDATE_TIME          DATE,
   constraint PK_MRBS_DEPMENT primary key (ID)
)
/

comment on table MRBS_DEPMENT is
'��������������ı�'
/

comment on column MRBS_DEPMENT.DEPT_NAME is
'�����������'
/

comment on column MRBS_DEPMENT.DEPT_TYPE is
'��λ���ͣ�������1���������2�����ġ�3�ɹ����ġ�4ϵͳ��Ա'
/

comment on column MRBS_DEPMENT.REMARK is
'��ע'
/

comment on column MRBS_DEPMENT.IS_DEL is
'�Ƿ�ɾ��'
/

comment on column MRBS_DEPMENT.IS_VALID is
'�Ƿ���Ч'
/

comment on column MRBS_DEPMENT.CREATE_USER is
'������'
/

comment on column MRBS_DEPMENT.CREATE_TIME is
'����ʱ��'
/

comment on column MRBS_DEPMENT.UPDATE_USER is
'�޸���'
/

comment on column MRBS_DEPMENT.UPDATE_TIME is
'�޸�ʱ��'
/

/*==============================================================*/
/* Table: MRBS_DICT_CHILD                                       */
/*==============================================================*/
create table MRBS_DICT_CHILD 
(
   DICT_ID              NUMBER(20)           not null,
   DICT_PARENT_ID       NUMBER(20),
   DICT_VALUE           VARCHAR2(200),
   constraint PK_MRBS_DICT_CHILD primary key (DICT_ID)
)
/

comment on table MRBS_DICT_CHILD is
'���   �ɹ���ʽ����'
/

comment on column MRBS_DICT_CHILD.DICT_ID is
'ID'
/

comment on column MRBS_DICT_CHILD.DICT_PARENT_ID is
'����ID'
/

comment on column MRBS_DICT_CHILD.DICT_VALUE is
'�ֵ�ֵ'
/

/*==============================================================*/
/* Table: MRBS_DICT_PARENT                                      */
/*==============================================================*/
create table MRBS_DICT_PARENT 
(
   DICT_ID              NUMBER(20)           not null,
   DICT_NAME            VARCHAR2(200),
   constraint PK_MRBS_DICT_PARENT primary key (DICT_ID)
)
/

comment on table MRBS_DICT_PARENT is
'���   �ɹ���ʽ����'
/

comment on column MRBS_DICT_PARENT.DICT_ID is
'ID'
/

comment on column MRBS_DICT_PARENT.DICT_NAME is
'�ֵ�����'
/

/*==============================================================*/
/* Table: MRBS_LOG                                              */
/*==============================================================*/
create table MRBS_LOG 
(
   ID                   NUMBER(20)           not null,
   LOG_TIME             VARCHAR(50),
   LOG_IP               VARCHAR(50),
   MENU_ID              VARCHAR(50),
   LOG_TYPE             VARCHAR(50),
   MESSAGE              VARCHAR(200),
   IS_DEL               VARCHAR(1),
   IS_VALID             VARCHAR(1),
   CREATE_TIME          VARCHAR(50),
   CREATE_USER          VARCHAR(50),
   UPDATE_TIME          VARCHAR(50),
   UPDATE_USER          VARCHAR(50),
   constraint PK_MRBS_LOG primary key (ID)
)
/

comment on table MRBS_LOG is
'��־��'
/

comment on column MRBS_LOG.ID is
'ID'
/

comment on column MRBS_LOG.LOG_TIME is
'��¼ʱ��'
/

comment on column MRBS_LOG.LOG_IP is
'��¼IP'
/

comment on column MRBS_LOG.MENU_ID is
'�˵�ID'
/

comment on column MRBS_LOG.LOG_TYPE is
'��־���ͣ����������ֵ��'
/

comment on column MRBS_LOG.MESSAGE is
'��ʾ��Ϣ'
/

comment on column MRBS_LOG.IS_DEL is
'�Ƿ�ɾ��'
/

comment on column MRBS_LOG.IS_VALID is
'�Ƿ���Ч'
/

comment on column MRBS_LOG.CREATE_TIME is
'����ʱ��'
/

comment on column MRBS_LOG.CREATE_USER is
'������'
/

comment on column MRBS_LOG.UPDATE_TIME is
'�޸�ʱ��'
/

comment on column MRBS_LOG.UPDATE_USER is
'�޸���'
/

/*==============================================================*/
/* Table: MRBS_MEET                                             */
/*==============================================================*/
create table MRBS_MEET 
(
   ID                   NUMBER(20)           not null,
   MEET_NAME            VARCHAR2(100),
   MEET_ADDRESS         VARCHAR2(200),
   MEET_SIZE            VARCHAR2(10),
   MEET_FUN_ID          NUMBER(20),
   IS_SPECIAL           VARCHAR2(1),
   IS_PRIVATE           VARCHAR2(1),
   MEET_CONFIG          VARCHAR2(200),
   NOTES                VARCHAR2(500),
   IS_VALID             NUMBER(1),
   IS_DEL               NUMBER(1),
   CREATE_TIME          DATE,
   CREATE_USER          VARCHAR2(50),
   UPDATE_TIME          DATE,
   UPDATE_USER          VARCHAR2(50),
   constraint PK_MRBS_MEET primary key (ID)
)
/

comment on table MRBS_MEET is
'�����ұ�'
/

comment on column MRBS_MEET.ID is
'ID'
/

comment on column MRBS_MEET.MEET_NAME is
'����������'
/

comment on column MRBS_MEET.MEET_ADDRESS is
'�����ҵص�'
/

comment on column MRBS_MEET.MEET_SIZE is
'�����ҹ�ģ'
/

comment on column MRBS_MEET.MEET_FUN_ID is
'�����ҹ���: �����ֵ�����������ݣ����ꡢ���꣩'
/

comment on column MRBS_MEET.IS_SPECIAL is
'�Ƿ������������'
/

comment on column MRBS_MEET.IS_PRIVATE is
'�Ƿ�ר��������'
/

comment on column MRBS_MEET.MEET_CONFIG is
'����������'
/

comment on column MRBS_MEET.NOTES is
'��ע'
/

comment on column MRBS_MEET.IS_VALID is
'�Ƿ���Ч'
/

comment on column MRBS_MEET.IS_DEL is
'�Ƿ�ɾ��'
/

comment on column MRBS_MEET.CREATE_TIME is
'����ʱ��'
/

comment on column MRBS_MEET.CREATE_USER is
'������'
/

comment on column MRBS_MEET.UPDATE_TIME is
'����ʱ��'
/

comment on column MRBS_MEET.UPDATE_USER is
'������'
/

/*==============================================================*/
/* Table: MRBS_MEET_COUNT                                       */
/*==============================================================*/
create table MRBS_MEET_COUNT 
(
   ID                   NUMBER(20)           not null,
   NAME                 VARCHAR2(50),
   BEGIN_TIME           VARCHAR2(20),
   END_TIME             VARCHAR2(20),
   SORT_NUM             VARCHAR2(10),
   IS_VALID             NUMBER(1),
   IS_DEL               NUMBER(1),
   CREATE_TIME          VARCHAR2(20),
   UPDATE_TIME          VARCHAR2(20),
   CREATE_USER          VARCHAR2(50),
   UPDATE_USER          VARCHAR2(50),
   constraint PK_MRBS_MEET_COUNT primary key (ID)
)
/

comment on table MRBS_MEET_COUNT is
'���α�ÿ��������ÿ��Ԥ���ĳ�������'
/

comment on column MRBS_MEET_COUNT.ID is
'Ψһ����'
/

comment on column MRBS_MEET_COUNT.NAME is
'��������'
/

comment on column MRBS_MEET_COUNT.BEGIN_TIME is
'��ʼʱ��'
/

comment on column MRBS_MEET_COUNT.END_TIME is
'����ʱ��'
/

comment on column MRBS_MEET_COUNT.SORT_NUM is
'�������:'
/

comment on column MRBS_MEET_COUNT.IS_VALID is
'�Ƿ�����'
/

comment on column MRBS_MEET_COUNT.IS_DEL is
'�Ƿ�ɾ��'
/

comment on column MRBS_MEET_COUNT.CREATE_TIME is
'����ʱ��'
/

comment on column MRBS_MEET_COUNT.UPDATE_TIME is
'�޸�ʱ��'
/

comment on column MRBS_MEET_COUNT.CREATE_USER is
'������'
/

comment on column MRBS_MEET_COUNT.UPDATE_USER is
'�޸���'
/

/*==============================================================*/
/* Table: MRBS_MENU                                             */
/*==============================================================*/
create table MRBS_MENU 
(
   MENU_ID              NUMBER(20)           not null,
   MENU_NAME            VARCHAR2(100),
   MENU_URL             VARCHAR2(100),
   PARENT_MENU_ID       VARCHAR2(100),
   IS_DEL               VARCHAR2(10),
   IS_VALID             VARCHAR2(10),
   CREATE_USER          VARCHAR2(50),
   UPDATE_USER          VARCHAR2(50),
   CREATE_TIME          DATE,
   UPDATE_TIME          DATE,
   constraint PK_MRBS_MENU primary key (MENU_ID)
)
/

comment on table MRBS_MENU is
'�˵���'
/

comment on column MRBS_MENU.MENU_ID is
'�˵�ID'
/

comment on column MRBS_MENU.MENU_NAME is
'�˵�����'
/

comment on column MRBS_MENU.MENU_URL is
'�˵�URL'
/

comment on column MRBS_MENU.PARENT_MENU_ID is
'�����˵�ID'
/

comment on column MRBS_MENU.IS_DEL is
'�Ƿ�ɾ��'
/

comment on column MRBS_MENU.IS_VALID is
'�Ƿ���Ч'
/

comment on column MRBS_MENU.CREATE_USER is
'������'
/

comment on column MRBS_MENU.UPDATE_USER is
'�޸���'
/

comment on column MRBS_MENU.CREATE_TIME is
'����ʱ��'
/

comment on column MRBS_MENU.UPDATE_TIME is
'�޸�ʱ��'
/

/*==============================================================*/
/* Table: MRBS_NOTICE                                           */
/*==============================================================*/
create table MRBS_NOTICE 
(
   NOTICE_ID            NUMBER(20)           not null,
   NOTICE_TITLE         VARCHAR(200),
   CONTENTS             VARCHAR(2000),
   SEND_NTS_USER_ID     NUMBER(20),
   RECIVE_NTS_USER_ID   NUMBER(20),
   IS_DEL               VARCHAR(10),
   IS_VALID             VARCHAR(10),
   CREATE_TIME          DATE,
   UPDATE_TIME          DATE,
   CREATE_USER          VARCHAR(50),
   UPDATE_USER          VARCHAR(50),
   constraint PK_MRBS_NOTICE primary key (NOTICE_ID)
)
/

comment on table MRBS_NOTICE is
'֪ͨ��'
/

comment on column MRBS_NOTICE.NOTICE_ID is
'֪ͨID'
/

comment on column MRBS_NOTICE.NOTICE_TITLE is
'֪ͨ����'
/

comment on column MRBS_NOTICE.CONTENTS is
'֪ͨ����'
/

comment on column MRBS_NOTICE.SEND_NTS_USER_ID is
'֪ͨ������ID'
/

comment on column MRBS_NOTICE.RECIVE_NTS_USER_ID is
'֪ͨ������ID'
/

comment on column MRBS_NOTICE.IS_DEL is
'�Ƿ�ɾ��'
/

comment on column MRBS_NOTICE.IS_VALID is
'�Ƿ���Ч'
/

comment on column MRBS_NOTICE.CREATE_TIME is
'����ʱ��'
/

comment on column MRBS_NOTICE.UPDATE_TIME is
'�޸�ʱ��'
/

comment on column MRBS_NOTICE.CREATE_USER is
'������'
/

comment on column MRBS_NOTICE.UPDATE_USER is
'�޸���'
/

/*==============================================================*/
/* Table: MRBS_NOTICE_USER                                      */
/*==============================================================*/
create table MRBS_NOTICE_USER 
(
   ID                   NUMBER(20)           not null,
   USER_ID              NUMBER(20),
   NOTICE_ID            NUMBER(20),
   constraint PK_MRBS_NOTICE_USER primary key (ID)
)
/

comment on table MRBS_NOTICE_USER is
'֪ͨ���û�������'
/

comment on column MRBS_NOTICE_USER.ID is
'ID'
/

comment on column MRBS_NOTICE_USER.USER_ID is
'�û�ID'
/

comment on column MRBS_NOTICE_USER.NOTICE_ID is
'֪ͨID'
/

/*==============================================================*/
/* Table: MRBS_PRIVATE_MEET                                     */
/*==============================================================*/
create table MRBS_PRIVATE_MEET 
(
   ID                   NUMBER(20)           not null,
   MEET_ID              NUMBER(20),
   DEPT_ID              NUMBER(20),
   constraint PK_MRBS_PRIVATE_MEET primary key (ID)
)
/

comment on table MRBS_PRIVATE_MEET is
'ר�����������ñ�:˽�л�����ֻ����ר�ŵĴ�������ſ���Ԥ����������������޷�Ԥ��ר�л����ң���ʼ����Ϊ���ɹ����Ŀ�������ר�������ң�'
/

comment on column MRBS_PRIVATE_MEET.ID is
'ID'
/

comment on column MRBS_PRIVATE_MEET.MEET_ID is
'������ID'
/

comment on column MRBS_PRIVATE_MEET.DEPT_ID is
'��λID'
/

/*==============================================================*/
/* Table: MRBS_PROJECT                                          */
/*==============================================================*/
create table MRBS_PROJECT 
(
   ID                   NUMBER(20)           not null,
   PROJECT_NUM          VARCHAR2(100),
   PROJECT_NAME         VARCHAR2(1000),
   BIDDING_USER         VARCHAR2(200),
   PURCHASE_TYPE        NUMBER(20),
   BUDGET               NUMBER(20,2),
   PROXY_ORG_ID         NUMBER(20),
   LINK_PHONE_NUM       VARCHAR2(20),
   OPEN_BID_TIME        DATE,
   SL_TIME              DATE,
   IS_DEL               VARCHAR2(10),
   IS_VALID             VARCHAR2(10),
   CREATE_USER          VARCHAR2(50),
   CREATE_TIME          DATE,
   UPDATE_USER          VARCHAR2(50),
   UPDATE_TIME          DATE,
   PROJECT_CHECK_STATUS VARCHAR2(20),
   CHECK_CENTER_ID      NUMBER(20),
   APPLY_TIME           DATE,
   PROXY_LINK_USER      VARCHAR2(50),
   constraint PK_MRBS_PROJECT primary key (ID)
)
/

comment on table MRBS_PROJECT is
'������Ԥ����Ŀ��Ϣ��'
/

comment on column MRBS_PROJECT.ID is
'ID'
/

comment on column MRBS_PROJECT.PROJECT_NUM is
'��Ŀ���'
/

comment on column MRBS_PROJECT.PROJECT_NAME is
'��Ŀ����'
/

comment on column MRBS_PROJECT.BIDDING_USER is
'�б��ˣ��б굥λ��'
/

comment on column MRBS_PROJECT.PURCHASE_TYPE is
'�ɹ���ʽID'
/

comment on column MRBS_PROJECT.BUDGET is
'Ԥ��'
/

comment on column MRBS_PROJECT.PROXY_ORG_ID is
'�������'
/

comment on column MRBS_PROJECT.LINK_PHONE_NUM is
'���������ϵ�˵绰'
/

comment on column MRBS_PROJECT.OPEN_BID_TIME is
'����ʱ��'
/

comment on column MRBS_PROJECT.SL_TIME is
'�ڶ��ŷ⿪��ʱ��'
/

comment on column MRBS_PROJECT.IS_DEL is
'�Ƿ�ɾ��'
/

comment on column MRBS_PROJECT.IS_VALID is
'�Ƿ���Ч'
/

comment on column MRBS_PROJECT.CREATE_USER is
'������'
/

comment on column MRBS_PROJECT.CREATE_TIME is
'����ʱ��'
/

comment on column MRBS_PROJECT.UPDATE_USER is
'�޸���'
/

comment on column MRBS_PROJECT.UPDATE_TIME is
'�޸�ʱ��'
/

comment on column MRBS_PROJECT.PROJECT_CHECK_STATUS is
'��Ŀ���״̬'
/

comment on column MRBS_PROJECT.CHECK_CENTER_ID is
'�ύ��˷�����'
/

/*==============================================================*/
/* Table: MRBS_ROLE                                             */
/*==============================================================*/
create table MRBS_ROLE 
(
   ROLE_ID              NUMBER(20)           not null,
   ROLE_NAME            VARCHAR2(50),
   IS_SUPER             VARCHAR2(1),
   IS_DEL               VARCHAR2(10),
   IS_VALID             CHAR(10),
   constraint PK_MRBS_ROLE primary key (ROLE_ID)
)
/

comment on table MRBS_ROLE is
'��ɫ��'
/

comment on column MRBS_ROLE.ROLE_ID is
'��ɫID'
/

comment on column MRBS_ROLE.ROLE_NAME is
'��ɫ����'
/

comment on column MRBS_ROLE.IS_SUPER is
'�Ƿ�ѡ������Ȩ��'
/

/*==============================================================*/
/* Table: MRBS_ROLE_MENU                                        */
/*==============================================================*/
create table MRBS_ROLE_MENU 
(
   ID                   NUMBER(20)           not null,
   ROLE_ID              NUMBER(20),
   MENU_ID              NUMBER(20),
   constraint PK_MRBS_ROLE_MENU primary key (ID)
)
/

comment on table MRBS_ROLE_MENU is
'��ɫ�˵���'
/

comment on column MRBS_ROLE_MENU.ROLE_ID is
'��ɫID'
/

comment on column MRBS_ROLE_MENU.MENU_ID is
'�˵�ID'
/

/*==============================================================*/
/* Table: MRBS_USER                                             */
/*==============================================================*/
create table MRBS_USER 
(
   USER_ID              NUMBER(20)           not null,
   DEPT_ID              NUMBER(20),
   USER_NAME            VARCHAR2(100),
   EMAIL                VARCHAR2(100),
   PASSWORD             VARCHAR2(100),
   MOBILE_PHONE_NUM     VARCHAR2(20),
   PHONE_NUM            VARCHAR2(20),
   REAL_NAME            VARCHAR2(50),
   LAST_LOGIN_TIME      DATE,
   LAST_LOGIN_IP        VARCHAR2(50),
   LOGIN_COUNT          NUMBER(11),
   IS_DEL               VARCHAR2(10),
   IS_VALID             VARCHAR2(10),
   CREATE_USER          VARCHAR2(50),
   UPDATE_USER          VARCHAR2(50),
   CREATE_TIME          DATE,
   UPDATE_TIME          DATE,
   constraint PK_MRBS_USER primary key (USER_ID)
)
/

comment on table MRBS_USER is
'�û���'
/

comment on column MRBS_USER.USER_ID is
'ID'
/

comment on column MRBS_USER.USER_NAME is
'��¼�û���'
/

comment on column MRBS_USER.EMAIL is
'����'
/

comment on column MRBS_USER.PASSWORD is
'��¼����'
/

comment on column MRBS_USER.MOBILE_PHONE_NUM is
'�ֻ�'
/

comment on column MRBS_USER.PHONE_NUM is
'��ϵ�绰'
/

comment on column MRBS_USER.REAL_NAME is
'����'
/

comment on column MRBS_USER.LAST_LOGIN_TIME is
'����¼ʱ��'
/

comment on column MRBS_USER.LAST_LOGIN_IP is
'����¼IP'
/

comment on column MRBS_USER.LOGIN_COUNT is
'��¼����'
/

comment on column MRBS_USER.IS_DEL is
'�Ƿ�ɾ��'
/

comment on column MRBS_USER.IS_VALID is
'�Ƿ���Ч'
/

comment on column MRBS_USER.CREATE_USER is
'������'
/

comment on column MRBS_USER.UPDATE_USER is
'�޸���'
/

comment on column MRBS_USER.CREATE_TIME is
'����ʱ��'
/

comment on column MRBS_USER.UPDATE_TIME is
'�޸�ʱ��'
/

/*==============================================================*/
/* Table: MRBS_USER_ROLE                                        */
/*==============================================================*/
create table MRBS_USER_ROLE 
(
   ID                   NUMBER(20)           not null,
   USER_ID              NUMBER(20),
   ROLE_ID              NUMBER(20),
   constraint PK_MRBS_USER_ROLE primary key (ID)
)
/

comment on table MRBS_USER_ROLE is
'��ɫ��'
/

comment on column MRBS_USER_ROLE.ID is
'ID'
/

comment on column MRBS_USER_ROLE.USER_ID is
'�û�ID'
/

alter table MRBS_BOOK_MEET
   add constraint FK_MRBS_BOO_REFERENCE_MRBS_MEE foreign key (MEET_ID)
      references MRBS_MEET (ID)
/

alter table MRBS_BOOK_MEET
   add constraint FK_MRBS_BOO_REFERENCE_MRBS_PRO foreign key (PROJECT_ID)
      references MRBS_PROJECT (ID)
/

alter table MRBS_DICT_CHILD
   add constraint FK_MRBS_DIC_REFERENCE_MRBS_DIC foreign key (DICT_PARENT_ID)
      references MRBS_DICT_PARENT (DICT_ID)
/

alter table MRBS_NOTICE_USER
   add constraint FK_MRBS_NOT_REFERENCE_MRBS_NOT foreign key (NOTICE_ID)
      references MRBS_NOTICE (NOTICE_ID)
/

alter table MRBS_NOTICE_USER
   add constraint FK_MRBS_NOT_REFERENCE_MRBS_USE foreign key (USER_ID)
      references MRBS_USER (USER_ID)
/

alter table MRBS_PRIVATE_MEET
   add constraint FK_PRIVATE_REFERENCE_MEET foreign key (MEET_ID)
      references MRBS_MEET (ID)
/

alter table MRBS_PRIVATE_MEET
   add constraint FK_PRIVATE_REFERENCE_PROXY_OR foreign key (DEPT_ID)
      references MRBS_DEPMENT (ID)
/

alter table MRBS_ROLE_MENU
   add constraint FK_MRBS_ROL_REFERENCE_MRBS_MEN foreign key (MENU_ID)
      references MRBS_MENU (MENU_ID)
/

alter table MRBS_ROLE_MENU
   add constraint FK_MRBS_ROL_REFERENCE_MRBS_ROL foreign key (ROLE_ID)
      references MRBS_ROLE (ROLE_ID)
/

alter table MRBS_USER
   add constraint FK_MRBS_USE_REFERENCE_MRBS_DEP foreign key (DEPT_ID)
      references MRBS_DEPMENT (ID)
/

alter table MRBS_USER_ROLE
   add constraint FK_MRBS_USE_REFERENCE_MRBS_ROL foreign key (ROLE_ID)
      references MRBS_ROLE (ROLE_ID)
/

alter table MRBS_USER_ROLE
   add constraint FK_MRBS_USE_REFERENCE_MRBS_USE foreign key (USER_ID)
      references MRBS_USER (USER_ID)
/


create or replace trigger "CompoundDeleteTrigger_mrbs_not"
for delete on MRBS_NOTICE compound trigger
// Declaration
// Body
  before statement is
  begin
     NULL;
  end before statement;

  before each row is
  begin
     NULL;
  end before each row;

  after each row is
  begin
     NULL;
  end after each row;

  after statement is
  begin
     NULL;
  end after statement;

END
/


create or replace trigger "CompoundInsertTrigger_mrbs_not"
for insert on MRBS_NOTICE compound trigger
// Declaration
// Body
  before statement is
  begin
     NULL;
  end before statement;

  before each row is
  begin
     NULL;
  end before each row;

  after each row is
  begin
     NULL;
  end after each row;

  after statement is
  begin
     NULL;
  end after statement;

END
/


create or replace trigger "CompoundUpdateTrigger_mrbs_not"
for update on MRBS_NOTICE compound trigger
// Declaration
// Body
  before statement is
  begin
     NULL;
  end before statement;

  before each row is
  begin
     NULL;
  end before each row;

  after each row is
  begin
     NULL;
  end after each row;

  after statement is
  begin
     NULL;
  end after statement;

END
/


create trigger "tib_mrbs_notice" before insert
on MRBS_NOTICE for each row
declare
    integrity_error  exception;
    errno            integer;
    errmsg           char(200);
    dummy            integer;
    found            boolean;

begin
    --  Column "NOTICE_ID" uses sequence SEQ_NOTICE
    select SEQ_NOTICE.NEXTVAL INTO :new.NOTICE_ID from dual;

--  Errors handling
exception
    when integrity_error then
       raise_application_error(errno, errmsg);
end;
/

create materialized view log on MRBS_MEET_COUNT
/

