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




