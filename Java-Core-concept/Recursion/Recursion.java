public class Recursion
{
    public static void main(String[] args) {
        
        Printnum(5);
    }

    static void Printnum(int num) 
    {
       int count = num; 
       if(count > 1)
       {
        Printnum(count-1);
       }
       System.out.print(num);
    }
}