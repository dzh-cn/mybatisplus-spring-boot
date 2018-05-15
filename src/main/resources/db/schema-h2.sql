
DROP TABLE IF EXISTS user;

CREATE TABLE user
(
	test_id BIGINT(20) NOT NULL COMMENT '主键ID',
	tenant_id BIGINT(20) NOT NULL COMMENT '租户ID',
	name VARCHAR(30) NULL DEFAULT NULL COMMENT '名称',
	age INT(11) NULL DEFAULT NULL COMMENT '年龄',
	test_type INT(11) NULL DEFAULT NULL COMMENT '测试下划线字段命名类型',
	test_date DATETIME NULL DEFAULT NULL COMMENT '日期',
	role BIGINT(20) NULL DEFAULT NULL COMMENT '测试',
	phone VARCHAR(11) NULL DEFAULT NULL COMMENT '手机号码',
	PRIMARY KEY (test_id)
);
create table ABS_MALL_PRODUCT
(
	product_id int auto_increment comment '产品id'
		primary key,
	security_id int not null comment '产品的-security_id',
	asset_pool_status varchar(45) null comment '产品状态',
	ipo_status varchar(45) null comment '发行状态',
	new_issue_status varchar(45) null comment '上架状态',
	underlying_asset_type varchar(45) null comment '基础资产类型',
	contract_value decimal(20) null comment '发行金额',
	registration_id varchar(32) null comment '备案确认函',
	registration_date date null comment '备案日期',
	list_date date null comment '产品设立日',
	revolving_start_date date null comment '循环期开始日',
	amortizing_start_date date null comment '摊还期开始日',
	legal_maturity_date date null comment '法定到期日',
	asset_recycle tinyint null comment '循环购买',
	first_payment_date date null comment '首次偿付日',
	book_building_date date null comment '簿记建档日',
	listing_transfter_date date null comment '挂牌转让日',
	created_by varchar(30) not null comment '创建人',
	last_modified_by varchar(32) null comment '修改人',
	created_date timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
	modified_date timestamp default CURRENT_TIMESTAMP not null comment '修改时间',
	remark varchar(600) null comment '备注',
	promoted tinyint(1) null comment '是否首页展示，1是，0否',
	amortization_type varchar(45) null comment '还本方式(过手摊还/固定摊还)',
	amortization_length varchar(16) null comment '摊还期期限',
	regulator_code varchar(32) null comment '监管机构code',
	maturity_date date null comment '到期日',
	carry_date date null comment '起期日',
	approve_date date null comment '通过日'
);
create table abs_mall_security
(
	security_id int auto_increment comment '证券的或者产品的-security_id'
		primary key,
	security_internal_id varchar(45) not null comment '证券内部代码',
	security_code varchar(45) null comment '证券代码',
	security_group varchar(45) null comment '证券组',
	security_type varchar(45) not null comment '证券类型',
	security_name varchar(45) not null comment '证券简称/产品简称',
	security_full_name varchar(100) null comment '证券全称/产品全称',
	security_description varchar(100) null comment '证券描述/产品描述',
	coupon decimal(24,6) null comment '票面利率(发行时)',
	coupon_type varchar(20) null comment '利率类型',
	coupon_frequency varchar(45) null comment '每年付息次数',
	coupon_description varchar(100) null comment '利率说明',
	coupon_base_rate decimal(24,6) null comment '基准利率',
	coupon_base_rate_rule varchar(300) null comment '基准利率公式',
	coupon_base_rate_description varchar(100) null comment '基准利率公式描述',
	spread decimal(24,6) null comment '固定利差',
	issue_form varchar(45) null comment '凭证类别',
	day_count varchar(45) null comment '计息期规则',
	par decimal null comment '每份面值(元)',
	issue_amount decimal(20) null comment '发行金额',
	issue_date date null comment '发行日',
	maturity_date date null comment '到期日',
	issue_type varchar(45) null comment '发行方式',
	created_by varchar(32) null comment '创建人',
	created_date timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
	last_modified_by varchar(32) null comment '修改人',
	modified_date timestamp default CURRENT_TIMESTAMP not null comment '修改时间',
	remark varchar(600) null comment '备注',
	exchange varchar(32) null comment '交易流通场所',
	constraint uniq_security_internal_id
		unique (security_internal_id)
);