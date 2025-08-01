# Write your MySQL query statement below
SELECT Visits.customer_id , count(Visits.visit_id) as count_no_trans
FROM Visits
LEFT JOIN Transactions
ON Visits.visit_id = Transactions.visit_id
where Transactions.transaction_id is NULL
GROUP BY Visits.customer_id