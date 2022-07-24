package userinputs;



import java.util.Scanner;

public class TestPrompt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Test Name:  ");
        String testName = scan.nextLine();

        System.out.print("Test Env: ");
        String env = scan.nextLine();

        System.out.print("Total Num: ");
        int totalTests = scan.nextInt();

        System.out.print("Desired Ratio: ");
        double ratio = scan.nextDouble();

        System.out.println("Generate Report: " );
        boolean generateReport = scan.nextBoolean();

        String testConfig = "";

        testConfig += "Chosen Test  : " + testName  + "\n";
        testConfig += "Execution Env: " + env       + "\n";
        testConfig += "Total Tests: " + totalTests + "\n";
        testConfig += "Target Ratio: " + ratio + "\n";
        testConfig += "Reports: "  + generateReport + "\n";





    }
}
