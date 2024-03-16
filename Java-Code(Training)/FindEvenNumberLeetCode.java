
import java.util.Scanner;

public class FindEvenNumberLeetCode {
public static void main(String[] args)
{
   int []arr = {1,22,33,4444,55555};


   //  System.out.println(even(arr)); 

System.out.println(strngSize(12345));
   
}

static int even(int[] arr) 
{   
   int count ;
   int rem = 0;

   for (int i = 0; i < arr.length; i++) 
   {
      
      count = (int) (Math.floor(Math.log10(arr[i]))+1);
      if (count%2==0)
      {
         rem ++;
      }
   }
   return rem;
}

static int Strsize(int num)
{
   if (num ==0)
   {
      return 1;
   }
   return String.valueOf(num).length();
}

static int findnum(int i) 
{ 
   int count1 = 0;
   while(i>0)

   {
      i /=10; 
      count1 ++;

   }
   
   return count1;

}
static int strngSize(int x) {
   int d = 1;
   int v;
   if (x >= 0) {
       d = 0;
       x = -x;
   }
   int p = -10;
   for (int i = 1; i < 10; i++) {
      System.out.println("value of d "+d);
       if (x > p)
       
           return i + d;
           System.out.println("in loop value of d "+d);
           System.out.println("in loop value of x "+x);
           System.out.println("in loop value of p "+p);
       p = 10 * p;
       System.out.println("in loop value of p "+p);
   }
   v= 10+d;
   System.out.println("result "+v); 
   return 10 + d;
   
}
}


