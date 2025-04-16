
## Intersection of Two Linked Lists

### 🔄 Algorithm:

1. **Calculate the lengths of both linked lists**:
   - Traverse both linked lists and calculate their lengths (`lenA` for the first list and `lenB` for the second list).

2. **Align the pointers**:
   - Move the pointer of the longer list ahead by the difference in lengths (`|lenA - lenB|`).
   - This ensures that both pointers are equidistant from the end of their respective lists, so they can be compared node by node.

3. **Traverse both lists simultaneously**:
   - Traverse both lists in parallel from their respective adjusted starting points.
   - Compare the nodes. If they are the same, that node is the intersection.
   - If no intersection is found by the time the end of the lists is reached, return `null`.

4. **Return the intersection node**:
   - If both pointers meet at the same node, return that node as the intersection point.

---

### ⏱️ Time Complexity:

- **Calculating the length of both linked lists**: O(n) and O(m) respectively, where `n` is the length of the first list and `m` is the length of the second list.
- **Aligning the pointers**: This takes at most O(n - m) steps to align the pointers.
- **Traversing the lists simultaneously**: This takes O(min(n, m)) time.

**Overall Time Complexity**: **O(n + m)**, where `n` is the length of the first list and `m` is the length of the second list.

---

### 📀 Space Complexity:

The algorithm only uses a few pointers, so it doesn't require extra space proportional to the input size.

**Space Complexity**: **O(1)** (constant space)
