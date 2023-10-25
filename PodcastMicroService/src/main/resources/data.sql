INSERT INTO podcast (podcast_name) VALUES
    ('Ibland så är det inte så jävla enkelt'),
    ('Who let the dogs out?'),
    ('It´s not you, it´s me'),
    ('No soup for you!'),
    ('Stop being a wimp, it´s friday!'),
    ('Vox amps - what´s the deal?'),
    ('Falling down - en studie i sammanbrott');

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