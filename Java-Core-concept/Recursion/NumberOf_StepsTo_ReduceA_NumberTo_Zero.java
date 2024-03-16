package JAVA;

public class NumberOf_StepsTo_ReduceA_NumberTo_Zero {
    public static void main(String[] args) {
        int n = 41 ;

        int ans = NumberOfstep(n);
        System.out.println(ans);
    }

    private static int NumberOfstep(int n)
    {
        return helperFunction(n,0);
    }

    private static int helperFunction(int n, int i) {

        if(n==0) return i;
        if( n%2==0)
        {
            return helperFunction(n/2,++i);
        }
            return helperFunction(n-1,++i);


    }
}
