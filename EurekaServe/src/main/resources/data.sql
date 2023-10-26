INSERT INTO users (username, password, enabled)
VALUES
    ('Andreas', '{noop}asd', true),
    ('Moses Quake', '{noop}asd', true),
    ('Mikael', '{noop}asd', true),
    ('Alfred', '{noop}asd', true),
    ('Lada', '{noop}asd', true)
;

INSERT INTO authorities (username, authority)
VALUES
    ('Andreas', 'USER'),
    ('Moses Quake', 'ADMIN'),
    ('Mikael', 'USER'),
    ('Alfred', 'ADMIN'),
    ('Lada', 'USER')
;