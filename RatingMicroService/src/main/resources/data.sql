INSERT INTO thumb_rating(thumbs_up,thumbs_down) VALUES
                                                    (0,0),
                                                    (5,5),
                                                    (-5,-5);

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