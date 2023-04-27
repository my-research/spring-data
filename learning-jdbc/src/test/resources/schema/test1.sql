drop table if exists foo CASCADE;
create table foo
(
    id   bigint,
    name varchar(255),
    version bigint,
    primary key (id)
);