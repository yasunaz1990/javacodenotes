package userinputs;

import java.util.Scanner;

public class GettingBooleanInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a character");
       String letter1 = scan.nextLine();
       String letter2 = scan.nextLine();

        System.out.println(letter1);
        System.out.println(letter2);



    }
}
