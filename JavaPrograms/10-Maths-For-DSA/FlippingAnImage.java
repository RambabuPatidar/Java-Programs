package com.MathsForDSA;

import java.util.Scanner;

public class FlippingAnImage {
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        int[][] mat = {
                {1 ,0, 0, 1},
                {0, 0, 1, 1},
                {1, 0, 1, 0},
                {1, 0, 0, 1}
        };

        for(int i=0; i<mat.length; i++) {
            reverseArray(mat, i);
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void reverseArray(int[][] mat, int i) {
        int first= 0;
        int last = mat[i].length -1;
        while( first <= last) {
            int temp = mat[i][first];
            mat[i][first] = 1 ^ (mat[i][last]);
            mat[i][last] = 1 ^ (temp);
            first++; last--;
        }
//        for (int j = 0; j <= (mat[i].length + 1) / 2; j++) {
//            int temp = mat[i][j];
//            mat[i][j] = 1 ^ (mat[i][mat[i].length -1 -j]);
//            mat[i][mat[i].length -1 -j] = 1 ^ (temp);
//
//        }
    }
}
