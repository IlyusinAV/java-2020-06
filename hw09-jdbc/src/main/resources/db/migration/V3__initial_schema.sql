create table Client
(
    id   bigserial not null primary key,
    name varchar(50),
    age  int
);
create table Account
(
    no   varchar(25),
    type varchar(50),
    rest real
);