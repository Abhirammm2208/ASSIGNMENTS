/*
Problem Statement
David, an academic advisor at a university, has been assigned the task of analyzing student performance across various subjects to provide insights for improving academic programs. He needs to calculate the ranks of students based on their scores in different subjects by joining data from the STUDENT_SCORES and SUBJECT_DETAILS tables.

Tasks to Perform:

Write a query to retrieve the STUDENT_NAME and SCORE for students who took the subject 'Math'. Join the STUDENTS table with the EXAM_SCORES table on the STUDENT_ID field to get the relevant scores for the specified subject.
Write a query to retrieve the STUDENT_NAME of students who scored greater than 90 in the subject 'English'. Join the STUDENTS table with the EXAM_SCORES table on the STUDENT_ID field and filter the results where the subject is 'English' and the score is greater than 90.
Write a query to retrieve the distinct STUDENT_NAME of students who scored 85 or more in any subject. Join the STUDENTS table with the EXAM_SCORES table on the STUDENT_ID field and filter the results to include only those students with a score of 85 or higher.


Note: The user must write only the join queries to select the required records.
*/

SELECT s.STUDENT_NAME, e.SCORE
FROM STUDENTS s
JOIN EXAM_SCORES e ON s.STUDENT_ID = e.STUDENT_ID
WHERE e.SUBJECT = 'Math';

SELECT s.STUDENT_NAME
FROM STUDENTS s
JOIN EXAM_SCORES e ON s.STUDENT_ID = e.STUDENT_ID
WHERE e.SUBJECT = 'English' AND e.SCORE > 90;

SELECT DISTINCT s.STUDENT_NAME
FROM STUDENTS s
JOIN EXAM_SCORES e ON s.STUDENT_ID = e.STUDENT_ID
WHERE e.SCORE >= 85;

