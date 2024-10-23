package pushpak56fileHandlingQestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsinFile {
    public static void main(String[] args) {
    int wordccount =0;
        try(BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\PUSHPAK\\Desktop\\question\\snehal.txt"))) {
            String line;
            while ((line = br.readLine())!=null){
                String[] word = line.trim().split("\\s+");
                wordccount += word.length;

            }
            System.out.println("Total Word in file are :"+wordccount);

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
