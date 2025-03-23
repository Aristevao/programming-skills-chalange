## Description

This program contains an SQL script retrieve all distinct pet names.

## How to Run

1. Creates tables dogs and cats.
2. Inserts sample data into both tables.
3. Runs the fetch_distinct_pet_names.sql script to select distinct pet names from both tables:

```sql
SELECT name FROM dogs
UNION
SELECT name FROM cats;
```