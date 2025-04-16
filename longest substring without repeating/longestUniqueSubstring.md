# Length of the Longest Substring Without Repeating Characters

##  Algorithm (Using Sliding Window + HashSet)

1. Initialize a `HashSet` to store unique characters.
2. Initialize two pointers `left` and `right` both at `0`.
3. Iterate with `right` over the string:
   - If the character is **not** in the set, add it and update `maxLength`.
   - If the character **is** in the set, remove characters from the set starting from `left` until it's not a duplicate.
4. Continue this until `right` reaches the end of the string.
5. Return `maxLength`.

---

## Example

For the input: `"abcabcbb"`

Unique substrings:
- `"abc"` → length = 3  
- `"bca"` → length = 3  
- `"cab"` → length = 3  
- `"abc"` → length = 3  

🔹 **Answer = 3**
