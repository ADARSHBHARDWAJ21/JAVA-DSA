package Collectionframework;

import java.util.*;

public class module1 {
    static void main(String[] args) {
       // List or Collection -> interface
        // ArrayList -> concrete class
        ArrayList<Integer> list = new ArrayList<>();
        // add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        //addAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(20);

        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.size());
        System.out.println("Printing list2: "+ list2);
        list2.clear();
        System.out.println(list2.size());

        // I want to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("Element: " + iterator.next());
        }

        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
        System.out.println(list3.get(2));
        System.out.println("befor ser: " +list3);
        list3.set(0,100); // old value at index will be overwrite
        System.out.println("after set: " + list3);

        list3.set(0,100);
        // toArray  // converting any collection to array

      Object[]arr = list3.toArray();
      for(Object obj: arr){
          System.out.println(obj);
      }
      //contains
        System.out.println(list3.contains(100009));

      list.add(12);
      list.add(6);
        System.out.println("Printing Entire List: " +list);

        //sort an arrayList'
        Collections.sort(list);
        System.out.println("Printing Entire List:  "+list);
          // HW -> how can we sort nin descending order
        ArrayList<Integer> newList = (ArrayList<Integer>)list.clone();
        System.out.println("Printing Entire newList:  " + newList);
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
        System.out.println(marks.isEmpty());
        System.out.println(newList.indexOf(40));



    }
}
