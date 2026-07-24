package WhileloopQ;
//SEPERATE DIGIT
public class Q1 {
    static void main(String[] args) {
       int n =76578;
       while(n != 0) {
           int rem = n%10;  // This statement divides the no by 10 and prints the reminder
           System.out.print(rem);// prints the reminder, %operator gives reminder
           n = n / 10;  // / this operator helps in dividing

       }
    }

     }
