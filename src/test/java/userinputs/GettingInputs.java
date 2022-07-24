package userinputs;

import java.util.Scanner;

public class GettingInputs {
    public static void main(String[]args){
        // 1. Create a scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int userAge = scan.nextInt();

        System.out.println("You have entered:" + userAge);
        scan.close();;

    }
}
