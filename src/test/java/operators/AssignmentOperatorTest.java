package operators;

import org.testng.annotations.Test;

public class AssignmentOperatorTest {
    @Test
    public void  demo() {
        /*
        symbol:  =
            [storage] = [data source]
            variable    value, variable, method
         */

        String username = "testProd1"; // value

        String temp = username;        // variable

        double data = Math.random();   // method

        System.out.println(data);
    }
}
