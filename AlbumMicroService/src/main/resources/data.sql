INSERT INTO album (album_name) VALUES
                                               ('Yoyoyoyo'),
                                               ('Yoyoyoyo - the sequel'),
                                               ('Yoyoyoyo - tredje gången gillt'),
                                               ('Shit hits hard (when you´re out of luck)'),
                                               ('Dansa i freon'),
                                               ('A Blaze in the Northern Sky'),
                                               ('Damn, it feels good to be a gangsta'),
                                               ('Meteora');

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