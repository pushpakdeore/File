package pushpak56fileHandlingQestion;
import java.io.*;
import java.util.*;


public class LogSummaryGenerator {
    public static void generateLogSummary(String inputFile,String outputFile){
        Map<String ,Integer> loglevelCounts =new HashMap<>();
        try(BufferedReader reader =new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer =new BufferedWriter(new FileWriter(outputFile)))
        {
            String line;
            while ((line=reader.readLine())!= null){
                String[] field =line.split(",");

                String loglevel =field[1];
                loglevelCounts.put(loglevel,loglevelCounts.getOrDefault(loglevel,0)+1);


                }
            for (Map.Entry<String, Integer> entry : loglevelCounts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");

            }

        }catch (IOException e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        String inpufile ="C:\\Users\\PUSHPAK\\Desktop\\question\\logs.txt";
        String outputfile ="C:\\Users\\PUSHPAK\\Desktop\\question\\log_summary.txt";
        generateLogSummary(inpufile,outputfile);

    }
}
