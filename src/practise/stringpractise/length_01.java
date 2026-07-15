package practise.stringpractise;
import java.sql.SQLOutput;
import java.util.Scanner;
public class length_01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String str = sc.nextLine();
        String username1  = sc.nextLine();
        String username2 = sc.next();
        System.out.println(username1);
        System.out.println(username2);
        System.out.println(username1.equals(username2));
        System.out.println(username1.equalsIgnoreCase(username2));
        System.out.println(username1.toUpperCase());
        System.out.println(username1.toLowerCase());
        System.out.println(username1.trim());
        System.out.println(username1.startsWith("ADARSH"));
        System.out.println(username2.endsWith("Bhardwaj"));
        //System.out.println(str);
        System.out.println(username1.isEmpty());
        System.out.println(username2.isBlank());
        System.out.println( " Length of string:  " +str.length());
        System.out.println("first char: " +str.charAt(0));
        System.out.println("substring of str/ username: " +str.substring(0,6));
        System.out.println("check whether substringcontains: " +str.contains("Adarsh"));
        System.out.println(username1.toCharArray());
        System.out.println(username1.getClass());
        for (int i = 0; i < str.length(); i++) {

            System.out.println("ALL CHAR OF WHOLESTRING: " +str.charAt(i));
            System.out.println(i);

        }
        //
        if(str.length()>10){
            System.out.println("Characters more then 10");
        }else{
            System.out.println("Characters less then 10");
        }
    }
}
