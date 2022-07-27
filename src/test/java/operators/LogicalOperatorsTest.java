package operators;

import org.testng.annotations.Test;

public class LogicalOperatorsTest {

    @Test
    public void andDemo() {
        // symbol: &&
        // [boolean_data] && [boolean_data]     -->     [boolean_data]
        // AND is greedy, only returns true if both operand are true
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        boolean isRaining = randomBool();
        boolean isWindy = randomBool();
        boolean stayInside = isRaining && isWindy;
        System.out.println("Is it raining?\t\t\t" + isRaining + "\nIs it windy outside?\t" + isWindy + "\nAND:\tStay Inside?\t" + stayInside);
    }

    @Test
    public void orDemo() {
        // symbol: ||
        // [boolean_data] || [boolean_data]     -->     [boolean_data]
        // OR is generous, it returns true if either operand is true
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        boolean isRaining = randomBool();
        boolean isWindy = randomBool();
        boolean stayInside = isRaining || isWindy;
        System.out.println("Is it raining?\t\t\t" + isRaining + "\nIs it windy outside?\t" + isWindy + "\nOR:\tStay Inside?\t\t" + stayInside);
    }

    @Test
    public void notDemo() {
        // symbol: !
        // ![boolean_data]     -->     [boolean_data]
        // NOT flips the value
        System.out.println("True becomes " + !true);
        System.out.println("False becomes " + !false);

        boolean isRaining = randomBool();
        boolean isWindy = randomBool();
        boolean stayInside = !isRaining && !isWindy;
        System.out.println("Is it raining?\t\t\t" + isRaining + "\nIs it windy outside?\t" + isWindy + "\nNOT:\tStay Inside?\t" + stayInside);
    }

    @Test
    public static boolean randomBool() {
        int randomNumber = (int)(Math.random() * 2);
        boolean result = false;
        if (randomNumber == 1) {
            result = true;
        }
        return result;

    }
}
