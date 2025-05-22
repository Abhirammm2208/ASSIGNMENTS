--  Your task is to retrieve the Name and Location of all employees who are currently working under Charles.


SELECT E.Name, E.Location
FROM Employee E
JOIN Project P ON E.Id=P.Employeeid
WHERE P.Manager = 'Charles';
