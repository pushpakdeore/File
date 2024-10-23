package pushpak56fileHandlingQestion;

import java.io.*;
//Problem 1: Copy File Content
//Requirements:
//        1. Read the content from source.txt.
//2. Write the content to destination.txt.
//        Approach:
//        1. Use FileReader to read from source.txt.
//2. Use FileWriter to write to destination.txt.
//3. Handle exceptions and ensure resources are properly closed using try-with-resources.


public class CopyFileContent  {
    public static void main(String[] args)  {
        try ( FileReader r =new FileReader("C:\\Users\\PUSHPAK\\Desktop\\question\\kunal.txt");
              FileWriter w =new FileWriter("C:\\Users\\PUSHPAK\\Desktop\\question\\kunal1.txt")){
            int i;
            while ((i=r.read())!=-1){
                w.write((char)i);
            }
            System.out.println("copy completed .");

        }catch (IOException e){
            System.out.println(e);
        }

    }
}
