create database Login;
use Login;

create table users (
user_id int primary key,
user_firstname  VARCHAR(40) not null,
user_lastname   VARCHAR(40) not null,
user_email    VARCHAR(60) not null,
user_password  VARCHAR(256)
);



