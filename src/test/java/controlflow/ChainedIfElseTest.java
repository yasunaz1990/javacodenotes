package controlflow;

import org.testng.annotations.Test;
import ui.Automations;

public class ChainedIfElseTest {


    @Test
    public void demo() {

        if(false) {
            System.out.println("code block A");
        }
        else if(true) {
            System.out.println("code block B");
        }
        else if(false) {
            System.out.println("code block C");
        }
        else if(true) {
            System.out.println("code block D");
        }
        else if(true) {
            System.out.println("code block E");
        }
        else {
            System.out.println("code block Default");
        }

    }


    @Test
    public void crossBrowser() {
        Automations.openBrowser("safari");
        Automations.visit("https://trello.com");
        Automations.sleep(6);
        Automations.closeBrowser();
    }

}//end::class
