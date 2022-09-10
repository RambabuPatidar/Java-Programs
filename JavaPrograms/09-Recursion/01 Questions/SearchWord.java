package com.MoreRecursionQuestions;
// Q. https://leetcode.com/problems/word-search/

public class SearchWord {
//    add base conditions I directly added that it in editor
    public static void main(String[] args) {
        char[][]  board = {
            {'a', 'b','c'},
            {'s', 'f','c'},
            {'a', 'd','e'}
        };
        String word  = "fdeccb";
        System.out.println(wordSearch(board,word));
    }

    static boolean wordSearch(char[][] board, String word) {
        char ch = word.charAt(0);
        int i;
        if( board.length == 1 && board[0].length == 1) {
            return true;
        }
        boolean found = false;
        for ( i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if( board[i][j] == ch) {
                    if( search(board, i, j, word)){
                        found = true;
                        break;

                    }
                }
            }
            if(found) {
                break;
            }
        }
        return found;

    }

    static boolean search(char[][] board, int row, int col, String word) {
        if( word.isEmpty() ) {
            return true;
        }
        char stChar = word.charAt(0);

        if( board[row][col] != stChar) {
            return false;
        }
        char store = board[row][col];
        board[row][col] = '.';
        boolean down = false;
        boolean up = false;
        boolean right = false;
        boolean left = false;

        if(row < board.length -1) {
            down =  search(board,row +1, col, word.substring(1));
        }
        if( col < board[0].length - 1) {
            right=  search(board, row , col +1, word.substring(1));
        }
        if( row > 0) {
            up =  search(board, row -1, col, word.substring(1));
        }
        if( col > 0) {
            left =  search(board, row , col - 1, word.substring(1));
        }
        board[row][col] = store;
        return down || up || left || right ;
    }
}
