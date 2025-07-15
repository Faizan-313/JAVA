import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {
        String filename = "example.txt";
        String content = "Hello, this is content written to the file!\nSecond line of text.";

        // Write content to the file
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close();
            System.out.println("Content successfully written to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        //Read content from the file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            System.out.println("\nReading content from " + filename + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
