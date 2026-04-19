// given an array of marks of student if the marks of any atudent is less than
//35 print its roll roll number .[roll no refers to index of array]

package Arrays2;

public class array_problem04 {
    static void main(String[] args) {
      int[] arr = {34,45,67,100,56,34,0,4,23,22};
      int n = arr.length;
        System.out.println("Student marks less then 35are: ");
        for (int i = 0; i<n ; i++) {
            if (arr[i] <23){
                // we wrote i so that index of no less then 35 can be printed
                System.out.println(i+ " ");
            }

        }
    }
}
