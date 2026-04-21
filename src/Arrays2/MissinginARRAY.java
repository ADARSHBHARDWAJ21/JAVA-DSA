package Arrays2;

public class MissinginARRAY {
    public static void main(String[] args) {
        // Example: Numbers 1 to 8, but '1' is missing
        int[] arr = {2, 3, 4, 5, 6, 7, 8};

        int n = arr.length + 1; // n becomes 8

        // Mathematical sum of 1 to n: (n * (n + 1)) / 2
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int ele : arr) {
            actualSum += ele; // Fixed variable name to match
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}