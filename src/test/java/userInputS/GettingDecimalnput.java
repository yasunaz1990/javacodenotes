 package userInputS;

import java.util.Scanner;

 public class GettingDecimalnput {

     public static void main(String[] args) {

    // 1. Crate a scanner
    Scanner scan = new Scanner(System.in);

    // 2. Prompt the user
     System.out.println("Enter the success ratio");
    double ratio = scan.nextDouble();
    ratio *= 10;

    // 3. Echo back the input
    System.out.println("You're desired ration: "+ratio);

    // 4. Close the scanner
    scan.close();


}
}
