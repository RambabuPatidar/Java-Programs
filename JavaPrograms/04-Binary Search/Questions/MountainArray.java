package com.BinarySearchQuestions;

public class MountainArray {
    public static void main(String [] args) {
        int[] arr = {0, 1, 0};

        System.out.println(mountainArray(arr));
     }

     static int mountainArray(int[] arr) {
         int s = 0;
         int e = arr.length -1;
         while(s <= e) {
             int mid = (s+e) / 2;
             if(arr[mid] < arr[mid+1]) {
                 s = mid+1;
             }
             else {
                 e = mid-1;
             }

         }
         return e+1;
     }


}
