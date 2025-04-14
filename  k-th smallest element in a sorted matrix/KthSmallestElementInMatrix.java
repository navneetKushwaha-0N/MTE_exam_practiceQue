public class KthSmallestElementInMatrix {

    // Helper function to count elements <= mid
    public static int countLessEqual(int[][] matrix, int mid) {
        int n = matrix.length;
        int row = n - 1, col = 0;
        int count = 0;

        while (row >= 0 && col < n) {
            if (matrix[row][col] <= mid) {
                count += (row + 1); // all elements in this column till row
                col++;
            } else {
                row--;
            }
        }
        return count;
    }

    // Function to find the k-th smallest element
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0], right = matrix[n - 1][n - 1];

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = countLessEqual(matrix, mid);

            if (count < k) {
                left = mid + 1; // The k-th element is larger than mid
            } else {
                right = mid; // The k-th element is <= mid
            }
        }
        return left; // left will be the k-th smallest element
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;
        System.out.println("The " + k + "-th smallest element is: " + kthSmallest(matrix, k));
    }
}
