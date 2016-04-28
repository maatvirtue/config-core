CREATE TABLE `config` (
  `configId` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `key`      VARCHAR(100) NULL,
  `value`    VARCHAR(255) NOT NULL,
  PRIMARY KEY (`configId`),
  UNIQUE INDEX `key_UNIQUE` (`key` ASC)
);
