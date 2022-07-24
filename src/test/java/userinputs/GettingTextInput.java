package userinputs;

import java.util.Scanner;

public class GettingTextInput {

    public static void main (String [] args) {

        //1. Create a scanner
        Scanner scan = new Scanner (System.in);

        //2. User prompt
        System.out.println("enter a test name");
        String userInput = scan.nextLine();

        //3. Echo
        System.out.println("User Input:" + userInput.toUpperCase() );

        //4. Close the scanner
        scan.close();

    }
}
