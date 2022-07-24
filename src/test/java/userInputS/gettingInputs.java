package userInputS;

import java.util.Scanner;


public class gettingInputs {

    public static void main(String[] args) {
        // 1. Create a scanner
        Scanner scan = new Scanner(System.in);

        // 2. Get an input
        System.out.println("Enter your age");
        int userAge = scan.nextInt();

        // 3. Echo the input to the terminal
        System.out.println("you have entered:" + userAge);

        // 4. Close the scanner
        scan.close();


    }
}
