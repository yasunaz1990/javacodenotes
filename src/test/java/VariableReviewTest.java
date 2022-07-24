import org.testng.annotations.Test;

public class VariableReviewTest {

    @Test
    public void VariableCreationReview() {
        int id = 12657;
        int year = 2022;
        double pi = 3.14;
        char grade = 'A';
        String msg = "Test";
        boolean isRaining = true;
    }

    @Test
    public void defaultVariableValues() {
        int id = 0;
        double pi = 0.0;
        char grade  = '\0';
        String msg =  null;
        boolean isRaining = false;

        final String username = "alphaleaf123";
    }

}
