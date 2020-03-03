/*==============================================================*/
/* Sequencies                                                   */
/*==============================================================*/

create sequence T_USER_SEQ;

create sequence T_ROLE_SEQ;

create sequence T_ADDRESS_SEQ;

/*==============================================================*/
/* Table: T_USER                                                */
/*==============================================================*/
create table T_USER 
(
   T_USER_ID            NUMBER(19,0)         not null,
   FIRSTNAME            VARCHAR2(1024 CHAR)  not null,
   LASTNAME             VARCHAR2(1024 CHAR)  not null,
   AGE                  NUMBER(3,0)          not null,
   constraint PK_T_USER primary key (T_USER_ID)
);

/*==============================================================*/
/* Table: T_ROLE                                                */
/*==============================================================*/
create table T_ROLE 
(
   T_ROLE_ID            NUMBER(19,0)         not null,
   ROLE_NAME            VARCHAR2(1024 CHAR)  not null,
   constraint PK_T_ROLE primary key (T_ROLE_ID)
);

/*==============================================================*/
/* Table: T_USER_ROLE                                           */
/*==============================================================*/
create table T_USER_ROLE 
(
   USER_ID              NUMBER(19,0)         not null,
   ROLE_ID              NUMBER(19,0)         not null,
   constraint PK_T_USER_ROLE primary key (USER_ID, ROLE_ID)
);

/*==============================================================*/
/* Table: T_ADDRESS                                             */
/*==============================================================*/
create table T_ADDRESS 
(
   T_ADDRESS_ID         NUMBER(19,0)         not null,
   USER_ID              NUMBER(19,0)         not null,
   STREET               VARCHAR2(1024 CHAR)  not null,
   CITY                 VARCHAR2(1024 CHAR)  not null,
   constraint PK_T_ADDRESS primary key (T_ADDRESS_ID)
);

alter table T_USER_ROLE
   add constraint FK_T_USER_ROLE_REF_T_USER foreign key (USER_ID)
      references T_USER (T_USER_ID);

alter table T_USER_ROLE
   add constraint FK_T_USER_ROLE_REF_T_ROLE foreign key (ROLE_ID)
      references T_ROLE (T_ROLE_ID);

alter table T_ADDRESS
   add constraint FK_T_ADDRESS_REF_T_USER foreign key (USER_ID)
      references T_USER (T_USER_ID);
      
commit;