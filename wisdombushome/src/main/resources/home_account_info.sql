/*
Navicat MySQL Data Transfer

Source Server         : 172.16.102.103
Source Server Version : 50617
Source Host           : 172.16.102.103:3388
Source Database       : wisdombus_test_zhcx

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2017-05-22 13:58:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for home_account_info
-- ----------------------------
DROP TABLE IF EXISTS `home_account_info`;
CREATE TABLE `home_account_info` (
  `UUID` varchar(32) NOT NULL COMMENT '编号',
  `ACCOUNT_NAME` varchar(100) DEFAULT NULL COMMENT '账号名称',
  `ACCOUNT_PWD` varchar(100) DEFAULT NULL COMMENT '密码',
  `ACCOUNT_STATUS` smallint(6) DEFAULT NULL COMMENT '状态(0：正常，1：待审核，2：审核不通过，3：注销，4：异常)',
  `DEL_FLAG` smallint(6) DEFAULT NULL COMMENT '删除标记(0：正常，1：删除，2：锁定)',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(32) DEFAULT NULL COMMENT '创建人ID',
  `ACCOUNT_TYPE` smallint(6) DEFAULT NULL COMMENT '账号类型(0：平台账号，1：系统账号，2：程序账号)',
  `KEY_TYPE` smallint(6) DEFAULT NULL COMMENT '密钥类型(0：MD5，1：AES，2：明文，3：RSA)',
  `SECRET_KEY` varchar(100) DEFAULT NULL COMMENT '密钥',
  `PWD_CALL_WAY` smallint(6) DEFAULT NULL COMMENT '密码找回方式(0：EMail)',
  `SECURITY_EMAIL` varchar(100) DEFAULT NULL COMMENT '安全邮箱',
  `LAST_EDIT_TIME` datetime DEFAULT NULL COMMENT '上一次修改密码的时间',
  `USER_ID` varchar(32) DEFAULT NULL COMMENT '用户ID',
  `REMARK` varchar(200) DEFAULT NULL COMMENT '备注',
  `PHONE` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `SALT` varchar(32) DEFAULT NULL COMMENT '盐值',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账号信息';

-- ----------------------------
-- Table structure for home_auth_menu
-- ----------------------------
DROP TABLE IF EXISTS `home_auth_menu`;
CREATE TABLE `home_auth_menu` (
  `uuid` varchar(32) NOT NULL COMMENT 'uuid',
  `corp_id` varchar(32) DEFAULT NULL COMMENT '企业id',
  `creator` varchar(32) DEFAULT NULL COMMENT '创建者',
  `who_modified` varchar(32) DEFAULT NULL COMMENT '修改者',
  `time_created` varchar(20) DEFAULT NULL COMMENT '创建时间',
  `time_modified` varchar(20) DEFAULT NULL COMMENT '修改时间',
  `app_id` varchar(32) DEFAULT NULL COMMENT '应用ID',
  `auth_id` varchar(32) DEFAULT NULL COMMENT '应用权限ID',
  `menu_code` varchar(60) DEFAULT NULL COMMENT '菜单编码',
  `menu_name` varchar(90) DEFAULT NULL COMMENT '菜单名',
  `menu_url` varchar(200) DEFAULT NULL COMMENT 'Url',
  `display_order` int(11) DEFAULT NULL COMMENT '排序',
  `parent_id` varchar(32) DEFAULT NULL COMMENT '父节点',
  `iconfont` varchar(150) DEFAULT NULL COMMENT '图标',
  `str1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `status` smallint(6) DEFAULT NULL COMMENT '状态(新加，1：正常，2：停用)',
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单';

-- ----------------------------
-- Table structure for home_auth_role
-- ----------------------------
DROP TABLE IF EXISTS `home_auth_role`;
CREATE TABLE `home_auth_role` (
  `uuid` varchar(32) NOT NULL COMMENT 'uuid',
  `app_id` varchar(32) DEFAULT NULL COMMENT '应用ID',
  `role_name` varchar(50) DEFAULT NULL COMMENT '角色名称',
  `role_code` varchar(20) DEFAULT NULL COMMENT '角色编码',
  `str1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `creator` varchar(32) DEFAULT NULL COMMENT '创建者',
  `who_modified` varchar(32) DEFAULT NULL COMMENT '修改者',
  `time_created` varchar(20) DEFAULT NULL COMMENT '创建时间',
  `time_modified` varchar(20) DEFAULT NULL COMMENT '修改时间',
  `status` smallint(6) DEFAULT NULL COMMENT '状态(新加，1：正常，2：停用)',
  `grade` smallint(6) DEFAULT NULL COMMENT '级别（新加，1：普通，2：系统）',
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色';

-- ----------------------------
-- Table structure for home_auth_user
-- ----------------------------
DROP TABLE IF EXISTS `home_auth_user`;
CREATE TABLE `home_auth_user` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'uuid',
  `login_name` varchar(11) NOT NULL COMMENT '账号',
  `user_name` varchar(16) DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `salt_density_value` varchar(50) DEFAULT NULL COMMENT '盐值',
  `plot_code` bigint(20) DEFAULT NULL,
  `plot_name` varchar(200) DEFAULT NULL,
  `shop_id` varchar(32) DEFAULT NULL,
  `user_type` smallint(6) DEFAULT NULL COMMENT '用户类型',
  `email` varchar(20) DEFAULT NULL COMMENT '邮箱',
  `mobile_phone` varchar(11) DEFAULT NULL COMMENT '电话',
  `user_status` smallint(6) DEFAULT '0' COMMENT '用户状态',
  `date_from` varchar(20) DEFAULT NULL COMMENT '生效时间',
  `date_to` varchar(20) DEFAULT NULL COMMENT '失效时间',
  `activedate` varchar(20) DEFAULT NULL COMMENT '激活时间',
  `enddate` varchar(20) DEFAULT NULL COMMENT '停用时间',
  `creator` bigint(20) DEFAULT NULL COMMENT '创建人',
  `time_created` varchar(20) DEFAULT NULL COMMENT '创建时间',
  `who_modified` bigint(20) DEFAULT NULL COMMENT '修改人',
  `time_modified` varchar(20) DEFAULT NULL COMMENT '修改时间',
  `channel` varchar(20) DEFAULT NULL COMMENT '注册通道',
  `source` varchar(20) DEFAULT NULL COMMENT '来源',
  `user_img` varchar(200) DEFAULT NULL COMMENT '用户头像',
  `user_ext2` varchar(20) DEFAULT NULL COMMENT '扩展字段2',
  `user_ext3` varchar(50) DEFAULT NULL COMMENT '扩展字段3',
  `user_ext4` varchar(50) DEFAULT NULL COMMENT '扩展字段4',
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- ----------------------------
-- Table structure for home_comm_empl
-- ----------------------------
DROP TABLE IF EXISTS `home_comm_empl`;
CREATE TABLE `home_comm_empl` (
  `UUID` bigint(20) NOT NULL,
  `corp_id` bigint(20) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL COMMENT 'JT/T697.7-2014 4.1.2.1.1',
  `gender` varchar(16) DEFAULT NULL,
  `birth_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `IDC_type` varchar(16) DEFAULT NULL,
  `IDC_num` varchar(50) DEFAULT NULL,
  `nation_code` varchar(16) DEFAULT NULL,
  `native_place` varchar(100) DEFAULT NULL,
  `degree_code` varchar(16) DEFAULT NULL,
  `phone_no` varchar(18) DEFAULT NULL,
  `mPhone_no` varchar(18) DEFAULT NULL,
  `health_code` varchar(16) DEFAULT NULL,
  `pol_aff_code` varchar(16) DEFAULT NULL,
  `present_addr` varchar(200) DEFAULT NULL,
  `initial_work_time` datetime DEFAULT NULL,
  `status_of_onPost` smallint(6) DEFAULT NULL COMMENT '0-不在岗 1-在岗',
  `pro_catCode` varchar(16) DEFAULT NULL,
  `eff_start_time` datetime DEFAULT NULL,
  `eff_end_time` datetime DEFAULT NULL,
  `creator` bigint(20) DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `modifier` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='员工基本信息表';

-- ----------------------------
-- Table structure for home_comm_enterprise
-- ----------------------------
DROP TABLE IF EXISTS `home_comm_enterprise`;
CREATE TABLE `home_comm_enterprise` (
  `corp_id` bigint(20) NOT NULL,
  `enterprise_name` varchar(100) DEFAULT NULL,
  `enterprise_code` varchar(16) DEFAULT NULL,
  `enterprise_addr` varchar(200) DEFAULT NULL,
  `enterprise_post` varchar(8) DEFAULT NULL,
  `enterprise_div` varchar(16) DEFAULT NULL,
  `enterprise_cate` varchar(16) DEFAULT NULL,
  `enterprise_legal_name` varchar(50) DEFAULT NULL,
  `enterprise_leader` varchar(50) DEFAULT NULL,
  `enterprise_leader_phone` varchar(16) DEFAULT NULL,
  `enterprise_contact` varchar(24) DEFAULT NULL,
  `enterprise_fax` varchar(16) DEFAULT NULL,
  `enterprise_website` varchar(200) DEFAULT NULL,
  `enterprise_reg` varchar(40) DEFAULT NULL,
  `enterprise_regDate` datetime DEFAULT NULL,
  `enterprise_regCap` int(11) DEFAULT NULL COMMENT '单位：万元',
  `enterprise_qua` varchar(8) DEFAULT NULL COMMENT '参考企业资质级别',
  `effect_start_time` datetime DEFAULT NULL,
  `effect_end_time` datetime DEFAULT NULL,
  `creator` bigint(20) DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `modifier` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `logo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`corp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业基本信息';

-- ----------------------------
-- Table structure for home_comm_enterprise_copy
-- ----------------------------
DROP TABLE IF EXISTS `home_comm_enterprise_copy`;
CREATE TABLE `home_comm_enterprise_copy` (
  `store_id` bigint(20) NOT NULL,
  `store_name` varchar(200) DEFAULT NULL,
  `store_code` varchar(16) DEFAULT NULL,
  `store_addr` varchar(200) DEFAULT NULL,
  `store_type` varchar(8) DEFAULT NULL,
  `effect_start_time` datetime DEFAULT NULL,
  `effect_end_time` datetime DEFAULT NULL,
  `creator` bigint(20) DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `modifier` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `logo` varchar(100) DEFAULT NULL,
  `store_remark` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`store_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业基本信息';

-- ----------------------------
-- Table structure for home_comm_organization
-- ----------------------------
DROP TABLE IF EXISTS `home_comm_organization`;
CREATE TABLE `home_comm_organization` (
  `UUID` bigint(20) NOT NULL,
  `corp_id` bigint(20) DEFAULT NULL,
  `seq_code` smallint(6) DEFAULT NULL,
  `group_name` varchar(100) DEFAULT NULL,
  `is_use` smallint(6) DEFAULT NULL COMMENT '1启用 2停用 3删除 ',
  `group_code` varchar(50) DEFAULT NULL,
  `group_tel` varchar(16) DEFAULT NULL,
  `group_mail` varchar(8) DEFAULT NULL,
  `group_fax` varchar(16) DEFAULT NULL,
  `group_addr` varchar(250) DEFAULT NULL,
  `remark` text,
  `eff_start_time` datetime DEFAULT NULL,
  `efft_end_time` datetime DEFAULT NULL,
  `creator` bigint(20) DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `modiflier` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `layer` int(11) DEFAULT NULL,
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='组织基本信息表';

-- ----------------------------
-- Table structure for home_comm_post
-- ----------------------------
DROP TABLE IF EXISTS `home_comm_post`;
CREATE TABLE `home_comm_post` (
  `UUID` bigint(20) NOT NULL,
  `corp_id` bigint(20) DEFAULT NULL,
  `post_name` varchar(100) DEFAULT NULL,
  `eff_end_time` datetime DEFAULT NULL,
  `eff_start_time` datetime DEFAULT NULL,
  `creator` bigint(20) DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `modifier` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='岗位基本信息表';

-- ----------------------------
-- Table structure for home_comm_post_rule
-- ----------------------------
DROP TABLE IF EXISTS `home_comm_post_rule`;
CREATE TABLE `home_comm_post_rule` (
  `UUID` bigint(20) NOT NULL,
  `emp_id` bigint(20) DEFAULT NULL,
  `group_id` bigint(20) DEFAULT NULL,
  `post_id` bigint(20) DEFAULT NULL,
  `like_code` varchar(50) DEFAULT NULL,
  `eff_start_time` datetime DEFAULT NULL,
  `eff_end_time` datetime DEFAULT NULL,
  `corp_id` bigint(20) DEFAULT NULL,
  `creator` bigint(20) DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `modifier` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='员工岗位表';

-- ----------------------------
-- Table structure for home_dictionary_county_city
-- ----------------------------
DROP TABLE IF EXISTS `home_dictionary_county_city`;
CREATE TABLE `home_dictionary_county_city` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(10) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `superior_code` varchar(10) DEFAULT NULL,
  `eff_start_time` datetime DEFAULT NULL,
  `eff_end_time` datetime DEFAULT NULL,
  `corp_id` bigint(20) DEFAULT NULL,
  `creator` bigint(20) DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `modifier` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=155 DEFAULT CHARSET=utf8 COMMENT='县级城市';

-- ----------------------------
-- Table structure for home_dictionary_data
-- ----------------------------
DROP TABLE IF EXISTS `home_dictionary_data`;
CREATE TABLE `home_dictionary_data` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(10) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `instructions` varchar(20) DEFAULT NULL,
  `serial_number` int(11) DEFAULT NULL,
  `super_code` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='数据字典';

-- ----------------------------
-- Table structure for home_dictionary_province_city
-- ----------------------------
DROP TABLE IF EXISTS `home_dictionary_province_city`;
CREATE TABLE `home_dictionary_province_city` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(10) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `eff_start_time` datetime DEFAULT NULL,
  `eff_end_time` datetime DEFAULT NULL,
  `corp_id` bigint(20) DEFAULT NULL,
  `creator` bigint(20) DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `modifier` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8 COMMENT='省级城市';

-- ----------------------------
-- Table structure for home_dictionary_town_city
-- ----------------------------
DROP TABLE IF EXISTS `home_dictionary_town_city`;
CREATE TABLE `home_dictionary_town_city` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(10) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `superior_code` varchar(10) DEFAULT NULL,
  `eff_start_time` datetime DEFAULT NULL,
  `eff_end_time` datetime DEFAULT NULL,
  `corp_id` bigint(20) DEFAULT NULL,
  `creator` bigint(20) DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `modifier` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='市级城市';

-- ----------------------------
-- Table structure for home_form_detail
-- ----------------------------
DROP TABLE IF EXISTS `home_form_detail`;
CREATE TABLE `home_form_detail` (
  `UUID` bigint(20) NOT NULL AUTO_INCREMENT,
  `identity_type` smallint(6) DEFAULT NULL,
  `plot_code` bigint(20) DEFAULT NULL,
  `plot_name` varchar(200) DEFAULT NULL,
  `addr` varchar(200) DEFAULT NULL,
  `goods_up` int(11) DEFAULT NULL,
  `goods_middle` int(11) DEFAULT NULL,
  `goods_last` int(11) DEFAULT NULL,
  `form_title` varchar(200) DEFAULT NULL,
  `form_remark` text,
  `connector` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `corp_id` bigint(20) DEFAULT NULL,
  `eff_end_time` datetime DEFAULT NULL,
  `eff_start_time` datetime DEFAULT NULL,
  `creator` bigint(20) DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `modifier` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='表单详情';

-- ----------------------------
-- Table structure for home_housing_atta
-- ----------------------------
DROP TABLE IF EXISTS `home_housing_atta`;
CREATE TABLE `home_housing_atta` (
  `UUID` bigint(20) NOT NULL AUTO_INCREMENT,
  `form_id` bigint(20) DEFAULT NULL,
  `atta_type` smallint(6) DEFAULT NULL,
  `atta_url` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='附件表';

-- ----------------------------
-- Table structure for home_housing_rent
-- ----------------------------
DROP TABLE IF EXISTS `home_housing_rent`;
CREATE TABLE `home_housing_rent` (
  `UUID` bigint(20) NOT NULL AUTO_INCREMENT,
  `rent_type` smallint(6) DEFAULT NULL,
  `identity_type` smallint(6) DEFAULT NULL,
  `plot_code` bigint(20) DEFAULT NULL,
  `plot_name` varchar(200) DEFAULT NULL,
  `rent_addr` varchar(200) DEFAULT NULL,
  `room` smallint(6) DEFAULT NULL,
  `living_room` smallint(6) DEFAULT NULL,
  `toilet` smallint(6) DEFAULT NULL,
  `m2` smallint(6) DEFAULT NULL,
  `flow` smallint(6) DEFAULT NULL,
  `flow_count` smallint(6) DEFAULT NULL,
  `housing_direction` smallint(6) DEFAULT NULL,
  `housing_d` smallint(6) DEFAULT NULL,
  `housing_type` smallint(6) DEFAULT NULL,
  `housing_config` varchar(200) DEFAULT NULL COMMENT '存JSON数据',
  `pay` int(11) DEFAULT NULL,
  `pay_type` int(11) DEFAULT NULL,
  `rent_title` varchar(200) DEFAULT NULL,
  `rent_remark` mediumtext,
  `connector` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `corp_id` bigint(20) DEFAULT NULL,
  `eff_end_time` datetime DEFAULT NULL,
  `eff_start_time` datetime DEFAULT NULL,
  `creator` bigint(20) DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `modifier` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='房产租赁';

-- ----------------------------
-- Table structure for home_job
-- ----------------------------
DROP TABLE IF EXISTS `home_job`;
CREATE TABLE `home_job` (
  `UUID` bigint(20) NOT NULL AUTO_INCREMENT,
  `province` varchar(100) DEFAULT NULL,
  `town` varchar(100) DEFAULT NULL,
  `county` varchar(100) DEFAULT NULL,
  `addr` varchar(200) DEFAULT NULL,
  `job_key` varchar(100) DEFAULT NULL,
  `job_title` varchar(200) DEFAULT NULL,
  `salary_unit` varchar(10) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `job_remark` varchar(1000) DEFAULT NULL,
  `about_us` varchar(1000) DEFAULT NULL,
  `connector` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `eff_end_time` datetime DEFAULT NULL,
  `eff_start_time` datetime DEFAULT NULL,
  `plot_code` bigint(20) DEFAULT NULL,
  `plot_name` varchar(200) DEFAULT NULL,
  `creator` bigint(20) DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `modifier` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='工作机会';

-- ----------------------------
-- Table structure for home_notice
-- ----------------------------
DROP TABLE IF EXISTS `home_notice`;
CREATE TABLE `home_notice` (
  `UUID` bigint(6) NOT NULL AUTO_INCREMENT,
  `plot_code` bigint(6) DEFAULT NULL,
  `plot_name` varchar(100) DEFAULT NULL,
  `notice_title` varchar(200) DEFAULT NULL,
  `notice_detail` varchar(2000) DEFAULT NULL,
  `notice_type` varchar(200) DEFAULT NULL,
  `creator` bigint(20) DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `modifier` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='公告详情';

-- ----------------------------
-- Table structure for home_order
-- ----------------------------
DROP TABLE IF EXISTS `home_order`;
CREATE TABLE `home_order` (
  `UUID` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_code` bigint(20) DEFAULT NULL,
  `order_name` varchar(100) DEFAULT NULL,
  `order_type` smallint(6) DEFAULT NULL,
  `order_status` smallint(6) DEFAULT NULL,
  `plot_code` bigint(20) DEFAULT NULL,
  `plot_name` varchar(200) DEFAULT NULL,
  `corp_id` bigint(20) DEFAULT NULL,
  `eff_end_time` datetime DEFAULT NULL,
  `eff_start_time` datetime DEFAULT NULL,
  `creator` bigint(20) DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `modifier` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='订单';

-- ----------------------------
-- Table structure for home_plot
-- ----------------------------
DROP TABLE IF EXISTS `home_plot`;
CREATE TABLE `home_plot` (
  `UUID` bigint(6) NOT NULL AUTO_INCREMENT,
  `plot_code` bigint(6) DEFAULT NULL,
  `plot_name` varchar(200) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `town` varchar(100) DEFAULT NULL,
  `county` varchar(100) DEFAULT NULL,
  `addr` varchar(200) DEFAULT NULL,
  `owner` bigint(20) DEFAULT NULL,
  `creator` bigint(20) DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `modifier` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='小区详情';

-- ----------------------------
-- Table structure for home_pwd_log
-- ----------------------------
DROP TABLE IF EXISTS `home_pwd_log`;
CREATE TABLE `home_pwd_log` (
  `NUMBER` varchar(32) DEFAULT NULL COMMENT '编号',
  `PWD_CHANGE_TIME` varchar(20) DEFAULT NULL COMMENT '密码变更时间',
  `PWD_CHANGERID` varchar(32) DEFAULT NULL COMMENT '密码变更者ID',
  `STATE` smallint(6) DEFAULT NULL COMMENT '密码变更状态0：失败 1：成功',
  `PWD_PHONE` varchar(20) DEFAULT NULL COMMENT '密码变更手机号',
  `PWD_CHANGER_DEP` varchar(32) DEFAULT NULL COMMENT '密码变更者所属部门'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='密码变更日志';

-- ----------------------------
-- Table structure for home_role_res_ref
-- ----------------------------
DROP TABLE IF EXISTS `home_role_res_ref`;
CREATE TABLE `home_role_res_ref` (
  `UUID` varchar(32) NOT NULL COMMENT 'uuid',
  `MENU_ID` varchar(32) DEFAULT NULL COMMENT '资源ID',
  `APP_ID` varchar(32) DEFAULT NULL COMMENT '应用ID',
  `ROLE_ID` varchar(32) DEFAULT NULL COMMENT '角色ID',
  `CREATOR` varchar(32) DEFAULT NULL COMMENT '创建者',
  `WHO_MODIFIED` varchar(32) DEFAULT NULL COMMENT '修改者',
  `TIME_CREATED` varchar(20) DEFAULT NULL COMMENT '创建时间',
  `TIME_MODIFIED` varchar(20) DEFAULT NULL COMMENT '修改时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色与菜单关系表';

-- ----------------------------
-- Table structure for home_shop
-- ----------------------------
DROP TABLE IF EXISTS `home_shop`;
CREATE TABLE `home_shop` (
  `shop_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `shop_name` varchar(100) DEFAULT NULL,
  `shop_addr` varchar(200) DEFAULT NULL,
  `shop_scope` varchar(200) DEFAULT NULL,
  `shop_leader` varchar(50) DEFAULT NULL,
  `shop_leader_phone` varchar(16) DEFAULT NULL,
  `shop_contact` varchar(24) DEFAULT NULL,
  `logo` varchar(100) DEFAULT NULL,
  `shop_remark` varchar(200) DEFAULT NULL,
  `effect_start_time` datetime DEFAULT NULL,
  `effect_end_time` datetime DEFAULT NULL,
  `plot_code` bigint(20) DEFAULT NULL,
  `plot_name` varchar(200) DEFAULT NULL,
  `creator` bigint(20) DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `modifier` bigint(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`shop_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='商铺信息';

-- ----------------------------
-- Table structure for home_signin_log
-- ----------------------------
DROP TABLE IF EXISTS `home_signin_log`;
CREATE TABLE `home_signin_log` (
  `USER_ID` varchar(32) DEFAULT NULL COMMENT '用户ID',
  `TIME_SIGNIN` varchar(20) DEFAULT NULL COMMENT '登录时间',
  `SIGNIN_STATE` int(1) DEFAULT NULL COMMENT '0：失败 1：成功 2：异常',
  `SIGER_NAME` varchar(20) DEFAULT NULL COMMENT '登录用户名称',
  `TIME_SIGNOUT` varchar(20) DEFAULT NULL COMMENT '用户退出时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='登录日志信息';

-- ----------------------------
-- Table structure for home_user_role_ref
-- ----------------------------
DROP TABLE IF EXISTS `home_user_role_ref`;
CREATE TABLE `home_user_role_ref` (
  `UUID` varchar(32) NOT NULL COMMENT 'uuid',
  `CORP_ID` varchar(32) DEFAULT NULL COMMENT '企业id',
  `EMP_ID` varchar(32) DEFAULT NULL COMMENT '员工ID',
  `USER_ID` varchar(32) DEFAULT NULL COMMENT '用户ID，用户表的UUID',
  `APP_ID` varchar(32) DEFAULT NULL COMMENT '应用ID',
  `ROLE_ID` varchar(32) DEFAULT NULL COMMENT '角色ID',
  `START_TIME` varchar(20) DEFAULT NULL COMMENT '有效期开始时间',
  `END_TIME` varchar(32) DEFAULT NULL COMMENT '有效期结束时间',
  `CERATOR` varchar(32) DEFAULT NULL COMMENT '创建者',
  `WHO_MODIFIED` varchar(32) DEFAULT NULL COMMENT '修改者',
  `TIME_CREATED` varchar(20) DEFAULT NULL COMMENT '创建时间',
  `TIME_MODIFIED` varchar(20) DEFAULT NULL COMMENT '修改时间',
  `STATE` int(1) DEFAULT NULL COMMENT '状态（1：正常，2：停用）',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户和角色关系表';
