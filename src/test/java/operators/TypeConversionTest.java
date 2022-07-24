package operators;

import org.testng.annotations.Test;

public class TypeConversionTest {

    @Test
    public void implicitTypeConversionDemo () {

        double count = 0.0; //decimal number
        int    num = 890;   //whole number

        //[double]  < -- int OK implicit type conversion
        count = num;
        System.out.println(count);

        double pi = 3.145;
        int ans = 0;

        //s[int] <- double
        //ans = pi;  // NOT-OK
    }


    @Test
    public void implicitTypeConversionEx1 () {
        char grade = 'C';

        //s[int] <- v(char)
        int ans = grade;
        System.out.println(ans);

        // Related Data Type
        // double, int, char -> Numerical data type

    }

    @Test
   public void implicitTypeConversionEx2() {

        //String var = 'C';
        //String var = 89.02;
        //String var = true;

        //boolean var = 0;
        //boolean var = "text";

    }

   @Test
    public void ExplicitTypeConversionDemo () {
   // (int)couble --> int
        int ans = (int)19.89;
        System.out.println(ans);
   // (char) int -->
        char grade = (char)67000;
        System.out.println(grade);

        // (char) couble  -->char
        char symbol = (char)98.87;

        // not allowed
        // String var = (String)90;
        // String var = false;
       // boolean var = (boolean) "false";

    }

    @Test
    public void explicitTypeCastingUsage(){

         // generating random number
        // Math.ramdom()

        double ans = Math.random(); // 0.00000 ~ 0.9999999 fake random number
        //ans = ans * 100;
        ans *= 100;

        int rand = (int)ans; // explicit tyoe casting
        System.out.println(rand);


        //homework
        int myRandom = (int) (Math.random() * 10); //0-999
        System.out.println(myRandom);
    }
}