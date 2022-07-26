package operators;
import org.testng.annotations.Test;

public class varContentUpdaterTest {

    @Test
    public void addUpdate(){
        int number = 100;
        number += 20;
        System.out.println(number);

        int age = 30;
        age = age + 10;
        System.out.println(age);
    }

    @Test
    public void minusUpdate(){
        int number = 100;
        number -= 20;
        System.out.println(number);

        int age = 30;
        age = age - 10;
        System.out.println(age);
    }

    @Test
    public void multiplyUpdate(){
        int number = 100;
        number *= 20;
        System.out.println(number);

        int age = 30;
        age = age * 10;
        System.out.println(age);
    }

    @Test
    public void divisionUpdate(){
        int number = 100;
        number /= 20;
        System.out.println(number);

        int age = 30;
        age = age / 10;
        System.out.println(age);
    }

    @Test
    public void modUpdate(){
        int number = 100;
        number %= 20;
        System.out.println(number);

        int age = 30;
        age = age % 10;
        System.out.println(age);
    }

    @Test
    public void incrementDecrementUpdater(){
        char letter = 'A';
        letter++;
        System.out.println(letter);

    }

}
