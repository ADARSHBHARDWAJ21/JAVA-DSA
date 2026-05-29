package Strings;

public class Equals_13 {
    static void main(String[] args) {
        String s = "abcxyz";
        String t = "abc";
        t = t +"xyz";
        System.out.println(s==t);  // op false because it compares address
        System.out.println(s.equals(t)); // op true because it compares characters
    }
}
