# Exercise 7-10 - Cube Numbers

## Description

Write a program that recursively calculates cube numbers using the given definition.

The definition is:

```text
cube(1) = 1

cube(N) = cube(N - 1) + 3(square(N)) - 3N + 1
```

The `square()` method must also be implemented recursively using:

```text
(N - 1)^2 = N^2 - 2N + 1
```

## File Structure

```text
exercise-10-cube-numbers/
├── README.md
└── src/
    └── main/
        └── java/
            └── CubeNumbers.java
```

## Approach

The program contains two recursive methods:

- `square(int n)` calculates the square of a number.
- `cube(int n)` calculates the cube of a number using `square(int n)`.

## Square Method

The given definition is:

```text
(N - 1)^2 = N^2 - 2N + 1
```

Rearranging it to calculate `N^2`:

```text
N^2 = (N - 1)^2 + 2N - 1
```

Therefore, the recursive method is:

```java
return square(n - 1) + 2 * n - 1;
```

The base case is:

```java
if (n == 1) {
    return 1;
}
```

because:

```text
1^2 = 1
```

## Cube Method

The given definition is:

```text
cube(1) = 1

cube(N) = cube(N - 1) + 3(square(N)) - 3N + 1
```

The base case is:

```java
if (n == 1) {
    return 1;
}
```

The recursive case is:

```java
return cube(n - 1) + 3 * square(n) - 3 * n + 1;
```

## Example

For `N = 3`:

First:

```text
square(1) = 1
square(2) = 1 + 4 - 1 = 4
square(3) = 4 + 6 - 1 = 9
```

Then:

```text
cube(1) = 1

cube(2)
= 1 + 3(4) - 3(2) + 1
= 8

cube(3)
= 8 + 3(9) - 3(3) + 1
= 27
```

Therefore:

```text
3^3 = 27
```

## Sample Output

```text
Enter N: 5
Cube of 5 = 125
```

## Compilation and Execution

From the exercise directory:

```bash
javac src/main/java/CubeNumbers.java
java -cp src/main/java CubeNumbers
```

## Complexity

The `square()` method makes one recursive call for each value down to `1`, so it has:

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

The `cube()` method calls `square(n)` at each recursive level, so with this direct implementation its overall time complexity is:

- **Time Complexity:** O(n²)
- **Space Complexity:** O(n)

The space complexity is O(n) because of the recursive call stack.