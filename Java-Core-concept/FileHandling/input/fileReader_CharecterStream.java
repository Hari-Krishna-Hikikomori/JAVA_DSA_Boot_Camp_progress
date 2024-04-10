package FileHandling.input;

import java.io.FileReader;
import java.io.IOException;

public class fileReader_CharecterStream
{
    public static void main(String[] args) {

        try(FileReader Fr = new FileReader("D:\\GitHub\\JAVA_DSA_Boot_Camp_progress\\Java-Core-concept\\FileHandling\\testFiles\\test_01.txt"))
        {
            char in = (char) Fr.read();
            while(Fr.ready())
            {
                System.out.print(in);
                in = (char) Fr.read();
            }
            System.out.println();
            Fr.close();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
