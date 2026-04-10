package Javapractise;

public class javapractise_03 {
    static void main(String[] args) {
        int arr[] = {1,3,4,2,4,34,43,-23};

        for (int i = 0; i <arr.length ; i++) {
            if (i%2==1) {arr[i] = arr[i]*2;
            }
            else{
                arr[i]+=10;
            }
            System.out.println(arr[i] + "");
        }
    }
}
