// find the doublet in the array whose sum is equal to given value of x
package Arrays2;

public class twosumproblem_011 {
    static void main(String[] args) {
      int arr[] = {0,3,-1,8,5,4,9,2};
      int n = arr.length;
      int x = 9;

        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]+arr[j] == x){
                    System.out.println(arr[i]+" "+arr[j]);


                }
            }
        }
    }
}
