package JAVA.BlackTricking_Maze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maze_Allside {
    public static void main(String[] args) {
        Boolean[][] maze ={{true,true,true},
                           {true,true,true},
                           {true,true,true}};
        int[][] count = new int [maze.length][maze[0].length];

        System.out.println(allSide("",0,0,maze));
        System.out.println(allSide2("",0,0,maze));
        allsideCount("",0,0,maze,count);


    }
    static List<String> allSide(String ans, int Down, int Right, Boolean[][] maze)
    {

        ArrayList<String> pos = new ArrayList<>();

        if(Down == maze.length-1 && Right == maze[0].length-1)
        {
            pos.add(ans);
            return pos;
        }
        Boolean[][] copy = createSubArray(maze,0, maze.length, 0, maze[0].length);
        copy[Down][Right] = false;
        if(Down != maze.length-1 && Right != maze[0].length-1 && maze[Down+1][Right+1])
       {
            pos.addAll(allSide(ans + "C", Down + 1, Right+1,maze));
        }


        if(Down != maze.length-1 && maze[Down+1][Right]) {
            
            
            pos.addAll(allSide(ans + "D", Down + 1, Right,copy));
        }

        if(Right != maze[0].length-1 && maze[Down][Right+1]) {
            
            
            
            pos.addAll(allSide(ans + "R", Down, Right + 1,copy));
        }
        if(Down != 0 && maze[Down-1][Right]) {
            
            
            
            pos.addAll(allSide(ans + "U", Down - 1, Right,copy));
        }

        if(Right != 0 && maze[Down][Right-1]) {
            
            
            
            pos.addAll(allSide(ans + "L", Down, Right - 1,copy));
        }
        return pos;
    }
    private static Boolean[][] createSubArray(Boolean[][] originalArray, int startRow, int endRow, int startCol, int endCol) {
        int numRows = endRow - startRow ;
        int numCols = endCol - startCol ;
        Boolean[][] subArray = new Boolean[numRows][numCols];

        for (int i = startRow; i < endRow; i++) {
            for (int j = startCol; j < endCol; j++) {
                subArray[i - startRow][j - startCol] = originalArray[i][j];
            }
        }

        return subArray;
    }
    static List<String> allSide2(String ans, int Down, int Right, Boolean[][] maze)
    {

        ArrayList<String> pos = new ArrayList<>();

        if(Down == maze.length-1 && Right == maze[0].length-1)
        {
            pos.add(ans);
            return pos;
        }

        maze[Down][Right] = false;
        if(Down != maze.length-1 && Right != maze[0].length-1 && maze[Down+1][Right+1])
        {
           pos.addAll(allSide2(ans + "C", Down + 1, Right+1,maze));
        }


        if(Down != maze.length-1 && maze[Down+1][Right])
        {
            pos.addAll(allSide2(ans + "D", Down + 1, Right,maze));
        }

        if(Right != maze[0].length-1 && maze[Down][Right+1])
        {
            pos.addAll(allSide2(ans + "R", Down, Right + 1,maze));
        }
        if(Down != 0 && maze[Down-1][Right])
        {
            pos.addAll(allSide2(ans + "U", Down - 1, Right,maze));
        }

        if(Right != 0 && maze[Down][Right-1])
        {
            pos.addAll(allSide2(ans + "L", Down, Right - 1,maze));
        }
        maze[Down][Right] = true;
        return pos;
    }
    static void allsideCount(String ans, int Down, int Right, Boolean[][] maze,int[][] mazeCount)
    {


        if(Down == maze.length-1 && Right == maze[0].length-1)
        {
            mazeCount[Down][Right] = 1 + ans.length();
            for (int i = 0; i < maze.length ; i++) {
                System.out.println(Arrays.toString(mazeCount[i]));
            }
            System.out.println(ans);
            System.out.println();
            return;
        }

        maze[Down][Right] = false;
        mazeCount[Down][Right] = 1 + ans.length();
        if(Down != maze.length-1 && Right != maze[0].length-1 && maze[Down+1][Right+1])
        {
            allsideCount(ans + "C", Down + 1, Right+1,maze,mazeCount);
        }


        if(Down != maze.length-1 && maze[Down+1][Right])
        {
            allsideCount(ans + "D", Down + 1, Right,maze,mazeCount);
        }

        if(Right != maze[0].length-1 && maze[Down][Right+1])
        {
            allsideCount(ans + "R", Down, Right + 1,maze,mazeCount);
        }
        if(Down != 0 && maze[Down-1][Right])
        {
            allsideCount(ans + "U", Down - 1, Right,maze,mazeCount);
        }

        if(Right != 0 && maze[Down][Right-1])
        {
            allsideCount(ans + "L", Down, Right - 1,maze,mazeCount);
        }
        maze[Down][Right] = true;
        mazeCount[Down][Right] = 0;
        return ;
    }
}
