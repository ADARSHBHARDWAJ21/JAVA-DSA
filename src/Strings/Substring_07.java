package Strings;

public class Substring_07 {
    static void main(String[] args) {
        String s = "abcdef";
        System.out.println(s.substring(1)); // prints 1 and agge wale instances
        System.out.println(s.substring(1,4)); // bcd
        // substring(i,j) - this gets part of string from i to j-1
        //substring(i) - it prints i and after i instances
        //print all substring
        for (int i = 1; i <=5 ; i++) {
            System.out.println(s.substring(0,i)+" ");

        }
    }
}
