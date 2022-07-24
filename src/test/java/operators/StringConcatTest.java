package operators;

import org.testng.annotations.Test;

public class StringConcatTest {
    @Test
    public void concatDemo() {
        String output = "Test Score: " + "90";
        System.out.println(output);

        int testCount = 120;
        System.out.println("Test Score: " + testCount);


    }

    @Test
    public void concatUsage() {
        String testName = "Smoke";
        int totalNum = 60;
        int passed = 30;
        int skipped = 10;
        int failed = 20;

        String output =  "Test executed: " + testName + "\n"
                + "Total testcases: " + totalNum + "\n"
                + "Total passed: " + passed + "\n"
                + "Total skipped: " + skipped + "\n"
                + "Total failed: " + failed + "\n";

        System.out.println(output);
    }
}
