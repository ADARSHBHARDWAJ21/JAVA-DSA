// Write a program to print sum of all the elements of all the elements of a 2D matrix
package multidimensionalarrays;

public class problem03 {
    static void main(String[] args) {
        int arr [][] = {{1,23,45}, {34,53,54},{4,5,65}};
        int mx = Integer.MIN_VALUE;
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0;

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                mx = Math.max(mx, arr[i][j]);
                sum += arr[i][j];


            }
        }
            System.out.println("Sum is : " +sum);
            //System.out.println(mx);


    }
}
