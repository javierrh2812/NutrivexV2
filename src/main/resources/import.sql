/* Populate tables */
INSERT INTO roles (name) VALUES ("NUTRITIONIST");
INSERT INTO roles (name) VALUES ("PATIENT");
INSERT INTO roles (name) VALUES ("ADMIN");

INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('John', 'Doe', 'Nutricion Deportiva', '1');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Juan', 'Perez', 'Nutricion Pediatrica', '2');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Linus', 'Torvalds', 'Nutricion y dietetica', '3');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Federico', 'Romero', 'ISAAK II', '4');

INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Franco', 'Gregorini', 69.9, 1.63, 'M');
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Javier', 'Ramos', 53.2, 1.63, 'M');
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Ada', 'Hurtado', 49.5, 1.54, 'F');
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Julio', 'Huarachi', 55.5, 1.65, 'M');

INSERT INTO users (username, password, person_id, role_id) VALUES ("jdoe","1234",1,1);
INSERT INTO users (username, password, person_id, role_id) VALUES ("jperez","1234",2,1);
INSERT INTO users (username, password, person_id, role_id) VALUES ("ltorvalds","1234",3,1);
INSERT INTO users (username, password, person_id, role_id) VALUES ("fromero","1234",4,1);
INSERT INTO users (username, password, person_id, role_id) VALUES ("fgregorini","1234",5,2);
INSERT INTO users (username, password, person_id, role_id) VALUES ("jramos","1234",6,2);
INSERT INTO users (username, password, person_id, role_id) VALUES ("ahurtado","1234",7,2);
INSERT INTO users (username, password, person_id, role_id) VALUES ("jhuarachi","1234",8,2);




