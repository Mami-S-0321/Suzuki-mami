SELECT DEPTNO,DNAME,loc FROM dept;

SELECT ENAME,SUPERIOR,HIREDATE FROM emp;

SELECT DEPTNO,DNAME,loc FROM dept WHERE DEPTNO = 2;

SELECT EMPNO,ENAME,HIREDATE,job FROM emp WHERE job = 'PG';

UPDATE dept SET dname�@= '�l��';
COMMIT;

UPDATE emp SET superior = '��؁@�m', sal = 290000,job = 'SE',deptno�@=01 WHERE empno = 008;
COMMIT;
SELECT * FROM emp;

UPDATE emp SET superior = '��؁@�m', sal = 290000,job = 'SE',deptno�@=01 WHERE empno = 008;
DROP TABLE emp;
CREATE TABLE emp(
--�Ј�NO
  empno VARCHAR2(3) PRIMARY KEY,
  --�Ј���
  ename VARCHAR2(20) NOT NULL,
  --��i
  superior VARCHAR2(20),
 --���Г�
  hiredate DATE NOT NULL,
  --���^
  sal NUMBER NOT NULL,
  --�E��
  job VARCHAR2(30),
  --����NO
  deptno VARCHAR2(2),
  /*dept �e�[�u���� deptno �J������ �֘A�t����B
  ���̂��ߕ\����ɂĐ��񖼂� fk_deptno �ŊO���Q�Ɛ����ݒ肵�Ă���B
  */
  CONSTRAINT fk_deptno FOREIGN KEY(deptno) REFERENCES dept(deptno)
);
INSERT INTO emp VALUES(001,'��� �m',NULL,'2000/01/01',600000,'PL',01);
INSERT INTO emp VALUES(002,'���� �K��', '��� �m','2000/03/22',350000,'�u���b�WSE',01);
INSERT INTO emp VALUES(003,'���� �ЂƂ�',NULL,'2000/01/01',500000,'PL',02);
INSERT INTO emp VALUES(004,'��O �v',' ��� �m','2000/04/01',320000,'SE',01);
INSERT INTO emp VALUES(005,'�^�c ���V',' ��� �m','2001/04/01',300000,'SE',01);
INSERT INTO emp VALUES(006,'��� ��',' ��� �m','2001/04/01',300000,'PE',01);
INSERT INTO emp VALUES(007,'�_�� �w ','���� �ЂƂ�','2001/04/01',280000,'PG',02);
INSERT INTO emp VALUES(008,'���� ��','���� �ЂƂ�','2002/04/01',280000,'PG',02);
INSERT INTO emp VALUES(009,'���� ��','���� �ЂƂ�','2003/04/01',260000,'PG',02);
INSERT INTO emp VALUES(010,'���R �_','���� �ЂƂ�','2006/04/01',180000,'�f�U�C�i�[',02);
COMMIT;
SELECT * FROM emp;

DELETE FROM emp WHERE  empno = 6;
