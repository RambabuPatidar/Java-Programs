package com.BasicsOfJava;
 import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {

        multiple(12, 24, 'R' ,"Rambabu", "KunalKushwaha");
        int c = sum(25, 25);

    }

    static void sum (int a, int ... v){
        System.out.println("the variable argument function got called");
    }

    static int sum(int a, int b) {
        return a+b;
    }
    static void multiple(int a, int b, char c, String ... s){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(Arrays.toString(s));
    }
}
