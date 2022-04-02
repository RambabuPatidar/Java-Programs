package com.MathsForDSA;

public class FindApowerB {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;

        System.out.println(findPower(base, power));
    }

    static int findPower(int base, int power){
        int ans= 1;
        while( power != 0) {
            if( (power & 1) == 1) {
                ans = ans * base;
            }
            power = power >> 1;
            base = base*base;
        }
        return ans;
    }
}
