package typing;

import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {
        // 1. Create a scanner
        Scanner scan = new Scanner(System.in);


        // 2. Get the user input
        int count = scan.nextInt();
        double ratio = scan.nextDouble();
        boolean report = scan.nextBoolean();
        String testName = scan.nextLine();

        // 3. Close the scanner
        scan.close();
        scan.close();
        scan.close();
        scan.close();
    }
}
