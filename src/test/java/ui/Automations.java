package ui;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;


public class Automations {

    private static WebDriver driver;
    private static WebDriverWait waits;

    /**
     * Use this method to open the Chrome browser. This method must be called
     * before any of the automation commands listed in this class
     */
    public static void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    /**
     * Use this method to terminate the driver --> browser
     * connection and quit the browser.
     */
    public static void closeBrowser() {
        driver.quit();
    }

    /**
     * Use this method to close the current window
     * that the driver is focused on.
     */
    public static void closeWindow() {
        driver.close();
    }

    /**
     * Use this method to refresh the current window
     */
    public static void refresh() {
        driver.navigate().refresh();
    }


    /**
     * Use this method to visit a particular site, note that
     * driver will wait until all the site components is displayed
     *
     * @param url
     */
    public static void visit(String url) {
        driver.get(url);
    }


    /**
     * Use this method to type into the element with provided text
     *
     * @param location By object
     * @param text     String object
     */
    public static void type(By location, String text) {
        WebElement element =
                waits.until(ExpectedConditions.visibilityOfElementLocated(location));
        element.clear();
        element.sendKeys(text);
    }

    /**
     * Use this method to determine whether an element extractable by the provided location
     * is visible to the ende user or not.
     *
     * @param location By object
     * @return boolean  true: element is visible,  false: element is not visible
     */
    public static boolean isVisible(By location) {
        WebElement element =
                waits.until(ExpectedConditions.visibilityOfElementLocated(location));
        boolean result = element.isDisplayed();
        return result;
    }


    /**
     * Use this method to swtich to desired tab that is open in
     * current browser session.  Make sure to provide unique text
     * that is found in the tab title.
     *
     * @param targetTitle String object
     */
    public static void switchToTab(String targetTitle) {
        Set<String> ids = driver.getWindowHandles();
        for (String each : ids) {
            driver.switchTo().window(each);
            String title = driver.getTitle();
            if (title.contains(targetTitle)) {
                break;
            }
        }//end::for
    }



    /**
     * Use this method to invoke a user click on the element
     * extractable by the provided location ( coordinate )
     *
     * @param location By object
     */
    public static void click(By location) {
        WebElement element =
                waits.until(ExpectedConditions.elementToBeClickable(location));
        element.click();
    }

    /**
     * Use this method to grab the text content of the element
     * extractable by the provided location.
     *
     * @param location By object
     * @return String object
     */
    public static String getText(By location) {
        WebElement element =
                waits.until(ExpectedConditions.visibilityOfElementLocated(location));
        String textContent = element.getText();
        return textContent;
    }

    /**
     * Use this method to invoke element border highlight effect. This method should be
     * used for important element interactions that needs to be captured in screenshot.
     *
     * @param location By object
     */
    public static void highlight(By location) {
        WebElement element =
                waits.until(ExpectedConditions.visibilityOfElementLocated(location));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid red;');", element);
    }

    /**
     * Highlights the given element
     * @param element
     */
    public static void highlight(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid red;');", element);
    }

    /**
     * Use this method to put the Thread into sleep for specified
     * amount of time. Only use this method to demo the test execution
     * work-flow.
     *
     * @param sec
     */
    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException ignore) {
            // DO-NOTHING
        }
    }

    /**
     * Use this method to generate fake test data.
     * @return faker object
     */
    public static Faker data() {
        Faker faker = new Faker();
        return faker;
    }
}//end::class