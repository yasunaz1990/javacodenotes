package userinputs;

import java.util.Scanner;

public class GettingDecimalInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the success ratio");
        double ratio = scan.nextDouble();
        ratio += 10;

        System.out.println("You're desired ratio:" + ratio);

        scan.close();


    }
}