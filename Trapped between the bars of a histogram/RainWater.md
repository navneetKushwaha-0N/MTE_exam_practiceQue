# Trapping Rain Water (Two-Pointer Approach)

## Problem Description

Given an array of non-negative integers `height` representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

## Algorithm (Two-Pointer Approach)

1.  Initialize two pointers: `left = 0`, `right = n - 1` (where `n` is the length of the `height` array).
2.  Initialize `leftMax = 0`, `rightMax = 0`, and `water = 0`.
3.  While `left < right`:
    * If `height[left] < height[right]`:
        * If `height[left] >= leftMax`, update `leftMax = height[left]`.
        * Else, add `leftMax - height[left]` to `water`.
        * Move `left++`.
    * Else:
        * If `height[right] >= rightMax`, update `rightMax = height[right]`.
        * Else, add `rightMax - height[right]` to `water`.
        * Move `right--`.
4.  Return `water`.

## Time and Space Complexities

* **Time Complexity:** O(n) - We traverse the array only once.
* **Space Complexity:** O(1) - We use constant extra space.

## Explanation with Example

**Input:**
Markdown
# Trapping Rain Water (Two-Pointer Approach)

## Problem Description

Given an array of non-negative integers `height` representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

## Algorithm (Two-Pointer Approach)

1.  Initialize two pointers: `left = 0`, `right = n - 1` (where `n` is the length of the `height` array).
2.  Initialize `leftMax = 0`, `rightMax = 0`, and `water = 0`.
3.  While `left < right`:
    * If `height[left] < height[right]`:
        * If `height[left] >= leftMax`, update `leftMax = height[left]`.
        * Else, add `leftMax - height[left]` to `water`.
        * Move `left++`.
    * Else:
        * If `height[right] >= rightMax`, update `rightMax = height[right]`.
        * Else, add `rightMax - height[right]` to `water`.
        * Move `right--`.
4.  Return `water`.

## Time and Space Complexities

* **Time Complexity:** O(n) - We traverse the array only once.
* **Space Complexity:** O(1) - We use constant extra space.

## Explanation with Example

**Input:**

height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]


**Visualization:**

Index:    0  1  2  3  4  5  6  7  8  9  10 11
Heights: [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]