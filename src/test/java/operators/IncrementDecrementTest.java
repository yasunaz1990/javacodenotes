package operators;

import org.testng.annotations.Test;

public class IncrementDecrementTest {
    @Test
    public void increment() {
        // symbol ++
        // adds 1
        // variable content updater by 1
        int num = 80;
        num++; // postfix
        System.out.println(num);

        int age = 10;
        ++age; // prefix
        System.out.println(age);
    }
    @Test
    public void decrement() {
        // symbol --
        // subtracts 1
        // variable content update by -1
        int number = 100;
        number--;   // postfix
        System.out.println(number);

        int limit = 100;
        --limit;    // prefix
        System.out.println(limit);
    }

    @Test
    public void postfixAndPrefix() {
        // postfix: var++,  var--
        // prefix : ++var,  --var

        int n = 15;
        System.out.println( n--); // 15
        System.out.println( n ); // 14

        int y = 20;
        System.out.println(++y); // 21
    }
    @Test
    public void orderOfExecution() {
        int a = 2;
        int b = 4;
        int c = 10;

        System.out.println(a + b-- * c);
        System.out.println(b);
    }
    @Test
    public void ocaQuizExample() {
        int n = 10;
        int x = 20;

        int ret = ++n * x-- + 100; // 10+1 x 20 + 100 = 320
        System.out.println(ret);
    }
}
