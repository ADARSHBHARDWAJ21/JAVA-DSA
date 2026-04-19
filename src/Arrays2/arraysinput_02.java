package Arrays2;
import java.util.Scanner;
public class arraysinput_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {

            System.out.println("array elements are: "+arr[i] + " ");

        }
    }
}
