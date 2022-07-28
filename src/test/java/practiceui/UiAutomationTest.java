package practiceui;

import org.testng.annotations.Test;
import ui.Trello;
import static ui.Automations.*;

public class UiAutomationTest {

    @Test
    public void demo() {
        // Test data
        String email = data().internet().emailAddress();
        String pass = data().internet().password();
        String expected = "There is no an account for this email";

        // Test Script
        openBrowser();
        visit(Trello.url_home);
        sleep(3);
        String homeBanner = getText(Trello.home_page_banner);
        lit(Trello.home_page_banner);
        sleep(3);
        click(Trello.login_link);
        sleep(3);
        type(Trello.enter_email, email);
        type(Trello.enter_password, pass);
        click(Trello.btn_login);
        sleep(3);
        String extract = getText(Trello.error_message);
        closeBrowser();

        // Assertions & Decisions
        boolean result = expected.equals(extract);

        if(result) {
            System.out.println("Test passed!");
            System.out.println("No need to save the recording");
        }
        else {
            System.out.println("Verification failed..");
            System.out.println("Take a screenshot for bugs");
            System.out.println("Save the recording");
        }
    }

    @Test
    public void fakeData() {
        String name = data().name().fullName();
        String address = data().address().fullAddress();
        String username = data().name().username();
        String password = data().internet().password();
        String phoneNumber = data().phoneNumber().cellPhone();
        String ssn = data().idNumber().ssnValid();
        String company = data().company().name();

        System.out.println(name);
        System.out.println(address);
        System.out.println(username);
        System.out.println(password);
        System.out.println(phoneNumber);
        System.out.println(ssn);
        System.out.println(company);
    }
}
