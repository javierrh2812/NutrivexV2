/* Populate tables */
INSERT INTO roles (name) VALUES ('ROLE_NUTRITIONIST');
INSERT INTO roles (name) VALUES ('ROLE_PATIENT');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');

INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Ana', 'Herrera', 'Deportiva', '85210');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Lucio', 'Ramos', 'Perinatal', '52822');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Roberto', 'Perez', 'Deportiva', '72528');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Daria', 'Gomez', 'Vegetariana', '03110');

INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Franco', 'Gregorini', 69.9, 1.63, 'M');
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Abigail', 'Marques', 45.5, 1.70, 'F')
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Daniela', 'Tobias', 48.7, 1.50, 'F')
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Tanya', 'degurechaff', 38.47, 1.44, 'F')

INSERT INTO users (person_id, role_id) VALUES (1,1);
INSERT INTO users (person_id, role_id) VALUES (2,1);
INSERT INTO users (person_id, role_id) VALUES (3,1);
INSERT INTO users (person_id, role_id) VALUES (4,1);
INSERT INTO users (person_id, role_id) VALUES (5,2);
INSERT INTO users (person_id, role_id) VALUES (6,2);
INSERT INTO users (person_id, role_id) VALUES (7,2);
INSERT INTO users (person_id, role_id) VALUES (8,2);

