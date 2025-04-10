
---

# Algorithm

1. Calculate the total sum of the array elements.
2. Initialize a variable `leftSum = 0`.
3. Traverse the array:
   - At each index `i`, compute the `rightSum = totalSum - leftSum - arr[i]`.
   - If `leftSum == rightSum`, return `i` as the equilibrium index.
   - Else, update `leftSum += arr[i]`.
4. If no equilibrium index is found, return `-1`.

---

# Time and Space Complexity

| Type              | Complexity |
|-------------------|------------|
| **Time Complexity**   | O(n)       |
| **Space Complexity**  | O(1)       |

- **Time:** We traverse the array once to calculate total sum and once more to find the equilibrium index.
- **Space:** Constant extra space is used, regardless of the input size.

---

# Example
# Input:

text
arr = [-7, 1, 5, 2, -4, 3, 0]
