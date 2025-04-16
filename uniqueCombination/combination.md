# ✅ Problem: Find All Unique Combinations of Numbers that Sum to a Target

We need to find all combinations of numbers from a given array such that the sum of the numbers in each combination equals a target value.

## Approach:
We can solve this problem using **backtracking**. At each step, we explore whether to include the current number in the combination or exclude it, and we continue this process recursively.

---

## Algorithm:
1. **Sort the array**: Sorting helps in easily skipping duplicates and optimizing the search.
2. **Backtracking**: We try to build combinations by adding numbers to a current combination and then recursively trying to complete the combination.
3. **Skipping duplicates**: We need to skip duplicate numbers to ensure unique combinations.
4. **Termination condition**: If the sum of the current combination exceeds the target, we stop exploring that combination.

---

## ⏱ Time and 📀 Space Complexity

### Time Complexity:
- **O(2^n)** — In the worst case, we explore all subsets of the input array. Each recursive call either includes or excludes an element.
- We also iterate through the elements, leading to exponential complexity.

### Space Complexity:
- **O(k)** — Where `k` is the maximum depth of the recursion tree (which can be at most `n` in the worst case, where `n` is the number of elements in the array).
- **O(2^n)** — For storing all combinations (in the worst case, where all subsets are valid combinations).
