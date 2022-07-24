package operators;

import org.testng.annotations.Test;

public class BasicOperatorTest {

    @Test
    public void demo() {
        // basic arithmetic operators: +, -, /, *, %
        // [num1] + [num2]      -->     [number]
        int age = 19;
        int num = 10;
        int result = age + num;
        System.out.println(result);
    }

    @Test
    public void addingNumber() {
        // symbol +
        int num = 10 + 20 + 90;
        System.out.println(num);

        int n = 10;
        int m = 50;
        int ret = m + n + 20;
        System.out.println(ret);

        int x = 90;
        System.out.println(x + 98.900);
        //int sum = x + 98.900;
    }

    @Test
    public void subtractingNumber() {
        // symbol -
        int num = 10 - 20 - 90;
        System.out.println(num);

        int n = 10;
        int m = 50;
        int ret = n - m - 20;
        System.out.println(ret);

        int x = 10;
        System.out.println(x - 20.900 - 'A');
    }

    @Test
    public void dividingNumbers() {
        // symbol /
        // division --> double
        // Math.round();
        double num = 50.25 / 2;
        System.out.println(num);

        double ret = 19 / 0.0;      // logical error - results in "Infinity"
        int ret2 = 19 / 0;          // undefined divide by zero error
        System.out.println(ret);
    }

    @Test
    public void multiplyingNumbers() {
        // symbol *
        int n = 10;
        int m = 20;
        System.out.println(n * m);
    }

    @Test
    public void modulus() {
        // symbol %
        // Modulus is about the remainder from a division
        // Modulus result is always lower than the amount after the % symbol, which is never 0
        int n = 13;
        int b = 1;
        int ret = n % b;
        System.out.println(ret);
    }

    @Test
    public void proof() {
        int modNumber = (int)(Math.random() * 25);
        for (int i = 0; i < 25_000; i++) {
            System.out.println(i + " % " + modNumber + " = " + i % modNumber);
        }
    }

    @Test
    public void detectingEvenOrOddNumber() {
        int resource = (int)(Math.random() * 1000000);
        int ret = resource % 2;       // --> R:{0,1}    0: even, 1: odd
        System.out.print(resource + ":\t");
        if (ret == 0) System.out.println("Even");
        else if (ret == 1) System.out.println("Odd");
    }



}
