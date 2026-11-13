# Tutorial 14 – Exercise 1-6: Remove Duplicates from a Sorted Array

## Objective

Implement two different approaches to remove duplicate values from a sorted integer array.

The array is represented by:

- `int[] a` – stores the integer elements.
- `int nElems` – tracks the number of valid elements.

After removing duplicates, each distinct value must appear exactly once. The relative order of the remaining elements must be preserved, and `nElems` must be updated.

## Approach 1: In-Place Compaction

### Main Idea

Uses two indexes:

- `read` examines each element.
- `write` identifies the position where the next distinct element should be stored.

When a new distinct value is found, it is copied to the `write` position. At the end, `nElems` is updated to the number of distinct elements.

### Complexity

- Worst-case time: O(n)
- Additional space: O(1)

## Approach 2: Repeated Shifting

### Main Idea

Compares adjacent elements. When two consecutive elements are equal, the duplicate is removed by shifting all subsequent elements one position to the left.

The element counter is decremented after every removal.

### Complexity

- Worst-case time: O(n²)
- Additional space: O(1)

## Example

Input:

```text
a = {1,1,1,1,2,2,3,3,3,5}
nElems = 10
```

Expected logical result:

```text
a = {1,2,3,5,...}
nElems = 4
```

## Assignment Comparison

For the given example:

| Measurement | In-Place Compaction | Repeated Shifting |
|---|---:|---:|
| Element assignments | 3 | 28 |
| Final element count | 4 | 4 |
| Additional space | O(1) | O(1) |

## Comparison and Conclusion

In-place compaction is more efficient because it examines each element once and overwrites only the positions needed for distinct values.

Repeated shifting is less efficient when many duplicates exist because each deletion may require moving several elements.

In-place compaction is the recommended approach for larger arrays.

## Compilation and Execution

Run these commands from the exercise directory:

```bash
javac -d out src/main/java/tutorial14/exercise06removeduplicatessortedarray/*.java

java -cp out tutorial14.exercise06removeduplicatessortedarray.Main
```