CREATE TABLE IF NOT EXISTS data(
    id bigserial PRIMARY KEY,
    sensor_id bigint NOT NULL,
    timestamp timestamp NOT NULL,
    measurement float NOT NULL,
    type varchar NOT NULL
);