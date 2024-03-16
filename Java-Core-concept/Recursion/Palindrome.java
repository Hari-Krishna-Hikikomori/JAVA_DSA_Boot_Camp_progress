package JAVA;

public class Palindrome {
    public static void main(String[] args) {
        int n = 1 ;

        palinOrNot(n);
    }

    private static void palinOrNot(int n)
    {

        if(n == ReversNumber.revers(n,0)) System.out.println("ture");
        else System.out.println("False");
    }
}
