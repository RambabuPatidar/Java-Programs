package com.Patterns;

public class PatternsQuestion01 {
    public static void main(String[] args) {
        int n = 5;

//        square(n);

//        leftAlignedRightTriangle(n);

//        rightAlignedRightTriangle(n);

//        invertedRightAlignedTriangle(n);

//          verticalLineNumberTriangle(n);

//            leftAlignedFullTriangle(n);
//        triangle(n);

//        invertedTriangle(n);
//        triangleWithIncreasingStar(n);
//        triangleWithDecreasingStar(n);
//        triangleWithBothIncreasingAndDecreasingStar(n);
//          emptyTriangle(n);
          emptyTriangleReversed(n);
    }

    static void emptyTriangleReversed(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            if(i == 1) {
                System.out.println("*");

                continue;
            }
            if( i== n) {
                for(int j=1; j<=2*n -1; j++) {
                    System.out.print("*");
                }
                System.out.println();
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
    static void emptyTriangle(int n ) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            if(i == 1) {
                System.out.println("*");

                continue;
            }
            if( i== n) {
                for(int j=1; j<=2*n -1; j++) {
                    System.out.print("*");
                }
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

    static void triangleWithBothIncreasingAndDecreasingStar(int n) {
        triangleWithDecreasingStar(n);
        triangleWithIncreasingStar(n);
    }

    static void triangleWithDecreasingStar(int n) {
        for(int i= 1; i<=n; i++) {
            for(int j=1; j<=i-1; j++) {
                System.out.print(" ");

            }
            for(int j=1; j<= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void triangleWithIncreasingStar(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void invertedTriangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i-1; j++) {
                System.out.print(" ");

            }
            for(int j=1; j<=2*(n-i+1) -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void leftAlignedFullTriangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=1; i<n; i++) {
            for(int j=n-i; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void verticalLineNumberTriangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j =1; j<=i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    static void invertedRightAlignedTriangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void rightAlignedRightTriangle(int n) {
        for(int i=0; i<n ;i++) {
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void square(int n) {
        for(int i=0; i<n; i++) {
            for(int j = 0; j<n ;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void leftAlignedRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
