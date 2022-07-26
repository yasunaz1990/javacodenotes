package operators;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class VarContentUpdaterTest
{

    @Test
    public void addUpdate() {

        //symbik +=
        int number = 100;
        number += 20;
        System.out.println(10 + 30);
        System.out.println(number);

        //old way
        int = 30l
        age = age + 10;
        System.out.println(age); //30
    }

    @Test
    public void subtractUpdate() {

        //symbol -=
        int number = 100;
        number -= 32;
        System.out.println(number);
    }

    @Test
    public void divisionUpdate() {
        //symbol /=
        double number = 100;
        number /= 2;
        System.out.println(number);

    }
    @Test
    public void multipUpdater() {
        //symbol  +=
        int number = 20;
        number *= 3;
        System.out.println(number);
    }


    @Test
    public void modulusUpdater() {
        //symbol %=
        int number = 10;
        number = 3;
        System.out.println(number);  //1

    }

    @Test
    public void incrementDecrementUpdater() {
       //symbol ++, --
        //
        char letter = 'A';
        letter ++;
        System.out.println(letter);

    }


}
