import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferClass 
{
    public static void main(String[] args) {
        try{
        BufferedWriter writer = new BufferedWriter(new FileWriter("newfile.txt"));
        writer.write("hi rossi it been a while");
        writer.close();
        }catch (IOException e) {
            e.printStackTrace();

        }

        }
}