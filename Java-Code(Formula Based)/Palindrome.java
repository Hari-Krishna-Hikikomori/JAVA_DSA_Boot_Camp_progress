package Assignment;

import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args) 
    {    
    
    Scanner in = new Scanner(System.in);
    String a = in.nextLine();
    String b = a.replace(" ", "");
    boolean y = true;
  while(y)
  {

    for (int j = b.length()-1; j >= 0; j--) 
        {
            y = false;
            int A = 0;
        for (int i = A ; i <= A ; i++) 
        {
          if (b.charAt(j)==b.charAt(i))
          {
            y = true;
            A++;
            if(j==b.length()-1)
            {
              System.out.println("palindrome");
              return;
            } 
          }
          
            
        }
        if(y==false)
        {
         System.out.println("not palindrome");
         return;
        }
        }
  
   
    }
 }
}
