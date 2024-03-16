import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Createownexception{
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Oops! An error occurred: " + e.getMessage());
        } finally {
            try {
                reader = new BufferedReader(new FileReader("file.txt"));
                String line = reader.readLine();
                System.out.println(line);
            } catch (IOException e) {
                System.out.println("Oops! An error occurred: " + e.getMessage());
            
        }
    }
}
}