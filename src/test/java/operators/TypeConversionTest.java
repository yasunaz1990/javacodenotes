package operators;

import org.testng.annotations.Test;

public class TypeConversionTest {

    @Test
    public void implicitTypeConversion() {
        double count = 0.0;
        int num = 890;

        count = num;
        System.out.println(count);
        //double to int but not int to double

        double pi = 3.14;
        int answer = 0;

    }
    @Test
    public void implicitTypeConversionEx1(){
        char grade = 'C';
        //converts to char number
        int ans = grade;

    }
    @Test
    public void implicitTypeConversionEx2(){
        //illegal stuff
        //String var = 'C';
        //String var = 80.92;
        //boolean var = 0;
        //boolean var = "text"'
    }
    @Test
    public void explicitTypeConversionDemo(){
        int ans = (int)19.89;
        System.out.println(ans);

        char grade = (char)67000;
        System.out.println(grade);

        char symbol = (char)198.87;
        System.out.println(symbol);

        //illegal
        //String var = (String)90
    }

    @Test
    public void explicitTypeCastingUsage(){
        double ans = Math.random();
        ans *= 10;
        System.out.println(ans);

        int rand = (int)ans;
    }


}
