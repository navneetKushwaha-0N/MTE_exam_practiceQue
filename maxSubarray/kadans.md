## ✅ Algorithm: Kadane’s Algorithm (Maximum Subarray Sum)

### Steps:

1. **Initialize two variables:**
   - `maxSoFar = nums[0]` — to keep track of the maximum sum found so far.
   - `currentMax = nums[0]` — to store the sum of the current subarray.

2. **Iterate through the array starting from index 1:**
   - At each index `i`, do:
     - `currentMax = max(nums[i], currentMax + nums[i])`
       - This decides whether to start a new subarray or continue the current one.
     - `maxSoFar = max(maxSoFar, currentMax)`
       - Update the global maximum if the current subarray sum is larger.

3. **Return** `maxSoFar` as the result.

---

### ⏱ Time Complexity:
- **O(n):** Only one pass through the array is needed.

---

### 📀 Space Complexity:
- **O(1):** No extra space is used except for a few variables.

