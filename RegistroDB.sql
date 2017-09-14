create database if not exists registro  ;
create table if not exists usuarios(
id int auto_increment primary key not null,
user_name varchar(20) not null,
user_password varchar(15) not null,
user_type enum('master','normal') not null
);
insert into usuarios values(
default,
'Testes',
'teste',
'master');