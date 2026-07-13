package Methods;
import java.util.Scanner;
public class Methods_02 {
    static void hii(){
        System.out.println("Hiii!!");
    }

        // METHOD OVERLOADING - CREATING METHOD WITH SAME NAME
         static int add(int p, int q){
        int sum = p+q;
        return sum;
         }
//        static int add(int p, int q, int r ) {
//            int ans = p + q + r;
//            return ans;
//        }
              static float add(float p, float q, float r ) {
               float ans = p + q + r;
                 return ans;
}
            static void main() {
//                System.out.println("hii");
//                hii();
//                System.out.println("adarsh");
                int ans1 = add(2,4);
                float ans2 = add(5,3,5);
                System.out.println("ans1: " +ans1);
                System.out.println("ans2: " +ans2);
            }
            // CALL BY VALUE

    }

