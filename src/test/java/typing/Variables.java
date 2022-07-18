package typing;

import org.testng.annotations.Test;

public class Variables {

    @Test
    public void variableIntro() {
        // Create varaibles
        int age = 29;
        double pi = 3.14;
        char grade = 'c';
        String test = "Regression";
        boolean report = false;

        // update variable content
        age = 30;
        pi = 3.16;
        grade = 'A';
        test = "Smoke";
        report = true;
    }
}
