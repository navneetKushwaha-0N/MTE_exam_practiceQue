# Merge Two Sorted Linked Lists (Java)

##  Algorithm

1. Create a **dummy node** to act as the starting point of the merged list.
2. Use a **pointer `tail`** to keep track of the current node in the new list.
3. Compare the current nodes of both lists:
   - Add the smaller one to `tail.next`.
   - Move the corresponding list pointer ahead.
4. After the loop, if any elements remain in either list, append them.
5. Return `dummy.next` as the head of the merged list.

---

##  Time and Space Complexities

- **Time Complexity:** `O(n + m)`  
  Where `n` and `m` are the lengths of the two lists. Each node is visited exactly once.

- **Space Complexity:** `O(1)`  
  No extra memory is used, except for the dummy node and pointers.
  >  If a new list was created instead of rearranging existing pointers, it would be `O(n + m)`.

---

##  Example Walkthrough

**Input:**

**Steps:**
- Compare 1 and 2 → pick 1
- Compare 3 and 2 → pick 2
- Compare 3 and 4 → pick 3
- Compare 5 and 4 → pick 4
- Compare 5 and 6 → pick 5
- Only 6 left → append it

**Output:**
Merged List: 1 -> 2 -> 3 -> 4 -> 5 -> 6