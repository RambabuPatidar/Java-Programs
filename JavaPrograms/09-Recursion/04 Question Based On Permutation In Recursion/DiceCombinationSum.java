package com.PermutationRecursion;

import java.util.ArrayList;

public class DiceCombinationSum {
    public static void main(String [] args) {
        System.out.println(diceFace("", 2, 6));
    }

    static void dice(String p, int target) {
        if( target == 0 ) {
            System.out.println(p);
            return ;
        }

        for(int i=1; i<=6 && i<=target; i++) {
            dice(p + i, target - i);
        }
    }

    static ArrayList<String> dice02(String p, int target) {
        ArrayList<String> list = new ArrayList<String>();
        if( target == 0 ) {
            list.add(p);
            return list;
        }

        for(int i=1; i<=6 && i<=target; i++) {
            list.addAll(dice02(p + i, target - i));
        }
        return list;
    }
    // Let's say we have now given the dice of 8 sides or any side
    static ArrayList<String> diceFace(String p, int target, int face) {
        ArrayList<String> list = new ArrayList<String>();
        if( target == 0 ) {
            list.add(p);
            return list;
        }

        for(int i=1; i<=face && i<=target; i++) {
            list.addAll(diceFace(p + i, target - i, face));
        }
        return list;
    }
}
