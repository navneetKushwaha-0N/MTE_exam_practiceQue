# 🧠 Algorithm: Find the k-th Smallest Element in a Sorted Matrix

Given a matrix where each row and column is sorted in ascending order, we need to find the k-th smallest element in the matrix.

## Approach (Binary Search + Heap):

1. **Use binary search** to find the k-th smallest element.
   - The value of the k-th smallest element lies between the smallest (`matrix[0][0]`) and the largest (`matrix[n-1][n-1]`) elements in the matrix.
   - Perform binary search between these values to narrow down the range.

2. **Count the elements less than or equal to a mid value**:
   - For each mid value calculated during binary search, count how many elements are less than or equal to mid. This can be efficiently done using the property of the sorted rows and columns.
   - For each row, use two pointers (one starting from the leftmost and the other from the rightmost element) to count the number of elements that are less than or equal to mid.

3. **Adjust the binary search range**:
   - If the count of elements ≤ mid is less than k, then the k-th smallest element is greater than mid, so move the lower bound up.
   - If the count of elements ≤ mid is greater than or equal to k, then the k-th smallest element is less than or equal to mid, so move the upper bound down.

4. **Repeat until the binary search converges**, and the value of mid is the k-th smallest element.

---

## ⏱️ Time and Space Complexities

- **Time Complexity:** `O(n * log(max - min) + n * log n)`
  - The binary search runs `log(max - min)` times, where `max` and `min` are the largest and smallest elements in the matrix.
  - For each `mid`, the count of elements less than or equal to `mid` is computed in `O(n)` time. Therefore, the total time complexity is `O(n * log(max - min))`.
  - Additionally, there is an extra `O(n * log n)` factor for the sorting step (if used, but it's not always required depending on implementation).

- **Space Complexity:** `O(1)`
  - No extra space is used except for a few variables to store the binary search bounds and the count.

---

## 📊 Example Walkthrough

### **Input:**
matrix = [ [1, 5, 9], [10, 11, 13], [12, 13, 15] ] k = 8

### **Steps:**

1. **Binary Search Range**:
   - The smallest element is 1 (`matrix[0][0]`), and the largest is 15 (`matrix[n-1][n-1]`).
   - Perform binary search in the range `[1, 15]`.

2. **First Mid = 8**:
   - Count elements ≤ 8: In the matrix, there are 6 elements less than or equal to 8.
   - Since 6 < 8, the k-th smallest element is greater than 8. Adjust the range to `[9, 15]`.

3. **Second Mid = 12**:
   - Count elements ≤ 12: In the matrix, there are 7 elements less than or equal to 12.
   - Since 7 < 8, adjust the range to `[13, 15]`.

4. **Third Mid = 14**:
   - Count elements ≤ 14: In the matrix, there are 8 elements less than or equal to 14.
   - Since 8 = 8, the k-th smallest element is less than or equal to 14, adjust the range to `[13, 14]`.

5. **Final Answer**:
   - After narrowing down the search, the k-th smallest element is `13`.

### **Output:**

The 8-th smallest element is: 13