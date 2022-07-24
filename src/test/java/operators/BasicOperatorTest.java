package operators;

import org.testng.annotations.Test;

public class BasicOperatorTest {

    @Test
    public void Demo() {
        int age = 19;
        int num = 10;
        int result = age + num;
        System.out.println(result);
    }

    @Test
    public void addingNumber() {
        int num = 10 + 20 + 90;
        System.out.println(num);

        int n = 10;
        int m = 50;
        int ret = n + m + 20;
        System.out.println(ret);
    }

    @Test
    public void subtractingNumber() {
        int num = 10 - 20 - 90;
        System.out.println(num);

        int n = 10;
        int m = 50;
        int ret = n - m - 20;
        System.out.println(ret);
    }

    @Test
    public void dividingNumber() {
        double num = 10.0 / 3.0;
        System.out.println(num);

        double num2 = 10 / 3;
        System.out.println(num2);
    }

    @Test
    public void multiplyingNumber() {
        double num = 10.0 * 3.0;
        System.out.println(num);

        double num2 = 10 * 3;
        System.out.println(num2);
    }

    @Test
    public void modulus() {
        int n = 13;
        int b = 5;
        int ret = n % b;
        System.out.println(ret);
    }

}
