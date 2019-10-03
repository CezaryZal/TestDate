CREATE DATABASE  IF NOT EXISTS `test_date`;

SET FOREIGN_KEY_CHECKS = 0;


DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment`(
                            `id` INTEGER NOT NULL AUTO_INCREMENT,
                            `nr_token` INTEGER DEFAULT NULL,
                            `date` DATE NOT NULL,
                            `user_id` INTEGER NOT NULL,
                            PRIMARY KEY (`id`)


) ENGINE = InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8;

INSERT INTO `comment` VALUES
(1, 2, '2018-05-23', 1),
(2, 3, '2018-02-23', 1),
(3, 6, '2018-06-23', 2),
(4, 7, '2018-05-25', 2);

SET FOREIGN_KEY_CHECKS = 1;