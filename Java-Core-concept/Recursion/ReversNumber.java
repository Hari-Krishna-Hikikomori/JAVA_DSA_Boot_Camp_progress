package JAVA;

public class ReversNumber {
    public static void main(String[] args) {

        int n = 12345;
        int ans = revers(n,0);
        int ans2 = revers2(n);

        System.out.println(ans);
        System.out.println(ans2);

    }

    private static int revers2(int n)
    {
        if(n == 0) return n;

        int pow =(int)Math.log10(n);

        return  n%10 * pow(10,pow)+ revers2(n/10);
    }

    private static int pow(int i, int v)
    {
        if(v == 0) return 1;
        if(v<=1)
        {
            return i;
        }
        return  i * pow(i,--v);
    }

     static int revers(int n, int i)
    {
        if(n < 10)return n%10+i*10;
        return revers(n/10,n%10+i*10);
    }
}
