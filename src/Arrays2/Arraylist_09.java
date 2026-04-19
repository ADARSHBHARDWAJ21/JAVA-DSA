// in java thy have fixed size so we use dynamic array using oop
package Arrays2;

import java.util.ArrayList;

public class Arraylist_09 {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,11);
        arr.add(2,14);
        arr.add(3,15);
        arr.add(4,18);
        arr.add(5,23);
       System.out.println(arr.get(0));
        System.out.println(arr);
        for (int i = 0; i <=5 ; i++) {
           // System.out.println(arr.get(i)+ " ");

        }
        System.out.println();
        arr.set(2,300);
        System.out.println(arr);


        arr.add(90);
        System.out.println(arr.size());
        System.out.println(arr);

        arr.remove(0);
        System.out.println(arr);
        }
    }

