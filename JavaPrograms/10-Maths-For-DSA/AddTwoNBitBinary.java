package com.MathsForDSA;

import java.util.Arrays;

public class AddTwoNBitBinary {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0};
        int[] arr2 = {0, 0, 0, 0};

       int[] ans =  addition(arr, arr2);
        System.out.println(Arrays.toString(ans));

        System.out.println(Integer.toBinaryString(0));
    }

    static int[] addition(int[] num1, int[] num2){
        int[] ans = new int[num1.length  + 1];
        int carry = 0;
        int i;
        for (i = num1.length-1; i >= 0 ; i--) {
            int sum = num1[i] + num2[i] + carry;
            if( sum <=1) {
                ans[i+1] = sum;
                carry = 0;
            }
            else if( sum == 2) {
                ans[i+1] = 0;
                carry = 1;
            }
            else{
                ans[i+1] = 1;
                carry = 1;
            }
        }
        ans[i + 1] = carry;
        return ans;
    }
}
