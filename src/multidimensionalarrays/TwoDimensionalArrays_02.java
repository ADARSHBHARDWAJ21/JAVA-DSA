package multidimensionalarrays;
import java.util.Scanner;
public class TwoDimensionalArrays_02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int m = arr.length;
        int n = arr[0].length;
        System.out.println(n);
        System.out.println(m);
        //arr[0][0] = 9;
        //input of 2D Array
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }

        }


        //output of 2d Array
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
