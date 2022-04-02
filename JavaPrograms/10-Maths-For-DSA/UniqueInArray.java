package com.MathsForDSA;

public class UniqueInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4 ,5, 4, 3, 2, 1};

        System.out.println(findUnique(arr));
    }

     static int findUnique(int[] arr) {
            int ans =arr[0];
         for (int i = 1; i < arr.length; i++) {
             ans = ans^arr[i];
         }
         return ans;
    }
}
