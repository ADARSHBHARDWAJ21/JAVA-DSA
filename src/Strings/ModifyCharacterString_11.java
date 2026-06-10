package Strings;
//we cannot change individual characters in a string , we can but we wil waste a lot of time&space
public class ModifyCharacterString_11 {
    static void main(String[] args) {
        String s  = "hello";
        s = s.substring(0,2)+ 'y' + s.substring(3);
        System.out.println(s);

        //he +y+ lo
        //
        // 1st hello is also in memory and 2nd heylo is also in memory
    }
}
