package Logicbuilding;

public class problem_3 {

    static int reverseNum(int num) {
        int revNum = 0;

        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;
        }

        return revNum;
    }

    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = reverseNum(num);

        if (originalNum == reversedNum) {
            System.out.println("It is a palindrome");
            return true;
        } else {
            System.out.println("It is not a palindrome");
            return false;
        }
    }

    public static void main(String[] args) {

        int num = 1456;

        int revNum = reverseNum(num);
        System.out.println("Reverse Number = " + revNum);

        boolean ans = isPalindrome(num);
        System.out.println(ans);

    }
}