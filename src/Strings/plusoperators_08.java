package Strings;

public class plusoperators_08 {
    static void main(String[] args) {
        String s = "abbc";
        String t = "pqr";

       // s = s + t;
        s = s +"z";

        System.out.println(s);
        System.out.println("Hi i am "+10);
        System.out.println("abbc"+10+20); //abbc1020
        System.out.println(10+20+"abbc"); //30 abc
    }
}
