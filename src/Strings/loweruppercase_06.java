package Strings;

public class loweruppercase_06 {
    static void main(String[] args) {
        String s = "Adarsh is 24 YEARS OLD";
        //System.out.println(s.toLowerCase());
        String c = s.toLowerCase();
        System.out.println(c);
        System.out.println(s.toUpperCase());

        // concatination
        String a = "abc";
        String b =  "xyz";
        a.concat(b);
        System.out.println(a.concat(b));

        //Empty string
        String x = "";
        System.out.println(x.length());
    }
}
