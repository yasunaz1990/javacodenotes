package operators;

import org.testng.annotations.Test;

public class LogicalOperatorsTest {


    @Test
    public void andDemo() {
        // symbol   &&
        // boolean_data  &&  boolean_data -->  boolean_data
        // AND is greedy, only returns true if both operand is true
        System.out.println( true  && true  );
        System.out.println( true  && false );
        System.out.println( false && true  );
        System.out.println( false && false );

        boolean isRaining = true;
        boolean isWindy = true;
        boolean stayInside = isRaining && isWindy;

        System.out.println("User should stay inside?: " + stayInside);

    }

    @Test
    public void orDemo() {
        // symbol ||
        // boolean_data  ||  boolean_data -->  boolean_data
        // OR is generous
        System.out.println(true  || true );
        System.out.println(true  || false);
        System.out.println(false || true);
        System.out.println(false || false);

        boolean isRaining = false;
        boolean isWindy = false;
        boolean stayInside = isRaining || isWindy;

        System.out.println("User should stay inside?: " + stayInside);
    }

    @Test
    public void notDemo() {
        // symbol  !
        // !(boolean_data) --> boolean_data
        // NOT  flips the boolean
        System.out.println( !false );
        System.out.println( !true  );

        boolean isRaining = false;
        boolean isWindy = false;
        System.out.println( !(false || false) );
    }
}
