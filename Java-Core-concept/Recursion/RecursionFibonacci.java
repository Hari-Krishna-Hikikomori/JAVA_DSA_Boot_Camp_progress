public class RecursionFibonacci
{
    public static void main(String[] args) 
    {
        System.out.println(fibonacci(6));   
    }

    static int fibonacci(int i) 
    {
        if(i < 2)
        {
            return i;
        }
        return fibonacci(i-1)+fibonacci(i-2);
    }
}