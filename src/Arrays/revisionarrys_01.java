package Arrays;

public class revisionarrys_01 {
    static void main(String[] args) {
        //basix 01
        //int arr[];
        //Allocation
        //arr = new int[5];
        //init
        int brr[] = {10, 20, 30};
        int n = brr.length;
        System.out.println("VALUE AT 0 INDEX " + brr[0]);
        System.out.println("VALUE AT 0 INDEX " + brr[1]);
        System.out.println("VALUE AT 0 INDEX " + brr[2]);

        //------------------------------+--------------------------------------------------------------------------
        // sum of array
        //int arr [] = {1,2,3,4,5,6};
        // int sum = 0;
        //for (int i = 0; i <arr.length ; i++) {
        //  sum += arr[i];


        //}
        //System.out.print(sum);
        // System.out.println("Value at 0 index: " +arr[3]);
        // multiplication of array
        int arr[] = {1, 2, 3, 4, 5, 6};
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];


        }
        // System.out.print(product);

//        // max value inside the array
        int crr[] =  {23,54,6,4,-1,56};
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i <crr.length ; i++) {

            if(crr[i]>mx) {
                mx = crr[i];
            }

        }
       // System.out.println(mx);

    // minimum element in array
        int drr[] = {23,4,5,-9,8,1,0};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <drr.length ; i++) {
            if (min >drr[i]) {
                 min = drr[i];
            }
        }
        System.out.println(min);
    }
}

