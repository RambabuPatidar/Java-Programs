package com.Backtracking;

import java.util.Arrays;

public class PrintAllPaths {
    public static void main(String[] args) {
        int[][] maze = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        printAllPaths(maze,"", 0, 0, 1);
    }
    static void printAllPaths(int[][] maze,String p, int row, int col, int level) {
        if( row == maze.length -1 && col == maze[0].length -1){
            maze[row][col] = level;
            for(int[] num: maze) {
                System.out.println(Arrays.toString(num));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(maze[row][col] != 0) {
            return;
        }
        maze[row][col] = level;
        if(row < maze.length - 1) {
            printAllPaths(maze, p + 'D', row +1, col, level+ 1) ;
        }
        if(col < maze[0].length - 1) {
            printAllPaths(maze, p + 'R', row , col +1, level+ 1) ;
        }
        if(row > 0) {
            printAllPaths(maze, p + 'U', row -1 , col, level+ 1) ;
        }
        if(col > 0) {
            printAllPaths(maze, p + 'L', row , col -1, level + 1) ;
        }
        maze[row][col] = 0;

    }
}
