public class UniqueDigitNumbers {

    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;

        int total = 10; // For n = 1
        int uniqueDigits = 9;
        int available = 9;

        for (int i = 2; i <= n && available > 0; i++) {
            uniqueDigits *= available;
            total += uniqueDigits;
            available--;
        }

        return total;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println("Count of unique-digit numbers for n = " + n + " is: " + countNumbersWithUniqueDigits(n));
        // Output: 91
    }
}
