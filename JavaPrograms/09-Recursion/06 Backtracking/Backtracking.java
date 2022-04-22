package com.Backtracking;
//Backtracking 05
public class Backtracking {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        backtracking(maze, "", 0, 0);
    }

    static void backtracking(boolean[][] maze, String p, int row, int col) {
        if( row == maze.length -1 && col == maze[0].length -1){
            System.out.println(p);
            return;
        }
        if(!maze[row][col]) {
            return;
        }
        maze[row][col] = false;
        if(row < maze.length - 1) {
            backtracking(maze, p + 'D', row +1, col) ;
        }
        if(col < maze[0].length - 1) {
            backtracking(maze, p + 'R', row , col +1) ;
        }
        if(row > 0) {
            backtracking(maze, p + 'U', row -1 , col) ;
        }
        if(col > 0) {
            backtracking(maze, p + 'L', row , col -1) ;
        }

        maze[row][col] = true;
    }
}
