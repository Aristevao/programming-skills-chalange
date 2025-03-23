## Problem

Consider a software utility called ‘bq’ that allows the user to read runtime, persistent data structures.

- **Problem #1:** Determine the structure of relation ABC;
- **Problem #2:** Read the first and last records of relation XYZ;
- **Problem #3:** Read key value 10 and the next 2 records.

## bq Commands:

- bq | Starts utility from linux command prompt
- rel <relation name> | Specify which data structure, also known as a relation, to access
- di | Display data structure of relation identified
  key
- key <key values> | Request system to prompt for key values for the relation identified, or specify the key to read
- re k | Read the record associated with the key value identified
- re f | Read the first record
- re l | Read the last record
- re n | Read the next record
- re p | Read the previous record
- x | Exit the utility