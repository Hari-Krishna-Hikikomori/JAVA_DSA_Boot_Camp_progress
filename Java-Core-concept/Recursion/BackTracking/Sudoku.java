package JAVA.BackTracking;

public class Sudoku {
    public static void main(String[] args) {
        int[][] sudo = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        Sudoku_shaffle(sudo,0,0);
        KunalSudoku_shaffle(sudo);


    }

    private static void Sudoku_shaffle(int[][] sudo ,int row,int col)
    {
        if(row == sudo.length)
        {
            display(sudo);
            return;
        }
        if(col == sudo.length)
        {
            Sudoku_shaffle(sudo,row+1,0);
            return;
        }
        if(sudo[row][col] == 0 )
        {
            for (int num = 1; num < 10; num++) {
                if (isTrue(sudo, row, col, num)) {
                    sudo[row][col] = num;
                    Sudoku_shaffle(sudo, row, col + 1);
                    sudo[row][col] = 0;
                }
            }
            return;
        }
        Sudoku_shaffle(sudo, row, col + 1);

    }

    private static boolean isTrue(int[][] sudo, int row, int col, int num)
    {
        for (int i = 0; i < sudo.length; i++)
        {
          if(sudo[row][i] == num)
          {
              return false;
          }
        }
        for (int i = 0; i < sudo.length; i++)
        {
            if(sudo[i][col] == num)
            {
                return false;
            }
        }


        int tempRow  = set(row);
        int tempcol  = set(col);

        for (int i = tempRow; i < tempRow+3; i++)
        {
            for (int j = tempcol; j <tempcol+3; j++)
            {
              if(sudo[i][j] == num)
              {
                  return false;
              }
            }

        }

        return true;
    }

    private static int set(int row)
    {
        if(row < 3)
        {
            return 0;
        }
        if(row > 2 && row <6)
        {
            return 3;
        }
            return  6;
    }

    private static void display(int[][] sudo)
    {
        for (int[] row:sudo)
        {
            for (int element : row)
            {
                System.out.print(element+" ");
            }
            System.out.println();

        }
        System.out.println("---------------");
    }
    private static void KunalSudoku_shaffle(int[][] sudo)
    {
        int row = 0;
        int col = 0;
        boolean out = true;
        for (int i = row; i < sudo.length; i++)
        {

            for (int j = col; j <sudo.length ; j++)
            {
                if(sudo[i][j] == 0)
                {
                    row = i;
                    col = j;
                    out = false;
                    break;
                }
            }
            if (!out)
            {
                break;
            }

        }
        if(out)
        {
            display(sudo);
        }
        for (int count = 1; count < 10; count++)
        {
            if(isTrue(sudo,row,col,count))
            {
                sudo[row][col] = count;
                KunalSudoku_shaffle(sudo);
                sudo[row][col] = 0;
            }
        }
    }
}
