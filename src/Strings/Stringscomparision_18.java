package Strings;

public class Stringscomparision_18 {
    static void main() {
        String name1 = "Love";
        String name2 = "LOVE";
        // ==
//        if(name1==name2){
//            System.out.println("Both strings are equal");
//
//        }else{
//            System.out.println("Both strings are not equal");
//        }

        // .equals()
//        if(name1.equals(name2)){
//            System.out.println("Both strings are equal");
//
//        }else{
//            System.out.println("Both strings are not equal");
//        }

           //.equalsIgnoreCase()
        if(name1.equalsIgnoreCase(name2)){
            System.out.println("Both strings are equal");

        }else{
            System.out.println("Both strings are not equal");
        }
    }
    }
