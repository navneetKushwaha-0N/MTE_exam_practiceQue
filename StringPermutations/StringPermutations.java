package StringPermutations;

public class StringPermutations {

    public static void permute(char[] arr, int start, int end) {
        if (start == end) {
            System.out.println(String.valueOf(arr));
        } else {
            for (int i = start; i <= end; i++) {
                swap(arr, start, i);
                permute(arr, start + 1, end);
                swap(arr, start, i); // backtrack
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String str = "ABC";
        char[] charArray = str.toCharArray();
        System.out.println("Permutations of " + str + ":");
        permute(charArray, 0, str.length() - 1);
    }
}
