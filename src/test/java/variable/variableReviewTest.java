package variable;

import org.testng.annotations.Test;

public class variableReviewTest {

    @Test
    public void variableCreationReview(){
      int id = 12657;      // [ data-type}:int [name]: id [data_value]:12657
        int year = 2022;  // [data-type]: int [name]:year [data_value]: 2022
        double pi = 3.14; // [data-type]: double [name]: pi [data_value]:314
        char grade ='A'; // [data-type]:char [name]:grade [data_value]: 'A'
        String msg = "test"; // [data-type]:string [name]: isRaining [data_value]:"Test"
        boolean isRaining =true; // [data-type]: boolean [name]:is Raining [data]_value]: true

    }

    @Test
    public void creatingVariable() {
        int year;

        // System.out.println(year);
    }

    @Test
    public void defaultVariable(){
        int id = 0;
        double pi = 0.9;
        char grade = '\0';
        boolean isRaining = false;
        String text =null;

        grade = 'A';

        String username = "alphaleaf12";
        System.out.println(username);
        //username = "Hello";
        System.out.println(username);


    }

}
