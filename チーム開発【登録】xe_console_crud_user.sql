SELECT emp_id,emp_name,gender, 
TO_CHAR(birthday, 'yyyy/MM/dd') AS birthday,dept_name 
FROM employee e 
INNER JOIN department d 
ON e.dept_id = d.dept_id
WHERE d.dept_id IN(1,2,3) ORDER BY emp_id;