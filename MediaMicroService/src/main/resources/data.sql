# INSERT INTO song (media_name) VALUES ('Sunday Morning Coming Down'),
#     ('Marilyn will die but...'),
#     ('Amish Paradise'),
#     ('Mr. Pharmacist'),
#     ('Put The Clock Back On The Wall'),
#     ('Who Killed Marilyn?');

insert into song(media_name, fk_genre) value ('Cool Ass song', 1)

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