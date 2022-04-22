package com.Backtracking;

public class AllDirectionPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        AllDirection(maze, "", 0, 0);
    }

    static void AllDirection(boolean[][] maze, String p, int row ,int col) {
        if( row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        // The cells which are visited mark them false. because if we don't
        // do that the same function call will be called in the recursive function
        // calls and these will lead to an endless loop
        if(!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        if( row < maze.length -1 ) {
            AllDirection(maze, p + 'D', row +1,col);
        }
        if( col < maze.length -1  ) {
            AllDirection(maze, p +'R', row, col +1);
        }
        if(row > 0){
            AllDirection(maze, p + 'U', row -1, col);
        }
        if(col > 0){
            AllDirection(maze,p + 'L', row,col -1);
        }
    }
}
 // But problem with this is that whenever we marked the cell as false
// it has been modified in the original and the other path can't use it
//because it is marked false. so whenever other function call reach at that point
// it will find that point as marked false so it will return from that point.
// this will lead to lost of some paths and we will only able to get the first
// some paths that had took advantage of being first as the maze was initially true.