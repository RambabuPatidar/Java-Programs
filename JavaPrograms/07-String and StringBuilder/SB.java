package com.StringsAndStringBuilder;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder =  new StringBuilder();
       // string builder does not create a new object every time
        // because we are just appending directly the character in to the string

        for(int i=0; i<26; i++) {
            builder.append( (char )('a' + i));
        }

        System.out.println(builder.toString());
    }
}
