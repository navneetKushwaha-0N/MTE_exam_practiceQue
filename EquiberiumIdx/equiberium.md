## Algorithm: Find Equilibrium Index

### Step-by-step:

1. **Calculate Total Sum**
   - Traverse the array once to calculate the total sum of all elements.

2. **Initialize `leftSum` to 0**
   - This variable will keep track of the sum of elements to the left of the current index.

3. **Traverse the Array Again**
   - At each index `i`:
     - Subtract the current element `arr[i]` from `totalSum` to get the **right sum**.
     - Check if `leftSum == totalSum`:
       - If yes, return index `i` as the equilibrium index.
     - Add `arr[i]` to `leftSum` (preparing for the next iteration).

4. **If no index found**, return -1.

---

### ⏱Time Complexity: `O(n)`
- One pass to compute the total sum → `O(n)`
- One pass to check for the equilibrium index → `O(n)`
- **Total: O(n)**

---

###  Space Complexity: `O(1)`
- Only a few variables (`totalSum`, `leftSum`, loop index) are used.
- **No extra space** proportional to the size of the input.

---

###  Example:
For input array:
```java
arr = {-7, 1, 5, 2, -4, 3, 0}
```
- Total Sum = `0`
- At index `3`,  
  - Left sum = `-1` (`-7 + 1 + 5`)  
  - Right sum = `-1` (`-4 + 3 + 0`)  
   So, `3` is the equilibrium index.