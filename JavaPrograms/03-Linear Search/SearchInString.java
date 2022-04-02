package com.LinearSearchAndQuestions;
import java.util.Arrays;
public class SearchInString {
    public static void main(String[] args) {
        String name = "Rambabu";
        char target = 'z';

        if( linearSearch(name, target) ) {
            System.out.println("present" );

        }
        else {
            System.out.println("Not Present");

        }
        // converting the string to array and than making that array
        // string to print
        // it is working internally don't worry to much
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean linearSearch(String name, char target) {
        if(name.length() == 0) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if( name.charAt(i) == target) {

                return true;
            }

        }
        return false;
    }
}
