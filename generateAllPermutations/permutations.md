# ✅ Problem: Generate All Permutations of a Given Array

## Algorithm:

### Backtracking:
The idea is to **swap elements recursively** to generate all permutations.

1. **Fix one element**: We begin by fixing one element in place.
2. **Swap the rest**: We recursively swap the fixed element with the other elements in the array.
3. **Repeat the process**: This process is repeated recursively for the remaining elements until all elements have been fixed.
4. **Backtrack**: After exploring all possible permutations starting with the current element, we swap back (backtrack) and move to the next element.
5. **Termination condition**: When the current index reaches the end of the array, we have a complete permutation, and we add it to the result list.

### Swap Elements:
By swapping the current element with the other elements, we generate all possible permutations for the current index.

---

## ⏱ Time and 📀 Space Complexity:

### Time Complexity:
- **O(n!)** — The number of permutations of an array of size `n` is `n!`. In the worst case, we generate all `n!` permutations. For each permutation, we perform constant work to copy and add it to the result.

### Space Complexity:
- **O(n!)** — The result list stores all `n!` permutations. Each permutation takes `O(n)` space, so the total space for storing all permutations is `O(n * n!)`.
- **O(n)** — The recursive stack space, which can go up to `O(n)` for the deepest recursion call.

---
