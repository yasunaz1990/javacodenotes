package userinputs;

import java.util.Scanner;

public class TestPrompt {
    public static void main(String[] args) {
        // 1. Create a scanner
        Scanner scan = new Scanner(System.in);

        // 2. Prompt for input & process that input
        System.out.print("Test Name: ");
        String testName = scan.nextLine();

        System.out.print("Test Env : ");
        String env = scan.nextLine();

        System.out.print("Total num : ");
        int totalTests = scan.nextInt();

        System.out.print("Desired ratio");
        double ratio = scan.nextDouble();

        System.out.print("Generate report?: ");
        boolean generateReport = scan.nextBoolean();

        // 3. Processing the data
        String testConfig = "";

        testConfig += "Choosen test  : " + testName       + "\n";
        testConfig += "Execution env : " + env            + "\n";
        testConfig += "Total tests   : " + totalTests     + "\n";
        testConfig += "Target ratio  : " + ratio          + "\n";
        testConfig += "Reports       : " + generateReport + "\n";

        System.out.println(testConfig);


    }
}
