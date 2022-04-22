package com.Backtracking;

import java.util.Arrays;

public class RatInMaze {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, false, true, true, true, true},
                {true, true, true, false, true, false},
                {false, true, false, false, true, true},
                {true, false, true, true, false, true},
                {false, false, true, false, false, true},
                {true, false, false, true, false, true},
        };
        int[][] board = new int[maze.length][maze[0].length];
        ratInMaze(maze,board, "", 0, 0, 1);



    }


    static void ratInMaze(boolean[][] maze, int[][] board, String p, int row, int col, int step) {
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
        board[row][col] = step;
        maze[row][col] = false;
        if(row < maze.length - 1) {
            ratInMaze(maze, board,p + 'D', row +1, col,step + 1) ;
        }
        if(col < maze[0].length - 1) {
            ratInMaze(maze, board,p + 'R', row , col +1 ,step +1 ) ;
        }
        if(row > 0) {
            ratInMaze(maze, board,p + 'U', row -1 , col,step +1) ;
        }
        if(col > 0) {
            ratInMaze(maze, board,p + 'L', row , col -1,step +1) ;
        }
        maze[row][col] = true;
        board[row][col] = 0;

    }
}
