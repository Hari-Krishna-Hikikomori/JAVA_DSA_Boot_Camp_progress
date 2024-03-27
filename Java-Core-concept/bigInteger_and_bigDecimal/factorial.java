package bigInteger_and_bigDecimal;

import java.math.BigInteger;

public class factorial
{
    factorial(BigInteger num)
    {
        num = factorial_print(num);
        System.out.println(num);
    }
    factorial() {}
    static BigInteger factorial_print(BigInteger num)
    {
        BigInteger ans = BigInteger.ONE;
        BigInteger i = BigInteger.valueOf(2);

        while (i.compareTo(num) < 0 || i.compareTo(num) == 0)
        {
            ans = ans.multiply(i);
            i = i.add(BigInteger.ONE);
        }

        return ans;
    }

}
