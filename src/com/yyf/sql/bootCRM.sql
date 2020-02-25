USE mybatis;
CREATE TABLE sys_user(
	user_id int(32) PRIMARY KEY AUTO_INCREMENT COMMENT '用户id',
	user_code varchar(32) COMMENT '用户账号',
	user_name varchar(50) COMMENT '用户名称',
	user_password varchar(32) COMMENT '用户密码',
	user_state varchar(1) COMMENT '用户状态（1：正常，0：暂停）'
) COMMENT='系统用户表';

CREATE TABLE customer(
	cust_id int(32) PRIMARY KEY AUTO_INCREMENT COMMENT '客户编号',
	cust_name varchar(50) COMMENT '客户名称',
	cust_user_id int(32) COMMENT '负责人id',
	cust_create_id int(32) COMMENT '创建人id',
	cust_source varchar(50) COMMENT '客户信息来源',
	cust_industry varchar(50) COMMENT '客户所属行业',
	cust_level varchar(32) COMMENT '客户级别',
	cust_linkman varchar(50) COMMENT '联系人',
	cust_phone varchar(64) COMMENT '固定电话',
	cust_mobile varchar(16) COMMENT '移动电话',
	cust_zipcode varchar(10) COMMENT '邮政编码',
	cust_address varchar(100) COMMENT '联系地址',
	cust_createtime datetime COMMENT '创建时间'
) COMMENT='客户信息表';


CREATE TABLE base_dict(
	dict_id varchar(32) PRIMARY KEY COMMENT '数据字典id',
	dict_type_code varchar(10) COMMENT '数据字典类别代码',
	dict_type_name varchar(50) COMMENT '数据字典类别名称',
	dict_item_name varchar(50) COMMENT '数据字典项目名称',
	dict_item_code varchar(10) COMMENT '数据字典项目代码（可为空）',
	dict_sort int(10) COMMENT '排序字段',
	dict_enable char(1) COMMENT '是否可用：1：使用，0：停用',
	dict_memo varchar(100) COMMENT '备注'
) COMMENT='数据字典表';




