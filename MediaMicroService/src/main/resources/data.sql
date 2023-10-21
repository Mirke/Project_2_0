INSERT INTO media_type (media_type_name)
VALUES ('Song'),
       ('Podcast'),
       ('Video');


INSERT INTO song (media_name, fk_genre, media_type_id)
VALUES ('Sunday Morning Coming Down', 1, 1),
       ('Marilyn will die but...', 2, 1),
       ('Amish Paradise', 3, 1),
       ('Mr. Pharmacist', 4, 1),
       ('Put The Clock Back On The Wall', 4, 1),
       ('Who Killed Marilyn?', 5, 1);

INSERT INTO video (media_name, fk_genre, media_type_id)
VALUES ('Murder was the case', 1, 3),
       ('Autobahn', 2, 3),
       ('Der Model', 3, 3),
       ('Das Boot', 4, 3),
       ('Ich habe Frühstuck gegessen', 5, 3);

INSERT INTO podcast (media_name, fk_genre, media_type_id)
VALUES ('Ibland så är det inte så jävla enkelt', 1, 2),
       ('Who let the dogs out?', 2, 2),
       ('It´s not you, it´s me', 3, 2),
       ('No soup for you!', 4, 2),
       ('Falling down - en studie i sammanbrott', 5, 2);

