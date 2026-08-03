# Exercise 5-4 – Number of Digits

## Objective

Write a Java program that repeatedly reads positive integers from the user and displays the number of digits in each integer. The program terminates when the user enters `-1`.

---

## Problem Statement

The program should continue prompting the user for positive integers.

- If the input is a positive integer, display its number of digits.
- If the input is `-1`, terminate the program and print a thank-you message.

---

## Algorithm

1. Start an infinite `do-while` loop.
2. Read an integer.
3. If the integer is `-1`, print **Thank you!** and exit.
4. Otherwise:
   - Store the original number.
   - Count the digits by repeatedly dividing the number by `10`.
   - Print the result.
5. Repeat.

---

## Sample Input

```text
524
24
35790
-1
```

## Sample Output

```text
Please enter a number:
524
Number of digits in 524 = 3

Please enter a number:
24
Number of digits in 24 = 2

Please enter a number:
35790
Number of digits in 35790 = 5

Please enter a number:
-1
Thank you!
```

---

## Concepts Practiced

- `do-while` loops
- Integer division
- Sentinel-controlled repetition
- Counting digits mathematically