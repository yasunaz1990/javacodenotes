package userinputs;

import java.util.Scanner;

public class GetDecimalInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the target success ratio");
        double ratio = scan.nextDouble();

        System.out.println("Your desired ratio: " + ratio);

        scan.close();

    }
}
