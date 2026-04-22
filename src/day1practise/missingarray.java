package day1practise;
import java.util.Arrays;

public class missingarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};
        int n = arr.length + 1; // n = 5 (Total numbers that should be there)
        int expectedSum = n * (n + 1) / 2; // Sum of 1 to 5 = 15
        int actualSum = 0;

        // Use arr.length (4) instead of n (5) here
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i]; // Sum of {1, 2, 3, 5} = 11

        }
        System.out.println(actualSum);
        System.out.println(expectedSum);
        System.out.println("Missing number is: " + (expectedSum - actualSum)); // 15 - 11 = 4
    }
}