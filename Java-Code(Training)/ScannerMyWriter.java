import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerMyWriter {
    public static void main(String[] args) {
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter("user.input");
            myWriter.write("This is some text in the file.");
            myWriter.close();
            System.out.println("File created successfully.");

            File file = new File("user.input");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("Oops! An error occurred: " + e.getMessage());
        } finally {
            if (myWriter != null) {
                try {
                    myWriter.close();
                } catch (IOException e) {
                    System.out.println("Failed to close FileWriter: " + e.getMessage());
                }
            }
        }
    }
}
