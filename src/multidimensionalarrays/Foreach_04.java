package multidimensionalarrays;

public class Foreach_04 {
    static void main(String[] args) {
        int[] a = {4,7,2,8};
        for(int ele:a)
            System.out.println();
        //1 2 3
        //4 5 6
        int[][] b = {{1,2,3},{4,5,6}};
        // output of 2d array
        for (int i = 0; i < 2; i++) {  // rows
            for (int j = 0; j < 3 ; j++) {  // colums
                System.out.print(b[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
