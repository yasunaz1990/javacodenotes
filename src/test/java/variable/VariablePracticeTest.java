package variable;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class VariablePracticeTest {

    // Data Type       Type of data
    //---------------------------------
    // [Data Type] [varname] = [data];
    //  String           text data
    //  boolean          logical label
    //  int              whole number
    // double            decimal number
    //  char             letter


    @Test
    public void practiceOne() {

       String name = "John Miller";
       int    age  = 32;
       String username = "john.miller";
       String password = "StrongPass123!";
       boolean isOnline = true;
       int numOfFollowers = 1230;
       int numberOfFollowings = 245;
       double likeScoreAvg = 13.4;

       // User profile info output
        System.out.println("Name:\t" + name);
        System.out.println("Age:\t" + age);
        System.out.println("Current username:\t" + username);
        System.out.println("Current password:\t" + password);
        System.out.println("Currently Online:\t" + isOnline);
        System.out.println("Number of followers:\t" + numOfFollowers);
        System.out.println("Number of followings:\t" + numberOfFollowings);
        System.out.println("Like score average:\t" + likeScoreAvg);

        // Simulation of state change
        age = 36;
        username = "johnm134";
        password = "amd23Pass123!";
        isOnline = false;
        numOfFollowers = 3230;
        numberOfFollowings = 1245;
        likeScoreAvg = 23.4;


        System.out.println("\n\n");

        // User profile info output
        System.out.println("Name:\t" + name);
        System.out.println("Age:\t" + age);
        System.out.println("Current username:\t" + username);
        System.out.println("Current password:\t" + password);
        System.out.println("Currently Online:\t" + isOnline);
        System.out.println("Number of followers:\t" + numOfFollowers);
        System.out.println("Number of followings:\t" + numberOfFollowings);
        System.out.println("Like score average:\t" + likeScoreAvg);

    }


    @Test
    public void practiceTwo() {
        // ---- Test Data
        String siteUrl = "https://trello.com";
        String expectedBanner = "Nijat helps teams move work forward.";
        String loginButtonText = "Log in";
        String fakeUserEmail = "fake@gmai.l.com";
        String fakeUserPass = "FakePass123!";
        boolean expectedErrorDisplay = true;

        // ---- Test Step ( User usage simulation )

        WebDriverManager.chromedriver().setup();
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();

        browser.get(siteUrl);
        sleep(2);
        WebElement elem = browser.findElement(By.xpath("//h1"));
        System.out.println( elem.isDisplayed() );
        String actualBannerText = elem.getText();
        System.out.println("BOT: " + elem.getText() );

        WebElement loginLink = browser.findElement(By.xpath("(//a[text()='"+loginButtonText+"'])[1]"));
        loginLink.click();
        sleep(5);

        WebElement emailInput = browser.findElement(By.cssSelector("input#user"));
        emailInput.sendKeys(fakeUserEmail);
        sleep(3);

        WebElement passInput = browser.findElement(By.cssSelector("input#password"));
        passInput.sendKeys(fakeUserPass);
        sleep(3);

        WebElement loginButtonGreen = browser.findElement(By.cssSelector("input#login"));
        loginButtonGreen.click();
        sleep(2);

        WebElement errorSectionRed = browser.findElement(By.cssSelector("div#error > .error-message"));
        boolean actualErrorDisplay = errorSectionRed.isDisplayed();

        sleep(3);



        // ---- Assertion
        Assert.assertEquals(actualBannerText, expectedBanner );
        Assert.assertEquals(actualErrorDisplay, expectedErrorDisplay);
    }




    public static void sleep(int s) {
        try {
            Thread.sleep(s * 1000);
        } catch (InterruptedException e) {
        }
    }

}
