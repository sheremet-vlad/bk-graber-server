create database if not exists  graber;

use graber;

create table if not exists bet
(
    id          int unsigned auto_increment,
    bet_type_id int unsigned not null,
    match_id    int unsigned not null,
    coef        double       not null,
    bk_1        varchar(128) null,
    bk_2        varchar(45)  null,
    bk_3        varchar(45)  null,
    bk_4        varchar(45)  null,
    bk_5        varchar(45)  null,
    bk_6        varchar(45)  null,
    bk_7        varchar(45)  null,
    team_id     int unsigned not null,
    constraint bet_type_id_UNIQUE
    unique (bet_type_id),
    constraint id_UNIQUE
    unique (id),
    constraint match_id_UNIQUE
    unique (match_id),
    constraint team_id_UNIQUE
    unique (team_id)
    );

create index fk_bet_bet_type1_idx
    on bet (bet_type_id);

create index fk_bet_match1_idx
    on bet (match_id);

create table if not exists bet_type
(
    id   int unsigned auto_increment,
    name varchar(128) not null,
    constraint id_UNIQUE
    unique (id)
    );

alter table bet_type
    add primary key (id);

create table if not exists `match`
(
    id   int unsigned auto_increment,
    name varchar(90) not null,
    constraint id_UNIQUE
    unique (id)
    );

alter table `match`
    add primary key (id);

create table if not exists team
(
    id   int unsigned auto_increment,
    name varchar(256) not null,
    constraint id_UNIQUE
    unique (id)
    );

alter table team
    add primary key (id);

