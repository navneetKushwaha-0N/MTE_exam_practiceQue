# Maximum Product Subarray

## Problem Description

Given an integer array `nums`, find the contiguous subarray within an array (containing at least one number) which has the largest product.

## Algorithm

1.  Initialize `maxSoFar = nums[0]`, `minSoFar = nums[0]`, and `result = nums[0]`.
2.  Loop from index `1` to `n-1` (where `n` is the length of `nums`):
    * If the current number `nums[i]` is negative, swap `maxSoFar` and `minSoFar`.
    * Update `maxSoFar = max(nums[i], maxSoFar * nums[i])`.
    * Update `minSoFar = min(nums[i], minSoFar * nums[i])`.
    * Update `result = max(result, maxSoFar)`.
3.  Return `result`.

## Time and Space Complexities

* **Time Complexity:** O(n) — We traverse the array once.
* **Space Complexity:** O(1) — We use constant extra space.

## Explanation

The algorithm works by keeping track of the maximum and minimum product subarrays ending at each position. This is necessary because multiplying by a negative number can turn the smallest (most negative) number into the largest, and vice-versa.

**Example:**

Let's consider the array `nums = [2, 3, -2, 4]`.

1.  `maxSoFar = 2`, `minSoFar = 2`, `result = 2`.
2.  **i = 1:** `nums[1] = 3`.
    * `maxSoFar = max(3, 2 * 3) = 6`.
    * `minSoFar = min(3, 2 * 3) = 3`.
    * `result = max(2, 6) = 6`.
3.  **i = 2:** `nums[2] = -2`.
    * Swap `maxSoFar` and `minSoFar`: `maxSoFar = 3`, `minSoFar = 6`.
    * `maxSoFar = max(-2, 3 * -2) = -2`.
    * `minSoFar = min(-2, 6 * -2) = -12`.
    * `result = max(6, -2) = 6`.
4.  **i = 3:** `nums[3] = 4`.
    * `maxSoFar = max(4, -2 * 4) = 4`.
    * `minSoFar = min(4, -12 * 4) = -48`.
    * `result = max(6, 4) = 6`.

The maximum product is 6, which is the product of the subarray `[2, 3]`.

**Another Example with negative numbers:**

Let's consider the array `nums = [-2, 3, -4]`.

1.  `maxSoFar = -2`, `minSoFar = -2`, `result = -2`.
2.  **i = 1:** `nums[1] = 3`.
    * `maxSoFar = max(3, -2 * 3) = 3`.
    * `minSoFar = min(3, -2 * 3) = -6`.
    * `result = max(-2, 3) = 3`.
3.  **i = 2:** `nums[2] = -4`.
    * Swap `maxSoFar` and `minSoFar`: `maxSoFar = -6`, `minSoFar = 3`.
    * `maxSoFar = max(-4, -6 * -4) = 24`.
    * `minSoFar = min(-4, 3 * -4) = -12`.
    * `result = max(3, 24) = 24`.

The maximum product is 24, which is the product of the subarray `[-2, 3, -4]`.