package com.StringQuestions;

public class SuffleString {
    public static void main(String[] args) {
//        "aiohn"
//                [3,1,4,2,0]
        String s= "aiohn";
        int[] arr = {3,1,4,2,0};

        String ans = restoreString(s, arr);
        System.out.println(ans);
    }

    static String restoreString(String s, int[] indices) {
        StringBuilder  builder = new StringBuilder(s);

        for(int i=0; i< indices.length ; i++ ) {
            if( indices[i] != i ) {
                char temp = (char)builder.charAt(indices[i]);
                builder.setCharAt(indices[i],(char)builder.charAt(i)) ;
                builder.setCharAt(i,temp);
                int temp2 = indices[i];
                indices[i] = indices[temp2];
                indices[temp2] = temp2;
            }

        }
        return builder.toString();

    }


}
