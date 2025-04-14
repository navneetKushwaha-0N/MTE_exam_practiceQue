# 🧠 Algorithm: Median of Two Sorted Arrays (Binary Search Approach)

1. **Ensure `nums1` is the smaller array**:
   - Swap the arrays if `nums1` is larger than `nums2`, to minimize the binary search size.

2. **Binary Search on the smaller array (`nums1`)**:
   - Let `i` be the index for `nums1` and `j` be the index for `nums2`, where `i` and `j` partition the arrays.
   - The sum of `i` and `j` must split both arrays into two equal halves, i.e., `i + j = (len(nums1) + len(nums2) + 1) / 2`.

3. **Check partition conditions**:
   - Left elements of both arrays must be less than or equal to the right elements of the opposite arrays:
     - `nums1[i-1] <= nums2[j]`
     - `nums2[j-1] <= nums1[i]`

4. **If these conditions are satisfied**, you can compute the median based on the size of the combined arrays.

5. **If conditions aren't met**:
   - Adjust the binary search range by updating `i` (moving left or right) to satisfy the partition conditions.

6. **Calculate Median**:
   - If the combined length is odd, the median is the maximum of the left elements.
   - If even, the median is the average of the maximum of the left elements and the minimum of the right elements.

---

## ⏱️ Time and Space Complexities

- **Time Complexity:** `O(log(min(n, m)))`  
  The binary search runs on the smaller array (`nums1`), hence the complexity is logarithmic in terms of the smaller array's size.

- **Space Complexity:** `O(1)`  
  We are using constant space, only modifying pointers and indices to manage the binary search process.

---

## 📊 Example Walkthrough

### **Example 1:**

**Input:**

**Steps:**
1. First, ensure `nums1` is the smaller array (it already is).
2. Perform binary search on `nums1`. For the partitioning:
   - `partition1 = 1` (divide `nums1` into `[1]` and `[3]`)
   - `partition2 = 1` (divide `nums2` into `[2]`)
   - `maxLeft1 = 1`, `minRight1 = 3`, `maxLeft2 = 2`, `minRight2 = Integer.MAX_VALUE`
3. Conditions satisfied:
   - `maxLeft1 <= minRight2` and `maxLeft2 <= minRight1`
4. **Median:** Since combined length is odd, the median is the maximum of the left elements:
   - `max(1, 2) = 2`

**Output:**
Median: 2.0