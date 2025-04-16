### Algorithm:
We can solve this problem using the **Expand Around Center** approach. The basic idea is that for each character in the string, we expand around that character to find the longest palindrome.

#### Expand Around Center:
- For each character (considering both single characters and pairs of characters as centers), expand outwards to check for palindrome substrings.
- Expand outward until the characters at the left and right indices are not the same.

#### Track the maximum length:
- Keep track of the start and end indices of the longest palindrome found so far.

#### Return the substring:
- Once we’ve found the longest palindrome, extract it from the string using the tracked indices.

---

### Time Complexity:
- **O(n²)**: We perform **O(n)** expansion for each character in the string, and there are **O(n)** characters, resulting in **O(n²)** time complexity.

### Space Complexity:
- **O(1)**: The space complexity is constant as we are only using a few variables to track the start and end of the longest palindrome.
