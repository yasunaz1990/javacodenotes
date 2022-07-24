package operators;

import org.testng.annotations.Test;

public class IncrementDecrementTest {

    @Test
    public void increment(){
        int num = 80;
        num++;
        System.out.println(num);
    }

    @Test
    public void decrement(){
        int num = 80;
        num--;
        System.out.println(num);
    }

    @Test
    public void postfixAndPrefix(){
        int n = 15;
        System.out.println(n--);
        System.out.println(n);

        int y = 20;
        System.out.println(++y);
    }

    @Test
    public void orderOfExecution(){
        int a = 2;
        int b = 4;
        int c = 10;

        System.out.println(a + b * c);
    }

    @Test
    public void ocaQuizExample(){
        int n = 10;
        int x = 20;

        int ret =  ++n * x-- + 100;
        System.out.println(ret);
    }

}
