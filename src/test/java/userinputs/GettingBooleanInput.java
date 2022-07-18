package userinputs;

import java.util.Scanner;

public class GettingBooleanInput {

    public static void main(String[] args) {
        // 1. Create a scanner
        Scanner scan = new Scanner(System.in);

        // 2. Prompt the user
        System.out.println("Enter a character");
        String letter2 = scan.nextLine();




//        // 3. Make a decision
//        if ( generateReport ) System.out.println("Sure will generate for you");
//        else                  System.out.println("Ok, no report then");

        // 4. Close the scanner
        scan.close();
    }
}
