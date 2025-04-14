# Longest Palindromic Substring

## Algorithm

1. **Input the String**: Read the input string `s` of length `n`.
2. **Initialize a DP Table**:
   - Create a 2D boolean array `dp` of size `n x n` where `dp[i][j]` is `true` if the substring `s[i...j]` is a palindrome.
3. **Base Cases**:
   - All substrings of length 1 are palindromes (`dp[i][i] = true` for all `i`).
   - For substrings of length 2, check if `s[i] == s[i+1]`. If true, mark `dp[i][i+1] = true`.
4. **Fill the DP Table**:
   - For substrings of length greater than 2, check if `s[i] == s[j]` and `dp[i+1][j-1]` is `true`. If both conditions are satisfied, mark `dp[i][j] = true`.
5. **Track the Longest Palindrome**:
   - Keep track of the starting index and maximum length of the longest palindromic substring found.
6. **Output the Result**:
   - Extract and return the longest palindromic substring using the starting index and length.

---

## Time and Space Complexities

### Time Complexity:
- The outer loop runs for substring lengths from 3 to `n` (**O(n)**).
- The inner loop iterates over all possible starting indices for each substring length (**O(n)**).
- Thus, the overall time complexity is **O(n²)**.

### Space Complexity:
- The `dp` table requires **O(n²)** space to store results for all substrings.

---

## Example

**Input**: `"babad"`  
**Output**: `"bab"` or `"aba"` (both are valid palindromic substrings)

**Explanation**:
- Substrings `"bab"` and `"aba"` are palindromes of length 3.
- The algorithm identifies one of them as the longest palindromic substring.

---

## Steps to Build Prefix Sum Array

1. **Input the Array**: Read the size of the array `n` and its elements.
2. **Build Prefix Sum Array**:
   - Create an array `prefix` of size `n`.
   - Set `prefix[0] = arr[0]`.
   - For each index `i` from 1 to `n-1`, compute `prefix[i] = prefix[i-1] + arr[i]`.
3. **Query the Range Sum**:
   - For a given range `[L, R]`:
     - If `L == 0`, return `prefix[R]`.
     - Otherwise, return `prefix[R] - prefix[L-1]`.
4. **Output the Result**: Print the sum of elements in the range `[L, R]`.

---

## Time and Space Complexities for Prefix Sum

### Time Complexity:
- Building the prefix sum array takes **O(n)**.
- Querying the range sum takes **O(1)**.
- Overall time complexity is **O(n)**.

### Space Complexity:
- The prefix sum array requires **O(n)** space.