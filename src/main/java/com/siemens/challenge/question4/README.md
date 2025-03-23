## Description

This program determines whether a string `s` can be transformed into string `t` using exactly `k` operations.

Allowed Operations:
Concatenate a lowercase letter from the Portuguese alphabet at the end of the string.
Remove the last character from the string (if the string is empty, it remains empty).
If it's possible to transform s into t using exactly k operations, the program prints "yes", otherwise, it prints "no".

## How to Run

### Prerequisites

- Java 17
- Maven

### Run the Program

Compile and execute with the following command:

```bash
java ConcatRemove.java
```

### Run the Tests

Compile and execute with the following command:

```bash
mvn test
```

## Samples

### Input

```
blablablabla
blablabcde
8
```

### Output

```
yes
```

---

### Input

```
tab
tab
7
```

### Output

```
yes
```