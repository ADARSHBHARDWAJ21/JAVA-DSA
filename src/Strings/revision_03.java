// string operations
package Strings;

public class revision_03 {
    static void main(String[] args) {
        // empty - > uss string ki length 0 hai
        //  blank -> empty or sirf spaces hai string
        String str = " ";
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        String name = "  Love  ";
        System.out.println(name.length());
        name = name.trim();
        System.out.println(name.length());

    }
}
