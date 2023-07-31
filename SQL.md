# mysql
## tb_admin
```mysql
/*
 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50640
 Source Host           : localhost:3306
 Source Schema         : db_home
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_admin
-- ----------------------------
DROP TABLE IF EXISTS `tb_admin`;
CREATE TABLE `tb_admin`  (
  `id` int(5) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT COMMENT '序号',
  `adminNumber` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '管理员编号',
  `username` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
  `realName` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '真实姓名',
  `sex` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '性别',
  `age` int(3) NULL DEFAULT NULL COMMENT '年龄',
  `IDCard` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '身份证号',
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_admin
-- ----------------------------
INSERT INTO `tb_admin` VALUES (00001, '1001', '管理员1', '123', '张三', '男', 23, '330381221301241245', '2023-07-31 16:28:34');
INSERT INTO `tb_admin` VALUES (00002, '1200', 'admin2', '123', '里斯', '男', 34, '110011001100110011', '2023-07-31 16:30:29');
INSERT INTO `tb_admin` VALUES (00003, 'a1232', 'admin', '123', '白一', '男', 32, '987654321123456789', '2023-07-31 16:39:34');
INSERT INTO `tb_admin` VALUES (00004, 'a34243', 'a1', '123', '贝贝', '女', 32, '97645568741231564X', '2023-07-31 16:43:30');

SET FOREIGN_KEY_CHECKS = 1;
```

## tb_employee
```mysql
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_employee
-- ----------------------------
DROP TABLE IF EXISTS `tb_employee`;
CREATE TABLE `tb_employee`  (
  `id` int(5) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT COMMENT '序号',
  `employeeNumber` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '员工编号',
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
  `realName` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '真实姓名',
  `sex` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '性别',
  `age` int(3) NULL DEFAULT NULL COMMENT '年龄',
  `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '联系电话',
  `IDCard` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '身份证号',
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_employee
-- ----------------------------
INSERT INTO `tb_employee` VALUES (00001, '2132', 'employee', '123', '小红', '女', 22, '10101010010', '123456789123456789', '2023-07-31 16:32:56');
INSERT INTO `tb_employee` VALUES (00002, 'w2321', 'w1', '123', '小白', NULL, NULL, '12345678910', '123456789123456789', '2023-07-31 16:37:14');
INSERT INTO `tb_employee` VALUES (00003, 'e3244', 'work1', '123', '小李', '男', 32, '11111000001', '12365498765432132X', '2023-07-31 16:44:38');

SET FOREIGN_KEY_CHECKS = 1;
```