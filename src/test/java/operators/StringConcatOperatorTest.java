package operators;

import org.testng.annotations.Test;

public class StringConcatOperatorTest {

    // Symbol  +
    // [String data ]  +  [String data] ---> [String data]

    @Test
    public void concatDemo() {
        String output = "Test score " + "90";
        System.out.println(output);


        String out1 = true + "120";
        System.out.println(out1);
    }

    @Test
    public void concatUsage1() {
        String text = "Hello " + 2022;

        String question = "true?" + "{BTN}->[ONCLICK(/signup)";
        String fact = "It weights " + 10.32 + "kg";

        int day = 3;
        String message = "That was" + 5 + " days ago!";


        System.out.println(text);
        System.out.println(question);
        System.out.println(message);
        System.out.println(fact);
    }


    @Test
    public void concatUsage2() {
        String testName = "Smoke";
        int totalNum = 60;
        int passNum = 30;
        double ratio = 48.56;

        // Empty string
        String output = "";

        output += "Title : " + testName + "\n";
        System.out.println(output);

        output += "Tests : " + totalNum + "\n";
        System.out.println(output);

        output += "Passed: " + passNum + "\n";
        System.out.println(output);

        output += "Ratio : " + ratio + "\n";

        // Display output
        System.out.println(output);
    }
}
