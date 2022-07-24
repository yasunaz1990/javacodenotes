package operators;

import org.testng.annotations.Test;

public class StringConcatOperatorTest {

    // Symbol +

    @Test
    public void concatDemo() {
        String output = "Test score " + "90";
        System.out.println(output);

        int testCount = 120;
        String out1 = "Test executed: " + testCount;
        System.out.println(out1);
    }

    @Test
    public void concatUsage() {

        String testname = "smoke";
        int totalnum = 60;
        int passed = 30;
        int skipped = 10;
        int failed = 20;

        String output = "Test executed: " + testname + "\n"
            + "Total testcases: " + totalnum + "\n"
            + "Total passed: " + passed + "\n"
            + "Total skipped: " + skipped + "\n"
            + "Total failed: " + failed + "\n";
        System.out.println(output);
    }
}
