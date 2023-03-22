create table cards (
    id UUID not null primary key,
    health int not null,
    level int not null,
    name varchar(100) not null,
    attack varchar(100) not null
)