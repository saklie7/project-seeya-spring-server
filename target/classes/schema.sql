drop table if exists member;
drop table if exists board;

create table member(
	memberid varchar(100) not null primary key,
	password varchar(100) not null,
	lastName varchar(10) not null,
	firstName varchar(20) not null,
	job varchar(50),
	email varchar(50),
	nickName varchar(100) not null,
	comment varchar(2000) not null default 'Hello~!!'
);

create table board (
	bno bigint auto_increment not null primary key,
	writer varchar(100) not null, 
	title varchar(255) not null,
	content clob not null,
	reg_date date default sysdate,
	hit_cnt bigint default 0
);
