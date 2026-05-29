package Strings;

public class Append_17 {
    static void main(String[] args) {
        StringBuilder s = new StringBuilder("Abc");
        s.append(35);
        System.out.println(s);
        s.append('*');
        System.out.println(s);
        int[] arr = {1,2,3,4,5};
        s.append(arr); // does not work , address is appended
        System.out.println(s);
    }
}
