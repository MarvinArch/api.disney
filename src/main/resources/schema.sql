CREATE TABLE characters(
    character_id LONG NOT NULL AUTO_INCREMENT,
    name VARCHAR(75) NOT NULL,
    image VARCHAR(200),
    age INTEGER,
    history TEXT,
    weight INTEGER,
    CONSTRAINT PK_CHARACTERS PRIMARY KEY(character_id)
);

CREATE TABLE genre(
    name VARCHAR(75) NOT NULL,
    image VARCHAR(200),
    CONSTRAINT PK_GENRE PRIMARY KEY(name)
);

CREATE TABLE movie_serie(
    movie_id LONG NOT NULL AUTO_INCREMENT,
    img VARCHAR(200),
    title VARCHAR(75) NOT NULL,
    creation_date DATE NOT NULL,
    qualification DOUBLE,
    name_genre VARCHAR(75) NULL_TO_DEFAULT,
    CONSTRAINT name_genre FOREIGN KEY (name_genre) REFERENCES genre(name),
    CONSTRAINT PK_MOVIE_SERIE PRIMARY KEY(movie_id)
);

CREATE TABLE character_movie(
    id LONG NOT NULL AUTO_INCREMENT,
    fk_character_id  LONG NOT NULL,
    fk_movie_id LONG NOT NULL,
    CONSTRAINT PK_CHARACTERS_MOVIE PRIMARY KEY(id),
    CONSTRAINT fk_movie_id FOREIGN KEY (fk_movie_id) REFERENCES movie_serie (movie_id),
    CONSTRAINT fk_character_id FOREIGN KEY (fk_character_id) REFERENCES characters (character_id)
);


