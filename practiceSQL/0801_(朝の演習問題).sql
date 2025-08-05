CREATE TABLE items(
id NUMBER(4) PRIMARY KEY,
name VARCHAR2(30 CHAR) NOT NULL,
name VARCHAR2(30 CHAR) UNIQUE,
price NUMBER(7) NOT NULL,
price NUMBER(7) DEFAULT(0),
registration_date DATE DEFAULT(SYSDATE),
registration_date DATE NOT NULL,
update_date DATE DEFAULT(SYSDATE),
update_date DATE NOT NULL,
category_id NUMBER(4) FOREIGN KEY(categories.id),
);

