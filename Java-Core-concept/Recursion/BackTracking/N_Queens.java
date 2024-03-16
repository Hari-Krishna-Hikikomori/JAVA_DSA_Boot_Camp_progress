package JAVA.BackTracking;

import java.util.Arrays;

public class N_Queens {
    public static void main(String[] args) {
        int queen = 4;
        boolean[][] maze ={{true,true,true,true},
                           {true,true,true,true},
                           {true,true,true,true},
                           {true,true,true,true}};
        int arr[][] = new int[maze.length][maze[0].length];
        Queen(maze,arr,0,0,4);

        boolean[][] board = new boolean[5][5];
        System.out.println(Knul_Queens(board,0));

    }

    private static void Queen(boolean[][] maze, int[][] arr, int row, int col,int queen)
    {
        if(col == maze.length)
        {
            return;
        }

        if(row == maze[0].length ){
            for (int i = 0; i < arr.length ; i++) {
                System.out.println(Arrays.toString(arr[i]));
            }
            System.out.println();

            return;
        }
        if(!maze[row][col])
        {
            Queen(maze,arr,row,col+1,queen);
            return;
        }
        int Qrow = row;
        int Qcol = col;
        boolean[][] temp = createSubArray(maze,0, maze.length, 0, maze[0].length);
        temp[Qrow][Qcol] = false;


        while(Qrow != maze.length-1 && Qcol != maze[0].length-1)
        {

            temp[Qrow + 1][Qcol+ 1] = false;
            Qrow = Qrow + 1;
            Qcol = Qcol + 1;
        }

         Qrow = row;
         Qcol = col;
        while(Qrow != 0 && Qcol != 0)
        {


            temp[Qrow - 1][Qcol - 1] = false;
            Qrow = Qrow - 1;
            Qcol = Qcol - 1;
        }

        Qrow = row;
        Qcol = col;
        while(Qrow != 0 && Qcol != maze[0].length-1)
        {


            temp[Qrow - 1][Qcol + 1] = false;
            Qrow = Qrow - 1;
            Qcol = Qcol + 1;
        }

        Qrow = row;
        Qcol = col;
        while(Qrow != maze.length -1 && Qcol != 0)
        {


            temp[Qrow + 1][Qcol - 1] = false;
            Qrow = Qrow + 1;
            Qcol = Qcol - 1;
        }

        Qrow = row;
        Qcol = col;
        while(Qrow != maze.length -1 )
        {


            temp[Qrow + 1][Qcol] = false;
            Qrow = Qrow + 1;
        }

        Qrow = row;
        Qcol = col;
        while(Qrow != 0 )
        {


            temp[Qrow - 1][Qcol] = false;
            Qrow = Qrow - 1;
        }

        Qrow = row;
        Qcol = col;
        while(Qcol != maze[0].length -1 )
        {


            temp[Qrow][Qcol + 1] = false;
            Qcol = Qcol + 1;
        }

        Qrow = row;
        Qcol = col;
        while(Qcol != 0 )
        {

            temp[Qrow][Qcol - 1] = false;
            Qcol = Qcol - 1;
        }

        arr[row][col] = queen;
        Queen(temp,arr,row+1,0,queen - 1);
        arr[row][col] = 0;
        Queen(maze,arr,row,col+1,queen);
    }
    private static boolean[][] createSubArray(boolean[][] originalArray, int startRow, int endRow, int startCol, int endCol) {
        int numRows = endRow - startRow ;
        int numCols = endCol - startCol ;
        boolean[][] subArray = new boolean[numRows][numCols];

        for (int i = startRow; i < endRow; i++) {
            for (int j = startCol; j < endCol; j++) {
                subArray[i - startRow][j - startCol] = originalArray[i][j];
            }
        }

        return subArray;
    }



    static int Knul_Queens(boolean[][] board,int row)
    {
        if(row == board.length)
        {

            display(board);
            return 1;
        }
        int count = 0;
        for (int i = 0; i < board.length; i++)
        {
           if(isTrue(board,row,i))
           {
               board[row][i] = true;
               count += Knul_Queens(board,row+1);
               board[row][i] = false;
           }
        }
        return count;
    }

    private static boolean isTrue(boolean[][] board, int row, int col)
    {
        int Qrow = row;
        int Qcol = col;

        while(Qrow != 0 && Qcol != 0)    // left diagonal
        {


            if(board[Qrow - 1][Qcol - 1])
            {
                return false;
            }
            Qrow = Qrow - 1;
            Qcol = Qcol - 1;
        }

        Qrow = row;
        Qcol = col;
        while(Qrow != 0 && Qcol != board[0].length-1) // diagonal right
        {


            if(board[Qrow - 1][Qcol + 1])
            {
                return false;
            }
            Qrow = Qrow - 1;
            Qcol = Qcol + 1;
        }

        Qrow = row;
        Qcol = col;
        while(Qrow != 0 )              // up
        {


            if (board[Qrow - 1][Qcol])
            {
                    return false;
            }
            Qrow = Qrow - 1;
        }

        Qrow = row;
        Qcol = col;
        while(Qcol != board[0].length-1)  // Right
        {


            if (board[Qrow][Qcol + 1])
            {
                return false;
            }
            Qcol = Qcol + 1;
        }

        Qrow = row;
        Qcol = col;
        while(Qcol != 0 )                  // left
        {

            if (board[Qrow][Qcol - 1])
            {
                return false;
            }
            Qcol = Qcol - 1;
        }


        return true;
    }

    private static void display(boolean[][] board) {
        System.out.println("--------------");
        for(boolean[] row: board)
        {
            for (boolean pos : row)
            {
                if (pos)
                {
                    System.out.print("|Q| ");
                }
                else
                {
                    System.out.print("|_| ");
                }
            }
            System.out.println();
        }
        System.out.println("--------------");
    }
}
