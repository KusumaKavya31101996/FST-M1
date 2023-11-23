select SUM(purchase_amount) AS "Total sum" from orders
Total sum
17541.18

select AVG(purchase_amount) AS "Average" from orders
Average
1461.765

select MAX(purchase_amount) AS "Maximum" from orders
Maximum
5760

select MIN(purchase_amount) AS "Minumum" from orders
Minumum
65.26

select COUNT(distinct salesman_id) AS "Total count" from orders
Total count
6