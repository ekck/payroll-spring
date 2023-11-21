-- db/migration/V1_0__create_client_schema.sql

CREATE TABLE IF NOT EXISTS "client" (
    "id" SERIAL PRIMARY KEY,
    "name" varchar(20) NOT NULL,
    "email" varchar(50) NOT NULL,
    "date_of_birth" timestamp NOT NULL
);
