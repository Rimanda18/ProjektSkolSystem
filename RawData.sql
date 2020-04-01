

-- Admin
-- idAdmin,	Firstname, Lastname,  Username, Email, Password, Entry
INSERT INTO `Admin` VALUES (1,'Anton','Meck','Meck99','Ritva@ad.com','9080','true'),(2,'Ritva','Stig','Rig','Ritva@gmail.com','4050','true');

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
INSERT INTO `Teacher` VALUES (1,'Daniel','Vikström','Danne','Daniel@gmail.com','3434'),
							 (2,'Anki','Antonsson','An95','Anki@gmail.com','6767'),
                             (3,'Siv','Bernad','Sivan','Siv@teacher.com','9999'),
                             (4,'Per','Albom','P79','Per@teacher.com','7878'),
                             (5,'Dalia','Mattson','Dal','Dalia@teacher.com','9090'),
                             (6,'Magnus','Ture','Mange','Magnus@teacher.com','4321');
                             
   -- Staff
   -- idStaff,Profession, Firstname, Lastname,  Username, Email, Password
   INSERT INTO `staff` VALUES (1,'Vaktmästare','Ingvar','Andersson',' Ing','Ingvar@gmail.com','8282'),
							  (2,'Sjuksyster','Madeleine','Strand',' Madde','Madeleine@gmail.com','9376'),
							  (3,'Lokalvårdare','Ayna','Birgersson',' Aya','Ayna@gmail.com','2112'),
                              (4,'Lokalvårdare','Bengt','Engström',' Ben','Bengt@gmail.com','7447'),
                              (5,Null,'Andre','Vendel',' An','Andre@gmail.com','2345');
                              
-- Course
-- idCourse, Coursename, Teacher_idTeacher
INSERT INTO `Course` VALUES (1,'Mathematics 1A',1),(2,'English 1A',2),(3,'English 2A',6),(4,'Swedish 1',3),(5,'Swedish 2',3),(6,'Swedish 3',3),(7,'Mathematics 2B',1),(8,'Mathematics  3C',1),(9,'Society B2',4),(10,'EconomyAA',5);

-- Admin_has_Course
-- Course_idCourse, Admin_idAdmin
INSERT INTO `Admin_has_Course` VALUES (1,3),(1,4),(1,5),(1,6),(1,7),(1,8),(1,9),(1,10),(2,1),(2,2),(2,3),(2,4),(2,5),(2,6),(2,7),(2,8),(2,9),(2,10);

-- Course_has_Student
-- Course_idCourse, Student_idStudent
INSERT INTO `Course_has_Student` VALUES (1,1),(3,1),(4,1),(9,1),(10,1),(3,2),(4,2),(5,2),(7,2),(8,2),(10,2),(2,3),(4,3),(5,3),(6,3),(7,3),(10,3),(2,4),(5,4),
										(6,4),(9,4),(1,5),(3,5),(4,5),(5,5),(9,5),(2,6),(4,6),(5,6),(6,6),(7,6),(9,6),(1,7),(3,7),(6,7),(8,7),(2,8),(7,8),
										(10,8),(2,9),(7,9),(10,9),(1,10),(2,10),(7,10),(1,11),(3,11),(8,11),(1,12),(2,12),(6,12),(9,12);


