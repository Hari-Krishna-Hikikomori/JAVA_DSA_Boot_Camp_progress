public class Pattern
{
    public static void main(String[] args) 
    {
        int times  = 5;
        int count = 0;
         for (int i = 0 ; i <= times; i++) {

            // for (int j = times-i; j >= 0;j--) 
            // {
            //     System.out.print(" ");    
            // }
            for (int x = 0; x < times; x++) 
            {
                if(x < count)
                {
                System.out.print(" "+x);
                }
                else
                {
                  System.out.print(" "+count);
                }               
            }
            for (int y = times; y >=0; y--) 
            {
                if(y > count)
                {
                System.out.print(" "+count);
                }
                else
                {
                  System.out.print(" "+y);
                }               
            }
            
            count++;
            System.out.println();
         }
         int count2 = times -1;
         for (int i = 0 ; i < times; i++) {

            for (int x = 0; x < times; x++) 
            {
                if(x < count2)
                {
                System.out.print(" "+x);
                }
                else
                {
                  System.out.print(" "+count2);
                }               
            }
            for (int y = times; y >= 0; y--) 
            {
                if(y > count2)
                {
                System.out.print(" "+count2);
                }
                else
                {
                  System.out.print(" "+y);
                }               
            }
            
            count2--;
            System.out.println();
         }    
    }
}