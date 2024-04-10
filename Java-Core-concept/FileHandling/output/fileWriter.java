package FileHandling.output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter
{
    public static void main(String[] args)
    {
        // this will always write fresh from start
        try(FileWriter fw = new FileWriter("D:\\GitHub\\JAVA_DSA_Boot_Camp_progress\\Java-Core-concept\\FileHandling\\testFiles\\test_02_FileWrite.txt"))
        // without modifying original file or write fresh from start new FileWriter(Str,true);
        //new FileWriter("test_02_FileWrite.txt",true);
        {
            fw.write("now playing Akari");
            fw.write(10);    //new line

            char[] in = "OWN PARADISE - ".toCharArray();
            fw.write(in);

            fw.write( "😶");

            // without modifying original file or write fresh from start

            fw.append('\n');
            fw.append("Next song");
            fw.append('\n');
            fw.append("Where Is Our Blue - Tatsuya Kitani ☄\uFE0F");

        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            BufferedReader br = new BufferedReader( new FileReader("D:\\GitHub\\JAVA_DSA_Boot_Camp_progress\\Java-Core-concept\\FileHandling\\testFiles\\test_02_FileWrite.txt"));

            while (br.ready())
            {
                System.out.println(br.readLine());
            }
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
