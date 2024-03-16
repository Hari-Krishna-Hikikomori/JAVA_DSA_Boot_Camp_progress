package JAVA;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        int ans = sumOfdigits(n);

        // concepts ( n-- Vs  --n both do n-1 )
        System.out.println(--n);// this do n-1 on first pass
        System.out.println(n--);// this also do n-1 but in the first pass it will pass the value first
        System.out.println(n--);// then do n-1

        System.out.println(ans);
    }

    private static int sumOfdigits(int n)
    {
        if(n < 10)
        {
            return n;
        }

        return n%10 + sumOfdigits(n/10);
    }
}
