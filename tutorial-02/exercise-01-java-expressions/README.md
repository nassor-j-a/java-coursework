# Exercise 2-1 – Java Expressions (Type Conversion)

## Objective
Understand type conversion between `char` and `int`, and observe ASCII behaviour.

---

## Given Code

```java
char c = 'a';
int x = c;

System.out.println(x);

x++;

System.out.println(x);

char v = (char) x;

System.out.println(c);
System.out.println(v);

c++;

System.out.println(c);