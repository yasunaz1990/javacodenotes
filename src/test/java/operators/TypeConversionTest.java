package operators;

import org.testng.annotations.Test;

public class TypeConversionTest {

    @Test
    public void implicitTypeConversionDemo() {
        double count = 0.0;     // decimal number
        int num = 890;          // whole number

        // s[double]  <-- s[int] OK  implicit type conversion
        count = num;
        System.out.println(count);

        double pi = 3.145;
        int ans = 0;

        // s[integer]  <-- s[double]  NOT OK
        // ans = pi;
    }

    @Test
    public void implicitTypeConversionEx1() {

        char grade = 'C';

        // s[int]  <-- v(char)
        int ans = grade;

        int highestNumber = 2_147_483_647;
        char highestSymbol = (int)65_535;
        System.out.println(ans);
        // grade = highestNumber;

        // Related Data Type
        // double, int, char  --> Numerical Data Type
        // ------(flow)---->  NOT OK
        // <-----(flow)-----  IS OK

    }

    @Test
    public void implicitTypeConversionEx2() {
        // String var = 'C';   // String is not a Numerical Data Type
        // String var = 89.02;
        // boolean var = 0;    // Java does not allow. Not a Numerical Data Type

    }

    @Test
    public void explicitTypeConversionDemo() {
        // (int)double --> int
        int ans = (int)19.89;       // This give consent to convert double to integer and will drop the data after the decimal
        System.out.println(ans);

        // (char)int --> char
        char grade = (char)937000;
        System.out.println(grade);

        // (char)double --> char
        char symbol = (char)98.87;
        System.out.println(symbol);

        // Not Allowed
        // String var = (String)90; // String is not a Numerical Data Type. Cannot do this.
        // String var = (String)true;       // String and boolean are not compatible.
        // boolean var = (boolean)0;
        // boolean var = (boolean)"false";
    }

    @Test
    public void explicitTypeCastingUsage() {
        // generating random number
        // Math.random()
        new java.util.Random();
        double answer = Math.random();  // 0.0 --> 0.9~
        answer *= 100;
        int rand = (int)Math.round(answer);     // explicit type casting
        System.out.println(rand + "%:\t" + answer);

        // Short way to write this
        int myRandom = (int)(Math.random() * 100);
        System.out.println(myRandom);

    }
}
