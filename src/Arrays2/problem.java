// Multiply odd indexed elementss by 2 qnd add 10 to even indexed element
package Arrays2;

public class problem {
    static void main(String[] args) {
        int[] arr = {34, 5, 56, 42, 3, 12, 32, 42, 3};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) // i used for index
                System.out.println(arr[i] + 10);

            else {
                System.out.println(arr[i] * 2);
            }

        }
    }}
