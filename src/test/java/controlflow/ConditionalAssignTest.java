package controlflow;

import org.testng.annotations.Test;

import java.util.Scanner;

public class ConditionalAssignTest {


    @Test
    public void demo() {
        // Syntax   var = (condition)? value1 : value2;
        //
        // condition
        // - boolean data value  :  true, false
        // - relation operators  :  10 < 1000
        // - boolean operators   :  false && true --> false
        // - function            :  isNYRainingNow() --> false
        // - boolean expression  : (age < 21 && isCitizen ) --> true or false

        int number = (100 <= 32)? 19 : 22;
        System.out.println(number);
    }


    public static void main(String[] args) {
        //1. create a scanner
        Scanner scan = new Scanner(System.in);

        //2. Prompt the user
        System.out.print("Please enter your age: ");
        int userAge = scan.nextInt();

        // Decision
        String outcome = (userAge >= 16)? "Yes, eligible!" : "No, not eligible!";

        // output
        System.out.println("-----------OUTPUT--------------");
        System.out.println("An I eligible to vote? > " + outcome);
    }

}
