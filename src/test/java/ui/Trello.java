package ui;

import org.openqa.selenium.By;

public class Trello {

    final public static String url_home = "https://trello.com";
    final public static String url_login = "https://trello.com/login";
    final public static String url_pricing = "https://trello.com/pricing";

    // -- Trello app element locations -- //
    // Trello home page related
    final public static By home_page_banner = By.xpath("//h1");
    final public static By login_link = By.xpath("(//a[text()='Log in'])[1]");
    final public static By btn_compare_pricing = By.xpath("//a/span[text()='Compare pricing']");

    // Trello login page related
    final public static By login_page_banner = By.xpath("//h1");
    final public static By enter_email = By.cssSelector("input#user");
    final public static By enter_password = By.cssSelector("input#password");
    final public static By btn_login = By.cssSelector("input#login");
    final public static By error_message = By.cssSelector("div#error > p");

    // Trello pricing page related
    final public static By free_description = By.xpath("(//p[contains(@class, 'UiPricing')])[2]");
    final public static By standard_description = By.xpath("(//p[contains(@class, 'UiPricing')])[4]");
    final public static By premium_description = By.xpath("(//p[contains(@class, 'UiPricing')])[6]");
    final public static By enterprise_description = By.xpath("(//p[contains(@class, 'UiPricing')])[8]");

}
