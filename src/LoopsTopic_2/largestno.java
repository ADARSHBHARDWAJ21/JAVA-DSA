package LoopsTopic_2;
import java.util.Scanner;
public class largestno {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st  no:  ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd no : ");
        int y = sc.nextInt();
        System.out.println("Enter 3rd no:  ");
        int z = sc.nextInt();

//        if(x>y && x>z){ // x is max
//            System.out.println("1 ST NO IS LARGEST: "+x);
//
//
//        }else if(y>x && y>z) {  // y is max
//                System.out.println("2nd no is largest :"+y);
//            }
//        else  {   // c is largest
//            System.out.println("3rd no is largest : " +z);
//        }

        //nested
        if(x>y  && x>z){
            if(y>x && y>z) {
                System.out.println("second no is largest: "+y);
            }else{
                System.out.println("first no is largest: " +x);
            }


        }else {
            System.out.println("3rd no is largest: " +z);
        }
            }
        }


