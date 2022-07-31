package operators;

import org.testng.annotations.Test;

public class RelationalOperatorsTest {

    @Test
    public void greaterThan() {
        // Symbol > greater than
        // n > m --> {true, false}
        boolean ans = 10 > 5;
        System.out.println(ans);

        ans = 10 > 52;
        System.out.println(ans);
    }
    @Test
    public void greaterThanOrEqualTo() {
        // symbol >= greater thaan or equal to
        // n >= m --> {true, false}
        boolean ans = 10>=9;
        System.out.println(ans);

        ans = 10 >= 10;
        System.out.println(ans);

        ans = 10 >=26;
        System.out.println(ans);
    }
    @Test
    public void lessThan() {
        // symbol < less than
        // n < m ---> {true, false}
        boolean ans = 5< 10;
        System.out.println(ans);

        ans = 5600 < 10;
        System.out.println(ans);

        ans = 98 < 98;
        System.out.println(ans);
    }
    @Test
    public void lessThanOrEqualTo() {
        // symbol <= less than or equal to
        // n <= m ---> {true, false}
        boolean ans = 5 <= 10;
        System.out.println(ans);

        ans = 5<=5;
        System.out.println(ans);

        ans = 5 <= -256;
        System.out.println(ans);
    }
    @Test
    public void equalTo() {
        // symbol == equal to
        // n ==m --> {true, false}
        boolean ans = (53 == 53);
        System.out.println(ans);

        ans = 53 == 90;
        System.out.println(ans);
    }
    @Test
    public void notEqualTo() {
        // symbol !=  not equal to
        // n != m --> {true, false}

        boolean ans = 1 !=7;
        System.out.println(ans);

        ans = 1 != 1;
        System.out.println(ans);
    }
    @Test
    public void flowOfExecution(){
        int age = 65;

        System.out.println("line 1");
        System.out.println("line 2");

        if(age < 21) {
            System.out.println("line 3");
            System.out.println("line 4");
        }

        System.out.println("line 5");
        System.out.println("line 6");
    }
}
