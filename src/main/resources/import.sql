/* Populate tables */
INSERT INTO roles (name) VALUES ("ROLE_NUTRITIONIST");
INSERT INTO roles (name) VALUES ("ROLE_PATIENT");
INSERT INTO roles (name) VALUES ("ROLE_ADMIN");

INSERT INTO users (username, password, role_id) VALUES ("jdoe","1234",			1);
INSERT INTO users (username, password, role_id) VALUES ("jperez","1234",		1);
INSERT INTO users (username, password, role_id) VALUES ("ltorvalds","1234",		1);
INSERT INTO users (username, password, role_id) VALUES ("fromero","1234",		1);
INSERT INTO users (username, password, role_id) VALUES ("fgregorini","1234",	2);
INSERT INTO users (username, password, role_id) VALUES ("jramos","1234",		2);
INSERT INTO users (username, password, role_id) VALUES ("ahurtado","1234",		2);
INSERT INTO users (username, password, role_id) VALUES ("jhuarachi","1234",		2);

INSERT INTO people (user_id, first_name, last_name, nutritionist_specialty, tuition_number) VALUES (1,'John', 'Doe', 'Nutricion Deportiva', '1');
INSERT INTO people (user_id, first_name, last_name, nutritionist_specialty, tuition_number) VALUES (2,'Juan', 'Perez', 'Nutricion Pediatrica', '2');
INSERT INTO people (user_id, first_name, last_name, nutritionist_specialty, tuition_number) VALUES (3,'Linus', 'Torvalds', 'Nutricion y dietetica', '3');
INSERT INTO people (user_id, first_name, last_name, nutritionist_specialty, tuition_number) VALUES (4,'Federico', 'Romero', 'ISAAK II', '4');
INSERT INTO people (user_id, first_name, last_name, weight, height, sex) 					VALUES (5,'Franco', 'Gregorini', 69.9, 1.63, 'M');
INSERT INTO people (user_id, first_name, last_name, weight, height, sex)					VALUES (6,'Javier', 'Ramos', 53.2, 1.63, 'M');
INSERT INTO people (user_id, first_name, last_name, weight, height, sex) 					VALUES (7,'Ada', 'Hurtado', 49.5, 1.54, 'F');
INSERT INTO people (user_id, first_name, last_name, weight, height, sex) 					VALUES (8,'Julio', 'Huarachi', 55.5, 1.65, 'M');

INSERT INTO recipes (name, description, nutritionist_id) VALUES ("Ensalada 1", "Lechuga + 2 tomates", 1);
INSERT INTO recipes (name, description, nutritionist_id) VALUES ("Batido proteico", "1 platano + fresas + medio vaso de leche", 1);
INSERT INTO recipes (name, description, nutritionist_id) VALUES ("Arroz con Pollo", "Pollo sancochado + 100g arroz", 1);

<<<<<<< HEAD
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Ana', 'Herrera', 'Deportiva', '85210');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Lucio', 'Ramos', 'Perinatal', '52822');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Roberto', 'Perez', 'Deportiva', '72528');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Daria', 'Gomez', 'Vegetariana', '03110');

INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Franco', 'Gregorini', 69.9, 1.63, 'M');
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Abigail', 'Marques', 45.5, 1.70, 'F')
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Daniela', 'Tobias', 48.7, 1.50, 'F')
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Tanya', 'degurechaff', 38.47, 1.44, 'F')

INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Pedro', 'Garcia', 'Nutricion Deportiva', '1');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Juan', 'Perez', 'Nutricion Pediatrica', '2');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Linus', 'Torvalds', 'Nutricion y dietetica', '3');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Federico', 'Romero', 'ISAAK II', '4');
=======
>>>>>>> 7287a2dcd533602f1afca19a0d858e0d1d834708


<<<<<<< HEAD

INSERT INTO users (username, password, person_id, role_id) VALUES ('Mali',"1234",1,1);
INSERT INTO users (username, password, person_id, role_id) VALUES ('Domas', "1234",2,1);
INSERT INTO users (username, password, person_id, role_id) VALUES ('Tomas', "1234",3,1);
INSERT INTO users (username, password, person_id, role_id) VALUES ('JamesA', "1234",4,1);
INSERT INTO users (username, password, person_id, role_id) VALUES ('Francox', "1234",5,2);
INSERT INTO users (username, password, person_id, role_id) VALUES ('ElGranHermano', "1234",6,2);
INSERT INTO users (username, password, person_id, role_id) VALUES ('Ioteayudo', "1234",7,2);
INSERT INTO users (username, password, person_id, role_id) VALUES ('Manito', "1234",8,2);
INSERT INTO users (username, password, person_id, role_id) VALUES ('Wryy',"1234",9,1);
INSERT INTO users (username, password, person_id, role_id) VALUES ('Jojo', "1234",10,1);
INSERT INTO users (username, password, person_id, role_id) VALUES ('ElRamos', "1234",11,1);
INSERT INTO users (username, password, person_id, role_id) VALUES ('MateoTobias', "1234",12,1);
INSERT INTO users (username, password, person_id, role_id) VALUES ('JavierElMiraNalgas',"1234",13,2);
INSERT INTO users (username, password, person_id, role_id) VALUES ('SiSePuede', "1234",14,2);
INSERT INTO users (username, password, person_id, role_id) VALUES ('AlvaroRock', "1234",15,2);
INSERT INTO users (username, password, person_id, role_id) VALUES ('YaSeleOlvido', "1234",16,2);


INSERT INTO foods (name, type, portion, calories, carbs, proteins) VALUES ('Tilapia','Pescado', 'tres cuartos', 11.0, 20.5, 34.7)
INSERT INTO foods (name, type, portion, calories, carbs, proteins) VALUES ('Arroz','Cereal', 'mitad', 14.0, 50.3, 3.9)

INSERT INTO recipes (name, description) VALUES ('Pescado a la plancha', 'Comer de acuerdo a lo pedido')
INSERT INTO recipes (name, description) VALUES ('Escabeche de pescado', 'Una solucion para un futuro sano')

-- INSERT INTO nutrition_plans (food_quantity_per_day, target_weight, total_time) VALUES (12, )
=======
>>>>>>> 7287a2dcd533602f1afca19a0d858e0d1d834708

