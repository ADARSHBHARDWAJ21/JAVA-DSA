package Strings;

public class revesion_01 {
    static void main(String[] args) {
        // string creation has 2 ways to create string
        //1 string literal -
        String str = "Love";
        System.out.println(str);
        //2 New keyword
        String Str = new String("Loove");
        System.out.println(Str);

        String firstName = "Adarsh";
        String lastname = new String("bhardwaj");
        System.out.println(firstName + " "+ lastname);
        System.out.println(firstName.length());
        System.out.println(firstName.charAt(2));
        // COMPARISION STRINGS
        // ==
        String name1 = "Love";
        String name2 = "LOVE";
        //== doesent checks name1 and name2  it checks that both name1 and name2 are refring to same thing or not in heapmemory
       // if(name1 == name2){

        //.equals check the actual equal not refrence
        //if(name1.equalsIgnoreCase(name2)){
        if(name1.equals(name2)){
            System.out.println("Both strings are equal");
        }
         else{
            System.out.println("Both strings are not equal");
        }

    ///  String input
        //There are 2methods to take input in strings
        //1) next()
        //2) next line()

    }


}
