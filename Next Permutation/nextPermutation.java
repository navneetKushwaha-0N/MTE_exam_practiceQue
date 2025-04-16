import java.util.*;
public class nextPermutation {
    public static void reverse(int[] nums, int st, int end) {
        while (st < end) {
            swap(nums, st, end);
            st++;
            end--;
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void NextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i < 0) {
            reverse(nums, 0, n - 1);
            return;
        }
        int j = n - 1;
        while (nums[j] <= nums[i]) {
            j--;
        }
        swap(nums, i, j);
        reverse(nums, i + 1, n - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        NextPermutation(nums);
        System.out.println("Next permutation: " + Arrays.toString(nums));
    }
}
