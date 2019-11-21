/* Populate tables */
INSERT INTO roles (name) VALUES ("NUTRITIONIST");
INSERT INTO roles (name) VALUES ("PATIENT");
INSERT INTO roles (name) VALUES ("ADMIN");

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

INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Franco', 'Gregorini', 69.9, 1.63, 'M');
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Javier', 'Ramos', 53.2, 1.63, 'M');
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Ada', 'Hurtado', 49.5, 1.54, 'F');
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Julio', 'Huarachi', 55.5, 1.65, 'M');


INSERT INTO users (person_id, role_id) VALUES (1,1);
INSERT INTO users (person_id, role_id) VALUES (2,1);
INSERT INTO users (person_id, role_id) VALUES (3,1);
INSERT INTO users (person_id, role_id) VALUES (4,1);
INSERT INTO users (person_id, role_id) VALUES (5,2);
INSERT INTO users (person_id, role_id) VALUES (6,2);
INSERT INTO users (person_id, role_id) VALUES (7,2);
INSERT INTO users (person_id, role_id) VALUES (8,2);
INSERT INTO users (person_id, role_id) VALUES (9,1);
INSERT INTO users (person_id, role_id) VALUES (10,1);
INSERT INTO users (person_id, role_id) VALUES (11,1);
INSERT INTO users (person_id, role_id) VALUES (12,1);
INSERT INTO users (person_id, role_id) VALUES (13,2);
INSERT INTO users (person_id, role_id) VALUES (14,2);
INSERT INTO users (person_id, role_id) VALUES (15,2);
INSERT INTO users (person_id, role_id) VALUES (16,2);


INSERT INTO users (id, email, password, person_id, role_id) VALUES (1,"pgarcia@correo.com","1234",1,1);
INSERT INTO users (id, email, password, person_id, role_id) VALUES (2, "jperez@correo.com","1234",2,1);
INSERT INTO users (id, email, password, person_id, role_id) VALUES (3, "ltorvalds@correo.com","1234",3,1);
INSERT INTO users (id, email, password, person_id, role_id) VALUES (4, "fromero@correo.com","1234",4,1);
INSERT INTO users (id, email, password, person_id, role_id) VALUES (5, "fgregorini@correo.com","1234",5,2);
INSERT INTO users (id, email, password, person_id, role_id) VALUES (6, "jramos@correo.com","1234",6,2);
INSERT INTO users (id, email, password, person_id, role_id) VALUES (7, "ahurtado@correo.com","1234",7,2);
INSERT INTO users (id, email, password, person_id, role_id) VALUES (8, "jhuarachi@correo.com","1234",8,2);


INSERT INTO foods (name, type, portion, calories, carbs, proteins) VALUES ('Tilapia','Pescado', 'tres cuartos', 11.0, 20.5, 34.7)
INSERT INTO foods (name, type, portion, calories, carbs, proteins) VALUES ('Arroz','Cereal', 'mitad', 14.0, 50.3, 3.9)

INSERT INTO recipes (name, description) VALUES ('Pescado a la plancha', 'Comer de acuerdo a lo pedido')
INSERT INTO recipes (name, description) VALUES ('Escabeche de pescado', 'Una solucion para un futuro sano')

-- INSERT INTO nutrition_plans (food_quantity_per_day, target_weight, total_time) VALUES (12, )

