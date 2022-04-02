package com.StringQuestions;

public class DefangeIPAddress {
    public static void main(String[] args){
        String s = "12.234.11.543";
        String toPut = "[.]";
//       String ans =  defangeAddress(s, toPut);
        String ans = defangeAddressModify(s, toPut);
        System.out.println(ans);

    }

    static String defangeAddressModify(String s , String toPut){
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '.') {
                builder.append("[.]");

            }
            else{
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
    static String defangeAddress(String s, String toPut) {

        // the drawback is that it is creating the new object
        //of string again and again reason is string are immutable
        String ans = "";
        int end = s.length() -1;
        int start = 0;
        while(start <= end) {
            if( s.charAt(start) == '.') {
                ans += toPut;

            }
            else{
                ans += s.charAt(start);
            }
            start ++ ;
        }
        return ans;
    }

}
