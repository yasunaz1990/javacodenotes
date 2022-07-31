package controlflow;
import org.testng.annotations.Test;

import java.util.Scanner;

public class ifStatementTest {
    /*
    if(condition) {
    code here
}
     */
    @Test
    public void demo() {
        boolean isRaining = true;
        System.out.println("really");
        System.out.println("let's stay home");

    }

    @Test
    public void demo2() {
        int userAge = 117;
        int ageLimit = 35;
        if (userAge > ageLimit) {
            System.out.println("You can vote..");
            System.out.println("click link to process");
        }

    }

    @Test
    public void demo3() {
        String userInput = "password"; // empty text
        String expected = "password";

        boolean match = userInput.equals(expected); // true, false
        System.out.println(match);
        if (match) {
            System.out.println("password match");
            System.out.println("Let the user proceeed to home page");
        } else {
            System.out.println("password incorrect");
            System.out.println("Try again..");
        }
    } // end:: demo3

    public static void main(String[] args) {
        // 1. create a scanner
        Scanner scan = new Scanner(System.in);
        //2. Process & Process
        System.out.println("Enter as number: ");
        int inputNum = scan.nextInt();
        // 3. Decision
        int result = inputNum % 2; // {0,1}
        if (result == 0) {
            System.out.println("Even number!");
        } else {
            System.out.println("Odd Number");

        }
    }
}



