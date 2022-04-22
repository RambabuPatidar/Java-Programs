package com.Backtracking;

import java.util.Arrays;

public class PrintAllPaths02 {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        int[][] board = new int[maze.length][maze[0].length];
        allPaths(maze, board, "", 0, 0, 1);

    }

    static void allPaths(boolean[][] maze, int[][] board, String p, int row, int col, int step) {
        if( row == maze.length -1 && col == maze[0].length -1){
            board[row][col] = step;
            for(int[] arr : board) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[row][col]) {
            return;
        }
        maze[row][col] = false;
        board[row][col] = step;

        if(row < maze.length - 1) {
            allPaths(maze, board, p + 'D', row +1, col, step + 1) ;
        }
        if(col < maze[0].length - 1) {
            allPaths(maze, board,p + 'R', row , col +1, step + 1) ;
        }
        if(row > 0) {
            allPaths(maze, board,p + 'U', row -1 , col, step + 1) ;
        }
        if(col > 0) {
            allPaths(maze, board,p + 'L', row , col -1, step + 1) ;
        }
        maze[row][col] = true;
        board[row][col] = 0;

    }
}
