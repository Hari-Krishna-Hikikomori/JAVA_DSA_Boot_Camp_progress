package JAVA;

public class Count {
    public static void main(String[] args)
    {
       int n = 5;
//       print_revers(n);
//       prints(n);
       palindrome(n);
    }

    private static void palindrome(int n)
    {
        System.out.println(n);
        if(n!=1) palindrome(n-1);
        if(n!=1)System.out.println(n);

    }

    private static void prints(int n)
    {


    }

    private static void print_revers(int n)
    {
        System.out.println(n);

        if(n == 1) return;

        print_revers(n-1);
    }
}
