package Arrays;

public class PassingArraystomethods {
   public static void main() {
        int x[] = {10,3,29,38};  // box created
       System.out.println(x[2]);  //2nd index printed
       change(x);
       System.out.println(x[2]);
    }

   public static void change(int[]y) {
        y[2] = 99;
    }
}
