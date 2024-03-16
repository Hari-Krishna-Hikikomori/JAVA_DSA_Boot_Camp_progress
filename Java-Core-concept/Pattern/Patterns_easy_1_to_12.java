public class Patterns_easy_1_to_12
{
    public static void main(String[] args) 
    {
        Pattern_12(9);        
    }

    static void Pattern01(int i) 
    {
        for (int row = 1; row <= i;row++) 
        {
            for (int col = 1; col <= i; col++) 
            {
                System.out.print("* ");
            }
            System.out.println();  
        }
    }
    static void Pattern_02(int i) 
    {
        for (int row = 1; row <= i;row++) 
        {
            for (int col = 1; col <= row; col++) 
            {
                System.out.print("* ");
            }
            System.out.println();  
        }
    }
    static void Pattern_03(int i) 
    {
        for (int row = 1; row <= i;row++) 
        {
            for (int col = i; col >= row ; col--) 
            {
                System.out.print("* ");
            }
            System.out.println();  
        }
    }
    static void Pattern_04(int i) 
    {
        for (int row = 1; row <= i;row++) 
        {
            for (int col = 1; col <= row; col++) 
            {
                System.out.print(col+" ");
            }
            System.out.println();  
        }
    }
    
    static void Pattern_05(int i) 
    {
        
        for (int row = 1; row <= i*2 -1;row++) 
        {
            
            int col = (row <= i) ? row : (i*2)-row;

            for (int col1 = 1; col1 <= col ; col1++) 
            {
                System.out.print("* ");
            }
            System.out.println();  
        }
    }
    static void Pattern_06(int i) 
    {
        for (int row = 1; row <= i;row++) 
        {
            for (int j = row; j <= i; j++) 
            {
                   System.out.print("  ");  
            }
            for (int col = 1; col <= row; col++) 
            {
                System.out.print(" *");
            }
            System.out.println();  
        }
    }
    static void Pattern_07(int i) 
    {
        for (int row = 1; row <= i;row++) 
        {
            for (int j = 1; j <= row; j++) 
            {
                   System.out.print("  ");  
            }
            for (int col = row; col <= i; col++) 
            {
                System.out.print(" *");
            }
            System.out.println();  
        }
    }
    static void Pattern_08(int i) 
    {
        for (int row = 1; row <= i;row++) 
        {
            for (int j = row; j <= i; j++) 
            {
                   System.out.print(" ");  
            }
            for (int col = 2; col <= row*2; col++) 
            {
                System.out.print("*");
            }
            System.out.println();  
        }
    }
    static void Pattern_09(int i) 
    {
        for (int row = 1; row <= i;row++) 
        {
            for (int j = 1; j <= row; j++) 
            {
                   System.out.print(" ");  
            }
            for (int col = row; col <= i*2 - row; col++) 
            {
                System.out.print("*");
            }
            System.out.println();  
        }
    }
    static void Pattern_10(int i) 
    {
        for (int row = 1; row <= i;row++) 
        {
            for (int j = row; j <= i; j++) 
            {
                   System.out.print(" ");  
            }
            for (int col = 1; col <= row; col++) 
            {
                System.out.print(" *");
            }
            System.out.println();  
        }
    }
    static void Pattern_11(int i) 
    {
        for (int row = 1; row <= i;row++) 
        {
            for (int j = 1; j <= row; j++) 
            {
                   System.out.print(" ");  
            }
            for (int col = row; col <= i; col++) 
            {
                System.out.print(" *");
            }
            System.out.println();  
        }
    }
    static void Pattern_12(int i) 
    {
        for (int row = 1; row <= i*2;row++) 
        { 
            int colms = (row <= i) ? row :  i * 2 - (row-1);
            int space = (row <= i) ? row :  i * 2 - (row-1);
            for (int j = 1; j <= space; j++) 
            {
                   System.out.print(" ");  
            }
            for (int col = colms; col <= i; col++) 
            {
                System.out.print(" *");
            }
            System.out.println();  
        }
    } 
}