// wap to add two matrices
package multidimensionalarrays;

public class problem_04 {
    static void main(String[] args) {
        int[][] a = {{1,9,3},{8,5,6},{3,7,4}};
        int[][] b = {{1,9,7},{6,7,6},{8,3,2}};

        int m = a.length;
        int n = b[0].length;
        int[][] res = new int[m][n];


        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                res[i][j] = a[i][j] + b[i][j];

            }

        }
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(res[i][j] + " ");

            }
            System.out.println();
        }
    }
}
