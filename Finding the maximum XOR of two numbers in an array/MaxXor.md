# Maximum XOR of Two Numbers in an Array (Using Trie)

## Problem Description

Given an integer array `nums`, return the maximum result of `nums[i] XOR nums[j]`, where `0 ≤ i ≤ j < n`.

## Algorithm (Using Trie - Efficient O(n))

We use a Trie (prefix tree) of binary representations to find the best number that gives the maximum XOR for every element.

**Steps:**

1.  **Trie Node Structure:**
    * Create a Trie node with two children: `0` and `1`.

2.  **Insert Numbers into Trie:**
    * For each number in `nums`, convert it into its 32-bit binary representation.
    * Insert the binary representation into the Trie, bit by bit, from the most significant bit (MSB) to the least significant bit (LSB).

3.  **Find Maximum XOR:**
    * For each number in `nums`:
        * Traverse the Trie, trying to go in the opposite direction of the current number's bit (to maximize XOR).
        * Calculate the current XOR value.
        * Track the maximum XOR value found.

4.  **Return Maximum XOR:**
    * Return the maximum XOR value.

## Time and Space Complexity

* **Time Complexity:** O(n * 32) = O(n)
    * We insert and check 32 bits per number.
* **Space Complexity:** O(n * 32) = O(n)
    * The Trie can have up to n * 32 nodes.

## Explanation with Example

**Input:**
Markdown
# Maximum XOR of Two Numbers in an Array (Using Trie)

## Problem Description

Given an integer array `nums`, return the maximum result of `nums[i] XOR nums[j]`, where `0 ≤ i ≤ j < n`.

## Algorithm (Using Trie - Efficient O(n))

We use a Trie (prefix tree) of binary representations to find the best number that gives the maximum XOR for every element.

**Steps:**

1.  **Trie Node Structure:**
    * Create a Trie node with two children: `0` and `1`.

2.  **Insert Numbers into Trie:**
    * For each number in `nums`, convert it into its 32-bit binary representation.
    * Insert the binary representation into the Trie, bit by bit, from the most significant bit (MSB) to the least significant bit (LSB).

3.  **Find Maximum XOR:**
    * For each number in `nums`:
        * Traverse the Trie, trying to go in the opposite direction of the current number's bit (to maximize XOR).
        * Calculate the current XOR value.
        * Track the maximum XOR value found.

4.  **Return Maximum XOR:**
    * Return the maximum XOR value.

## Time and Space Complexity

* **Time Complexity:** O(n * 32) = O(n)
    * We insert and check 32 bits per number.
* **Space Complexity:** O(n * 32) = O(n)
    * The Trie can have up to n * 32 nodes.

## Explanation with Example

**Input:**

nums = [3, 10, 5, 25, 2, 8]


**Binary Representations:**

3  = 00000000000000000000000000000011
10 = 00000000000000000000000000001010
5  = 00000000000000000000000000000101
25 = 00000000000000000000000000011001
2  = 00000000000000000000000000000010
8  = 00000000000000000000000000001000

