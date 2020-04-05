

-- Admin
-- idAdmin,	Firstname, Lastname,  Username, Email, Password, Entry
INSERT INTO `Admin` VALUES (1,'Anton','Meck','Meck99','Anton@admin.com','9080','true'),(2,'Ritva','Stig','Rig','Ritva@admin.com','4050','true');

-- Student
-- idStudent, Firstname, Lastname,  Username, Email, Password
INSERT INTO `Student` VALUES (1,'Evelina','Dalström','Eve','Evelina@gmail.com','1010'),
							 (2,'Anna','Bäck','Ann80','Anna@gmail.com','2020'),
                             (3,'Johan','Ekblom','Jon','Johan@gmail.com','1515'),
                             (4,'Sara','Sand','Sa15','Sara@gmail.com','1414'),
                             (5,'Adam','Viking','Ada','Adam@gmail.com','2313'),
                             (6,'Maria','Milan','Mia','Maria@gmail.com','3333'),
                             (7,'Jocke','Sandström','J95','Jocke@gmail.com','8888'),
                             (8,'Fredrick','Frank','Fredde','Fredrick@gmail.com','4444'),
                             (9,'Sammy','Adolf','Sam','Sammy@gmail.com','5656'),
                             (10,'Frida','Gustavsson','Fr81','Frida@gmail.com','2222'),
                             (11,'Barbro','Ericksson','Bbro','Barbro@gmail.com','1111'),
                             (12,'Erick','Thompsson','Etom','Erick@gmail.com','2121');
                             						
-- Teacher
-- idTeacher, Firstname, Lastname,  Username, Email, Password
INSERT INTO `Teacher` VALUES (1,'Daniel','Vikström','Danne','Daniel@teacher.com','3434'),
							 (2,'Anki','Antonsson','An95','Anki@teacher.com','6767'),
                             (3,'Siv','Bernad','Sivan','Siv@teacher.com','9999'),
                             (4,'Per','Albom','P79','Per@teacher.com','7878'),
                             (5,'Dalia','Mattson','Dal','Dalia@teacher.com','9090'),
                             (6,'Magnus','Ture','Mange','Magnus@teacher.com','4321');
                             
   -- Staff
   -- idStaff,Profession, Firstname, Lastname,  Username, Email, Password
   INSERT INTO `Staff` VALUES (1,'Vaktmästare','Ingvar','Andersson','Ing','Ingvar@gmail.com','8282'),
							  (2,'Sjuksyster','Madeleine','Strand','Madde','Madeleine@gmail.com','9376'),
							  (3,'Lokalvårdare','Ayna','Birgersson','Aya','Ayna@gmail.com','2112'),
                              (4,'Lokalvårdare','Bengt','Engström','Ben','Bengt@gmail.com','7447'),
                              (5,Null,'Andre','Vendel','An','Andre@gmail.com','2345');
                              
-- Course
-- idCourse, Coursename
INSERT INTO `Course` VALUES (1,'Matematik 1A'),(2,'Engelska 1A'),(3,'Engelska 2A'),(4,'Svenska 1'),(5,'Svenska 2'),
(6,'Svenska 3'),(7,'Matematik 2B'),(8,'Matematik  3C'),(9,'Samhäll B2'),(10,'Ekonomi AA');

-- Admin_has_Course
-- Course_idCourse, Admin_idAdmin
INSERT INTO `Admin_has_Course` VALUES (1,3),(1,4),(1,5),(1,6),(1,7),(1,8),(1,9),(1,10),(2,1),(2,2),(2,3),(2,4),(2,5),(2,6),(2,7),(2,8),(2,9),(2,10);

-- Course_has_Student
-- Course_idCourse, Student_idStudent
INSERT INTO `Course_has_Student` VALUES (1,1,null,null,null),(3,1,null,null,null),(4,1,null,null,null),(9,1,null,null,null),(10,1,null,null,null),(3,2,null,null,null),(4,2,null,null,null),(5,2,null,null,null),
										(7,2,null,null,null),(8,2,null,null,null),(10,2,null,null,null),(2,3,null,null,null),(4,3,null,null,null),(5,3,null,null,null),(6,3,null,null,null),(7,3,null,null,null),
                                        (10,3,null,null,null),(2,4,null,null,null),(5,4,null,null,null),(6,4,null,null,null),(9,4,null,null,null),(1,5,null,null,null),(3,5,null,null,null),(4,5,null,null,null),
                                        (5,5,null,null,null),(9,5,null,null,null),(2,6,null,null,null),(4,6,null,null,null),(5,6,null,null,null),(6,6,null,null,null),(7,6,null,null,null),(9,6,null,null,null),
                                        (1,7,null,null,null),(3,7,null,null,null),(6,7,null,null,null),(8,7,null,null,null),(2,8,null,null,null),(7,8,null,null,null),(10,8,null,null,null),(2,9,null,null,null),
                                        (7,9,null,null,null),(10,9,null,null,null),(1,10,null,null,null),(2,10,null,null,null),(7,10,null,null,null),(1,11,null,null,null),(3,11,null,null,null),(8,11,null,null,null),
                                        (1,12,null,null,null),(2,12,null,null,null),(6,12,null,null,null),(9,12,null,null,null);								

-- Teacher
-- Course_idCourse, Student_idStudent
INSERT INTO `school.db`.`Course_has_Teacher` (`Course_idCourse`, `Teacher_idTeacher`) VALUES ('1', '1'), ('4', '1'),('5', '1'),
																							 ('7', '1'),('8', '1'),('2', '2'),
                                                                                             ('4', '3'),('5', '3'),('6', '3'),
                                                                                             ('9', '4'),('10', '5'),('3', '6');




