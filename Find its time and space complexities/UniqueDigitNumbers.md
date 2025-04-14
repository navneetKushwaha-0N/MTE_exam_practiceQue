# Count Numbers with Unique Digits

## Problem Description

Given a non-negative integer `n`, count all numbers with unique digits, `x`, where `0 ≤ x < 10^n`.

## Algorithm

1.  If `n == 0`, return 1 (only the number 0).
2.  Initialize `total = 10` (for `n = 1`, counts 0 to 9).
3.  For `k` from 2 to `n`:
    * Initialize `unique = 9` (first digit cannot be 0).
    * Multiply `unique` by `(9, 8, 7, ..., 11 - k)` to count unique digits for `k` digits.
    * Add `unique` to `total`.
4.  Return `total`.

## Time and Space Complexities

* **Time Complexity:** O(n) — The loop runs up to `n` times.
* **Space Complexity:** O(1) — Only variables are used, no extra data structures.

## Explanation

The algorithm counts the numbers with unique digits by considering the number of digits `k` from 1 to `n`.

* For `n = 0`, there is only one number: 0.
* For `n = 1`, there are 10 numbers: 0, 1, 2, ..., 9.
* For `n = 2`, the first digit can be any digit from 1 to 9 (9 choices), and the second digit can be any digit from 0 to 9 except the first digit (9 choices). So, there are 9 * 9 = 81 numbers with unique digits. Total = 10 + 81 = 91.
* For `n = 3`, the first digit can be any digit from 1 to 9 (9 choices), the second digit can be any digit from 0 to 9 except the first digit (9 choices), and the third digit can be any digit from 0 to 9 except the first two digits (8 choices). So, there are 9 * 9 * 8 = 648 numbers with unique digits. Total = 10 + 81 + 648 = 739.
* And so on.

**Example:**

Let's consider `n = 3`.

1.  `total = 10`.
2.  **k = 2:**
    * `unique = 9`.
    * `unique = unique * 9 = 81`.
    * `total = total + unique = 10 + 81 = 91`.
3.  **k = 3:**
    * `unique = 9`.
    * `unique = unique * 9 * 8 = 648`.
    * `total = total + unique = 91 + 648 = 739`.
4.  Return `total = 739`.

**Code Example (Python):**

