

#  Problem Statement
Given an array `arr[]`, check if there exists an index `i` such that the sum of elements from index `0` to `i` (called the **prefix**) is equal to the sum of elements from `i+1` to `n-1` (called the **suffix**).

---

 ⚙️ Algorithm

1. Compute the total sum of the array.
2. Initialize `leftSum = 0`.
3. Traverse the array:
   - At each index `i`, subtract `arr[i]` from `totalSum`. This gives the **right sum**.
   - Compare `leftSum` and `rightSum`:
     - If equal, return `true` (a valid split exists).
     - Else, add `arr[i]` to `leftSum` and continue.
4. If no split point is found, return `false`.

---

⏱️ Time and Space Complexity

* Time Complexity: O(n)
One pass to compute the total sum
One pass to check for the split

 Example: For arr = [1, 2, 3, 3], we traverse the array twice (first to compute the total sum and second to check for the split). This makes it linear with respect to array size n.


* Space Complexity: O(1)
No extra space is used except for a few integer variables (totalSum, leftSum)

 Example: Regardless of input size, we do not use any additional data structures, so space usage remains constant.


