package userinputs;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class GettingInputs {

    public static void main (String [] args)  {

        //1. Create a scanner
        Scanner scan = new Scanner(System.in);

        //2. Get an input
        System.out.println("Enter your age");
        int userAge = scan.nextInt();

        //3. Echo the input to the terminal
        System.out.println("You have entered:"  + userAge);

        //4. Close the scanner
        scan.close();

    }

}
