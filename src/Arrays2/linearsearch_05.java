package Arrays2;
import java.util.Scanner;

public class linearsearch_05 {
    public static void main(String[] args) { // Added 'public'
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER VALUE OF X:");
        int x = sc.nextInt();

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // --- FIXED SOLUTION ---
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                flag = true;
                break; // Exit loop ONLY when found
            }
        }

        if (flag) { // You can just write (flag) instead of (flag == true)
            System.out.println("Element found");
        } else {
            System.out.println("Element not Found");
        }
    }
}