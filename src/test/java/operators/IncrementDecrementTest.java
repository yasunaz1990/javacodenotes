package operators;

// Prefix/Postfix Operators: ++ / --    ++x = increment then use variable.  x++ use variable then increment.
// int n = 5; System.out.print(++n);  <-- results in 6

import org.testng.annotations.Test;

public class IncrementDecrementTest {

    @Test
    public void increment() {
        // symbol: ++
        // adds 1
        // variable content updater by 1
        int num = (int)(Math.random() * 100);
        num++;      //  postfix
        System.out.println(num);

        int age = 10;
        ++age;      //  prefix
        System.out.println(age);

        // int ret = 10++;     //  Not valid, syntax error.  Unexpected type.
    }

    @Test
    public void decrement() {
        // symbol: --
        // subtracts 1
        // variable content updater by -1
        int number = 100;
        number--;   // postfix
        System.out.println(number);

        int limit = 100;
        --limit;    // prefix
        System.out.println(limit);
    }

    @Test
    public void postfixAndPrefix() {
        // postfix: var++, var--
        // prefix:  ++var, --var

        int n = 15;
        System.out.println(n--);    // 15
        System.out.println(n);      // 14

        int y = 20;
        System.out.println(++y);    // 21
    }

    @Test
    public void orderOfExecution() {
        int a = (int)(Math.random() * 20);
        int b = (int)(Math.random() * 20);
        int c = (int)(Math.random() * 20);
        int answer = a + b-- * c;
        System.out.println(a + "+" + ++b + "*" + c + " = " + answer);
        System.out.println(--b);
    }

    @Test
    public void ocaQuizExample() {
        int n = 10;
        int x = 20;
        int ret = ++n * x-- + 100;
        System.out.println(ret);

    }
}
