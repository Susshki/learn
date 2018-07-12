use mydb;

DROP TABLE BANK_ACCOUNT
create table bank_account(
	ID INT(10) PRIMARY KEY,
    OWNER VARCHAR(30),
    BALANCE double(10,2)
);

INSERT INTO BANK_ACCount values(1, "OBAMA", 5000);
INSERT INTO BANK_ACCount values(2, "TRUMP", 2000);

select * from BANK_ACCOUNT