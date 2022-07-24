package userinputs;

import java.util.Scanner;

public class TestPrompt {

    public static void main(String[] args) {
        // 1. Create a scanner
        Scanner scan = new Scanner(System.in);
        // 2. Prompt for input & process that input
        System.out.print("Test Name: ");
        String testName =scan.nextLine();

        System.out.print("Test Env :");
        String env =scan.nextLine();

        System.out.println("Total Num: ");
        int totalTests = scan.nextInt();

        System.out.print("Desired Ratio: ");
        double ratio =scan.nextDouble();

        System.out.print("Generate report?: ");
        boolean generateReport = scan.nextBoolean();

        // 3. Processing the data
        String testConfig = "";
         testConfig += "Chosen Test : " + testName + "\n";
         testConfig += "Execution Env: " + env    + "\n";
         testConfig += "total Tests : " + totalTests + "\n";
         testConfig += "Target ratio : " + generateReport + "\n";
         testConfig += "Reports : " + generateReport + "\n";
        System.out.println(testConfig);




    }

}
