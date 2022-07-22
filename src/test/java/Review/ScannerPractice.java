package Review;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        // 1. Scanner object ( usable copy of codes)
        // data : copy of code: Object
       Scanner scan = new Scanner(System.in);

        // 2. prompt & get input
        System.out.println("Enter text");
        String text = scan.nextLine();

        System.out.println("Enter one number");
        int number = scan.nextInt();

        System.out.println("Enter one decimal number");
        double ratio = scan.nextDouble();

        System.out.println("Enter one boolean data");
        boolean report = scan.nextBoolean();

        // 3. Use the input data captured
        System.out.println(" you entered: " + text );
        System.out.println(" you entered: " + number);
        System.out.println(" you entered:" + ratio);
        System.out.println(" you entered:" + report);









    }
}
