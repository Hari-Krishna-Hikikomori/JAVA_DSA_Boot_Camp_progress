public class pattern_hard_27_to_35 {
    public static void main(String[] args) {
        pattern31(4);
    }

    // static void patterns_27_00(int i) 
    // {
    //     int x = 1;
    //     int y = ((i+1)*i)-1;
    //     for (int row = 1; row <= i; row++) 
    //     {
    //        for (int space = 1; space <= row; space++) 
    //        {
    //          System.out.print("  ");
    //        }
    //        for (int col = 0; col <= i-row ; col++) 
    //        {
             
    //           System.out.print(x+" ");
    //           x++;
    //        }
    //        y = y-(i-row);
    //        for (int col2 = 1; col2 <= i-row+1 ; col2++) 
    //        {
    //          System.out.print(y+col2+" ");
    //        }
    //        y=y-1;
    //        System.out.println();   
    //     }
    // }
  static void patterns_27(int i) 
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
static void patterns_28(int i) 
    {  
        for (int row = 0; row <(i*2)-1; row++) 
        {
         
           int x = row < i ? i - row : (row + 2) - i;
          for (int col = 1; col <= i; col++) 
          {
            if(x <= col)
            {
              System.out.print("* ");
            }
            else
            {
              System.out.print(" ");
            }
          }
           
          System.out.println();
        }
    }      
static void patterns_29(int i) 
    {  
        for (int row = 1; row < i*2; row++) 
        {

          int x = row <= i ? row : (i*2) - row;

          for (int col = 1; col <= i*2; col++) 
          {
          int y = col <= i ? x : (i * 2) - (x-1);

            if(y >= col && col <= i || y <= col && col > i)
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
static void patterns_30(int i) 
    {  
        for (int row = 0; row < i; row++) 
        {
        
          for (int col = 1; col <= (i*2)-1; col++) 
          {
            int y = col <= i ? i+1 - col: col - (i-1);
            if(i - row<= col && col <=i || i + row >= col && col > i )
            {
              System.out.print(y+" ");
            }
            else
            {
              System.out.print("  ");
            }
          }
           
          System.out.println();
        }
    }      
static void patterns_31(int i) 
    {  
      
        for (int row = 1; row < (i*2); row++) 
        {
          int y = row <= i ? row : (i*2)- row;
          int x = i;
          for (int col = 0; col < (i*2)-1; col++) 
          {
           x = col < y ? i - col : (x = col >= i && col >=(i*2)-y ? x+1 : x);
           System.out.print(x+" ");
          }
           
          System.out.println();
        }
    }      
static void patterns_32(int i) 
    {  
      
        for (int row = 1; row <= i; row++) 
        {
          char x = (char) ((65 + i)-(row+1)); 
          for (int col = 1; col <= row; col++) 
          {
           x += 1; 
           System.out.print(x+" ");
          }
           
          System.out.println();
        }
    }      
static void patterns_33(int i) 
    {  
      int x = 64;
        for (int row = 1; row <= i; row++) 
        {
           
          for (int col = 1; col <= row; col++) 
          {
            x+=1;
            x = x%2==0 ? x - 32 : x + 32;
           System.out.print((char)x+" ");
          }
           
          System.out.println();
        }
    }      
static void patterns_34(int i) 
    {  
   
        for (int row = 1; row <= i; row++) 
        {
          char x = (char)((65+i)-(row));
          for (int col = 0; col <=i-row ; col++) 
          {              
           System.out.print(x+" ");
           x-=1;
          }
           
          System.out.println();
        }
    }      
static void patterns_35(int i) 
    {  
   
        for (int row = 1; row <= i; row++) 
        {
          for (int col = 1; col <= i*2 ; col++) 
          {              
           int x = col <=i ? col : ((i*2)+1) - col;
           if(col <= row && col <= i || col > i*2-row)
           {
           System.out.print(x);
           }
           else
           {
            System.out.print(" ");
           } 
          }
           
          System.out.println();
        }
    }
    static void pattern31(int n) {
      int originalN = n;
      n = 2 * n-2;
      for (int row = 0; row <=n; row++) {
          for (int col = 0; col <=n; col++) {
              int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
              System.out.print(atEveryIndex + " ");
          }
          System.out.println();
      }
  }
}
