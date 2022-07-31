package controlflow;

import org.testng.annotations.Test;

public class switchTest {
    // code formatting:
    //  [alt] + [ctrl] + [shift] + [L]

    @Test
    public void demo() {
        int ratio = 0;
        switch (ratio) {
            case 40:

                System.out.println("This case is for value 40");
                System.out.println("Generate some reports");
                break;
            case 45:
            System.out.println("This case is for value 50");
            System.out.println("Generate some reports");

            System.out.println("This case is for value 70");


        }
    } // end::demo
    @Test
    public void demo2(){
        // accept: .... int, char, String
        // won't accept: double, boolean
        String role = "";
        switch(role) {
            case "admin":
                System.out.println("You have full access");
                System.out.println("You can only manage everything!");
                break;
            case "guest":
                System.out.println("You have guest level access");
                System.out.println("You can only manage desktop/ dir");
                break;
                case "system":
                System.out.println("You do not have any access");
            System.out.println("This incident will be logged");
            break;
            default:
            System.out.println("You do not have access");
            System.out.println("This incident will be logged");
        }
     } //end::class

   }
