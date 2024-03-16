public class Patterns{
    public static void main(String[] args) {
        patterns_28(5);
    }

    static void patterns_27(int i)
    {
        int x = 1;
        int y = ((i+1)*i)-1;
        for (int row = 1; row <= i; row++)
        {
            for (int space = 1; space <= row; space++)
            {
                System.out.print("  ");
            }
            for (int col = 0; col <= i-row ; col++)
            {

                System.out.print(x+" ");
                x++;
            }
            y = y-(i-row);
            for (int col2 = 1; col2 <= i-row+1 ; col2++)
            {
                System.out.print(y+col2+" ");
            }
            y=y-1;
            System.out.println();
        }
    }
    static void patterns_28(int i)
    {
        int x = 0;
        int y = i*(i+1);
        for (int row = 1; row <= i; row++)
        {
            y -= (i-row)+1;
            for (int col = 0; col <=(i*2)+1; col++)
            {
                if(col>=0+row && col <=(i*2)+1-row)
                {
                    x = col <= i ? x +1 : x;
                    int ans = col > i ? (col - i) + y : x;
                    {
                        System.out.print(ans+" ");
                    }
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

}
