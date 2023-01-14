import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.TechGlobalUtil;

public class TestCase1 {
    public static void main(String[] args) {

        /*
        Test Case 1: Validate Automation Exercise site logo
        Given user navigates to “https://automationexercise.com/”
        Then user should see logo on top-left
         */

        WebDriver driver = Driver.getDriver();

        TechGlobalUtil.getFrontendTesting();


        System.out.println(driver.findElement(By.cssSelector("div[class='logo pull-left'] img")).isDisplayed());

        Driver.quitDriver();
    }
}
