package variable;

import org.testng.annotations.Test;

public class VariableReviewTest {

    @Test
    public void varialeCreationReview() {
        int id = 12657;  // [data-type]:int [name]: id  [data_value]: 12657
        int year = 2022; // [data-type]: int [name]: year [data_value]: 2022
        double pi = 3.14; // [data-type]: double = [name]: pt   [data_value]: 3.14
        char grade = 'A'; // [data-type]: char = [name]: grade   [data_value]: 'A';
        String msg = "Test"; // [data-type]: String = [name]: msf   [data_value]: "Test";
        boolean isRaining = true;  // [data-type]: boolean = [name]: isRaining [data_value]: true

    }
        @Test
        public void creatingVariable(){
            int year;
            // 10 lines of code later
        year = 90;

        int age1,age2,age3;

        age1 = 18;
        age1 = 21;
        age1 = 56;

        System.out.println(age1);

        }


        @Test
        public void defaultVariableValues(){
            int id = 0;
            double pi = 0.0;
            char grade = '\0';
            boolean isRaining = false;
            String text = null;

            grade = 'A';

            final String username = "alphaleaf12";
            System.out.println(username);

            //username = "Hello";
            System.out.println(username);
    }




}
