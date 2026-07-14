// STRING METHODS
package Strings;

public class revision_04 {
    static void main(String[] args) {
        // UPPERCASE
        String name = "love";
        System.out.println(name.toUpperCase());
        // LOWERCASE
        String str = "LOve";
        System.out.println(name.toLowerCase());
         // SUBSTRING
        String str1 = "My name is Love Babbar";
        //beginingIndex -> 3 -> inclusive
        //endIndex  -> 6 -> exclusive
        System.out.println(str1.substring(3,7));

        // contains
        System.out.println(str1.contains("Love"));

        //starts with
        //ends with
        String naame = "Rana Love babbar";
        System.out.println(naame.startsWith("Rana L"));
        System.out.println(naame.endsWith("babbar"));
        //.toCharArray()
        String naaame = "Babbar";
        char[] crr = naaame.toCharArray();
        //print the char array
        for(char ch: crr){
            System.out.println("Value of char: " + ch);
        }
        //SPLIT
        String input = "My , name, is, love, babbar";
        String[] words = input.split(",");
        for(String strr: words){
            System.out.println(strr);
        }



    }
}
