package Methods;

public class methods_07 {
    public static int prasun(int a) {
        System.out.println("Adarsh");
        System.out.println("bhardwaj");
        if(a>0) return 5;// because of return 5  adarsh bhardwaj is printed despite having int
       else return 10; }


       public static void main(String[] args) {
        int x = prasun(7);
           System.out.println(3+x);
           //prasun(); //stand alone call

        }
    }
    //working
//in prasun 7 is recived
// 7 is gone to int a
// then sout banu op-banu
// next by checking condition 7 is greater then 0 it is true
//return 5 means prasun value is 5 prasun value == 5
//in x 5 is stored
// sout 3+x x=5 is op =8
//Math.max(a,b) // return type of this is int