package pushpak56fileHandlingQestion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteUserInputtoFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the txt you eant to insert into file or  Exit for Exit");
        try (FileWriter w = new FileWriter("C:\\Users\\PUSHPAK\\Desktop\\question\\snehal.txt")){
            String user ;
            while (!(user = sc.nextLine()).equalsIgnoreCase("Exit")){
                w.write(user);
            }
            System.out.println("input add");

        }catch (IOException e){
            System.out.println(e);
        }finally {
            sc.close();
        }
    }
}
