package Strings;

public class Indexofjava_05 {
    static void main(String[] args) {
        // index of
        String s = "Raghav";
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        // compare to used to compare 2 given strings lexographically

      String a = "abc";
      String b = "dbc";
        System.out.println(a.compareTo(b ));
         // c.contains
        String c = "Physsics wallah Skills";
        //System.out.println(c.contains("slla"));
        System.out.println(c.contains("wallah"));
        // c.startsWith
        System.out.println(c.startsWith("physs"));
        System.out.println(c.endsWith("lls"));

        System.out.println();

    }
}
