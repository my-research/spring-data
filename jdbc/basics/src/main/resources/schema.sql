CREATE TABLE IF NOT EXISTS users
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(25) NOT NULL,
    infos json NOT NULL
    );
