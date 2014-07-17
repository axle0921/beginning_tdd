create table person (
        id integer GENERATED BY DEFAULT AS IDENTITY (START WITH 1, INCREMENT BY 1) not null,
        name varchar(40) not null,
        age integer not null,
        primary key(id),
        unique (name)
);