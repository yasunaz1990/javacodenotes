package operators;

import org.testng.annotations.Test;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.sql.SQLOutput;

public class IncrementDecrementTest {

   @Test
    public void  increment () {
       // symbol ++
        // adds 1
       //variable contect updater by 1
        int num = 80;
        num++;
        System.out.println(num);

        int age = 10;
        ++age;  //prefix
       System.out.println(age);
    }

    @Test
    public void decrement () {
       //symbol --
       // subtracts 1
       // variable content update by -1

       int number = 100;
       number--;
       System.out.println(number);

       int limit = 100;
       --limit; //prefix
        System.out.println(limit);
    }

    @Test
    public void postfixAndrefix () {
       //postfix:  var++, var--
        // prefix: ++var, ==var

        int n = 15;
        System.out.println(n--);  //15
        System.out.println(n);    //14

        int y = 20;
        System.out.println(++y);   //20


    }

    @Test
    public void orderOfExcution() {
       int a = 2;
       int b = 4;
       int c = 10;

       System.out.println(a + --b * c);  //32
        System.out.println(b);
    }

    @Test
    public void

}


