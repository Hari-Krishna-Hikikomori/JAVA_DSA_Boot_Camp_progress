package String;

import java.text.DecimalFormat;

public class decimalFormat
{
    public static void main(String[] args) {

        // java default class in java.text.DecimalFormat;
        // initial the format or Pattern of Decimal value Appearance in Stirng
        DecimalFormat df = new DecimalFormat("0.00000");

        System.out.println(df.format(7.34));
    }
}

