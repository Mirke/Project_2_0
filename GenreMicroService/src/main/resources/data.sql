INSERT INTO genre (genre_name) VALUES
                                   ('TRVE Black Metal'),
                                   ('Art-rock'),
                                   ('Psych'),
                                   ('Gaaangsta'),
                                   ('60´s Garage'),
                                   ('Horror');

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
    ('Andreas', 'ROLE_USER'),
    ('Moses Quake', 'ROLE_ADMIN'),
    ('Mikael', 'ROLE_USER'),
    ('Alfred', 'ROLE_ADMIN'),
    ('Lada', 'ROLE_USER')
;