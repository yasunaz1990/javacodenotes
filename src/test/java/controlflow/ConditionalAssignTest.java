package controlflow;

import org.testng.annotations.Test;

import java.util.Scanner;

public class ConditionalAssignTest {

    @Test
    public void demo() {

        // syntax var = (condition)? value : value:
        int number = (true && false) ? 19 : 22;
        System.out.println(number);
    }

    public static <Please, your> void main(String[] args) {
        // 1. create a scanner
        Scanner scan = new Scanner(System.in);
        // 2. Prompt the user
        System.out.println("Please enter your age:");
        int useAger = scan.nextInt();
        int userAge = 0;
        System.out.println("echo: " + userAge);
        userAge = scan.nextInt();
        // decision
        String outcome = (userAge >= 16) ? "yes, eligible! " : "No, not eligible";
        // output
        System.out.println("---- OUTPUT-----");
        System.out.println("Am I eligible to vote? > " + outcome);

    }
}

