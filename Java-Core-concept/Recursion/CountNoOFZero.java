package JAVA;

public class CountNoOFZero
{
    public static void main(String[] args) {

        int n = 1000;
        int ans = onOfzero(n,0);

    }

    private static int onOfzero(int n, int i)
    {
         if(n%10 == 0) i++;
         if(n<10)
         {
             System.out.println(i);
             return i;
         }

        return onOfzero(n/10,i);
    }
}
