# Write your MySQL query statement below
SELECT e1.name
from Employee e1
JOIN Employee e2
ON e1.id = e2.managerId 
GROUP BY e2.managerId
HAVING count(e2.managerId) >= 5