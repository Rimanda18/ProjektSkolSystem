-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema school.db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema school.db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `school.db` DEFAULT CHARACTER SET utf8 COLLATE utf8_swedish_ci ;
USE `school.db` ;

-- -----------------------------------------------------
-- Table `school.db`.`Admin`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`Admin` (
  `idAdmin` INT NOT NULL AUTO_INCREMENT,
  `Firstname` VARCHAR(35) NOT NULL,
  `Lastname` VARCHAR(35) NOT NULL,
  `Username` VARCHAR(35) NOT NULL,
  `Email` VARCHAR(35) NOT NULL,
  `Password` VARCHAR(35) NOT NULL,
  `Entry` VARCHAR(35) NULL DEFAULT NULL,
  PRIMARY KEY (`idAdmin`),
  UNIQUE INDEX `Email_UNIQUE` (`Email` ASC) VISIBLE,
  UNIQUE INDEX `Username_UNIQUE` (`Username` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `school.db`.`Course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`Course` (
  `idCourse` INT NOT NULL AUTO_INCREMENT,
  `Coursename` VARCHAR(35) NOT NULL,
  PRIMARY KEY (`idCourse`))
ENGINE = InnoDB
AUTO_INCREMENT = 11
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `school.db`.`Admin_has_Course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`Admin_has_Course` (
  `Admin_idAdmin` INT NOT NULL,
  `Course_idCourse` INT NOT NULL,
  PRIMARY KEY (`Admin_idAdmin`, `Course_idCourse`),
  INDEX `fk_Course_has_Admin_Course1_idx` (`Course_idCourse` ASC) VISIBLE,
  INDEX `fk_Course_has_Admin_Admin1_idx` (`Admin_idAdmin` ASC) VISIBLE,
  CONSTRAINT `fk_Course_has_Admin_Admin1`
    FOREIGN KEY (`Admin_idAdmin`)
    REFERENCES `school.db`.`Admin` (`idAdmin`),
  CONSTRAINT `fk_Course_has_Admin_Course1`
    FOREIGN KEY (`Course_idCourse`)
    REFERENCES `school.db`.`Course` (`idCourse`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `school.db`.`Message`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`Message` (
  `idMessage` INT NOT NULL AUTO_INCREMENT,
  `Email` VARCHAR(35) NOT NULL,
  `Message` VARCHAR(500) NOT NULL,
  `Date` DATE NOT NULL,
  PRIMARY KEY (`idMessage`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `school.db`.`Staff`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`Staff` (
  `idStaff` INT NOT NULL AUTO_INCREMENT,
  `Profession` VARCHAR(35) NULL DEFAULT NULL,
  `Firstname` VARCHAR(35) NOT NULL,
  `Lastname` VARCHAR(35) NOT NULL,
  `Username` VARCHAR(35) NOT NULL,
  `Email` VARCHAR(35) NOT NULL,
  `Password` VARCHAR(35) NOT NULL,
  PRIMARY KEY (`idStaff`),
  UNIQUE INDEX `Email_UNIQUE` (`Email` ASC) VISIBLE,
  UNIQUE INDEX `Username_UNIQUE` (`Username` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 9
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `school.db`.`Student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`Student` (
  `idStudent` INT NOT NULL AUTO_INCREMENT,
  `Firstname` VARCHAR(35) NOT NULL,
  `Lastname` VARCHAR(35) NOT NULL,
  `Username` VARCHAR(35) NOT NULL,
  `Email` VARCHAR(35) NOT NULL,
  `Password` VARCHAR(35) NOT NULL,
  PRIMARY KEY (`idStudent`),
  UNIQUE INDEX `Email_UNIQUE` (`Email` ASC) VISIBLE,
  UNIQUE INDEX `Username_UNIQUE` (`Username` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 18
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `school.db`.`Teacher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`Teacher` (
  `idTeacher` INT NOT NULL AUTO_INCREMENT,
  `Firstname` VARCHAR(35) NOT NULL,
  `Lastname` VARCHAR(35) NOT NULL,
  `Username` VARCHAR(35) NOT NULL,
  `Email` VARCHAR(35) NOT NULL,
  `Password` VARCHAR(35) NOT NULL,
  PRIMARY KEY (`idTeacher`),
  UNIQUE INDEX `Email_UNIQUE` (`Email` ASC) VISIBLE,
  UNIQUE INDEX `Username_UNIQUE` (`Username` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `school.db`.`Course_has_Student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`Course_has_Student` (
  `Course_idCourse` INT NOT NULL,
  `Student_idStudent` INT NOT NULL,
  `Daydate` DATE NULL DEFAULT NULL,
  `Attendance` VARCHAR(35) NULL DEFAULT NULL,
  `Notes` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`Course_idCourse`, `Student_idStudent`),
  INDEX `fk_Course_has_Student1_Student1_idx` (`Student_idStudent` ASC) VISIBLE,
  INDEX `fk_Course_has_Student1_Course1_idx` (`Course_idCourse` ASC) VISIBLE,
  CONSTRAINT `fk_Course_has_Student1_Course1`
    FOREIGN KEY (`Course_idCourse`)
    REFERENCES `school.db`.`Course` (`idCourse`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Course_has_Student1_Student1`
    FOREIGN KEY (`Student_idStudent`)
    REFERENCES `school.db`.`Student` (`idStudent`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `school.db`.`Course_has_Teacher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`Course_has_Teacher` (
  `Course_idCourse` INT NOT NULL,
  `Teacher_idTeacher` INT NOT NULL,
  PRIMARY KEY (`Course_idCourse`, `Teacher_idTeacher`),
  INDEX `fk_Course_has_Teacher_Teacher1_idx` (`Teacher_idTeacher` ASC) VISIBLE,
  INDEX `fk_Course_has_Teacher_Course1_idx` (`Course_idCourse` ASC) VISIBLE,
  CONSTRAINT `fk_Course_has_Teacher_Course1`
    FOREIGN KEY (`Course_idCourse`)
    REFERENCES `school.db`.`Course` (`idCourse`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Course_has_Teacher_Teacher1`
    FOREIGN KEY (`Teacher_idTeacher`)
    REFERENCES `school.db`.`Teacher` (`idTeacher`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
