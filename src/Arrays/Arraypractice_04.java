package Arrays;

public class Arraypractice_04 {
    static void main() {
        int arr[] = {3,45,34,-45,67,-56,-55,34,34};
        for (int i = 0; i <arr.length ; i++) {
            if(i%2==1) {arr[i] =arr[i]*2;
            }
            else {
                arr[i] += 10;
            }

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i] );

        }
    }
}
