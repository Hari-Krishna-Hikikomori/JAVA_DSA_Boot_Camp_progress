package bigInteger_and_bigDecimal;

import java.math.BigDecimal;

public class bigDecimal
{
    public static void main(String[] args)
    {
        BigDecimal A = new BigDecimal("0.040000");

        // error in decimal
        double a = 0.04;
        double b = 0.03;
        // actual value 0.01000000;

        System.out.println(a-b);

        // to get accurate value in small and large number in decimal

        BigDecimal B = new BigDecimal("0.030000");
        System.out.println(A.subtract(B));
    }

}
