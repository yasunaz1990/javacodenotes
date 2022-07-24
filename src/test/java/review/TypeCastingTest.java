package review;

import org.testng.annotations.Test;

public class TypeCastingTest {

    @Test
    public void typeCastingDemo() {
        // numerical data types:   double, int, char
        // text data type:         String
        // logic data type:        boolean

        //Type Casting:  [char] -->  [int]
        //               [double] -> [char]
        // example:
        //              'A' --> int age;
        //              65.4 -> char grade;

        // Implicit Type Casting: done for you by Java
        // Explicit Type Casting: done by you
    }

    @Test
    public void implicitTypeCasting() {
        // Example 1
        int box;
        box = 'C';
        System.out.println(box);

        // Example 2
        double storage;
        storage = 'C';
        System.out.println(storage);

        // Example 3
        double bag;
        int count = 1990;
        bag = count;
        System.out.println(bag);
    }

    @Test
    public void timeWhereImplicitTypeCastingWontWork() {
        // double, int,char ==> related
        // char ---> int     = OK
        // char ---> double  = OK
        // int ---> double   = OK

        // But following example, java
        // will not do implicit type conversion for you
        // int --> char     = NO
        // double --> char  = NO
        // double --> int   = NO

        // It could result in data loss
        // double ---> biggest
        // int    ---> second biggest
        // char   ---> smallest
    }

    @Test
    public void explicitTypeCasting(){
        // symbol   (data_type)value;
        char bag = (char)89.0;
        char box = (char)66535;

        int space = (int)890.894;
        System.out.println(space);
    }

    @Test
    public void randomNumberGeneration() {
        //0.0000 ~ 0.99999
        double number = Math.random();
        System.out.println(number);

        number *= 100;
        System.out.println(number);

        // Explicit Type Casting
        int ret = (int) number;

        System.out.println(ret);

        // 0 - 9
        int a = (int)(Math.random() * 10);
        System.out.println(a);

        // 0 - 99
        int b = (int)(Math.random() * 100);

        // 0 - 999
        int c = (int)(Math.random() * 1000);
        System.out.println(c);
    }
}
