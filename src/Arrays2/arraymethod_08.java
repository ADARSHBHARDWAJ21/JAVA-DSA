package Arrays2;

public class arraymethod_08 {
    static void main(String[] args) {
        int[] arr = {10,20,30,40};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]); //op 90
    }

   public static void change(int[] arr) {
        arr[0] = 90;


    }
}
