public class MajorityElement {

    public static int findMajorityElement(int[] nums) {
        int candidate = -1, count = 0;
        
        // Phase 1: Find the candidate using Boyer-Moore Voting Algorithm
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        // Phase 2: Verify if the candidate is actually the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        
        // If the candidate appears more than n/2 times, return it
        if (count > nums.length / 2) {
            return candidate;
        } else {
            return -1; // No majority element
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println("Majority Element: " + findMajorityElement(nums));
    }
}
