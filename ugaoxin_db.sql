/*
Navicat MySQL Data Transfer

Source Server         : 123
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : ugaoxin_db

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2019-08-20 21:09:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `product_id` bigint(20) NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `product_price` decimal(10,2) NOT NULL,
  `remark` varchar(255) NOT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of product
-- ----------------------------

-- ----------------------------
-- Table structure for `product_data`
-- ----------------------------
DROP TABLE IF EXISTS `product_data`;
CREATE TABLE `product_data` (
  `id` bigint(11) NOT NULL,
  `text` varchar(255) DEFAULT NULL,
  `start_date` varchar(255) DEFAULT NULL,
  `end_date` varchar(255) DEFAULT NULL,
  `duration` int(255) DEFAULT NULL,
  `progress` double DEFAULT NULL,
  `parent` int(11) DEFAULT NULL,
  `open` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of product_data
-- ----------------------------
INSERT INTO `product_data` VALUES ('1', '任务1', '01-01-2019', '06-01-2019', '5', '1', '0', '1');
INSERT INTO `product_data` VALUES ('2', '任务2', '04-01-2019', '11-01-2019', '7', '0.5166666666666667', '0', '1');
INSERT INTO `product_data` VALUES ('3', '任务3', '05-01-2019', '21-01-2019', '16', '0.5', '0', '1');
INSERT INTO `product_data` VALUES ('4', '任务4', '09-01-2019', '25-01-2019', '16', '0.1906832298136646', '3', '0');
INSERT INTO `product_data` VALUES ('5', '任务5', '22-01-2019', '27-01-2019', '5', '0.2', '3', '1');
INSERT INTO `product_data` VALUES ('6', '任务6', '27-01-2019', '02-02-2019', '6', '0', '0', '1');
INSERT INTO `product_data` VALUES ('7', '21312321', '03-01-2019', '14-01-2019', '11', '0.4727272727272727', '1', null);
INSERT INTO `product_data` VALUES ('8', '新任務22', '02-01-2019', '13-01-2019', '11', '0.569047619047619', '1', null);

-- ----------------------------
-- Table structure for `product_links`
-- ----------------------------
DROP TABLE IF EXISTS `product_links`;
CREATE TABLE `product_links` (
  `id` bigint(11) DEFAULT NULL,
  `source` bigint(255) DEFAULT NULL,
  `target` bigint(255) DEFAULT NULL,
  `type` int(255) DEFAULT NULL,
  KEY `source` (`source`),
  KEY `target` (`target`),
  CONSTRAINT `product_links_ibfk_1` FOREIGN KEY (`source`) REFERENCES `product_data` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `product_links_ibfk_2` FOREIGN KEY (`target`) REFERENCES `product_data` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of product_links
-- ----------------------------
INSERT INTO `product_links` VALUES ('1', '1', '2', '0');
INSERT INTO `product_links` VALUES ('2', '1', '5', '1');
INSERT INTO `product_links` VALUES ('3', '5', '6', '0');
INSERT INTO `product_links` VALUES ('4', '2', '3', '1');
INSERT INTO `product_links` VALUES ('5', '4', '6', '0');
INSERT INTO `product_links` VALUES ('6', '8', '3', '1');

-- ----------------------------
-- Table structure for `system`
-- ----------------------------
DROP TABLE IF EXISTS `system`;
CREATE TABLE `system` (
  `system_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(255) DEFAULT NULL,
  `admin_password` varchar(255) DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`system_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of system
-- ----------------------------
INSERT INTO `system` VALUES ('1', 'admin', '8cd7a188975d136460d93dcc7f3ec0fb', 'wsw');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `userpassword` varchar(255) DEFAULT NULL,
  `permissions` int(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '123', '2', '123@qq.com');
INSERT INTO `user` VALUES ('2', 'wen', '123', '1', null);
INSERT INTO `user` VALUES ('3', 'shan', '123', '1', null);
INSERT INTO `user` VALUES ('4', 'xxx', '8cd7a188975d136460d93dcc7f3ec0fb', '1', null);
INSERT INTO `user` VALUES ('5', 'xxxxxx', '8cd7a188975d136460d93dcc7f3ec0fb', '1', null);
