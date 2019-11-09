/* Populate tables */
INSERT INTO roles (name) VALUES ('ROLE_NUTRITIONIST');
INSERT INTO roles (name) VALUES ('ROLE_PATIENT');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');

INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('n1', 'a1', 'e1', '1');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('n2', 'a2', 'e2', '2');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('n3', 'a3', 'e3', '3');
INSERT INTO people (first_name, last_name, nutritionist_specialty, tuition_number) VALUES ('n4', 'a4', 'e4', '4');

INSERT INTO people (first_name, last_name, weight, height, sex) VALUES ('Franco', 'Gregorini', 69.9, 1.63, 'M');

INSERT INTO users (person_id, role_id) VALUES (1,1);
INSERT INTO users (person_id, role_id) VALUES (2,1);
INSERT INTO users (person_id, role_id) VALUES (3,1);
INSERT INTO users (person_id, role_id) VALUES (4,1);
INSERT INTO users (person_id, role_id) VALUES (5,2);

INSERT INTO foods (name, type, portion, calories, carbs, protein) VALUES ('Tilapia','Pescado', 'tres cuartos', 11.0, 20.5, 34.7)
INSERT INTO foods (name, type, portion, calories, carbs, protein) VALUES ('Arroz','Cereal', 'mitad', 11.0, 50.3, 3.9)

INSERT INTO recipes (name, description) VALUES ('Pescado a la plancha', 'Comer de acuerdo a lo pedido')
INSERT INTO recipes (name, description) VALUES ('Escabeche de pescado', 'Una solucion para un futuro sano')

INSERT INTO nutrition_plans (food_quantity_per_day, target_weight, total_time) VALUES (1, )
