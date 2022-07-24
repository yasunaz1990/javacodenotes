package operators;


import org.testng.annotations.Test;

    public class TypeCoversionTest {

        @Test
        public void implicitTypeConversionDemo() {
            double count = 0.0;   // decimal number
            int    num = 890;     // whole number

            //s[double]  <-- v(int)  OK  implicit type conversion
            count = num;
            System.out.println(count);


            double pi = 3.145;
            int   ans = 0;

            //s[int] <- v(double)
            //ans = pi;   // NOT-OK
        }

        @Test
        public void implicitTypeConversionEx1() {
            char grade = 'C';

            // s[int] <- v(char)
            double ans = grade;
            System.out.println(grade);

            // Related Data Type
            // double, int, char  --> Numerical Data Type
        }

        @Test
        public void implicitTypeConversionEx2() {
            // String var = 'C';
            // String var = 89.02;
            // String var = true;

            //boolean var = 0;
            //boolean var = "text";
        }


        @Test
        public void explicitTypeConversionDemo() {
            // (int)double --> int
            int ans = (int)19.89;
            System.out.println(ans);

            // (char)int --> char
            char grade = (char)67000;
            System.out.println(grade);

            // (char)double --> char
            char symbol = (char)198.87;
            System.out.println(symbol);

            //not allowed
            //String var = (String)90;
            //String var = (String)true;
            //String var = (String)'C';
            //boolean var = (boolean) 0;
            //boolean var = (boolean) "false";
        }


        @Test
        public void explicitTypeCastingUsage() {
            // generating random counter number
            // Math.random()
            double ans = Math.random(); //0.00000 ~ 0.999999999
            System.out.println(ans);

            ans *= 100;

            System.out.println(ans);

            int rand = (int)ans;  //explicit type casting

            System.out.println(rand);


            // Short way to write this
            System.out.println();

            int myRandom = (int)(Math.random() * 100);//0-99
            System.out.println(myRandom);

        }

        @Test
        public void demo() {
            for (int i = 0; i < 100; i++) {
                int myRandom = (int)(Math.random() * 100);
                System.out.println(myRandom);
            }

            int rand = (int)(Math.random() * 100);

        }//end

    }
