# Exercise 3-3 – Zodiac Sign

## Objective

Write a Java program that accepts a birth month and day, then determines the corresponding Zodiac sign.

---

## Problem Statement

Develop a Java program that prompts the user to enter:

- Birth month (1–12)
- Birth day

The program should determine and display the correct Zodiac sign according to the provided date.

---

## Zodiac Date Ranges

| Zodiac Sign | Date Range |
|-------------|------------|
| Capricorn | December 22 – January 19 |
| Aquarius | January 20 – February 17 |
| Pisces | February 18 – March 19 |
| Aries | March 20 – April 19 |
| Taurus | April 20 – May 20 |
| Gemini | May 21 – June 20 |
| Cancer | June 21 – July 22 |
| Leo | July 23 – August 22 |
| Virgo | August 23 – September 22 |
| Libra | September 23 – October 22 |
| Scorpio | October 23 – November 21 |
| Sagittarius | November 22 – December 21 |

---

## Algorithm

1. Read the month.
2. Read the day.
3. Validate the month.
4. Validate the day for the selected month.
5. Determine the Zodiac sign.
6. Display the result.

---

## Pseudocode

```text
BEGIN

INPUT month
INPUT day

IF month is invalid
    DISPLAY error
    STOP

Determine maximum valid day for the month

IF day is invalid
    DISPLAY error
    STOP

SWITCH(month)

Determine Zodiac sign

DISPLAY sign

END
```

---

## Sample Execution

### Example 1

Input

```text
Month: 7
Day: 15
```

Output

```text
Zodiac Sign: Cancer
```

---

### Example 2

Input

```text
Month: 12
Day: 25
```

Output

```text
Zodiac Sign: Capricorn
```

---

### Example 3

Input

```text
Month: 2
Day: 30
```

Output

```text
Invalid day for the selected month.
```

---

## Test Cases

| Month | Day | Expected Result |
|------:|----:|----------------|
| 1 | 5 | Capricorn |
| 1 | 25 | Aquarius |
| 3 | 10 | Pisces |
| 3 | 25 | Aries |
| 8 | 30 | Virgo |
| 12 | 31 | Capricorn |
| 2 | 30 | Invalid day |
| 15 | 10 | Invalid month |

---

## Time Complexity

```text
O(1)
```

---

## Space Complexity

```text
O(1)
```

---

## Java Concepts Demonstrated

- switch statement
- Conditional operator (`?:`)
- Input validation
- Nested decision making

---

## Source Code

```text
src/main/java/Zodiac.java
```

---

## Lessons Learned

- A `switch` statement is useful when decisions depend on one variable.
- The conditional operator simplifies choosing between two outcomes.
- Validating user input prevents impossible dates from being processed.