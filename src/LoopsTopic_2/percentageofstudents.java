package LoopsTopic_2;
import java.util.Scanner;
public class percentageofstudents {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in hindi: ");
        int hin = sc.nextInt();
        System.out.println("Enter marks in english: ");
        int eng = sc.nextInt();
        System.out.println("Enter marks in maths: ");
        int math = sc.nextInt();
        System.out.println("Enter marks in Science: ");
        int sci = sc.nextInt();
        double per = (hin + eng + math + sci) * 100.0 / 200;
        System.out.println("Your total percentage is: "+per);

        if(per>=90){
            System.out.println("Excellent");

        } else if(per>=80) {
            System.out.println("Very good");
        } else if (per>=70) {
            System.out.println("Good");
        }else if (per>=60){
            System.out.println(" can do better");
        }else if (per>=40){
            System.out.println("Below average");
        }else
        {
            System.out.println("Fail");
        }
        }

    }
