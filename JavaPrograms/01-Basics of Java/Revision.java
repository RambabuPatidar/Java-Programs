package com.BasicsOfJava;

import java.util.Scanner;
import java.util.ArrayList;
public class Revision {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

//        // Array declaration
//
//        int n = 5;
//        int[] arr = new int[n];
//
//        // Array Input
//        System.out.print("Input the Array: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        // Array OutPut 1.
//        System.out.print("Output 1 : ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        // Array Output 2
//        System.out.print("Output 2 : ");
//        for(int i : arr) {
//            System.out.print(i +" ");
//        }
//        System.out.println();
//        //Array Output 3
//        System.out.print("Output 3 : ");
//        System.out.println(Arrays.toString(arr));
//
//        // Passing the array into the method(function )
//        changeValue(arr);
//        System.out.print("Value after change value function called ");
//        System.out.println(Arrays.toString(arr));


        // multidimensional arrays
//        int n = 3;
//        int[][] arr = new int[n][];


//
//        for (int row = 0; row < n; row++) {
//            System.out.println("Enter the size of " + row + "th column ");
//            arr[row] = new int[in.nextInt()];
//            System.out.print("Enter the element of " + row + "th row :");
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = in.nextInt();
//            }
//        }
//
//        for (int row = 0; row < n; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//
//            }
//            System.out.println();
//
//        }

//       ArrayList<Integer> list = new ArrayList<>();
//       list.add(1);
//       list.add(2);
//        System.out.println(list.get(0));
//        list.add(3);
//        list.set(2, 0);
//        System.out.println(list);

        // declaration of arrays of array list
        // this "list" reference variable/ identifier will get stored in stack memory
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(3);
        // initialisation of arrays of array list
        // this actual object of the arrays of arraylist will be stored in objects;
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }



    }

//    static void changeValue(int[] arr) {
////        for (int i = 0; i < arr.length; i++) {
////            arr[i] = 0;
////        }
//        Arrays.fill(arr, 0);
//    }
}
