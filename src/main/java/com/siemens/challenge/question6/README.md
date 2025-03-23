## Student Grades Report

### Description

This script retrieves student grades from two tables: `Students` and `Notes`. The goal is to generate a report that
meets
the following criteria:

- Contains three columns: `Name`, `Grade` and `Value`.
- The report must be in descending order by grade, that is, the highest grades are inserted first.
- If there are more than one student with the same grade (8-10) assigned to them, sort those students in particular by
  their names in **alphabetical order**.
- If the grade is less than 8, use `NULL` as the name and list them in grades in **descending order**.
- If there are more than one student with the same grade (1-7) assigned to them, sort those students in particular by
  their grades in **ascending order**.

### How to run

1. Open the [SQLite Online](https://sqliteonline.com/).
2. Execute the following scripts:

```sql
-- Create the Student table
CREATE TABLE Students (
    ID INTEGER PRIMARY KEY,
    Name TEXT,
    Value INTEGER
);

-- Create the Notes table
CREATE TABLE Notes (
    Grade INTEGER PRIMARY KEY,
    Min_Value INTEGER,
    Max_Value INTEGER
);

-- Populate Student table
INSERT INTO Students (ID, Name, Value) VALUES
(1, 'Julia', 81),
(2, 'Carol', 68),
(3, 'Maria', 99),
(4, 'Andreia', 78),
(5, 'Jaqueline', 63),
(6, 'Marcela', 88);

-- Populate Notes table
INSERT INTO Notes (Grade, Min_Value, Max_Value) VALUES
(1, 0, 9),
(2, 10, 19),
(3, 20, 29),
(4, 30, 39),
(5, 40, 49),
(6, 50, 59),
(7, 60, 69),
(8, 70, 79),
(9, 80, 89),
(10, 90, 100);

-- Run the student_grades_report.sql script
SELECT
    CASE
        WHEN n.Grade < 8 THEN 'NULL'
        ELSE s.Name
    END AS Name,
    n.Grade,
    s.Value
FROM Students s
JOIN Notes n
    ON s.Value BETWEEN n.Min_Value AND n.Max_Value
ORDER BY
    n.Grade DESC,
    CASE
        WHEN n.Grade >= 8 THEN s.Name
        ELSE s.Value
    END ASC;
```

### Expected Output

| Name    | Grade | Value |
|---------|-------|-------|
| Maria   | 10    | 99    |
| Julia   | 9     | 81    |
| Marcela | 9     | 88    |
| Andreia | 8     | 78    |
| NULL    | 7     | 63    |
| NULL    | 7     | 68    |