-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema theSchool.db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema theSchool.db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `theSchool.db` DEFAULT CHARACTER SET utf8 COLLATE utf8_swedish_ci ;
USE `theSchool.db` ;

-- -----------------------------------------------------
-- Table `theSchool.db`.`Admin`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `theSchool.db`.`Admin` (
  `idAdmin` INT NOT NULL AUTO_INCREMENT,
  `Firstname` VARCHAR(35) NOT NULL,
  `Lastname` VARCHAR(35) NOT NULL,
  `Username` VARCHAR(35) NOT NULL,
  `Email` VARCHAR(35) NOT NULL,
  `Password` VARCHAR(35) NOT NULL,
  `Entry` VARCHAR(10) NULL DEFAULT 'Null',
  PRIMARY KEY (`idAdmin`),
  UNIQUE INDEX `Email_UNIQUE` (`Email` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 13
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `theSchool.db`.`Teacher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `theSchool.db`.`Teacher` (
  `idTeacher` INT NOT NULL AUTO_INCREMENT,
  `Firstname` VARCHAR(35) NOT NULL,
  `Lastname` VARCHAR(35) NOT NULL,
  `Username` VARCHAR(35) NOT NULL,
  `Email` VARCHAR(35) NOT NULL,
  `Password` VARCHAR(35) NOT NULL,
  PRIMARY KEY (`idTeacher`),
  UNIQUE INDEX `Email_UNIQUE` (`Email` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `theSchool.db`.`Course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `theSchool.db`.`Course` (
  `idCourse` INT NOT NULL AUTO_INCREMENT,
  `Coursename` VARCHAR(35) NOT NULL,
  `Teacher_idTeacher` INT NOT NULL,
  PRIMARY KEY (`idCourse`),
  INDEX `fk_Course_Teacher1_idx` (`Teacher_idTeacher` ASC) VISIBLE,
  CONSTRAINT `fk_Course_Teacher1`
    FOREIGN KEY (`Teacher_idTeacher`)
    REFERENCES `theSchool.db`.`Teacher` (`idTeacher`))
ENGINE = InnoDB
AUTO_INCREMENT = 11
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `theSchool.db`.`Admin_has_Course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `theSchool.db`.`Admin_has_Course` (
  `Admin_idAdmin` INT NOT NULL,
  `Course_idCourse` INT NOT NULL,
  PRIMARY KEY (`Admin_idAdmin`, `Course_idCourse`),
  INDEX `fk_Course_has_Admin_Admin1_idx` (`Admin_idAdmin` ASC) VISIBLE,
  INDEX `fk_Course_has_Admin_Course1_idx` (`Course_idCourse` ASC) VISIBLE,
  CONSTRAINT `fk_Course_has_Admin_Admin1`
    FOREIGN KEY (`Admin_idAdmin`)
    REFERENCES `theSchool.db`.`Admin` (`idAdmin`),
  CONSTRAINT `fk_Course_has_Admin_Course1`
    FOREIGN KEY (`Course_idCourse`)
    REFERENCES `theSchool.db`.`Course` (`idCourse`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `theSchool.db`.`Staff`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `theSchool.db`.`Staff` (
  `idStaff` INT NOT NULL AUTO_INCREMENT,
  `Profession` VARCHAR(35) NULL DEFAULT NULL,
  `Firstname` VARCHAR(35) NOT NULL,
  `Lastname` VARCHAR(35) NOT NULL,
  `Username` VARCHAR(35) NOT NULL,
  `Email` VARCHAR(35) NOT NULL,
  `Password` VARCHAR(35) NOT NULL,
  PRIMARY KEY (`idStaff`),
  UNIQUE INDEX `Username_UNIQUE` (`Username` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `theSchool.db`.`Student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `theSchool.db`.`Student` (
  `idStudent` INT NOT NULL AUTO_INCREMENT,
  `Firstname` VARCHAR(35) NOT NULL,
  `Lastname` VARCHAR(35) NOT NULL,
  `Username` VARCHAR(35) NOT NULL,
  `Email` VARCHAR(35) NOT NULL,
  `Password` VARCHAR(35) NOT NULL,
  PRIMARY KEY (`idStudent`),
  UNIQUE INDEX `Email_UNIQUE` (`Email` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 32
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `theSchool.db`.`course_has_student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `theSchool.db`.`course_has_student` (
  `Course_idCourse` INT NOT NULL,
  `Student_idStudent` INT NOT NULL,
  `Daydate` DATE NULL DEFAULT NULL,
  `Attendance` VARCHAR(35) NULL DEFAULT NULL,
  `Notes` VARCHAR(35) NULL DEFAULT NULL,
  PRIMARY KEY (`Course_idCourse`, `Student_idStudent`),
  INDEX `fk_Course_has_Student_Student1_idx` (`Student_idStudent` ASC) VISIBLE,
  INDEX `fk_Course_has_Student_Course1_idx` (`Course_idCourse` ASC) VISIBLE,
  CONSTRAINT `fk_Course_has_Student_Course1`
    FOREIGN KEY (`Course_idCourse`)
    REFERENCES `theSchool.db`.`Course` (`idCourse`),
  CONSTRAINT `fk_Course_has_Student_Student1`
    FOREIGN KEY (`Student_idStudent`)
    REFERENCES `theSchool.db`.`Student` (`idStudent`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
