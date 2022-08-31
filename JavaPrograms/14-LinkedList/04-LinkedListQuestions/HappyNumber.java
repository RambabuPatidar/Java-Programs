package com.LinkedList.LinkedListQuestions;
// a number is a happy number if the sum of the squares of the digits becomes
// 1 after some steps. google question search if not understand.

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(happyNumber(10000));
    }

    public static boolean happyNumber(int num){
        int slow = num;
        int fast = num;
        do {
            slow = squareNum(slow);;
            fast = squareNum(squareNum(fast));
        } while (fast != slow);

        if (fast == 1) {
            return true;
        }
        return false;
    }

    private static int squareNum(int num) {
        int ans = 0;
        while (num > 0 ) {
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }

}
