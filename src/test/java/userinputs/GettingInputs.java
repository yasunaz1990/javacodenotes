package userinputs;

import java.util.Scanner;

public class GettingInputs {

    public static void main(String[] args) {
        // 1. Create a Scanner
        Scanner scan;
        scan = new Scanner(System.in);
        // 2. Get an input
        System.out.println("Enter your age");
        int userAge = scan.nextInt();

        // 3. Echo input to the terminal
        System.out.println("you have entered: " + userAge);
        // 4. Close the scanner
        scan.close();;


    }
}
