public class MaxSubarraySum {

    public static int maxSumSubarrayOfSizeK(int[] arr, int k) {
        int n = arr.length;

        if (n < k) {
            System.out.println("Invalid: Array size is smaller than k");
            return -1;
        }

        // Step 1: Calculate  sum of first window
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        int result = maxSumSubarrayOfSizeK(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}
