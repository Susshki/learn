
use mydb;

create table person(
	ID INT(10) PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(30)
);



create table phone(
	ID INT(10) PRIMARY KEY AUTO_INCREMENT,
    PERSON_ID INT(10),
    PHONE_NUM VARCHAR(10),
    PHONE_TYPE VARCHAR(10),
    FOREIGN KEY(PERSON_ID) references PERSON(ID)    
);

select * from person;
select * from phone;

