--1-1(system ���[�U�[�ō쐬�ς�)
ALTER SESSION SET CONTAINER = xepdb1;
CREATE USER OraclePracticeUser IDENTIFIED BY systemsss;
--1-2
GRANT ALL PRIVILEGES TO OraclePracticeUser;
--1-3
CREATE TABLE snack(
snack_id NUMBER(3) PRIMARY KEY,
snack_name VARCHAR2(40) NOT NULL,
release_date DATE NOT NULL,
serial_number NUMBER(4) NOT NULL
);
--2-1
INSERT INTO snack VALUES(1,'�L��������','20-10-19',1111);
INSERT INTO snack VALUES(2,'�h���A���`�b�v�X','20-10-20',2222);
INSERT INTO snack VALUES(3,'�`���R','20-10-21',1111);
INSERT INTO snack VALUES(4,'�`���[�C���O�K��','20-10-22',3333);
INSERT INTO snack VALUES(5,'��؃`���R','20-10-23',4444);
INSERT INTO snack VALUES(6,'�N���[���X�e�B�b�N','20-10-24',4444);
INSERT INTO snack VALUES(7,'�v���e�C���o�[','20-10-25',5555);
INSERT INTO snack VALUES(8,'7�ω��̈�','20-10-26',3333);
INSERT INTO snack VALUES(9,'�J���A�Q�N��-�ē���-','20-10-27',5555);
INSERT INTO snack VALUES(10,'�ݖ�����ׂ�','20-10-27',5555);
COMMIT;
--2-2-1
SELECT * FROM snack;
--2-2-2
SELECT * FROM snack WHERE serial_number = 1111;
--2-2-3
SELECT snack_name FROM snack WHERE serial_number = 5555;
--2-3-1
UPDATE snack SET serial_number = 9999 WHERE serial_number = 1111;
--2-3-2
UPDATE snack SET serial_number =1111 WHERE snack_name = '�h���A���`�b�v�X';
UPDATE snack SET release_date ='22-07-28' WHERE snack_name = '�N���[���X�e�B�b�N';
--2-4-1
DELETE FROM snack WHERE serial_number = 5555;
--2-4-2
DELETE FROM snack WHERE release_date = '20-10-20';
--3-1
CREATE TABLE drink(  
drink_id NUMBER(3) PRIMARY KEY,  
drink_name VARCHAR2(40) NOT NULL,  
release_date DATE,  
sel_price NUMBER(4) NOT NULL 
);

INSERT INTO drink VALUES(1,'�R�[��','2020/10/21',100);  
INSERT INTO drink VALUES(2,'�I�����W','2020/10/22',200);  
INSERT INTO drink VALUES(3,'����������','2020/10/22',130);  
INSERT INTO drink VALUES(4,'�E�[������','2020/10/22',130);  
INSERT INTO drink VALUES(5,'�����Ȗ��I��������','2020/10/25',190);  
INSERT INTO drink VALUES(6,'�C�m�~�l��������','2020/10/26',150);  
INSERT INTO drink VALUES(7,'�X�|�[�c�h�����N','2020/10/26',150);  
COMMIT; 
--3-2
SELECT * FROM drink WHERE sel_price >= 150;
--3-3
SELECT drink_name,sel_price FROM drink WHERE sel_price >= 150 AND sel_price <= 200;
--3-4
SELECT drink_name,release_date FROM drink WHERE release_date BETWEEN '20-10-25' AND '20-10-31';
--3-5
SELECT drink_name FROM drink WHERE drink_name LIKE '%�[%';
--3-6
SELECT drink_name FROM drink WHERE drink_name IN('�R�[��','�E�[������');
--4-1
SELECT COUNT(*) FROM drink;
--4-2
SELECT AVG(sel_price) FROM drink;
--4-3
SELECT serial_number, COUNT(*) FROM snack GROUP BY serial_number;
--4-4
SELECT serial_number, COUNT(*) FROM snack  GROUP BY serial_number HAVING serial_number >= 2;
--5-1
SELECT* FROM snack ORDER BY release_date DESC;
--5-2
SELECT* FROM drink ORDER BY release_date ASC,drink_id DESC ;
--5-3
SELECT drink_id AS "drinkID",drink_name FROM drink ORDER BY drink_id DESC;
--6-1
CREATE TABLE drink_genre(  
genre_id NUMBER(3) PRIMARY KEY,  
genre_name VARCHAR2(40) NOT NULL); 

INSERT INTO drink_genre VALUES(1,'�Y�_');  
INSERT INTO drink_genre VALUES(2,'�ʎ���');  
INSERT INTO drink_genre VALUES(3,'����'); 
COMMIT;

ALTER TABLE drink  ADD genre_id NUMBER(3) REFERENCES drink_genre (genre_id);
DELETE FROM drink;
INSERT INTO drink VALUES(1,'�R�[��','2020/10/21',100,1); 
INSERT INTO drink VALUES(2,'�I�����W','2020/10/22',200,2);  
INSERT INTO drink VALUES(3,'����������','2020/10/22',130,null);  
INSERT INTO drink VALUES(4,'�E�[������','2020/10/22',130,3);  
INSERT INTO drink VALUES(5,'�����Ȗ��I��������','2020/10/25',190,2);  
INSERT INTO drink VALUES(6,'�C�m�~�l��������','2020/10/26',150,3);  
INSERT INTO drink VALUES(7,'�X�|�[�c�h�����N','2020/10/26',150,null);  
COMMIT;
--6-2
SELECT d.drink_name,d.sel_price,dg.genre_name,d.genre_id FROM drink d INNER JOIN drink_genre dg ON d.genre_id = dg.genre_id;
--6-3
SELECT d.drink_name,d.sel_price,dg.genre_name,d.genre_id FROM drink d LEFT OUTER JOIN drink_genre dg ON d.genre_id = dg.genre_id;
--7-1-1
CREATE TABLE book(  
book_id NUMBER(3) PRIMARY KEY,  
book_name VARCHAR2(40) NOT NULL,  
release_date DATE,  
sel_price NUMBER(4) NOT NULL 
);
--7-1-2
CREATE SEQUENCE book_id_seq NOCACHE;
--7-1-3
INSERT INTO book VALUES(book_id_seq.NEXTVAL,'���Ɩl��2000�̖�','22-11-16',400);
INSERT INTO book VALUES(book_id_seq.NEXTVAL,'���߂Ă�JavaSilver','00-04-10',480);
INSERT INTO book VALUES(book_id_seq.NEXTVAL,'�������߂̍������s','22-07-29',650);
INSERT INTO book VALUES(book_id_seq.NEXTVAL,'�N���E�h��b/���p','21-10-30',420);
COMMIT;
--7-1-4
DROP SEQUENCE book_id_seq;
--7-2-1
CREATE SEQUENCE genre_id_seq NOCACHE; 
CREATE TABLE book_genre( 
genre_id NUMBER(3) PRIMARY KEY,  
genre_name VARCHAR2(40) NOT NULL 
); 
INSERT INTO book_genre VALUES(genre_id_seq.NEXTVAL,'�G�{');  
INSERT INTO book_genre VALUES(genre_id_seq.NEXTVAL,'�Z�p');  
INSERT INTO book_genre VALUES(genre_id_seq.NEXTVAL,'��y');  
INSERT INTO book_genre VALUES(genre_id_seq.NEXTVAL,'�r�W�l�X');  
INSERT INTO book_genre VALUES(genre_id_seq.NEXTVAL,'���y');  
COMMIT;
ALTER TABLE book ADD genre_id NUMBER(3) REFERENCES book_genre(genre_id); 
DELETE FROM book;
CREATE SEQUENCE book_id_seq NOCACHE;

INSERT INTO book VALUES(book_id_seq.NEXTVAL,'���Ɩl�� 2000 �̖�','2022/11/16',400,1);  
INSERT INTO book VALUES(book_id_seq.NEXTVAL,'���߂Ă� JavaSilver','2000/04/10',480,2);  
INSERT INTO book VALUES(book_id_seq.NEXTVAL,'�������߂̍������s','2022/07/29',650,3);  
INSERT INTO book VALUES(book_id_seq.NEXTVAL,'�N���E�h��b/���p','2021/10/30',420,2);  
COMMIT;
--7-2-3
SELECT book_name,sel_price  FROM book WHERE sel_price > (SELECT AVG(sel_price) FROM book);
