package operators;

import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class BasicOperatorTest {

    @Test
    public void demo() {
        // basic operators +, -, /, *, %
        // [num] + [num]--> [um]
        int age = 19;
        int num = 10;
        int result = age + num;
        System.out.println(result); // 29
    }
        @Test
         public void addingNumber() {
            // symbol +
        int num = 1 + 20 + 90;
            System.out.println(num); // 120
        int n = 10;
        int m = 50;
        int ret = n + m + 20;
        System.out.println(ret); // 80
        int x = 10;
        System.out.println(x + 80.900 + 'A');

    }
    @Test
    public void subtractingNumber(){
        // symbol -
        int num = 1 - 20 - 90;
        System.out.println(num); // 120
        int n = 10;
        int m = 50;
        int ret = n - m - 20;
        System.out.println(ret); // 80
        int x = 10;
        System.out.println(x - 20.900 - 'A');

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
       int n = 13;
       int b = 5;
       int ret = n % b;
       System.out.println(ret);
  }
@Test
    public void detectingEvenOddNumber() {
        int res = 1972413;
        int ret = res % 2; // --> R: {0,1}
    System.out.println(ret);
}
}
