## Time and Space Complexity of Two Stacks in One Array

### ⏱️ Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| push1()   | O(1)            |
| push2()   | O(1)            |
| pop1()    | O(1)            |
| pop2()    | O(1)            |
| peek1()   | O(1)            |
| peek2()   | O(1)            |

✅ **All operations are constant time.**

---

### 📀 Space Complexity

- The entire structure uses one array of size `n` to store both stacks.
- No extra data structures are used except a few integer variables.

✅ **Space Complexity:** O(n)

Where `n` is the total size of the array shared between the two stacks.