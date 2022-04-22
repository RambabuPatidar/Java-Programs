package com.Backtracking;
//Backtracking 04
public class CountAndPrintPathInMazeWithObstacle02 {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, false, true},
                {true, true, true},
                {true, true, true}
        };

        int ans = countPath01(maze, maze.length -1, maze[0].length -1);
        System.out.println(ans);

        int ans02 = countPath02(maze,0,0);
        System.out.println(ans02);

        printPath(maze,"",0, 0);
    }
    // This is we are doing form reverse indexing let us try to do it with zero indexing
    // very basic stuff do it.
    static int countPath01(boolean[][] maze, int row, int col) {
        if( row == 0 && col == 0) {
            return 1;
        }
        if(!maze[row][col]) {
            return 0;
        }
        int ans = 0;
       if( row > 0) {
          ans += countPath01(maze , row -1 , col);
       }
       if( col > 0) {
           ans += countPath01(maze, row ,col-1);
       }
       return ans;
    }

    static int countPath02(boolean[][] maze, int row , int col){
        if( row == maze.length - 1 && col == maze[0].length -1 ) {
            return 1;
        }
        if(!maze[row][col]) {
            return 0;
        }
        int ans =0;
        if( row < maze.length - 1) {
            ans += countPath02(maze, row +1 , col);
        }
        if( col < maze[0].length - 1) {
            ans += countPath02(maze, row , col +1);
        }
        return ans ;
    }

    static void printPath(boolean[][] maze, String p, int row ,int col) {
        if( row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[row][col]) {
            return ;
        }

        if( row < maze.length -1 ) {
            printPath(maze, p + 'D', row +1,col);
        }
        if( col < maze.length -1  ) {
            printPath(maze, p +'R', row, col +1);
        }
    }
}
