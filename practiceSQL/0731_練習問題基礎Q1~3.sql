CREATE TABLE dept(
  deptno VARCHAR2(2) PRIMARY KEY,
  dname VARCHAR2(50) NOT NULL,
  loc VARCHAR2(100)
);

CREATE TABLE emp(
--社員NO
  empno VARCHAR2(3) PRIMARY KEY,
  --社員名
  ename VARCHAR2(20) NOT NULL,
  --上司
  superior VARCHAR2(20),
 --入社日
  hiredate DATE NOT NULL,
  --給与
  sal NUMBER NOT NULL,
  --職種
  job VARCHAR2(30),
  --部署NO
  deptno VARCHAR2(2),
  /*dept テーブルの deptno カラムと 関連付ける。
  そのため表制約にて制約名は fk_deptno で外部参照制約を設定してある。
  */
  CONSTRAINT fk_deptno FOREIGN KEY(deptno) REFERENCES dept(deptno)
);

INSERT INTO dept VALUES(01,'システム企画本部','東京都江東区豊洲 3-3-3');
INSERT INTO dept VALUES(02,'ソリューション事業部','神奈川県川崎市中原区上小田中 4-1-1');
INSERT INTO dept VALUES(03,'営業部','大阪府大阪市中央区城見 1-4-24');
INSERT INTO dept VALUES(04,'総務部',NULL);

INSERT INTO emp VALUES(001,'鈴木 仁',NULL,'2000/01/01',600000,'PL',01);
INSERT INTO emp VALUES(002,'佐藤 幸助', '鈴木 仁','2000/03/22',350000,'ブリッジSE',01);
INSERT INTO emp VALUES(003,'高橋 ひとみ',NULL,'2000/01/01',500000,'PL',02);
INSERT INTO emp VALUES(004,'大前 貢',' 鈴木 仁','2000/04/01',320000,'SE',01);
INSERT INTO emp VALUES(005,'真田 博之',' 鈴木 仁','2001/04/01',300000,'SE',01);
INSERT INTO emp VALUES(006,'大城 勉',' 鈴木 仁','2001/04/01',300000,'PE',01);
INSERT INTO emp VALUES(007,'神城 陣 ','高橋 ひとみ','2001/04/01',280000,'PG',02);
INSERT INTO emp VALUES(008,'結城 瞳','高橋 ひとみ','2002/04/01',280000,'PG',02);
INSERT INTO emp VALUES(009,'博多 弁','高橋 ひとみ','2003/04/01',260000,'PG',02);
INSERT INTO emp VALUES(010,'小山 浩','高橋 ひとみ','2006/04/01',180000,'デザイナー',02);

COMMIT;