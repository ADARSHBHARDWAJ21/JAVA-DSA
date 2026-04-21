package Arrays2;

public class twosum {
    static void main(String[] args) {
        int[] arr ={3,5,34,56,7,8,9,98};
        int n = arr.length;
        int x = 10;
        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x)
                    System.out.println("Element found " + i+ " " + j);


            }
        }

        }


    }

