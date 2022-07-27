package operators;

import org.testng.annotations.Test;


    public class VarContentUpdaterTest {
        @Test
        public void addUpdate() {
            // symbol +=
            int number = 100;
            number += 20;
            System.out.println(number);


            // old way
            int age = 20;
            age = age + 10;
            System.out.println(age);
        }

        @Test
        public void subtractUpdate() {
            int number = 100;
            number -= 32;
            System.out.println(number);
        }

        @Test
        public void divisionUpdate(){
            // symbol /=
            double number = 100;
           System.out.println(number);
       }
    }
