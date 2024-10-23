package pushpak56fileHandlingQestion;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

class Policy {
    private  String policyId;
    private String  policyHolderName;
    private double policyAmount;

    public Policy(String policyId, String policyHolderName, double policyAmount) {
        this.policyId = policyId;
        this.policyHolderName = policyHolderName;
        this.policyAmount = policyAmount;
    }

    public String getPolicyId(){
        return policyId;
    }
    public String getPolicyHolderName(){
        return policyHolderName;
    }
    public double getPolicyAmount(){
        return  policyAmount;
    }
}


interface FileOperations {
    void readPolicies(String inputFilePath);
    void writeSummary(String outputFilePath, int totalPolicies, double totalAmount);
}


class PolicyManager implements FileOperations {
    private List<Policy> policies = new ArrayList<>();
    @Override
    public void readPolicies(String inputfile ){
        try (BufferedReader br = new BufferedReader(new FileReader(inputfile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String policyId = parts[0];
                String policyHolderName = parts[1];
                double policyAmount = Double.parseDouble(parts[2]);

                Policy policy = new Policy(policyId, policyHolderName, policyAmount);
                policies.add(policy);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }
    @Override
    public void writeSummary(String ouptfile, int totalPolicies, double totalAmount) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ouptfile))) {
            bw.write("Total Number of Policies: " + totalPolicies);
            bw.newLine();
            bw.write("Total Policy Amount: " + totalAmount);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public void processPolicies(String inputFilePath, String outputFilePath) {
        readPolicies(inputFilePath);
        int totalPolicies = 0;
        double totalAmount = 0;

        for (Policy policy : policies) {
            totalPolicies++;
            totalAmount += policy.getPolicyAmount();
        }
        writeSummary(outputFilePath, totalPolicies, totalAmount);


    }

}
public class Main{
    public static void main(String[] args) {
        String inputfile="C:\\Users\\PUSHPAK\\Desktop\\question\\input.txt";
        String ouptfile ="C:\\Users\\PUSHPAK\\Desktop\\question\\output.txt";

        PolicyManager policyManager = new PolicyManager();
        policyManager.processPolicies(inputfile, ouptfile);

    }
}
