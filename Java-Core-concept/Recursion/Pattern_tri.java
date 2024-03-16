package JAVA;

public class Pattern_tri {
    public static void main(String[] args) {
        int row = 10;
        int col = 0;
        int ans = trianlge(row,col);
        trianlge2(row,col);
        rightTriangle(row,col);
        System.out.println();
        perfectTriangle(row,col,row,0);

    }

    private static void rightTriangle(int row, int col)
    {
     if(row==0)
     {
         return;
     }
     if(col < row)
     {
         rightTriangle(row, col + 1);
         System.out.print("*");
     }
     else {
         rightTriangle(row - 1, 0);
         System.out.println();
     }
    }

    private static void perfectTriangle(int row, int col, int n,int zero)
    {
        if(row == col)
        {

             if(row < n)
              {
                  System.out.print("* ");
                  perfectTriangle(row, col, n-1, zero+1);
                  return;
              }
             else
             {
                  System.out.print("* ");
                  System.out.println();
                 perfectTriangle(row-1,0,n+zero,0);
                  return;
             }
        }
        if(row <= 0)
        {
            return;
        }


        System.out.print(" ");
        perfectTriangle(row,col+1,n,zero);
    }

    private static void trianlge2(int row, int col)
    {
        if(row == col)
        {
            System.out.println();
            col = 0;
            row -= 1;
        }
        if(row == 0)
        {
            return;
        }


        System.out.print("* ");
        trianlge2(row,col+1);

    }

    private static int trianlge(int row, int col)
    {
        if(col == 0)
        {
            System.out.println(" ");
            row = trianlge(row-1,row-1);
        }
        if(row <= 0)
        {
            return 0;
        }

        System.out.print("* ");

        return trianlge(row,col-1);
    }
}
