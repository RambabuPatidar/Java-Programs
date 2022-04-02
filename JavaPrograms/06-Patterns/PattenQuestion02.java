package com.Patterns;

public class PattenQuestion02 {
    public static void main(String[] args) {
        int n =  5;

//        emptyDiamond(n);

//        numberDecIncDiamond(n);

//
        numberDecIncDiamond1(n);
    }

    static void framedEmptyDiamond(int n) {
        for(int i=1; i<=n ;i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=2*(i-1); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=2*(i-1); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void numberDecIncDiamond1(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=i; j>=1; j--) {
                System.out.print(j+" ");
            }
            if(i==1) {
                System.out.println();
                continue;
            }
            for(int j = 1; j<=i-1; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }

        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=i; j>=1; j--) {
                System.out.print(j+" ");

            }
            if(i==1) {
                System.out.println();
                continue;
            }
            for(int j = 1; j<=i-1; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
    static void numberDecIncDiamond(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            if(i==1) {
                System.out.println();
                continue;
            }
            for(int j = 1; j<=i-1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }

        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            if(i==1) {
                System.out.println();
                continue;
            }
            for(int j = 1; j<=i-1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    static void emptyDiamond(int n ) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            if(i == 1) {
                System.out.println("*");

                continue;
            }

            System.out.print("*");
            for(int j=1; j<=2*(i-1) -1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            if(i == 1) {
                System.out.println("*");

                continue;
            }

            System.out.print("*");
            for(int j=1; j<=2*(i-1) -1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }

}
