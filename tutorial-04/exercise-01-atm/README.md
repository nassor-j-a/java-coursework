# Exercise 4-1 – ATM PIN Verification

## Objective

Write a Java program that simulates an ATM PIN verification system with a maximum of three attempts.

---

## Problem Statement

An ATM generates a random four-digit PIN.

The program should:

1. Generate a random 4-digit PIN.
2. Display the generated PIN (for testing purposes).
3. Allow the user up to **3 attempts** to enter the PIN.
4. If the user enters the correct PIN, display the trial number.
5. If all three attempts are incorrect, lock the account.

---

## Algorithm

1. Generate a random integer between 1000 and 9999.
2. Repeat three times:
   - Read the user's PIN.
   - Compare it with the generated PIN.
   - If correct, display a success message and stop.
   - Otherwise display the remaining attempts.
3. If all attempts fail, display the account locked message.

---

## Pseudocode

```text
BEGIN

Generate random PIN

DISPLAY PIN

FOR trial = 1 TO 3

    INPUT enteredPIN

    IF enteredPIN = generatedPIN

        DISPLAY success message

        STOP

    ELSE

        DISPLAY remaining attempts

    ENDIF

END FOR

DISPLAY account locked

END
```

---

## Sample Execution

### Example 1

```text
Generated PIN: 6523

Enter PIN: 1234

Incorrect PIN. Attempts remaining: 2

Enter PIN: 6523

Correct!

You succeeded in trial number 2.
```

---

### Example 2

```text
Generated PIN: 5643

Enter PIN: 5645

Enter PIN: 5465

Enter PIN: 8888

You exceeded your trials.
We will lock your account!
```

---

## Test Cases

| Generated PIN | Attempts | Result |
|--------------:|----------|--------|
|1234|1234|Success Trial 1|
|1234|1111,1234|Success Trial 2|
|1234|1111,2222,1234|Success Trial 3|
|1234|1111,2222,3333|Account Locked|

---

## Time Complexity

```text
O(1)
```

Maximum of three iterations.

---

## Space Complexity

```text
O(1)
```

---

## Java Concepts Demonstrated

- `for` loops
- `if-else`
- `break`
- `Random`
- User input using `Scanner`

---

## Source Code

```text
src/main/java/ATM.java
```

---

## Lessons Learned

- Loops can limit the number of user attempts.
- The `break` statement exits a loop immediately.
- The `Random` class generates pseudo-random values.