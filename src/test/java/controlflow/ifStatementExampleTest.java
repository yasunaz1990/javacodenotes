package controlflow;

import org.testng.annotations.Test;

public class ifStatementExampleTest {

    @Test
    public void syntaxSample() {
        // if statement
        if (true) System.out.println("Hello there!");
        else
        System.out.println("Alphaleaf!");
        System.out.println("students!");
    }
    @Test
    public void uatResultFilter() {
        int score = 81;
        // filtering
        if(score <= 40) {
            System.out.println("Generating RED Report");
            System.out.println("QA, BA Dev investigate!");
        }
         // 41,42,43....78,79,80
        if(score > 40 && score <= 80) {
            System.out.println("Generating YELLOW Report");
            System.out.println("QA members investigate!");
        }
        // 81,82.....100
        if(score > 80) {
            System.out.println("Generating GREEN Report");
            System.out.println("Schedule for Staging deployment");
        }


            }

            }



