-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`KLANT`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`KLANT` (
  `klant_id` INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '',
  `voornaam` VARCHAR(50) NULL COMMENT '',
  `tussenvoegsel` VARCHAR(20) NULL COMMENT '',
  `achternaam` VARCHAR(51) NULL COMMENT '',
  `email` VARCHAR(320) NULL COMMENT '',
  PRIMARY KEY (`klant_id`)  COMMENT '',
  UNIQUE INDEX `klant_id_UNIQUE` (`klant_id` ASC)  COMMENT '')
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`ADRES`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ADRES` (
  `klant_id` INT UNSIGNED NOT NULL COMMENT '',
  `straatnaam` VARCHAR(26) NULL COMMENT '',
  `huisnummer` INT NULL COMMENT '',
  `toevoeging` VARCHAR(6) NULL COMMENT '',
  `postcode` VARCHAR(6) NULL COMMENT '',
  `woonplaats` VARCHAR(26) NULL COMMENT '',
  PRIMARY KEY (`klant_id`)  COMMENT '',
  UNIQUE INDEX `klant_id_UNIQUE` (`klant_id` ASC)  COMMENT '',
  INDEX `klant_id_idx` (`klant_id` ASC)  COMMENT '',
  CONSTRAINT `adres_constraint` UNIQUE (huisnummer, toevoeging, postcode),
  CONSTRAINT `klant_id`
    FOREIGN KEY (`klant_id`)
    REFERENCES `mydb`.`KLANT` (`klant_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`BESTELLING`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`BESTELLING` (
  `bestelling_id` INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '',
  `klant_id` INT UNSIGNED NOT NULL COMMENT '',
  `artikel_id1` INT UNSIGNED NULL COMMENT '',
  `artikel_naam1` VARCHAR(45) NULL COMMENT '',
  `artikel_aantal1` INT UNSIGNED NULL COMMENT '',
  `artikel_prijs1` INT UNSIGNED NULL COMMENT '',
  `artikel_id2` INT UNSIGNED NULL COMMENT '',
  `artikel_naam2` VARCHAR(45) NULL COMMENT '',
  `artikel_aantal2` INT UNSIGNED NULL COMMENT '',
  `artikel_prijs2` INT UNSIGNED NULL COMMENT '',
  `artikel_id3` INT UNSIGNED NULL COMMENT '',
  `artikel_naam3` VARCHAR(45) NULL COMMENT '',
  `artikel_aantal3` INT UNSIGNED NULL COMMENT '',
  `artikel_prijs3` INT UNSIGNED NULL COMMENT '',
  PRIMARY KEY (`bestelling_id`)  COMMENT '',
  UNIQUE INDEX `bestelling_id_UNIQUE` (`bestelling_id` ASC)  COMMENT '',
  INDEX `klant_id_idx` (`klant_id` ASC)  COMMENT '',
  CONSTRAINT `klant_id`
    FOREIGN KEY (`klant_id`)
    REFERENCES `mydb`.`KLANT` (`klant_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
