import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class filemake {
    public static void main(String[] args) {

        

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("myfile.txt"));
            writer.write("hello man nice to meet you");
            writer.write("\n yo its works");
            writer.close();
        } catch (Exception e) {  
            e.fillInStackTrace();
        }

        try {
            File file = new File("myfile.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
              //  String name = sc.nextLine();
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        

   }


    
}
