INSERT INTO users (username, password, enabled)
VALUES
    ('Andreas', '{noop}asd', true),
    ('MosesZal', '{noop}asd', true),
    ('Mikael', '{noop}asd', true),
    ('Alfred', '{noop}asd', true),
    ('Lada', '{noop}asd', true)
;

INSERT INTO authorities (username, authority)
VALUES
    ('MosesZal', 'ROLE_ADMIN'),
    ('Andreas', 'ROLE_USER'),
    ('Mikael', 'ROLE_USER'),
    ('Alfred', 'ROLE_USER'),
    ('Lada', 'ROLE_USER')
;