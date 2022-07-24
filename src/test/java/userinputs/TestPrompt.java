package userinputs;

import java.util.Scanner;

public class TestPrompt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Test name:");
        String testName = scan.nextLine();

        System.out.println("Test env:");
        String env = scan.nextLine();

        System.out.println("Total num:");
        int totalNum = scan.nextInt();

        System.out.println("Desired ratio:");
        double ratio = scan.nextDouble();

        System.out.println("Generate report? (true/false)");
        boolean generateReport = scan.nextBoolean();
        String report = "";
        if (generateReport) {
            report = "yes";
        }
        else report = "no";

        String testConfig = "";

        testConfig += "Test name: " + testName + "\n";
        testConfig += "Test env: " + env + "\n";
        testConfig += "Total num: " + totalNum + "\n";
        testConfig += "Desired ratio: " + ratio + "\n";
        testConfig += "Generate report? " + report + "\n";

        System.out.println(testConfig);

        scan.close();





    }
}
