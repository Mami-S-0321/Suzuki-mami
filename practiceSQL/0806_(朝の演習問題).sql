SELECT 
i.name,
i.price,
c.name
FROM items i INNER JOIN  categories c
ON c.id = i.category_id;

CREATE TABLE customers(
id NUMBER(4) PRIMARY KEY,
name VARCHAR2(25 CHAR) NOT NULL,
mail_address VARCHAR2(254) NOT NULL,
registration_date DATE DEFAULT(SYSDATE) NOT NULL,
update_date DATE DEFAULT(SYSDATE) NOT NULL
);

CREATE TABLE orders(
id NUMBER(5) PRIMARY KEY,
customer_id NUMBER(4) NOT NULL,
item_id NUMBER(4) NOT NULL,
quantity NUMBER(3) NOT NULL,
order_date DATE NOT NULL,
registration_date DATE DEFAULT(SYSDATE),
update_date DATE DEFAULT(SYSDATE),
FOREIGN KEY(customer_id) REFERENCES  customers(id),
FOREIGN KEY(item_id) REFERENCES items(id)

);

INSERT INTO customers VALUES (1, '田中太郎', 't.tanaka@abc.jp', SYSDATE, SYSDATE);
INSERT INTO customers VALUES (2, '鈴木次郎', 'j.suzuki@def.jp', SYSDATE, SYSDATE);
INSERT INTO customers VALUES (3, '渡辺花子', 'h.watanabe@ghi.jp', SYSDATE, SYSDATE);

INSERT INTO orders VALUES (1, 1, 2, 3, '2023-10-12', SYSDATE, SYSDATE);
INSERT INTO orders VALUES (2, 1, 6, 2, '2025-4-3', SYSDATE, SYSDATE);
INSERT INTO orders VALUES (3, 3, 5, 1, '2025-3-15', SYSDATE, SYSDATE);
INSERT INTO orders VALUES (4, 2, 5, 1, '2024-8-3', SYSDATE, SYSDATE);
INSERT INTO orders VALUES (5, 2, 1, 1, '2024-8-3', SYSDATE, SYSDATE);
INSERT INTO orders VALUES (6, 3, 4, 3, '2025-4-3', SYSDATE, SYSDATE);
COMMIT;