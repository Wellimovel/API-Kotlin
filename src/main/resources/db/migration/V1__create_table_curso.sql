CREATE TABLE curso(
    id bigint not null auto_increment,
    nome varchar(50) not null,
    categoria varchar(50) not null,
    primary key(id)
);

insert into curso values(1,'Kotlin', 'Programacao');
insert into curso values(2,'HTML', 'Front-end');