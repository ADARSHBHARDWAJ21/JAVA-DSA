//print table of 19
package LoopsTopic_2;

public class ForLoop_6 {
    static void main() {
       //for(int i = 19; i<=190; i++) // this code runs 172 times
           for(int i = 19; i<=190; i+=19)// this code runs 10 times
       {
          // if(i%19==0)
               System.out.println(i);
       }
    }
}
