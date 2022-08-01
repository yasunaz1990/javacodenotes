package controlflow;

import org.testng.annotations.Test;

public class SwitchTest {

// code formatting:
// win :  [alt] + [ctrl] + [shift] + [L]
// mac :  [command] + [option] + [shift] + [L]


    @Test
    public void demo() {
        int ratio = 110;

        switch (ratio) {
            case 40:
                System.out.println("This case is for value 40");
                System.out.println("Generate some reports");
                break;
            case 50:
                System.out.println("This case is for value 50");
                System.out.println("Generate some reports");
                break;
            case 70:
                System.out.println("This case is for value 70");
                System.out.println("Generate some reports");
                break;
            default:
                System.out.println("This is a default");
                System.out.println("Generate some reports");
        }
    }//end::demo

    @Test
    public void demo2() {
        // accepts:       int, char, String
        // won't accept:  double, boolean


        switch (getRole()) {
            case "admin":
                System.out.println("You have full access");
                System.out.println("You can manage everything!");
                break;
            case "system":
                System.out.println("You have system level access");
                System.out.println("You can only manage home/ dir");
                break;
            case "guest":
                System.out.println("You have guest level access");
                System.out.println("You can only manage desktop/ dir");
                break;
            default:
                System.out.println("You do not have any access");
                System.out.println("This incident will be logged");
        }


    }//end::demo2


    @Test
    public void loop() {

        // for loop
        for (int num = 1; num <= 10000000; num++) {
            System.out.println(num + "\t\tverifying...");
        }


    }


    public String getRole() {
        return "hacker";
    }


}//end::class
