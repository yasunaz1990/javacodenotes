package operators;

import org.testng.annotations.Test;

public class StringConcatOperatorTest {
    // Symbol +
    // [String data] + [String data]

    @Test
    public void contactDemo(){
        String output = "Test score" + "90";
        System.out.println(output);

        int testCount = 12;
        String out1 = "Test executed: " +  testCount;
        System.out.println(out1);


    }

        @Test
    public void concatUsage(){
        String testName ="Smoke";
        int totalNum = 60;
        int passed = 30;
        int skipped = 10;
        int failed = 20;

        String output = "Test executed:" + testName + "\n"
                      + "Total testcases:" + totalNum +"\n"
                      + "Total passed:" + passed +"\n"
                        + "Total skipped:" + skipped + "\n"
                        + "Total failed:" + failed + "\n";
            System.out.println(output);
        }
        }


