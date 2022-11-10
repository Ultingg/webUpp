CREATE TABLE IF NOT EXISTS person(
    id serial primary key,
    first_name varchar(255),
    last_name varchar(255)
);

INSERT INTO person (first_name, last_name)
values
    ('Вася', 'Петров'),
    ('David', 'Lapot')
    ;