SELECT i.name AS "���i��" , o.quantity AS "������", o.order_date AS "������"
FROM items i LEFT OUTER JOIN orders o ON i.id = o.item_id;

SELECT name,quantity,order_date FROM (SELECT i.name, o.quantity, o.order_date FROM items i INNER JOIN orders o ON i.id = o.item_id);

SELECT name,quantity,order_date FROM items i INNER JOIN orders o ON i.id = o.item_id WHERE i.price <( SELECT MAX(price) FROM items);

CREATE SEQUENCE seq_item  START WITH 7 NOCACHE;
INSERT INTO items(id, name, price, registration_date, update_date, category_id) VALUES(seq_item.NEXTVAL,'�~���N�`���R���[�g(15����)',270,SYSTEM,SYSTEM,1);
DROP SEQUENCE seq_item;

INSERT INTO items(id, name, price, registration_date, update_date, category_id) VALUES (seq_item.NEXTVAL, '�~���N�`���R���[�g�i15����j', 270, SYSDATE, SYSDATE, 1);
COMMIT;