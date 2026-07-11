package revesion.java01;

public class implicitexplicitconversion {
    static void main(String[] args) {
        //Type conversion means changing a value from one data type to another.

    int age = 20;
    //double marks = age;
    //Here, the integer 20 becomes the decimal 20.0.
    int a = 10;
    double b = 20.5;
    double c = a + b;
        System.out.println(c);
        //Implicit Conversion (Automatic / Widening)
        //Why is Implicit Conversion Safe?
        //Because the larger data type has enough memory to store the smaller value.
        //Java converts the smaller data type into a larger data type automatically.
        int y = 50;
        double x = y;

        System.out.println(y);
        System.out.println(x);
  //Explicit Conversion
        //Sometimes we convert from a larger data type to a smaller one.
        //Java does not do this automatically because data may be lost.
        //The programmer must explicitly request the conversion.

        double marks = 92.75;
        int m = (int) marks;

        System.out.println(m);

        // operators
        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedLastWeek;
        int projected = solvedThisWeek * 4;
        int average = solvedThisWeek / 7;
        int remainder = solvedThisWeek % 7;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);

        //RELATIONAL OPERATORS
        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println(currentStreak == targetStreak);
        System.out.println(currentStreak != targetStreak);
        System.out.println(currentStreak > targetStreak);
        System.out.println(currentStreak < targetStreak);
        System.out.println(currentStreak >= targetStreak);
        System.out.println(currentStreak <= targetStreak);
        //LOGICAL OPERATOR

                boolean completedDSA = true;
                boolean completedCore = false;

                System.out.println(completedDSA && completedCore);
                System.out.println(completedDSA || completedCore);
                System.out.println(!completedCore);

                // ASSINGMENT OPERATOR
        int ratingPoints = 100;

        ratingPoints += 20;  // ratingPoints = ratingPoints +
        System.out.println(ratingPoints);
        ratingPoints -= 10;  // ratingPoints = ratingPoints - 10
        System.out.println(ratingPoints);
        ratingPoints *= 2;   // ratingPoints = ratingPoints * 2
        System.out.println(ratingPoints);
        ratingPoints /= 4;   // ratingPoints = ratingPoints / 4
        System.out.println(ratingPoints);
        ratingPoints %= 30;  // ratingPoints = ratingPoints % 30
        System.out.println(ratingPoints);

        // UNARY INC/DEC OPERATORS
           //int g = -8;
           //int k =  g;
        //System.out.println(k);
      // increment operator
        // pre increment(pehle increment kro fir utilize kro)
        // post increment (pehle use kro fir increment kro)
         int g = 10;
        System.out.println(++g);
        System.out.println(g++);
// predecrement(pehle decrement kro fir utilize kro)
// post decrement(pehle use kro fir decrement kro)
      int k = 10;
        System.out.println(k--);
        System.out.println(--k);
        System.out.println(34+34);

            }
        }


