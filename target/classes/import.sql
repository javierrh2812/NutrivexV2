/* Populate tables */
INSERT INTO roles (role) VALUES ("NUTRITIONIST");
INSERT INTO roles (role) VALUES ("PATIENT");
INSERT INTO roles (role) VALUES ("ADMIN");

-- INSERT INTO users (person_id, role_id) VALUES (1,1);
-- INSERT INTO users (person_id, role_id) VALUES (2,1);
-- INSERT INTO users (person_id, role_id) VALUES (3,1);
-- INSERT INTO users (person_id, role_id) VALUES (4,1);
-- INSERT INTO users (person_id, role_id) VALUES (5,2);
-- INSERT INTO users (person_id, role_id) VALUES (6,2);
-- INSERT INTO users (person_id, role_id) VALUES (7,2);
-- INSERT INTO users (person_id, role_id) VALUES (8,2);

INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Pedro', 'Garcia', 'Nutricion Deportiva', '1');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Juan', 'Perez', 'Nutricion Pediatrica', '2');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Linus', 'Torvalds', 'Nutricion y dietetica', '3');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('Federico', 'Romero', 'ISAAK II', '4');

INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Franco', 'Gregorini', 69.9, 1.63, 'M');
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Javier', 'Ramos', 53.2, 1.63, 'M');
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Ada', 'Hurtado', 49.5, 1.54, 'F');
INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Julio', 'Huarachi', 55.5, 1.65, 'M');

--INSERT INTO users (enabled, username, password, person_id) VALUES (true, frankox, $2a$10$jCPJdEu.5CqwUyktwfsQfuh0vORxDK590OfN97ouMfu87N9p2U7Oe,1);
-- INSERT INTO users (enabled, username, password, person_id, role_id) VALUES (2, true, frankox,"1234",2,1);
-- INSERT INTO users (enabled, username, password, person_id, role_id) VALUES (3,true, frankox,"1234",3,1);
-- INSERT INTO users (enabled, username, password, person_id, role_id) VALUES (4,true, frankox,"1234",4,1);
-- INSERT INTO users (enabled, username, password, person_id, role_id) VALUES (5,true, frankox,"1234",5,2);
-- INSERT INTO users (enabled, username, password, person_id, role_id) VALUES (6,true, frankox,"1234",6,2);
-- INSERT INTO users (enabled, username, password, person_id, role_id) VALUES (7,true, frankox,"1234",7,2);
-- INSERT INTO users (enabled, username, password, person_id, role_id) VALUES (8,true, frankox,"1234",8,2);


INSERT INTO foods (name, type, portion, calories, carbs, proteins) VALUES ('Tilapia','Pescado', 'tres cuartos', 11.0, 20.5, 34.7)
INSERT INTO foods (name, type, portion, calories, carbs, proteins) VALUES ('Arroz','Cereal', 'mitad', 14.0, 50.3, 3.9)

INSERT INTO recipes (name, description) VALUES ('Pescado a la plancha', 'Comer de acuerdo a lo pedido')
INSERT INTO recipes (name, description) VALUES ('Escabeche de pescado', 'Una solucion para un futuro sano')

-- INSERT INTO nutrition_plans (food_quantity_per_day, target_weight, total_time) VALUES (12, )

