### Algorithm:

1. **Sort the array**: Sorting the array will help group the same elements together, making it easier to count their frequencies.
2. **Traverse the array**: Traverse the sorted array, counting consecutive occurrences of each element.
3. **Track the maximum frequency**: While traversing, track the element with the highest frequency.

---

### Time Complexity:
- **O(n log n)**: Sorting the array takes O(n log n) time, and traversing the array takes O(n) time.

### Space Complexity:
- **O(1)**: Since we are not using any extra data structures like a `HashMap`, the space complexity is constant.
