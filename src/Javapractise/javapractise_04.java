// given an array of marks of student if the marks of any student is less than 35 print
//its roll number {roll no refers to index of array}

package Javapractise;

public class javapractise_04 {
    static void main(String[] args) {
      int []arr = {34,5,4,55,67,76,45,66,76,67,34,43,65};
      int n = arr.length;
      for (int i = 0; i<n; i++){
          if(arr[i]<35)
              System.out.println(i+ " ");
      }

    }
}
