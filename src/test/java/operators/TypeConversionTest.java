package operators;

import org.testng.annotations.Test;

public class TypeConversionTest {
    @Test
    public void implicitTypeConversion(){
        double count = 0.0;     // decimal number
        int num = 890;          // whole number

        //double <-- int ok implicit type conversion
        count = num;
        System.out.println(count);

        double pi = 3.145;
        int ans = 0;

        //[int] <-- v(double)
        // ans = pi; //NOT -OK

    }
    @Test
    public void implicitTypeConversionEx1(){
        char grade = 'c';

        //  storage[int] <--  value is(char)
        int ans = grade;
        System.out.println(ans);
        // Related data type
        // double, int, char ---> Numerical data type
    }
    @Test
    public void implicitTypeConversionEx2(){

        // String var = 'C';
        // String var = 89.02;
        //String var = true;

        // boolean var = 0;
        // boolean var = "text";

    }
    @Test
    public void explicitTypeConversionDemo(){
        // (int)double --> int
        int ans = (int)19.89;
        System.out.println(ans);

        // (char)int----> char
        char grade = (char)67000;
        System.out.println(grade);

        // (char)double ---->char
        char symbol = (char)198.87;
        System.out.println(symbol);

        // not allowed
        // String var = (String)90;
        // String var = (String)true;
        // String var = (String)'C';
        // boolean var = (boolean) 0;
        //boolean var = (boolean) "false';
    }

    @Test
    public void explicitTypeCastingUsage(){
        // generating random numbers
        // Math.random()
        double ans = Math.random();  //0.00000 ~ 0.9999999
        System.out.println(ans);
        ans = ans * 100;
        System.out.println(ans);
        int rand = (int)ans;    //explicit type casting
        System.out.println(rand);

        int n = 36;
        double s = (char)n;


    }
}
