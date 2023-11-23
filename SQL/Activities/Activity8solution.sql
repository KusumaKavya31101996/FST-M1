SELECT customer_id, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY customer_id
CUSTOMER_ID	Max Amount
3009	2480.4
3005	948.5
3002	5760
3004	1983.43
3003	75.29
3008	250.45
3001	270.65
3007	2400.6

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders  
WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date
SALESMAN_ID	ORDER_DATE	Max Amount
5003	17-AUG-12	110.5
5007	17-AUG-12	75.29

SELECT customer_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders 
GROUP BY customer_id, order_date 
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000)
CUSTOMER_ID	ORDER_DATE	Max Amount
3002	15-AUG-12	5760