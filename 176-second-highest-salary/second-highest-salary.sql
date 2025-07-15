SELECT MAX(salary) AS SecondHighestSalary
FROM Employee AS e
WHERE e.salary < (SELECT MAX(salary) FROM Employee);
