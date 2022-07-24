package userinputs;

import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner(System.in);

        System.out.println("Enter age");
        int userAge = scan.nextInt();

        System.out.println("You have entered " + userAge);

        scan.close();
    }
}
