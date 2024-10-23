package pushpak56fileHandlingQestion;
//Problem 2: Read and Display File Content
//        Requirements:
//        1. Read the content from input.txt.
//        2. Print each line of the file to the console.
//        Approach:
//        1. Use BufferedReader to read from input.txt.
//        2. Read lines using a loop and print each line to the console.
//        3. Handle exceptions and ensure the reader is properly closed.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadDisplayFileContent {
    public static void main(String[] args) {
        try (BufferedReader bf =new BufferedReader(new FileReader("C:\\Users\\PUSHPAK\\Desktop\\question\\kunal.txt"))){
            String line;
            while ((line  = bf.readLine())!=null){
                System.out.println(line);
            }

        }catch (IOException e){
            System.out.println(e);
        }

    }

}
