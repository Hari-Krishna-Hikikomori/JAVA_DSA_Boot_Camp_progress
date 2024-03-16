public class Patterns_mid_13_to_26

{
    public static void main(String[] args) {
        patterns_21(3);
    }

    static void patterns_13(int i)
    {    for (int row = 1; row <= i; row++)
    {
        for (int j = 1; j <= i*2-1; j++)
        {
            if(row == i || row == 1 && j == i || (i - row)+1 == j || (i + row)-1 == j)
            {
                System.out.print(" *");
            }
            else
            {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    }
    static void patterns_14(int i)
    {
        for (int row = 1; row <= i; row++)
        {
            for (int j = 1; j <= i*2-1; j++)
            {
                if(row == 1 ||  row == j || (i * 2 - 1)-(row-1) == j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void patterns_15(int i)
    {
        for (int row = 1; row <= i*2-1; row++)
        {
            for (int j = 1; j <= i*2-1; j++)
            {
                if(row == 1 && j == i || (i - row)+1 == j && row <=i || (i + row)-1 == j && row <= i || (row - i)+1 == j && row >i || ((i*2-1) + i) - row == j && row > i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void patterns_16(int i)
    {
        for (int row = 1; row <= i; row++)
        {
            for (int j = row; j <= i-1; j++)
            {
                System.out.print("  ");
            }

            int x = 1;
            for (int col = 1; col <= row; col++)
            {
                if(x > 9)
                {
                    System.out.print(x + "  ");
                }
                else
                {
                    System.out.print(x + "   ");
                }
                x = x * (row - col) / col;
            }
            System.out.println();
        }
    }
    static void patterns_17(int i)
    {
        for (int row = 1; row <= i * 2 -1; row++)
        {
            int space = row <= i ? row : i * 2 - row;
            for (int j = 1; j <= i - space; j++)
            {
                System.out.print("  ");
            }
            int col1 = row <= i ? row : i * 2 - row;
            for (int col = 1; col <= col1 * 2 -1 ; col++)
            {
                int x = col < col1 ? 1 + (col1 - col) :1 + (col - col1);
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    static void patterns_18(int i)
    {
        for (int row = 1; row <= i * 2; row++)
        {
            int space = row <= i ? row : (i*2 - row)+1;
            for (int col = 1; col <= i * 2; col++)
            {
                if(col > (i -space) + 1 && col < i+space)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void patterns_19(int i)
    {
        for (int row = 1; row <= i * 2-1; row++)
        {
            int space = row <= i ? row : (i*2 - row);
            for (int col = 1; col <= i * 2; col++)
            {
                if(col > space  && col < (i*2)-(space-1) && i != row)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void patterns_20(int i)
    {
        for (int row = 1; row <= i; row++)
        {
            // int space = row <= i ? row : (i*2 - row)+1;
            for (int col = 1; col <= i - 1; col++)
            {
                if(col > 1  && col < i-1 && i != row && row != 1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void patterns_21(int i)
    {
        int x = 0;
        for (int row = 1; row <= i; row++)
        {
            for (int col = 1; col <= row ; col++)
            {
                x++;
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }


    static void patterns_22(int i)
    {
        int x = 0;
        for (int row = 1; row <= i; row++)
        {
            for (int col = 1; col <= row ; col++)
            {
                x = (row-col)%2 == 0 ? 1 : 0 ;
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    static void patterns_23(int i)
    {
        int y =  (i * 4) -3;
        for (int row = 0; row <= i - 1; row++)
        {
            for (int col = 1; col <= y ; col++)
            {
                if(row == 0)
                {
                    if(col == i - row || col == y-(i-1))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }

                else
                {
                    if(col == i - row || col == i + row || col == y-(i-1)-row || col ==((y+row)-(i-1)))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
static void patterns_24(int i)
    {
        for (int row = 0; row <= (i*2)-1; row++)
        {
            
            for (int col = 1; col <= i*2 ; col++)
            {
                if(col == 1 || col == 1 + row || col == i * 2 || col == (i * 2) - row)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
static void patterns_25(int i)
    {
        for (int row = 1; row <= i; row++)
        {
            
            for (int col = 1; col <= (i*2)-1; col++)
            {
                if((row == 1 && col >= i || row == i && col <= i || col == (i+1)-row || col == ((i * 2)-row)))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

static void patterns_26(int i)
    {
        for (int row = 1; row <= i; row++)
        {
            
            for (int col = 1; col <= (i+1)-row ; col++)
            {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }


}
