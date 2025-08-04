# Write your MySQL query statement below
SELECT r.contest_id , round(count(distinct r.user_id) *100 / (select count(user_id) from Users), 2) as percentage 
FROM Register r
JOIN Users u
ON r.user_id = u.user_id
GROUP BY r.contest_id
ORDER BY percentage DESC , contest_id ASC

