package practiceui;

import org.testng.annotations.Test;
import ui.Trello;

import static ui.Automations.*;

public class UiDemoTest {


    @Test
    public void ifExample() {
        openBrowser();
        visit(Trello.url_pricing);
        sleep(10);
        closeBrowser();
    }


    @Test
    public void ifExample2() {
        openBrowser("edge");
        visit(Trello.url_pricing);
        sleep(4);
        closeBrowser();
    }
}
