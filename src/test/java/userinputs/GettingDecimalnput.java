package userinputs;

import java.util.Scanner;

public class GettingDecimalnput {

    public static void main(String[] args) {
        // 1. Create a scanner
        Scanner scan = new Scanner(System.in);

        // 2. Prompt the user
        System.out.println("enter the success ratio");
        double ratio = scan.nextDouble();

        // 3. Echo back the input
        System.out.println("You're desired ratio: " + ratio);

        // 4. close the scanner
        scan.close();
    }
}
