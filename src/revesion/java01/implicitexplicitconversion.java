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
}
}