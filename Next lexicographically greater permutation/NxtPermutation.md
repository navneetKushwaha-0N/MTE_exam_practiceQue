  Next Lexicographical Permutation (Java)

##  Problem Statement
Given an array of integers, rearrange the numbers to get the **next lexicographically greater permutation** of numbers.  
If such an arrangement is not possible (i.e., the array is in descending order), rearrange it as the **lowest possible order** (sorted in ascending order).

---

##  Algorithm

1. **Find the first decreasing element from the right** (index `i`):
   - Traverse from right to left and find the first index `i` such that `arr[i] < arr[i + 1]`.
   - If no such index exists, the array is in descending order. Reverse the whole array.

2. **Find the next greater element from the end** (index `j`):
   - Traverse from right to left and find the first index `j` such that `arr[j] > arr[i]`.

3. **Swap elements at `i` and `j`**.

4. **Reverse the subarray from `i + 1` to end** to get the next smallest lexicographical sequence.


## Time and Space Complexities

Time Complexity: O(n)
One pass to find i, one to find j, and a final reverse step.
Space Complexity: O(1)
All operations are done in-place.