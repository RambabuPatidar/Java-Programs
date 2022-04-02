package com.StringsAndStringBuilder;

public class Performance {
    public static void main(String[] args) {
        // print all the small case alphabet

//        since the strings are immutable the whenever we are
        // adding the charcter into the previous string
        //it will creat new object for the that new string
        // and because of this grabage collection will have n-1
        // garbage values and the copying time of the previous string
//        take the time equal to length i.e. 1 + 2+ 3+ .... n-1
        // this will leads to the time complexity of n^2;
        // for optimizing this we will use the string builder
        String alpha = "";
        for(int i=0; i<26; i++) {
            alpha += (char)('a' + i);
        }
        System.out.println(alpha);
    }
}
