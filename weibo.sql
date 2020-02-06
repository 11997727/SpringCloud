/*
Navicat MySQL Data Transfer

Source Server         : docker
Source Server Version : 50728
Source Host           : 122.51.34.215:3307
Source Database       : weibo

Target Server Type    : MYSQL
Target Server Version : 50728
File Encoding         : 65001

Date: 2020-02-06 22:47:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT ' 微博id',
  `content` longtext CHARACTER SET utf8 NOT NULL COMMENT ' 内容',
  `publishtime` datetime NOT NULL COMMENT '发布时间',
  `userid` int(11) NOT NULL COMMENT ' 用户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO `blog` VALUES ('17', '11111111', '2020-02-06 04:24:26', '1');
INSERT INTO `blog` VALUES ('18', '1111111111', '2020-02-06 04:24:29', '1');
INSERT INTO `blog` VALUES ('19', '111111111111', '2020-02-06 04:24:32', '1');
INSERT INTO `blog` VALUES ('23', '11111111111111', '2020-02-06 04:24:44', '1');
INSERT INTO `blog` VALUES ('24', '11111111111111', '2020-02-06 04:24:47', '1');
INSERT INTO `blog` VALUES ('25', '1111111111111111111', '2020-02-06 04:24:53', '1');
INSERT INTO `blog` VALUES ('27', '11111111111111111', '2020-02-06 04:25:01', '1');
INSERT INTO `blog` VALUES ('28', '111111111111', '2020-02-06 04:25:04', '1');
INSERT INTO `blog` VALUES ('30', '123', '2020-02-06 05:53:44', '1');
INSERT INTO `blog` VALUES ('33', '222222222222222', '2020-02-06 11:18:47', '1');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(20) CHARACTER SET utf8 NOT NULL COMMENT ' 用户名',
  `password` varchar(40) CHARACTER SET utf8 NOT NULL COMMENT ' 密码',
  `age` int(10) NOT NULL COMMENT ' 年龄',
  `sex` int(10) NOT NULL COMMENT ' 性别',
  `nickname` varchar(20) CHARACTER SET utf8 NOT NULL COMMENT '昵称',
  `moblie` varchar(15) CHARACTER SET utf8 NOT NULL COMMENT ' 手机',
  `address` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT '地址',
  `supper` int(10) unsigned zerofill NOT NULL DEFAULT '0000000001' COMMENT '1 用户     2管理员',
  `prcpath` varchar(255) CHARACTER SET utf8 DEFAULT 'http://q3rk917br.bkt.clouddn.com/20180330234706_stfoo.jpg' COMMENT ' 头像名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'admin', '123456', '27', '1', 'az', '19919990911', '北京', '0000000002', 'http://q3rk917br.bkt.clouddn.com/20180330234706_stfoo.jpg');
INSERT INTO `users` VALUES ('17', 'asd', 'ssss', '23', '1', 'wewe', '11111111', '1111', '0000000001', 'http://q3rk917br.bkt.clouddn.com/20180330234706_stfoo.jpg');
INSERT INTO `users` VALUES ('18', 'asd', 'ssss', '23', '1', 'wewe', '11111111', '1111', '0000000001', 'http://q3rk917br.bkt.clouddn.com/20180330234706_stfoo.jpg');
INSERT INTO `users` VALUES ('19', 'asd', 'ssss', '23', '1', 'wewe', '11111111', '1111', '0000000001', 'http://q3rk917br.bkt.clouddn.com/20180330234706_stfoo.jpg');
INSERT INTO `users` VALUES ('20', 'asd', 'ssss', '23', '1', 'wewe', '11111111', '1111', '0000000001', 'http://q3rk917br.bkt.clouddn.com/20180330234706_stfoo.jpg');
