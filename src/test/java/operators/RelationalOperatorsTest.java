package operators;

import org.testng.annotations.Test;
//import static operators.LogicalOperatorsTest.

public class RelationalOperatorsTest {

    @Test
    public void greaterThan() {
        // symbol:  >   Greater Than
        // n > m    --> {true || false}
        boolean answer = 10 > 5;
        System.out.println(answer);

        answer = 10 > 52;
        System.out.println(answer);

    }

    @Test
    public void greaterThanOrEqualTo() {
        // symbol:  >=  Greater Than Or Equal To
        // n >= m   --> {true || false}
        boolean answer = 10 >= 9;
        System.out.println(answer);

        answer = 10 >= 10;
        System.out.println(answer);

    }

    @Test
    public void lesserThan() {
        // symbol:  <   Lesser Than
        // n < m    --> {true || false}
        boolean answer = 8 < 3;
        System.out.println(answer);

        answer = 9 < 10;
        System.out.println(answer);

    }

    @Test
    public void lesserThanOrEqualTo() {
        // symbol:  <=  Lesser Than Or Equal To
        // n <= m   --> {true || false}
        boolean answer = 5 <= 8;
        System.out.println(answer);

        answer = 8 <= 10;
        System.out.println(answer);

    }

    @Test
    public void equalTo() {
        // symbol:  ==  Equal To
        // n == m   --> {true || false}
        boolean answer = 53 == 53;
        System.out.println(answer);

        answer = 4 == 8;
        System.out.println(answer);

    }

    @Test
    public void notEqualTo() {
        // symbol:  !=  Not Equal To
        // n != m   --> {true || false}
        boolean answer = 5 != 5;
        System.out.println(true);

        answer = 9 != 1;
        System.out.println(answer);
        // answer = randomBool();
        // import static consoleoutput.ConsoleOutput.sleep;

    }

    @Test
    public void flowOfExecution() {
        int age = (int)(Math.random() * 100);

        System.out.println("You are "+age+" years old.");
        System.out.println("line 1");
        System.out.println("line 2");

        if (age < 21 || age >= 64) {
            System.out.println("line 3");
            System.out.println("line 4");
        }

        System.out.println("line 5");
        System.out.println("line 6");

    }
}
