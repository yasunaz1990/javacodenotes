package operators;

import org.testng.annotations.Test;

public class TypeConversionTest {

        @Test
    public void implicitTypeConversionDemo() {
            double count = 0.0;  // decimal number
            // int count = 890;    // whole number
            // double  <-- int  OK  implicit type conversion
            // count = num;
            System.out.println(count);

            double pi = 3.145;
            int ans = 0;

            // [int] <- v(double)
            // ans = pi;  // NOT -OK
        }
        @Test
        public void implicitTypeConversionEx1() {
      char grade = 'C';
    // [int] <-- v(char)
    int ans =grade;
    System.out.println(grade);

        }
        }



