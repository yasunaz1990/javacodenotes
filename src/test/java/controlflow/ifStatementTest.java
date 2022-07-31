package controlflow;

import org.testng.annotations.Test;

import java.util.Scanner;

public class ifStatementTest {
    /*
       if( condition ) {
          code here..
       }
     */

    @Test
    public void demo() {
        boolean isRaining = true;

        if(!isRaining) {
            System.out.println("really..?");
            System.out.println("let's just stay home");
        }
    }//end::demo

    @Test
    public void demo2() {
        int userAge = 117;
        int ageLimit = 35;

        if(userAge > ageLimit) {
            System.out.println("You can vote..");
            System.out.println("Click link to proceed");
        }
    }//end::demo2

    @Test
    public void demo3() {
        String userInput = "ninja!pass";  // empty text
        String expected =  "password";

        boolean match = userInput.equals(expected); // true,false

        if(match) {
            System.out.println("Password match");
            System.out.println("Let the user proceed to home page");
        }
        else {
            System.out.println("Password incorrect");
            System.out.println("Try again..");
        }

    }//end::demo3


    public static void main(String[] args) {
        // 1. Create a scanner
        Scanner scan = new Scanner(System.in);

        // 2. Process & Process
        System.out.print("Enter a number: ");
        int inputNum = scan.nextInt();

        // 3. Decision
        int result = inputNum % 2;  //{0,1}

        if( result == 0) System.out.println("Even number!");
        else System.out.println("Odd Number");

    }//end::main


}//end::class
