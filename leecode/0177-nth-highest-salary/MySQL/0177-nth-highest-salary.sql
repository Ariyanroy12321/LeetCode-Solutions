CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    RETURN (
        SELECT salary
        FROM (
            SELECT salary,
                   DENSE_RANK() OVER(ORDER BY salary DESC) AS id
            FROM Employee
        ) AS temp
        WHERE id = N
        LIMIT 1
    );
END