// print all no 1 to 100 divisible by 2/3 but 18 will not be there
package LoopsTopic_2;

public class continue_01 {
    static void main() {
        for (int i = 1; i <= 100 ; i++) {
            if(i==24 || i==27)continue; // use to remove that both of the no from output
            // what is written below continue is skiipped
            if(i%2==0 || i%3==0)
                System.out.println(i);

        }
    }
}
