package Arrays2;

public class maxarray {
    static void main(String[] args){
        int[]arr = {1,23,4,5,-54,53,-43,78};
        int n =arr.length;
        int mx = arr[0];
        for (int i = 0; i <n ; i++) {
            if(arr[i]>mx)
                mx = arr[i];
        }
        System.out.println(mx);

    }
}
