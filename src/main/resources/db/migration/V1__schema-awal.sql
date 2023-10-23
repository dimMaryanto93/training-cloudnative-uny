create table students
(
    id       character varying(128) not null primary key,
    nim      character varying(15)  not null,
    name     character varying(100),
    smt      integer                not null default 1,
    kelas_id character varying(128)
);