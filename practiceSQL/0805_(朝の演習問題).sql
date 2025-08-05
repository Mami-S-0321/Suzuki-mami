INSERT INTO categories(id, name, registration_date, update_date) VALUES (1, '�َq��', SYSDATE, SYSDATE);
INSERT INTO categories(id, name, registration_date, update_date) VALUES (2, '���[��', SYSDATE, SYSDATE);
INSERT INTO categories(id, name, registration_date, update_date) VALUES (3, '����', SYSDATE, SYSDATE);
INSERT INTO categories(id, name, registration_date, update_date) VALUES (4, '�ߗ�', SYSDATE, SYSDATE);

INSERT INTO items(id, name, price, registration_date, update_date, category_id) VALUES (1, '�V�X�e���蒠(A5�T�C�Y)', 8900, SYSDATE, SYSDATE, 2);
INSERT INTO items(id, name, price, registration_date, update_date, category_id) VALUES (2, '�L�����f�B�[5��Z�b�g', 340, SYSDATE, SYSDATE, 1);
INSERT INTO items(id, name, price, registration_date, update_date, category_id) VALUES (3, '�wJava����x', 2980, SYSDATE, SYSDATE, 3);
INSERT INTO items(id, name, price, registration_date, update_date, category_id) VALUES (4, '�J���[�y��3�F�Z�b�g', 340, SYSDATE, SYSDATE, 2);
INSERT INTO items(id, name, price, registration_date, update_date, category_id) VALUES (5, '�wJava ����x�i��2�Łj', 2980, SYSDATE, SYSDATE, 3);

COMMIT;

SELECT * FROM categories;
SELECT * FROM items;
SELECT category_id FROM items;
SELECT DISTINCT category_id FROM items;
SELECT id, name, price FROM items WHERE price = 340;
SELECT id, name FROM categories WHERE name = '�َq��';
UPDATE items SET price = 3480, update_date = SYSDATE WHERE id = 3;
UPDATE items SET price = 3480, update_date = SYSDATE WHERE id = 5;
COMMIT;

DELETE FROM categories WHERE id = 4;
COMMIT;
UPDATE items SET name = '�J���[�����y��3�F�Z�b�g' WHERE id = 4;
ROLLBACK;
INSERT INTO items(id, name, price, registration_date, update_date, category_id) VALUES (6, '�X�e�B�b�N�̂�', 180, SYSDATE, SYSDATE, 2);
SAVEPOINT items_save;
UPDATE items SET price = 240, update_date = SYSDATE WHERE id = 6;
ROLLBACK TO items_save;
COMMIT;

SELECT id, name, (price * 1.1) AS "���i�P���i�ō��݁j" FROM items;
SELECT id,name,price FROM items WHERE price >= 500;
SELECT id,name,price,category_id FROM items WHERE category_id = 2 AND price >= 500;
SELECT id,name,price,category_id FROM items WHERE category_id = 2 OR price <= 1000;
SELECT id,name,price,category_id FROM items WHERE NOT category_id = 2;
SELECT id,name,price FROM items WHERE name LIKE '%�Z�b�g';
SELECT id,name,price FROM items WHERE name LIKE '%Java����%';
SELECT id,name,price FROM items WHERE price BETWEEN 200 AND 500;
SELECT id,name,price FROM items WHERE category_id IN(1,3);
--��10
SELECT COUNT(*) AS "�s��" FROM items WHERE category_id = 2;
SELECT SUM(price) AS "���v" FROM items WHERE category_id = 3;
SELECT AVG(price) AS "����" FROM items WHERE category_id = 2;
SELECT MAX(price) AS "�ő�l" FROM items;
SELECT MIN(price) AS "�ŏ��l" FROM items;
SELECT category_id, AVG(price) AS "���ω��i" FROM items GROUP BY category_id;
SELECT category_id, AVG(price) AS "���ω��i" FROM items GROUP BY category_id HAVING AVG(price) >= 3000;
SELECT category_id, AVG(price) AS "���ω��i" FROM items GROUP BY category_id ORDER BY category_id;
SELECT category_id, AVG(price) AS "���ω��i" FROM items GROUP BY category_id ORDER BY category_id DESC;


