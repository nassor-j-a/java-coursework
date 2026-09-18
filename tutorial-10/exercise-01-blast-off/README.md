# Exercise 7-1 – Blast Off

## Description

Write a recursive method `countdown` that takes a single integer as a parameter and prints the numbers from `n` down to `1`.

After printing `1`, the method should print:

```text
Blastoff!
```

If the parameter is `0`, the method should print only:

```text
Blastoff!
```

## Example

If the user enters:

```text
6
```

The program should display:

```text
6
5
4
3
2
1
Blastoff!
```

## Algorithm

1. Check whether `n` is `0`.
2. If `n` is `0`, print `"Blastoff!"` and stop.
3. Otherwise, print the current value of `n`.
4. Call `countdown` again with `n - 1`.
5. Continue until `n` reaches `0`.

## Base Case

The base case is:

```java
if (n == 0) {
    System.out.println("Blastoff!");
    return;
}
```

This stops the recursive calls.

## Recursive Case

The recursive case is:

```java
System.out.println(n);
countdown(n - 1);
```

The current number is displayed and the method calls itself with the next smaller number.

## Example Walkthrough

For `n = 3`:

```text
countdown(3)
    ↓
prints 3
    ↓
countdown(2)
    ↓
prints 2
    ↓
countdown(1)
    ↓
prints 1
    ↓
countdown(0)
    ↓
prints Blastoff!
```

Output:

```text
3
2
1
Blastoff!
```

For `n = 0`:

```text
countdown(0)
    ↓
prints Blastoff!
```

Output:

```text
Blastoff!
```

## Concepts Used

* Recursion
* Base case
* Recursive case
* Methods
* `Scanner`
* User input

## Complexity

For an input of `n`:

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)` because of the recursive call stack.

## Compile and Run

From the exercise directory:

```bash
javac src/main/java/BlastOff.java
java -cp src/main/java BlastOff
```

## Expected Output

For input `6`:

```text
Enter a number: 6
6
5
4
3
2
1
Blastoff!
```