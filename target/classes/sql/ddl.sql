
CREATE DATABASE IF NOT EXISTS myusers;
USE myusers;

DROP TABLE IF EXISTS `myusers`.`users`;
CREATE TABLE `myusers`.`users` (
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NULL,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `phone` INT NULL,
  PRIMARY KEY (`username`));
 

DROP TABLE IF EXISTS `myusers`.`stock`;
CREATE TABLE `myusers`.`stock` (
  `title` VARCHAR(45) NOT NULL,
  `manufacturer` VARCHAR(45) NULL,
  `price` INT NOT NULL,
  `category` VARCHAR(45) NULL,
  `image` VARCHAR(45) NULL,
  PRIMARY KEY (`title`));