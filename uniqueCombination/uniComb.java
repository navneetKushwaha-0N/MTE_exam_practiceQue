package uniqueCombination;

import java.util.*;

public class uniComb {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);  // Sort to handle duplicates and improve efficiency
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            // If the current number is greater than the target, no point in continuing
            if (candidates[i] > target) break;

            // Include the number and continue searching with the updated target
            current.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, current, result);  // Not i + 1 because we can reuse the same element
            current.remove(current.size() - 1);  // Backtrack
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 5};
        int target = 8;
        List<List<Integer>> combinations = combinationSum(candidates, target);

        System.out.println("All unique combinations:");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
