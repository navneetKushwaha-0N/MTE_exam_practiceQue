import java.util.Scanner;

public class prefixSumRange {


    // Function to build the prefix sum array
    public static int[] buildPrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    // Function to get the sum in the range [L, R]
    public static int rangeSum(int[] prefix, int L, int R) {
        if (L == 0) {
            return prefix[R];
        } else {
            return prefix[R] - prefix[L - 1];
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Build prefix sum array
        int[] prefix = buildPrefixSum(arr);

        // Input range [L, R]
        System.out.print("Enter range L and R (0-based index): ");
        int L = scanner.nextInt();
        int R = scanner.nextInt();

        // Get range sum
        if (L < 0 || R >= n || L > R) {
            System.out.println("Invalid range.");
        } else {
            int sum = rangeSum(prefix, L, R);
            System.out.println("Sum from index " + L + " to " + R + " is: " + sum);
        }

        scanner.close();
    }
}
