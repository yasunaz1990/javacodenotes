package operators;

import org.testng.annotations.Test;

public class VarContentUpdaterTest {

    @Test
    public void addUpdate() {
        // symbol: +=
        // Adds the data and assigns it to the variable
        int number = (int)(Math.random() * 100);
        System.out.print(number + " becomes ");
        number += (int)(Math.random() * 10);
        System.out.println(number);

        // number = number + 20;

    }

    @Test
    public void subtractUpdate() {
        // symbol: -=
        // Subtracts the data and assigns it to the variable
        int number = 100;
        number -= 32;
        System.out.println(number);
    }

    @Test
    public void divisionUpdate() {
        // symbol: /=
        // Divides the data and assigns it to the variable
        double number = Math.round(Math.random() * 100);
        System.out.print(number + " divided by 2 = ");
        number /= 2;
        System.out.println(number);
    }

    @Test
    public void multiplyUpdate() {
        // symbol: *=
        // Multiplies the data and assigns it to the variable
        int number = (int)(Math.random() * 100);
        System.out.print(number + " becomes ");
        number *= (int)(Math.random() * 5);
        System.out.println(number);
    }

    @Test
    public void modulusUpdate() {
        // symbol: %=
        // Modulus the data and assign it to the variable
        int number = 100;
        System.out.print(number + " modulus 3 = ");
        number %= 3;
        System.out.println(number);
    }

    @Test
    public void incrementDecrementUpdater() {
        // symbol: ++, --
        // only works on numeric var (double, int, char)
        char letter = (char)(65 + Math.random() * 25);
        System.out.print(letter + "'s next character is ");
        letter++;
        System.out.print(letter + ", and it's previous character is ");
        --letter;
        --letter;
        System.out.println(letter + ".");
    }
}
