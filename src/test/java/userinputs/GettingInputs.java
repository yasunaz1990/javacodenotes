package userinputs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GettingInputs {

    public static void main(String[] args) {
        // 1. Create a scanner
        Scanner scan = new Scanner(System.in);

        // 2. Get an input
        System.out.print("Enter your age: ");
        int userAge = scan.nextInt();

        // 3. Echo the input to the terminal
        System.out.print("You have entered: " + userAge);

        // 4. Close this scanner
        scan.close();
    }
}
