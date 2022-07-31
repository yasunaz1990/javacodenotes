package operators;

import org.testng.annotations.Test;

public class RelationalOperatorsTest {

   @Test
    public void greaterThan() {
       // symbol > greater than
       // n > M --> {true, false}
       boolean ans = 10 > 5;
       System.out.println(ans);
    }
    @Test
    public void greaterThanOrEqualTo() {
       // symbol >= greater than or equal to
        // n >= m --> {true, false}
        boolean ans = 10 >= 10;
        System.out.println(ans);
    }
    @Test
    public void lessThan() {
       // symbol < less than
        // n < m --> {true, false}
        boolean ans = 5 < 10;
        System.out.println(ans);
    }
    @Test
    public void lessThanEqualTo() {
       // symbol <= less than equal to
        // n <= m --> {true, false}
        boolean ans = 5 <= 5;
        System.out.println(ans);
    }
    @Test
    public void equalTo() {
       // symbol == equal to
        // n == m --> {true, false}
        boolean ans = 53 == 90;
        System.out.println(ans);
    }
    @Test
    public void notEqualTo() {
       // symbol != not equal to
        // n != m {true, false}
        boolean ans = 1 != 7;
        System.out.println(ans);
    }
    @Test
    public void flowExecution() {
       int age = 65;
        System.out.println("line 1");
        System.out.println("line 2");
        if (age < 21) {
            System.out.println("line 3");
            System.out.println("line 4");
        System.out.println("line 5");
        System.out.println("line 6");
        }
    }

}
