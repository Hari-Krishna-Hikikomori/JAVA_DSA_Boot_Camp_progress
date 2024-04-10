package FileHandling.output;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class outputStreamWriter
{
    public static void main(String[] args) {

        try(OutputStreamWriter osw = new OutputStreamWriter(System.out))
        {
            osw.write("now playing Akari");
            osw.write(10);    //new line
            osw.write('\n');  //new line

            char[] in = "OWN PARADISE".toCharArray();
            osw.write(in);

            osw.write( " 😶");

        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
