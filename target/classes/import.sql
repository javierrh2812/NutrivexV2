/* Populate tables */
INSERT INTO roles (name) VALUES ("NUTRITIONIST");
INSERT INTO roles (name) VALUES ("PATIENT");
INSERT INTO roles (name) VALUES ("ADMIN");

INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Pedro', 'Garcia', 'Nutricion Deportiva', '1');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Juan', 'Perez', 'Nutricion Pediatrica', '2');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Linus', 'Torvalds', 'Nutricion y dietetica', '3');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Federico', 'Romero', 'ISAAK II', '4');

INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Franco', 'Gregorini', 69.9, 1.63, 'M');
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Javier', 'Ramos', 53.2, 1.63, 'M');
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Ada', 'Hurtado', 49.5, 1.54, 'F');
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Julio', 'Huarachi', 55.5, 1.65, 'M');

INSERT INTO users (id, email, password, person_id, role_id) VALUES (1,"pgarcia@correo.com","1234",1,1);
INSERT INTO users (id, email, password, person_id, role_id) VALUES (2, "jperez@correo.com","1234",2,1);
INSERT INTO users (id, email, password, person_id, role_id) VALUES (3, "ltorvalds@correo.com","1234",3,1);
INSERT INTO users (id, email, password, person_id, role_id) VALUES (4, "fromero@correo.com","1234",4,1);
INSERT INTO users (id, email, password, person_id, role_id) VALUES (5, "fgregorini@correo.com","1234",5,2);
INSERT INTO users (id, email, password, person_id, role_id) VALUES (6, "jramos@correo.com","1234",6,2);
INSERT INTO users (id, email, password, person_id, role_id) VALUES (7, "ahurtado@correo.com","1234",7,2);
INSERT INTO users (id, email, password, person_id, role_id) VALUES (8, "jhuarachi@correo.com","1234",8,2);

