-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';


-- -----------------------------------------------------
-- Schema school.db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema school.db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `school.db` DEFAULT CHARACTER SET utf8 ;
USE `school.db` ;

-- -----------------------------------------------------
-- Table `school.db`.`student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`student` (
  `idStudent` INT(11) NOT NULL AUTO_INCREMENT,
  `Firstname` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Lastname` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Username` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Email` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Password` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  PRIMARY KEY (`idStudent`),
  UNIQUE INDEX `Email_UNIQUE` (`Email` ASC),
  UNIQUE INDEX `Username_UNIQUE` (`Username` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 18
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `school.db`.`course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`course` (
  `idCourse` INT(11) NOT NULL AUTO_INCREMENT,
  `Coursename` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  PRIMARY KEY (`idCourse`))
ENGINE = InnoDB
AUTO_INCREMENT = 11
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `school.db`.`presence`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`presence` (
  `presence_idCourse` INT(11) NOT NULL,
  `presence_idStudent` INT(11) NOT NULL,
  `DayDate` DATE NULL DEFAULT NULL,
  `Attendance` VARCHAR(45) NULL DEFAULT NULL,
  `Notes` VARCHAR(50) NULL DEFAULT NULL,
  INDEX `presence_idStudent_idx` (`presence_idStudent` ASC),
  INDEX `fk_presence_idCourse_idx` (`presence_idCourse` ASC),
  CONSTRAINT `fk_presence_idStudent`
    FOREIGN KEY (`presence_idStudent`)
    REFERENCES `school.db`.`student` (`idStudent`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_presence_idCourse`
    FOREIGN KEY (`presence_idCourse`)
    REFERENCES `school.db`.`course` (`idCourse`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `school.db`.`admin`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`admin` (
  `idAdmin` INT(11) NOT NULL AUTO_INCREMENT,
  `Firstname` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Lastname` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Username` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Email` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Password` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Entry` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NULL DEFAULT NULL,
  PRIMARY KEY (`idAdmin`),
  UNIQUE INDEX `Email_UNIQUE` (`Email` ASC),
  UNIQUE INDEX `Username_UNIQUE` (`Username` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `school.db`.`admin_has_course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`admin_has_course` (
  `Admin_idAdmin` INT(11) NOT NULL,
  `Course_idCourse` INT(11) NOT NULL,
  PRIMARY KEY (`Admin_idAdmin`, `Course_idCourse`),
  INDEX `fk_Course_has_Admin_Course1_idx` (`Course_idCourse` ASC),
  INDEX `fk_Course_has_Admin_Admin1_idx` (`Admin_idAdmin` ASC),
  CONSTRAINT `fk_Course_has_Admin_Admin1`
    FOREIGN KEY (`Admin_idAdmin`)
    REFERENCES `school.db`.`admin` (`idAdmin`),
  CONSTRAINT `fk_Course_has_Admin_Course1`
    FOREIGN KEY (`Course_idCourse`)
    REFERENCES `school.db`.`course` (`idCourse`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `school.db`.`course_has_student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`course_has_student` (
  `Course_idCourse` INT(11) NOT NULL,
  `Student_idStudent` INT(11) NOT NULL,
  PRIMARY KEY (`Course_idCourse`, `Student_idStudent`),
  INDEX `fk_Course_has_Student1_Student1_idx` (`Student_idStudent` ASC),
  INDEX `fk_Course_has_Student1_Course1_idx` (`Course_idCourse` ASC),
  CONSTRAINT `fk_Course_has_Student1_Course1`
    FOREIGN KEY (`Course_idCourse`)
    REFERENCES `school.db`.`course` (`idCourse`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Course_has_Student1_Student1`
    FOREIGN KEY (`Student_idStudent`)
    REFERENCES `school.db`.`student` (`idStudent`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `school.db`.`teacher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`teacher` (
  `idTeacher` INT(11) NOT NULL AUTO_INCREMENT,
  `Firstname` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Lastname` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Username` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Email` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Password` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  PRIMARY KEY (`idTeacher`),
  UNIQUE INDEX `Email_UNIQUE` (`Email` ASC),
  UNIQUE INDEX `Username_UNIQUE` (`Username` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `school.db`.`course_has_teacher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`course_has_teacher` (
  `Course_idCourse` INT(11) NOT NULL,
  `Teacher_idTeacher` INT(11) NOT NULL,
  PRIMARY KEY (`Course_idCourse`, `Teacher_idTeacher`),
  INDEX `fk_Course_has_Teacher_Teacher1_idx` (`Teacher_idTeacher` ASC),
  INDEX `fk_Course_has_Teacher_Course1_idx` (`Course_idCourse` ASC),
  CONSTRAINT `fk_Course_has_Teacher_Course1`
    FOREIGN KEY (`Course_idCourse`)
    REFERENCES `school.db`.`course` (`idCourse`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Course_has_Teacher_Teacher1`
    FOREIGN KEY (`Teacher_idTeacher`)
    REFERENCES `school.db`.`teacher` (`idTeacher`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `school.db`.`message`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`message` (
  `idMessage` INT(11) NOT NULL AUTO_INCREMENT,
  `Email` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Message` VARCHAR(500) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Date` DATE NOT NULL,
  PRIMARY KEY (`idMessage`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;


-- -----------------------------------------------------
-- Table `school.db`.`staff`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school.db`.`staff` (
  `idStaff` INT(11) NOT NULL AUTO_INCREMENT,
  `Profession` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NULL DEFAULT NULL,
  `Firstname` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Lastname` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Username` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Email` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  `Password` VARCHAR(35) CHARACTER SET 'utf8' COLLATE 'utf8_swedish_ci' NOT NULL,
  PRIMARY KEY (`idStaff`),
  UNIQUE INDEX `Email_UNIQUE` (`Email` ASC),
  UNIQUE INDEX `Username_UNIQUE` (`Username` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 9
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
