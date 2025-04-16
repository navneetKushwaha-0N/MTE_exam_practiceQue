# : Generate All Subsets (Power Set)

We can generate all subsets of a given array using **backtracking** or **bit manipulation**. Here's the backtracking-based approach:

## Steps:

1. Start with an empty subset.
2. At each element, you have two choices: **include it** or **exclude it**.
3. Recursively do this for all elements.
4. Store each subset you build.

---

## ⏱ Time and  Space Complexity

### Time Complexity:
- **O(2ⁿ)** — Each element has two choices (include or exclude), so total subsets = `2^n`.

### Space Complexity:
- **O(2ⁿ × n)** — In the worst case, all `2^n` subsets are stored, and each subset can have up to `n` elements.
