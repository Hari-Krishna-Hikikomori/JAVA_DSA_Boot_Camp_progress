package String;

import java.util.Random;

public class randomString
{

    private Random random = new Random();

    public String getRandom(int Lenght)
    {
        StringBuffer sb = new StringBuffer(Lenght);

        for (int i = 0; i < Lenght; i++)
        {
            //random float value(between 0.000 to 1.000) Multiply by 26 and add by ASCII value;
            int Randomchar = 97 + (int)(random.nextFloat()*26);
            sb.append((char)(Randomchar));
        }
        return sb.toString();
    }
}
