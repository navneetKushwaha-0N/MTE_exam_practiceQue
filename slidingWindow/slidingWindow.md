# 📚 Sliding Window Technique

## 🔍 What is it?

The sliding window technique is an optimization technique used to reduce the time complexity of certain algorithms that involve arrays or lists. It's especially useful for problems involving **subarrays**, **substrings**, or **contiguous sequences**.

Instead of recalculating results from scratch for each subarray (which is often inefficient), the sliding window keeps track of the current window's result and *slides* it across the array by adding the next element and removing the first element of the previous window.

---

## 🧠 How it Works

- You define a **window size** (fixed or dynamic).
- Start from the beginning of the array.
- Slide the window one element at a time, updating the result accordingly.

---

## 🔧 Types of Sliding Windows

### 1. Fixed-size window
The window has a constant size `k`.

**Example:** Find the maximum sum of any subarray of size `k`.

### 2. Variable-size window
The window expands and contracts based on a condition.

**Example:** Find the longest subarray with a sum less than or equal to `k`.

---

## 💡 Applications in Array Problems

### ✅ Maximum/Minimum in a Subarray
- **Problem:** Find the max element in every subarray of size `k`.
- **Technique:** Use a deque to maintain a sliding window of max elements.

### ✅ Subarray Sum
- **Problem:** Find subarrays with a given sum.
- **Technique:** Use sliding window with two pointers to adjust the window size.

### ✅ Longest Substring Without Repeating Characters
- **Problem:** Find the length of the longest substring without repeating characters.
- **Technique:** Use a hash map and a sliding window that shrinks when duplicates appear.

### ✅ Counting Anagrams or Permutations in a String
- **Problem:** Count how many substrings are anagrams of a pattern.
- **Technique:** Use frequency maps and a sliding window of pattern size.

### ✅ Binary Subarrays with at Most K Ones
- **Problem:** Count subarrays with at most `K` 1s.
- **Technique:** Expand window until condition breaks, then shrink from the left.

---

## ✅ Benefits

- Reduces time complexity from **O(n²)** to **O(n)** in many problems.
- Cleaner, more efficient code.
- Especially useful in real-time data processing or streaming scenarios.


# Time and Space Complexity Analysis

## ⏱️ Time Complexity
**O(n)** — where `n` is the number of elements in the array.

- Each element is added and removed from the deque at most once.

## 📀 Space Complexity
- **O(k)** for the deque (in the worst case).
- **O(n - k + 1)** for the result list.
