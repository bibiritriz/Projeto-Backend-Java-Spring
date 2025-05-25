-- Inserindo a música
INSERT INTO MUSIC(LENGHT, ALBUM, NAME) VALUES (209, NULL, 'CORAÇÃO CIGANO');
INSERT INTO MUSIC(LENGHT, ALBUM, NAME) VALUES (168, 'Serenata da GG, Vol. 1 (Ao Vivo)', 'Nosso Primeiro Beijo');
INSERT INTO MUSIC(LENGHT, ALBUM, NAME) VALUES (219, NULL, 'Me Perdoa');

-- Inserindo os artistas
INSERT INTO music_artists(music_id, artist) VALUES (1, 'Luan Santana');
INSERT INTO music_artists(music_id, artist) VALUES (1, 'Luísa Sonza');

INSERT INTO music_artists(music_id, artist) VALUES (2, 'Gloria Groove');

INSERT INTO music_artists(music_id, artist) VALUES (3, 'Ferrugem');
INSERT INTO music_artists(music_id, artist) VALUES (3, 'IZA');

-- Inserindo os gêneros
INSERT INTO music_genres(music_id, genre) VALUES (1, 'Sertanejo');
INSERT INTO music_genres(music_id, genre) VALUES (1, 'Pop');

INSERT INTO music_genres(music_id, genre) VALUES (2, 'Pagode');
INSERT INTO music_genres(music_id, genre) VALUES (2, 'MPB');

INSERT INTO music_genres(music_id, genre) VALUES (3, 'Pagode');
INSERT INTO music_genres(music_id, genre) VALUES (3, 'Pop');

-- Inserindo os compositores
INSERT INTO music_song_writers(music_id, song_writer) VALUES (1, 'Luan Santana');
INSERT INTO music_song_writers(music_id, song_writer) VALUES (1, 'Lucas Santos');

INSERT INTO music_song_writers(music_id, song_writer) VALUES (2, 'Brunno Gabryel Lins Cardoso');
INSERT INTO music_song_writers(music_id, song_writer) VALUES (2, 'Daniel Garcia Felicione Napoleão');
INSERT INTO music_song_writers(music_id, song_writer) VALUES (2, 'Laryssa Goulart Loureiro');
INSERT INTO music_song_writers(music_id, song_writer) VALUES (2, 'Rodrigo Machado de Oliveira');

INSERT INTO music_song_writers(music_id, song_writer) VALUES (3, 'Bruno Gabriel');
INSERT INTO music_song_writers(music_id, song_writer) VALUES (3, 'Ferrugem');
INSERT INTO music_song_writers(music_id, song_writer) VALUES (3, 'Thiaguinho');

-- Inserindo os produtores
INSERT INTO music_producers(music_id, producer) VALUES (1, 'Lucas Santos');

INSERT INTO music_producers(music_id, producer) VALUES (2, 'Rafael Castilhol');

INSERT INTO music_producers(music_id, producer) VALUES (3, 'Prateado');