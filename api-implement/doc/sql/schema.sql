CREATE DATABASE `resume`;

USE `resume`;

CREATE TABLE `resume` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT '1' COMMENT '-1:del,1:normal',
  `create_time` datetime NOT NULL,
  `last_mod_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `log` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `timestamp` bigint(20) NOT NULL COMMENT '时间戳',
  `date` char(10) NOT NULL COMMENT '日期',
  `time` char(12) NOT NULL COMMENT '时间',
  `level` varchar(5) NOT NULL COMMENT '级别',
  `class` varchar(100) NOT NULL COMMENT '类名',
  `line` varchar(5) NOT NULL COMMENT '行数',
  `message` text NOT NULL COMMENT '信息',
  `error` text COMMENT '错误',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;