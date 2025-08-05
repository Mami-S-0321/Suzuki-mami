INSERT INTO categories(id, name, registration_date, update_date) VALUES (1, '菓子類', SYSDATE, SYSDATE);
INSERT INTO categories(id, name, registration_date, update_date) VALUES (2, '文房具', SYSDATE, SYSDATE);
INSERT INTO categories(id, name, registration_date, update_date) VALUES (3, '書籍', SYSDATE, SYSDATE);
INSERT INTO categories(id, name, registration_date, update_date) VALUES (4, '衣類', SYSDATE, SYSDATE);

INSERT INTO items(id, name, price, registration_date, update_date, category_id) VALUES (1, 'システム手帳(A5サイズ)', 8900, SYSDATE, SYSDATE, 2);
INSERT INTO items(id, name, price, registration_date, update_date, category_id) VALUES (2, 'キャンディー5種セット', 340, SYSDATE, SYSDATE, 1);
INSERT INTO items(id, name, price, registration_date, update_date, category_id) VALUES (3, '『Java入門』', 2980, SYSDATE, SYSDATE, 3);
INSERT INTO items(id, name, price, registration_date, update_date, category_id) VALUES (4, 'カラーペン3色セット', 340, SYSDATE, SYSDATE, 2);
INSERT INTO items(id, name, price, registration_date, update_date, category_id) VALUES (5, '『Java 入門』（第2版）', 2980, SYSDATE, SYSDATE, 3);

COMMIT;

SELECT * FROM categories;
SELECT * FROM items;
SELECT category_id FROM items;
SELECT DISTINCT category_id FROM items;
SELECT id, name, price FROM items WHERE price = 340;
SELECT id, name FROM categories WHERE name = '菓子類';
UPDATE items SET price = 3480, update_date = SYSDATE WHERE id = 3;
UPDATE items SET price = 3480, update_date = SYSDATE WHERE id = 5;
COMMIT;

DELETE FROM categories WHERE id = 4;
COMMIT;
UPDATE items SET name = 'カラー水性ペン3色セット' WHERE id = 4;
ROLLBACK;
INSERT INTO items(id, name, price, registration_date, update_date, category_id) VALUES (6, 'スティックのり', 180, SYSDATE, SYSDATE, 2);
SAVEPOINT items_save;
UPDATE items SET price = 240, update_date = SYSDATE WHERE id = 6;
ROLLBACK TO items_save;
COMMIT;

SELECT id, name, (price * 1.1) AS "商品単価（税込み）" FROM items;
SELECT id,name,price FROM items WHERE price >= 500;
SELECT id,name,price,category_id FROM items WHERE category_id = 2 AND price >= 500;
SELECT id,name,price,category_id FROM items WHERE category_id = 2 OR price <= 1000;
SELECT id,name,price,category_id FROM items WHERE NOT category_id = 2;
SELECT id,name,price FROM items WHERE name LIKE '%セット';
SELECT id,name,price FROM items WHERE name LIKE '%Java入門%';
SELECT id,name,price FROM items WHERE price BETWEEN 200 AND 500;
SELECT id,name,price FROM items WHERE category_id IN(1,3);
--問10
SELECT COUNT(*) AS "行数" FROM items WHERE category_id = 2;
SELECT SUM(price) AS "合計" FROM items WHERE category_id = 3;
SELECT AVG(price) AS "平均" FROM items WHERE category_id = 2;
SELECT MAX(price) AS "最大値" FROM items;
SELECT MIN(price) AS "最小値" FROM items;
SELECT category_id, AVG(price) AS "平均価格" FROM items GROUP BY category_id;
SELECT category_id, AVG(price) AS "平均価格" FROM items GROUP BY category_id HAVING AVG(price) >= 3000;
SELECT category_id, AVG(price) AS "平均価格" FROM items GROUP BY category_id ORDER BY category_id;
SELECT category_id, AVG(price) AS "平均価格" FROM items GROUP BY category_id ORDER BY category_id DESC;


