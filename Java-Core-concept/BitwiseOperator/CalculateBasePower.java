package BitwiseOperator;

public class CalculateBasePower 
{
    public static void main(String[] args) 
    {
       int base = 3;
       int pow  = 6;

      System.out.println(BaseMycode(base,pow));
      Base(base,pow);
    }

   private static void Base(int base, int pow) 
   {
      int ans = 1;
      while (pow > 0) 
      {
        if((pow & 1) == 1)
        {
          ans *= base;
        } 
        base *= base;
        pow = pow >> 1; 
      }
      System.out.println(ans);
   }

   private static int BaseMycode(int base, int pow) 
   {
       int ans = 1;
       int i = pow;
       
          for (int j = 0; j < 8; j++) 
          {
            i = pow & (1 << j);
            int count = 1;
            int base1 = base;
            int ans1 = 0;
            if(i == 1) ans1 = base;
            while (i > count) 
            {
               base1 = base1 * base;
               ans1 = base1;
               count++;     
            }
           if(ans1 != 0) ans = ans * ans1;
             
          } 
       
      
      return ans;
   }
  

}
