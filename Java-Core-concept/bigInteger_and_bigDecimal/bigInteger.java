package bigInteger_and_bigDecimal;

import java.math.BigInteger;

public class bigInteger
{
    public static void main(String[] args) {

        // bast way to use a big integer value by using String type
        // the range of BigInteger is -2^max.integer - 2^max.integer
        // integer range is -2147483647 - 2147483647
        BigInteger bi = new BigInteger("454534534534535");
        BigInteger BI = new BigInteger("232435454654768799232");

        // valueof the long type its range is 9,223,372,036,854,775,807
        BigInteger num = BigInteger.valueOf(9223372036854775807L);
        long no = num.longValue();

        System.out.println(bi.pow(99999));
        if(bi.compareTo(BI) > 0)
        {
            System.out.println(bi.compareTo(BI));
        }
        System.out.println(no);
    }
}
