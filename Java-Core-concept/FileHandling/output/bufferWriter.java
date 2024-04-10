package FileHandling.output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferWriter
{
    public static void main(String[] args)
    {
        try(BufferedWriter bw =new BufferedWriter(new FileWriter("D:\\GitHub\\JAVA_DSA_Boot_Camp_progress\\Java-Core-concept\\FileHandling\\testFiles\\test_02_FileWrite.txt",true)))
        {
            bw.newLine();  //new line
            bw.write("Eye Water -");
            char[] in = " Hiroyuki Sawano ".toCharArray();
            bw.write(in);
            bw.write( "\uD83C\uDF0A");

        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
