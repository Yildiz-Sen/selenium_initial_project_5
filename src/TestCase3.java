import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.TechGlobalUtil;

public class TestCase3 {
    public static void main(String[] args) {

        /*
        Given user navigates to “https://automationexercise.com/”
        Then user should see heading2 as “SUBSCRIPTION”
        And user should see and email input box with “Your email address” placeholder
        And user should see arrow submit button
        And user should see “Get the most recent updates from our site and be updated your self...” text under the email input box
         */

        WebDriver driver = Driver.getDriver();

        TechGlobalUtil.getFrontendTesting();

        System.out.println(driver.findElement(By.cssSelector("div[class='single-widget'] h2")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//form[@class='searchform']//input[2]")).isDisplayed());
        System.out.println(driver.findElement(By.cssSelector("i[class='fa fa-arrow-circle-o-right']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//form[@class='searchform']//p")).isDisplayed());


        Driver.quitDriver();



    }
}
