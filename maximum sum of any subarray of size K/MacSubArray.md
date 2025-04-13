# Maximum Sum of Subarray of Size K (Sliding Window Technique)

## ✅ Algorithm (Using Sliding Window Technique)

1. Calculate the sum of the first **K** elements. Let this be `windowSum`.
2. Initialize `maxSum = windowSum`.
3. Slide the window by one element at a time:
   - Subtract the first element of the previous window.
   - Add the next element in the array.
   - Update `maxSum` if `windowSum` is greater.
4. Return `maxSum`.

---

## ✅ Time and Space Complexity

- **Time Complexity**:  
  `O(n)` → Traverse the array once.

- **Space Complexity**:  
  `O(1)` → No extra space except variables.
