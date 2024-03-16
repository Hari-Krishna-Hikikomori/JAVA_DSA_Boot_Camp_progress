import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("WELCOME TO MATH PROGRAM");
        System.out.println("AMRSTRONG or PRIUM");
        
        
       
        while(true)
        {
            System.out.println("Press (a) For AMRSTRONG Or (b) for PRIUM and To End PRESS (c) ");
            char opp = in.next().trim().charAt(0);
            int num = in.nextInt();
    
            if(opp == 'a')
            {
                System.out.println(Amrstrong(num));    
            }
            if(opp == 'b')
            {
               System.out.println( prium(num));
            }
            if(opp == 'c')
            {
               break;
            }
        }

        
        
        

    }

    static boolean prium(int n) 
    { 
        int v = 2;
       while(v*v<=n)
       { 
        if(n%v==0)
        {
            return false;
        }
        v++;
       }
      return true;
       
    }

    static boolean Amrstrong(int n) 
    {
        int orgn = n;
        int comp = 0;
      while(n>0)
      {
        int rem = n % 10;
        n = n /10;
        
        comp = rem * rem * rem + comp;
        if (orgn==comp)
        {
            return true;
        }
      } 
      return false;
    }
 
  


}
