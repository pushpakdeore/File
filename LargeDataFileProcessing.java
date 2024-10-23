package pushpak56fileHandlingQestion;

import java.io.*;

public class LargeDataFileProcessing {
    public static void fileTransaction(String inputFile,String outputFile,double threshold){
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer =new BufferedWriter(new FileWriter(outputFile))){

            String line;
            while ((line =reader.readLine())!=null){
                String[] fields =line.split(",");

                double transactionAmount = Double.parseDouble(fields[2]);

                if(transactionAmount>threshold){
                    writer.write(line);
                    writer.newLine();
                }
            }
            System.out.println("filtered transaction have been written :"+outputFile );


        }catch (IOException e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        String inputfile ="C:\\Users\\PUSHPAK\\Desktop\\question\\transactions.txt";
        String outputfile = "C:\\Users\\PUSHPAK\\Desktop\\question\\filtered_transactions.txt";

        double threshold = 1000.00;
        fileTransaction(inputfile,outputfile,threshold);




    }

}
