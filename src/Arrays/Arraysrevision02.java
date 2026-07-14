package Arrays;

public class Arraysrevision02 {

    public static void main(String[] args) {

        int[][] brr = {
                {1, 2},
                {2, 3},
                {4, 5},
                {5, 6}
        };

        for (int rowIndex = 0; rowIndex < brr.length; rowIndex++) {

            for (int colIndex = 0; colIndex < brr[rowIndex].length; colIndex++) {

                System.out.print(brr[rowIndex][colIndex] + " ");

            }

            System.out.println();   // Move to the next row
        }
    }
}