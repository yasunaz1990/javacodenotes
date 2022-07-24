package userinputs;

import java.util.Scanner;

public class GettingTextInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("input something");
        String userInput = scan.nextLine();
        System.out.println("thing that was entered: " + userInput.toUpperCase());

        scan.close();



    }
}
