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