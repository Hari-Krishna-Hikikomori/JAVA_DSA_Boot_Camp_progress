package FileHandling.input;

import java.io.IOException;
import java.io.InputStreamReader;

public class inputStreamReader_CharecterStream
{
    public static void main(String[] args)
    {
        try(InputStreamReader sr = new InputStreamReader(System.in))
        {
            char in = (char) sr.read();

            while(sr.ready())
            {
                System.out.print(in);
                in = (char) sr.read();
            }
            System.out.println();
            sr.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
