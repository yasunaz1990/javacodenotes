package variable;

import org.testng.annotations.Test;

public class VariableReviewTest {

    @Test
    public void variableCreationReview() {
        int id = 12657;             //  [data-type]: int(eger)      [name]: id          [data_value]: 12657
        int year = 2022;            //  [data-type]: int(eger)      [name]: year        [data_value]: 2022
        double pi = 3.14;           //  [data-type]: double         [name]: pi          [data_value]: 3.14
        char grade = 'A';           //  [data-type]: char(acter)    [name]: grade       [data_value]: 'A'
        String msg = "Test!";       //  [data-type]: String         [name]: msg         [data_value]: "Test!"
        boolean isRaining = true;   //  [data-type]: boolean        [name]: isRaining   [data-value]: true
    }

    @Test
    public void creatingVariable() {
        // Start of discouraged forms of making variables
        int year;
        int age1, age2, age3;
        age1 = 18;
        age2 = 21;
        age3 = 56;
        // End of discouraged forms of making variables
    }

    @Test
    public void defaultVariableValues() {
        // Start default values for created variables
        int id = 0;
        double pi = 0.0;
        char grade = '\0';
        boolean isRaining = false;
        String text = null;
        // End default values for created variables

        grade = 'A';

        final String username = "alphaleaf12";  //  final: makes a variable locked to a value first assigned
        System.out.println(username);

        // username = "Hello";  <--- will not compile because "username" is final.

    }
}

/**
 * A = not initialized
 * B = 50
 * C = 100
 * D = 100
 * E = 200
 * F = 100
 */