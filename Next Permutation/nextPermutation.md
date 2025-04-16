## Next Greater Element (NGE)

### ✅ Problem Statement
For each element in an array, find the **Next Greater Element** to its right. If there is no greater element, return -1 for that position.

**Example:**
```
Input:  arr = [4, 5, 2, 10, 8]
Output: [5, 10, 10, -1, -1]
```

---

### 🔄 Algorithm (Using Stack)
1. Initialize an empty stack and a result array `res` of the same size as input.
2. Traverse the array from **right to left**.
3. For each element:
   - Pop elements from the stack while they are **less than or equal** to the current element.
   - If the stack is not empty after popping, the top of the stack is the **Next Greater Element**.
   - If the stack is empty, store `-1` in the result.
   - Push the current element onto the stack.
4. Return the result array.

---

### ⏱️ Time Complexity
| Operation            | Complexity |
|----------------------|------------|
| Traversing the array | O(n)       |
| Stack operations     | O(n)       |

⬆️ **Total:** O(n)

Each element is pushed and popped from the stack at most once.

---

### 📀 Space Complexity
| Structure     | Space |
|--------------|--------|
| Result array  | O(n)   |
| Stack         | O(n)   |

⬆️ **Total:** O(n)

---

Let me know if you want to include this for **circular arrays (Next Greater Element II)** or convert to other languages.

