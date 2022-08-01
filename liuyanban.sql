/*
Navicat MySQL Data Transfer

Source Server         : 本地服务器
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : liuyanban

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2022-08-01 14:36:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `content` text COMMENT '内容',
  `created` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('1', '小王', '标题一', '这是内容啊', '2022-07-26 14:04:35');
INSERT INTO `article` VALUES ('2', '小明', '标题二', '大萨达撒', '2022-07-26 14:05:47');
INSERT INTO `article` VALUES ('3', '小红', '大大的一个标题', '内容啊内容啊内容啊内容啊内容啊内容啊内容啊内容啊内容啊内容啊内容啊内容啊内容啊内容啊内容啊内容啊', '2022-07-26 14:55:49');
INSERT INTO `article` VALUES ('6', '小小', '小小的标题', '小小的内容', '2022-07-26 16:01:56');
INSERT INTO `article` VALUES ('7', '新增作者', '新增标题', '新增内容', '2022-07-26 17:14:55');
INSERT INTO `article` VALUES ('8', '小红', '测试小红', '测试测试啊', '2022-08-01 14:34:18');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `article_id` int(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('1', '1', '1', '第一个评论', '2022-08-01 10:47:23');
INSERT INTO `comment` VALUES ('2', '1', '1', '大萨达撒', '2022-08-01 11:03:18');
INSERT INTO `comment` VALUES ('3', '1', '2', '的车VSDVD', '2022-08-01 14:34:38');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '小明', '123456');
INSERT INTO `user` VALUES ('2', '小红', '111111');
