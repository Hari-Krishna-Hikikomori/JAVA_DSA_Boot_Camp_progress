package JAVA.BackTracking;


public class N_Knights
{
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(Knights(board,0));

        System.out.println(Kunal_knights(board,0,0,4,0));
    }

    private static int Kunal_knights(boolean[][] board, int row, int col, int Knights,int count)
    {
        if(Knights == 0)
        {
            display(board);
            count += 1;
            return count;
        }
        if(row == board.length-1 && col == board.length)
        {
            return count;
        }
        if(col == board.length)
        {
            return Kunal_knights(board,row+1,0,Knights,count);
        }


            if(isSafe(board,row,col))
            {
                board[row][col] = true;
                count = count + Kunal_knights(board,row,col+1,Knights-1,count);
                board[row][col] = false;
            }

        return Kunal_knights(board,row,col+1,Knights,count);
    }

    private static boolean isSafe(boolean[][] board, int row, int col)
    {
        if(vaild(board,row-2,col+1))
        {
            if(board[row-2][col+1])
            {
                return false;
            }
        }
        if(vaild(board,row-2,col-1))
        {
            if(board[row-2][col-1])
            {
                return false;
            }
        }
        if(vaild(board,row-1,col+2))
        {
            if(board[row-1][col+2])
            {
                return false;
            }
        }
        if(vaild(board,row-1,col-2))
        {
            if(board[row-1][col-2])
            {
                return false;
            }
        }
        return true;
    }

    private static boolean vaild(boolean[][] board, int row, int col)
    {
        if(row >= 0 && row < board.length && col >= 0 && col < board.length)
        {
            return true;
        }
        else return false;
    }

    private static int Knights(boolean[][] board, int row) {
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
                count += Knights(board,row+1);
                board[row][i] = false;
            }
        }
        return count;
    }
    private static boolean isTrue(boolean[][] board, int row, int col)
    {
        int Krow = row;
        int Kcol = col;

        for (int i = 1; i <=3; i++)
        {
            // up up right
            if(i == 3)
            {
                Kcol += 1;
            }
            else
            {
                Krow -= 1;
            }
            if(i == 3 && Kcol >= 0 && Krow >=0 && Krow < board.length && Kcol < board[0].length && board[Krow][Kcol])
            {
                return false;
            }
            
        }
       Krow = row;
       Kcol = col;
        for (int i = 1; i <=3; i++)
        {
            // up up left
            if(i == 3)
            {
                Kcol -= 1;
            }
            else
            {
                Krow -= 1;
            }
            if(i == 3 && Kcol >= 0 && Krow >=0 && Krow < board.length && Kcol < board[0].length && board[Krow][Kcol])
            {
                return false;
            }
        }

        Krow = row;
        Kcol = col;
        for (int i = 1; i <=3; i++)
        {
            // right right up
            if(i == 3)
            {
                Krow -= 1;
            }
            else
            {
                Kcol += 1;
            }
            if(i == 3 && Kcol >= 0 && Krow >=0 && Krow < board.length && Kcol < board[0].length && board[Krow][Kcol])
            {
                return false;
            }
        }

        Krow = row;
        Kcol = col;
        for (int i = 1; i <=3; i++)
        {
            // left left up
            if(i == 3)
            {
                Krow -= 1;
            }
            else
            {
                Kcol -= 1;
            }
            if(i == 3 && Kcol >= 0 && Krow >=0 && Krow < board.length && Kcol < board[0].length && board[Krow][Kcol])
            {
                return false;
            }
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
                    System.out.print("|K| ");
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
