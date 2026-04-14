package LoopsTopic_2;
import java.util.Scanner;
public class problem {
    static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int cp = sc.nextInt();
     int sp = sc.nextInt();
     int pro = sp-cp;
     int los = cp-sp;
     if(sp>cp){
         System.out.println(" we made profit:  " +pro);

     }
     if(cp>sp){
         System.out.println("we made loss:  " + los);

     }else{
         System.out.println("no profit no loss: ");
     }

    }
}
