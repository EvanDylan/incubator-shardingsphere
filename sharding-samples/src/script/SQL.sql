CREATE DATABASE IF NOT EXISTS `ds_0` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;
USE `ds_0`;

CREATE TABLE IF NOT EXISTS `t_order_0` (
                                           `order_id` bigint(20) NOT NULL AUTO_INCREMENT,
                                           `user_id` int(11) NOT NULL,
                                           `status` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                                           PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `t_order_1` (
                                           `order_id` bigint(20) NOT NULL AUTO_INCREMENT,
                                           `user_id` int(11) NOT NULL,
                                           `status` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                                           PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `t_order_item_0` (
                                                `order_item_id` bigint(20) NOT NULL AUTO_INCREMENT,
                                                `order_id` bigint(20) NOT NULL,
                                                `user_id` int(11) NOT NULL,
                                                PRIMARY KEY (`order_item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `t_order_item_1` (
                                                `order_item_id` bigint(20) NOT NULL AUTO_INCREMENT,
                                                `order_id` bigint(20) NOT NULL,
                                                `user_id` int(11) NOT NULL,
                                                PRIMARY KEY (`order_item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE DATABASE IF NOT EXISTS `ds_1` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;
USE `ds_1`;

CREATE TABLE IF NOT EXISTS `t_order_0` (
                                           `order_id` bigint(20) NOT NULL AUTO_INCREMENT,
                                           `user_id` int(11) NOT NULL,
                                           `status` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                                           PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `t_order_1` (
                                           `order_id` bigint(20) NOT NULL AUTO_INCREMENT,
                                           `user_id` int(11) NOT NULL,
                                           `status` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                                           PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `t_order_item_0` (
                                                `order_item_id` bigint(20) NOT NULL AUTO_INCREMENT,
                                                `order_id` bigint(20) NOT NULL,
                                                `user_id` int(11) NOT NULL,
                                                PRIMARY KEY (`order_item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `t_order_item_1` (
                                                `order_item_id` bigint(20) NOT NULL AUTO_INCREMENT,
                                                `order_id` bigint(20) NOT NULL,
                                                `user_id` int(11) NOT NULL,
                                                PRIMARY KEY (`order_item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;