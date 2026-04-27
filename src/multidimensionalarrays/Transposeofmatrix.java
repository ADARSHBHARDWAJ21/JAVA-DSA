package multidimensionalarrays;

public class Transposeofmatrix {
    public static void main(String[] args) {

        // Original matrix (3 x 2)
        // 1 2
        // 3 4
        // 5 6
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};

        int m = arr.length;        // number of rows = 3
        int n = arr[0].length;     // number of columns = 2

        // -------------------------------
        // 1. Print original matrix
        // -------------------------------
        System.out.println("Original Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // -------------------------------
        // 2. Print transpose directly (without storing)
        // Column-wise traversal
        // -------------------------------
        System.out.println("\nTranspose (without storing):");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // IMPORTANT (you missed this earlier)
        }

        // -------------------------------
        // 3. Store transpose in new matrix
        // Transpose size = n x m (2 x 3)
        // -------------------------------
        int[][] transpose = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = arr[i][j]; // correct mapping
            }
        }

        // -------------------------------
        // 4. Print stored transpose
        // -------------------------------
        System.out.println("\nTranspose (stored in array):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}