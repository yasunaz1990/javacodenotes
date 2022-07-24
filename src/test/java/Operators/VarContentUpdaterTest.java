package Operators;

import org.testng.annotations.Test;

public class VarContentUpdaterTest {

    @Test
    public void addUpdate(){
        // symbol +=
        int number = 100;
        number +=20;
        System.out.println(number);

        // old way
        int age = 20;
        age = age + 10;
        System.out.println(age); // 30
    }

    @Test
    public void subtractUpdate(){
        int number = 100;
        number -=32;
        System.out.println(number);
    }

    @Test
    public void divisionUpdate(){
        // symbol /=
        double number = 100;
        number /= 2;
        System.out.println(number);
    }

    @Test
    public void multiUpdate(){
        // symbol *=
        int number = 20;
        number *= 3;
        System.out.println(number);
    }
    @Test
    public void modulusUpdater(){
        // symbol %=
        int number = 10;
        number %=3;
        System.out.println(number);
    }

    @Test
    public void incrementDecrementUpdater(){
        // symbol ++, --
        // only works on numeric var ( double,int,char)
        char letter = 'A';
        letter++;
        System.out.println(letter);






    }
}
