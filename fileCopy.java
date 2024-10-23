package pushpak56fileHandlingQestion;

import java.io.*;

public class fileCopy {
    public static void copyfile(String inputfile,String outputfile){
        try (BufferedReader br = new BufferedReader(new FileReader(inputfile));
             BufferedWriter bw =new BufferedWriter(new FileWriter(outputfile))){
            String line;
            while ((line= br.readLine())!=null){
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File copy successfuly .");

        }catch (IOException e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        String inputfile ="C:\\Users\\PUSHPAK\\Desktop\\question\\source.txt";
        String output ="C:\\Users\\PUSHPAK\\Desktop\\question\\destination.txt";
        copyfile(inputfile,output);
    }
}
