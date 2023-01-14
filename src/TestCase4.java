import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.TechGlobalUtil;

public class TestCase4 {
    public static void main(String[] args) {
      /*
      Given user navigates to “https://automationexercise.com/”
       Then user should see “Copyright © 2021 All rights reserved” text in the footer
       */

        WebDriver driver = Driver.getDriver();

        TechGlobalUtil.getFrontendTesting();

        System.out.println(driver.findElement(By.cssSelector("p[class='pull-left']")).isDisplayed());

        Driver.quitDriver();
    }
}
