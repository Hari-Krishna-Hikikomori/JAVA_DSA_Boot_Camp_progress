package Assignment;

public class fibanocci 
{
    public static void main(String[] args) 
    {
       int n = 0;
       int s = 0;
       int t = 1;
       while(n <= 20)
       {
       int  temp = s + t;
            t = s;
            s = temp;
            System.out.println(s);
      
        n++;
       }    
    }
    
}
