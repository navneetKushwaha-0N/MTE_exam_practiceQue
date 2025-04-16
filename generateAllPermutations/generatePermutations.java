package generateAllPermutations;

import java.util.*;

public class generatePermutations {

    // Main method to generate all permutations
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);  // Start backtracking from index 0
        return result;
    }

    // Helper method to perform backtracking
    private static void backtrack(int[] nums, int start, List<List<Integer>> result) {
        // If we've reached the end of the array, add the permutation to the result
        if (start == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            result.add(temp);
            return;
        }

        // Loop through each element from the current index to the end
        for (int i = start; i < nums.length; i++) {
            // Swap the elements at indices 'start' and 'i'
            swap(nums, start, i);

            // Recursively generate permutations for the next index
            backtrack(nums, start + 1, result);

            // Backtrack by swapping the elements back
            swap(nums, start, i);
        }
    }

    // Method to swap elements at indices i and j
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = permute(nums);

        System.out.println("All permutations:");
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
