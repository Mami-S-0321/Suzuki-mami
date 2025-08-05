SELECT ename, superior FROM emp WHERE superior IS NOT NULL;
SELECT ename, sal, job FROM emp WHERE sal <= 300000;
SELECT ename, job, deptno FROM emp WHERE job = 'SE' AND deptno = '1';
SELECT ename, job, deptno FROM emp WHERE job = 'PL' OR deptno = '1';
SELECT empno, ename FROM emp WHERE ename LIKE '%��%';
SELECT ename, hiredate FROM emp WHERE hiredate BETWEEN '2000/01/01' AND '2001/12/31';
--���K���8
SELECT COUNT(*) AS "�s��" FROM emp;
SELECT MAX(sal) AS "���^(�ő�l)", MIN(sal) AS " ���^(�ŏ��l)",SUM(sal) AS "���^(���v�l)" FROM emp;
SELECT job, COUNT(*) AS "�s��" FROM emp GROUP BY job;
SELECT empno,ename FROM emp ORDER BY empno DESC;
SELECT deptno,ename, sal FROM emp ORDER BY deptno ASC,sal DESC;
SELECT emp.empno,emp.ename,dept.dname FROM emp INNER JOIN dept ON emp.deptno = dept.deptno;
SELECT e.empno, e.ename, d.dname FROM emp e RIGHT OUTER JOIN dept d ON e.deptno = d.deptno;