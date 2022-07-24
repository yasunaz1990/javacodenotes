package operators;

import org.testng.annotations.Test;

public class BasicOperatorTest {

    @Test
    public void demo() {
        // basic operators +, -, /, *, %
        // [num] + [num] --> [num]
        int age = 19;
        int num = 10;
        int result = age + num;
        System.out.println(result);  // 29
    }

    @Test
    public void addingNumber() {
        // symbol +
        int num = 10 + 20 + 90;
        System.out.println(num);

        int n = 10;
        int m = 50;
        int ret = n + m + 20;
        System.out.println(ret); // 80

        int x = 10;
        System.out.println(x + 8.900 + 'A');
    }

    @Test
    public void subtractingNumber(){
        // symbol -
        int num = 10 - 20 - 90;
        System.out.println(num);

        int n = 10;
        int m = 50;
        int ret = n - m - 20;
        System.out.println(ret); // 80

        int x = 10;
        System.out.println(x - 8.900 - 'A');
    }

    @Test
    public void dividingNumbers(){
        //symbol   /

        // division --> double
        // Math.round();
        double num = 10  /  3;
        System.out.println(num);

        int ret = 1 / 0;  // logical error, runtime error
        System.out.println(ret);
    }

    @Test
    public void multiplyingNumbers(){
        // symbol  *
        int n = 10;
        int m = 20;
        System.out.println(n * m);
    }

    @Test
    public void modulus(){
        // symbol  %
        // resource % num ---> {0,1...num-1}
        // resource % 5 -----> {0,1,2,3,4}
        int n = 13;
        int b = 5;
        int ret = n % b;
        System.out.println(ret);
    }

    @Test
    public void detectingEvenOrOddNumber(){
        int res = 198;

        int ret = res % 2;  // -->R:{0,1} 0:even, 1:odd
        System.out.println(ret);

    }
}
