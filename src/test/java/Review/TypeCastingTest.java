package Review;

import org.testng.annotations.Test;

public class TypeCastingTest {

    @Test
    public void typeCastingDemo() {
        // numerical:           double, int , char
        // text data type:      string
        // logic data type:     boolean

        // Type Casting: [char] ---> [int]
        //               [double] ---> [char]
        // example:
        //              'A' ----> int age;
        //              65.7 ---> char grade;

        //Implicit Type Casting : done for you by Java
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

        // Exmaple 3
        double bag;
        int count = 1990;
        bag = count;
        System.out.println(bag);

    }

    @Test
    public void timewhereImplicitTypeCastingWontWork() {
        // double, int, char ---> related
        // char ---> int       ok
        // char ---> double    ok
        // int ---> double     ok

        // But following example, java
        // will not do implicit type conversion for you
        // int ---> char        NO
        // double --> char      NO
        // double --->  int     NO
        //
        // It could result in data loss
        // double ---> biggest
        // int ---> second biggest
        // char --> smallest

    }

    @Test
    public void explicitTypeCasting() {
        // symbol (data_type)Value;

        char bag = (char)89.0;
        char box = (char)65535;

        int space = (int)890.894;
        System.out.println(space);

    }

    @Test
    public void randomNumberGeneration () {
        // 0.0000 ~ 0.99999
        double number = Math.random();
        System.out.println( number);

        number *= 10;
        System.out.println(number);

        // Explicit Type Casting
        int ret =(int)number;

        System.out.println(ret);


        // 0-9(int)(Math.random() * 10);
       int a = (int)(Math.random() * 10);
        System.out.println(a);


        // 0-99
        int b = (int)(Math.random()* 10);
        System.out.println(b);

        // 0 -999
        int c = (int)(Math.random() * 1000);
        System.out.println(c);




    }

}
