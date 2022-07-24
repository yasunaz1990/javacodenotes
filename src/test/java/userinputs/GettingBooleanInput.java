package userinputs;

import java.util.Scanner;

public class GettingBooleanInput {
    public static void main(String[] args) {

        // 1. Create a scanner
        Scanner scan = new Scanner(System.in);

        // 2. Prompt the user
        System.out.println("Would you like to generate report? (true/false)");
        boolean generateReport = scan.nextBoolean();

        // 3. Make a decision
        if (generateReport == true) System.out.println("Sure, will generate for you.");
        else System.out.println("Ok, no report then.");

        // 4. Close the scanner
        scan.close();

    }
}
