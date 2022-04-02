package com.Patterns;

public class PatternQuestionByKK {
    public static void main(String[] args) {
        int n = 5;

//        filledDiamond(n);
        pattern31(n);
    }

    static void pattern31(int n) {
        int originalN = n;
        n = 2 * n;
        for(int i=0; i<n; i++) {

            for(int j=0; j<n; j++) {
                System.out.print(originalN - Math.min(i, Math.min(j, Math.min(n-j-1,n-i-1))) + " ");
            }
            System.out.println();
        }
    }

    static void filledDiamond(int n ) {
        for(int i=1; i<=2 * n - 1 ; i++) {
            int space = i > n ? i-n : n-i;
            int star = i >n ? n - space : i;
            for(int j=1; j<= space ; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
