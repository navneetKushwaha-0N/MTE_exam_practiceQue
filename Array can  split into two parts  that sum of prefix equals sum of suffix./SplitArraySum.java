public class SplitArraySum {

    public static boolean canBeSplit(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // Right sum after removing arr[i]

            if (leftSum == totalSum) {
                return true; // Found the split point
            }

            leftSum += arr[i];
        }

        return false; // No valid split point found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};

        if (canBeSplit(arr)) {
            System.out.println("Array can be split into two parts with equal sum.");
        } else {
            System.out.println("Array cannot be split into two parts with equal sum.");
        }
    }
}
