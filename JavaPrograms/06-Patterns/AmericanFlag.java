package com.Patterns;

public class AmericanFlag {
    public static void main(String[] args) {
        int n = 15;
        americanFlag(n);
    }

    static void americanFlag(int n) {
        for(int i=1; i<= n; i++) {
           if(i<=n/2){
               System.out.print(" ");
               if( i%2 ==0) {
                   System.out.print(" ");
                   for(int j=1; j<=5; j++) {
                       System.out.print("* ");
                   }
                   System.out.print(" ");
                   for(int j=1; j<=25; j++){
                       System.out.print("=");
                   }
               }
               else{
                   for (int j = 1; j <=6 ; j++) {
                       System.out.print("* ");
                   }
                   for(int j=1; j<=25; j++){
                       System.out.print("#");
                   }
               }

           }
           else{
               if( i%2 == 0) {
                   for(int j = 1; j<=38; j++) {
                       System.out.print("=");
                   }
               }
               else{
                   for(int j = 1; j<=38; j++) {
                       System.out.print("#");
                   }
               }
           }
            System.out.println();
        }
    }
}
