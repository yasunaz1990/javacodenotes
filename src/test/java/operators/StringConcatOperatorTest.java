package operators;

import org.testng.annotations.Test;

public class StringConcatOperatorTest {

    // Symbol +
    // [String date] + [ String data ] --> [ String data]


    @Test
    public void concatDemo(){
        String output = "Test score" + " 90 ";
        System.out.println(output);

        String out1 = true + "120";
        System.out.println(out1);

    }
    @Test
    public void concatUsage1() {
        String text = " Hello " + 2022;
        String question = true + " or " + false;
        String message = "That was " + 5 + " days ago! ";

        String fact = "It weights " + 10.32 + "kg";

        System.out.println(text);
        System.out.println(question);
        System.out.println(message);
        System.out.println(fact);

    }

    @Test
    public void concatUsage2(){
        String testName ="Smoke";
        int totalNum = 60;
        int passed = 30;
        int skipped = 10;
        int failed = 20;

        String output = "Test executed: " + testName + "\n"
                + " Total testcases: " + totalNum + "\n"
                + "Total passed: " + passed + "\n"
                + "Total skipped: " + skipped + "\n"
                + "Total failed: " + failed + "\n";

        System.out.println(output);



    }
}
