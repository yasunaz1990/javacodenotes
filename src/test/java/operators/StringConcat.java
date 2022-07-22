package operators;

import org.testng.annotations.Test;

public class StringConcat {
    @Test
    public void firstSample() {
        String text = "Hello " + 2022;
        String question = true + " or " + false + "?";
        String message = "That was" + 5 + " days ago!";
        String fact = "It weights " + 10.32 + "kg";
    }

    @Test
    public void secondSample() {
        String testName = "Smoke";
        int totalNum = 60;
        int passNum = 30;
        double ratio = 48.56;

        // Empty string
        String output = "";

        output += "Title : " + testName + "\n";
        output += "Tests : " + totalNum + "\n";
        output += "Passed: " + passNum + "\n";
        output += "Ratio : " + ratio + "\n";

        // Display output
        System.out.println(output);
    }
}

