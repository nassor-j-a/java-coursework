# Tutorial 14 – Exercise 1-7: Majority in Array

## Objective

Given a sorted integer array, determine whether a specified integer `x` is a majority element.

A majority element occurs more than half the length of the array.

## Example

Input:

```text
a = {2, 2, 3, 3, 4, 4, 4, 4, 4}
```

The array contains 9 elements.

- 2 occurs twice.
- 3 occurs twice.
- 4 occurs five times.

Therefore, 4 is the majority element.

## Approach 1: Linear Search

### Method

`isMajorityElement(int x, int[] a)`

### Main Idea

Traverse the entire array and count how many times `x` occurs. Compare the count with half the array length.

### Complexity

- Worst-case time: O(n)
- Additional space: O(1)

This approach works for sorted and unsorted arrays.

## Approach 2: Binary Search

### Method

`isMajorityElementBinary(int x, int[] a)`

### Main Idea

1. Find the first occurrence of `x` using binary search.
2. Calculate the position `first + a.length / 2`.
3. Check that the position is within the array and contains `x`.
4. Return true if the condition holds; otherwise, return false.

### Complexity

- Worst-case time: O(log n)
- Additional space: O(1)

This approach takes advantage of the sorted array.

## Testing

The Main class tests:

1. The first example, where 4 is a majority element.
2. The second example, where no majority element exists.
3. Values that are not majority elements.
4. An additional array with five occurrences of 1.
5. A value that does not exist in the array.

Both implementations should return identical results.

## Comparison

| Measurement | Linear Search | Binary Search |
|---|---|---|
| Worst-case time | O(n) | O(log n) |
| Additional space | O(1) | O(1) |
| Uses sorted property | No | Yes |
| Search technique | Full traversal | First-occurrence binary search |

## Conclusion

Binary search is the preferred approach because the input array is sorted. It improves the worst-case time complexity from O(n) to O(log n), while using constant additional space.

## Compilation and Execution

Run these commands from the exercise directory:

```bash
javac -d out src/main/java/tutorial14/exercise07majorityarray/*.java

java -cp out tutorial14.exercise07majorityarray.Main
```