package LoopsTopic_2;
import java.util.Scanner;
public class threepointsonstraightline {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st coordinate: ");
        double x1 = sc.nextInt();
        System.out.println("enter 2nd coordinate: ");
        double x2 = sc.nextInt();
        System.out.println("enter 3rd coordinate: ");
        double x3 = sc.nextInt();
        System.out.println("enter 1st coordinate: ");
        double y1 = sc.nextInt();
        System.out.println("enter 2nd coordinate: ");
        double y2 = sc.nextInt();
        System.out.println("enter 3rd coordinate: ");
        double y3 = sc.nextInt();

        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);

        if(m1==m2) {
            System.out.println("The three points lie on single Line");
        }else{
            System.out.println("They do not lie on same palne");

            }

        }
        }


//adarsh