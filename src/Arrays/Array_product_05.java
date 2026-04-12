package Arrays;

import java.sql.SQLOutput;

public class Array_product_05 {
    static void main(String[] args) {
        {
            int [] arr = {-6,5,65,65,556,56};
            double product = 1;
            System.out.println(arr.length);
            // double product = 1;
            for (int i = 0; i < arr.length ; i++) {
                //product *= arr[i];
                product *= arr[i];
            }
            System.out.println(product);
            // System.out.println(product);
        }

    }
}


