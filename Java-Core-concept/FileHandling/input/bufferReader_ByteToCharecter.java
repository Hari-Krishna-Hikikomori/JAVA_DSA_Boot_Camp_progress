package FileHandling.input;

import java.io.*;

public class bufferReader_ByteToCharecter
{
    public static void main(String[] args)
    {

        // file text byte to char
        try(BufferedReader br = new BufferedReader( new FileReader("D:\\GitHub\\JAVA_DSA_Boot_Camp_progress\\Java-Core-concept\\FileHandling\\testFiles\\test_01.txt")))
        {

            while(br.ready())
            {
                System.out.println(br.readLine());
            }


        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


        // byte to char
        try(BufferedReader br = new BufferedReader( new InputStreamReader(System.in)))
        {
            int in = br.read();

            while(br.ready())
            {
                System.out.print((char) in);
                in = br.read();
            }

        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
