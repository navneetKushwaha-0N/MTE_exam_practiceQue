package generatesAllSubsets;

import java.util.*;

public class subsets {

    // Method to generate all subsets
    public static List<List<Integer>> generateSubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    // Backtracking helper function
    private static void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current)); // Add current subset to result

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);                // Include nums[i]
            backtrack(i + 1, nums, current, result); // Recurse
            current.remove(current.size() - 1);   // Backtrack
        }
    }

    public static void main(String[] args) {
        // Test the generateSubsets method with an example array
        int[] arr = {1, 2, 3};
        List<List<Integer>> subsets = generateSubsets(arr);

        // Print all subsets
        System.out.println("All subsets:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
