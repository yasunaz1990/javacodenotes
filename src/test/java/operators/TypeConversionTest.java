package operators;

import org.testng.annotations.Test;

public class TypeConversionTest {

    @Test
    public void implicitTypeConversion(){
        double count = 0.0;   // decimal number
        int num = 890;   // whole number

        // [ double ]   int OK implicit type conversion
        count = num;
        System.out.println(count);


        double pi = 3.145;
        int ans = 0;


        //[int] double
        pi = ans;
        System.out.println(pi);
        // NOT - OK   implicit type conversion

    }

     @Test
    public void implicitTypeConversionEx1() {
         char grade = 'C';

         // data storage(we will just put S) is[ int ]  data value is [char]..will just put v

         System.out.println(grade);

         double ans = grade;
         System.out.println(grade);

         // Related Date Type
         // double, int, char ---> Numerical Data Type

     }

     @ Test
    public void implicitTypeConversionEx2() {
         // String var = 'C": this is incorrect and java won't automatically fix it for you
         // String var = 89.92; this is incorrect and java wont automatically fix it for you

         //boolean var = 0; This is incorrect and java won't automatically fix it for you
         // boolean var = text"; This is incorrect and java wont automatically fix it for you
/* Note: #For both example above, there is NO implicit conversion for String and boolean#
    Implicit conversion means conversion is perform automatically by Java( Java will help you out)
 */

     }

     @Test
    public void explicitTypeConversionDemo() {

         // int ans = 19.89; This is Incorrect and Java won't convert it to correct output
         // Explicit conversion means Java WON'T automatically convert for you so result won't show up
         // so you( developer) have to manually do it consent it

         int ans = (int) 19.89;
         System.out.println(ans);

         char grade = (char) 6700;
         System.out.println(grade);

         // the below is not allowed
         // String var = ( String)90; This is incorrect
         //String var = (String) true; This is incorrect
         //String var = (String)'C'; This is incorrect
         //boolean var = ( boolean) 0; This is incorrect
         // boolean var =( boolean)"false"; This is incorrect

     }

     @Test
    public void explicitTypeCastingUsage(){
        // generating random number
       // Math.random();
       double ans = Math.random();  // between 0.0000 ~ 0.9999999 ( fake random number between those range)
         System.out.println(ans);

         ans = ans * 100;
         // You can also write the above as ans*= 100; and it will work exactly the same

         System.out.println(ans);

         int rand =( int) ans; // explicit type casting
         System.out.println(rand);





     }


     }








