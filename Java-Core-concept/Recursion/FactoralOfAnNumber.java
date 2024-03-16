package JAVA;

public class FactoralOfAnNumber {
    public static void main(String[] args) {
        int n = 5;
        factorial(n,1);
        long i = Kunal_factorial(n);  // basically both are same mine store value within function and his returning valu  e and store outside of the function
        facator(n,1);
        Sum(n,1);

        System.out.println(i);

    }

    private static void Sum(int n, int i)
    {
        if(n <= 1) {
            System.out.println( i);
            return;
        }
        Sum(n-1,i + n);
    }

    private static long Kunal_factorial(long n) {
        if(n <= 1)
        {
            return 1;
        }
        return n * Kunal_factorial(n-1);
    }

    private static void factorial(int n, long i)
    {
        if(n <= 1) {
            System.out.println(i);
            return;
        }
        factorial(n-1,i * n);
    }

    private static void facator(int n,int i)
    {
        if(i * i > n)
        {
            return;
        }
        if(n % i == 0)
        {
            System.out.println("facotor of "+n+" = "+i+" "+n/i);
        }
        facator(n,i+1);
    }
}
