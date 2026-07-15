package Strings;

public class Practise_03 {
    static void main(String[] args) {
        String str = "ADARSH";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println(reversed);
    }
}
