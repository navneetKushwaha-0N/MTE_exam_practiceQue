# Algorithm: Find the Majority Element in an Array

The majority element is the element that appears more than n/2 times in an array, where n is the size of the array.

We can solve this problem efficiently using the Boyer-Moore Voting Algorithm.

## Approach (Boyer-Moore Voting Algorithm)

**Initialization:**

* Set two variables: `candidate` (to store the potential majority element) and `count` (to keep track of the count of the candidate).

**Iteration:**

* Traverse through the array:
    * If `count` is 0, set the current element as `candidate` and set `count` to 1.
    * If the current element is the same as the `candidate`, increment `count` by 1.
    * If the current element is different from the `candidate`, decrement `count` by 1.

**Verification:**

* After the iteration, the `candidate` will hold the potential majority element. However, we need to verify if this element actually occurs more than n/2 times in the array. If it does, return it. Otherwise, return a value indicating no majority element exists (e.g., -1).

## Algorithm:

1.  Initialize `candidate` to `null` and `count` to 0.
2.  For each element in the array:
    * If `count` is 0, set `candidate` to the current element and set `count` to 1.
    * If the current element is equal to `candidate`, increment `count`.
    * If the current element is different from `candidate`, decrement `count`.
3.  Verify if `candidate` occurs more than n/2 times in the array.
4.  Return the `candidate` if it is the majority element, otherwise return -1.

## Time and Space Complexities

**Time Complexity:**

* The first loop runs through the array to find the potential candidate, which takes O(n) time.
* The second loop verifies whether the candidate is the majority element, which also takes O(n) time.
* Hence, the total time complexity is O(n), where n is the number of elements in the array.

**Space Complexity:**

* We only use a constant amount of extra space for the `candidate` and `count` variables.
* Hence, the space complexity is O(1).

## Example Walkthrough

**Input:**
nums = [3, 3, 4, 2, 4, 4, 2, 4, 4]


**Steps:**

**Phase 1: Finding the Candidate**

1.  Start with `candidate` = -1 and `count` = 0.
2.  Iterate through the array:
    * 3 → `candidate` = 3, `count` = 1
    * 3 → `candidate` = 3, `count` = 2
    * 4 → `count` = 1 (since `candidate` = 3, decrement `count`)
    * 2 → `count` = 0 (decrement `count` to 0)
    * 4 → `candidate` = 4, `count` = 1
    * 4 → `candidate` = 4, `count` = 2
    * 2 → `count` = 1 (decrement `count`)
    * 4 → `candidate` = 4, `count` = 2
    * 4 → `candidate` = 4, `count` = 3
3.  The `candidate` at the end of this phase is 4.

**Phase 2: Verifying the Candidate**

1.  Count the occurrences of 4 in the array. It appears 5 times, which is greater than n/2 = 9/2 = 4.5.
2.  Therefore, 4 is the majority element.

**Output:**

Majority Element: 4