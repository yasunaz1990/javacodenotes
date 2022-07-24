package userinputs;

import java.util.Scanner;

public class GettingBooleanInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("generate input");
        boolean input = scan.nextBoolean();
        if (input == true) {
            System.out.println("yes");
        }
        else System.out.println("no way bro");
        scan.close();

    }
}
