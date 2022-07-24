package operators;

import org.testng.annotations.Test;

public class BooleanOperatorTest {

    // data type:
    //         String, double, int, char
    // concat:  "abc" + "xyz" --> "abcxyz"
    // basic:  +, -, /, *, %
    // in/de: ++, --
    //        > postfix:  num++
    //        > prefix : --num
    // var updater:  +=, -=, /=, *=, %=

    @Test
    public void demo() {
        // boolean:  true, false
        // --------------------------------------
        //  && AND  --> GREEDY     {T,F} && {T,F} --> {T,F}
        //  || OR   --> KIND       {T,F} || {T,F} --> {T,F}
        //  !  NOT  --> FLIPPER    {T,F] !        --> {T,F}

        System.out.println( false );



    }
}
