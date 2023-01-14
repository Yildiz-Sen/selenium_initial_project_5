import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.TechGlobalUtil;

public class TestCase2 {
    public static void main(String[] args) {
        /*
        Given user navigates to “https://automationexercise.com/”
        Then validate all below header items are displayed and enabled and their text is as below
        Home
        Products
        Cart
        Signup / Login
        Test Cases
        API Testing
        Video Tutorials
        Contact us
         */

        WebDriver driver = Driver.getDriver();

        TechGlobalUtil.getFrontendTesting();

        //i[@class='fa fa-home']/..

        //Home
        System.out.println(driver.findElement(By.xpath("//i[@class='fa fa-home']/..")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//i[@class='fa fa-home']/..")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//i[@class='fa fa-home']/..")).getText());

        //Products
        System.out.println(driver.findElement(By.xpath("//i[@class='material-icons card_travel']/..")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//i[@class='material-icons card_travel']/..")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//i[@class='material-icons card_travel']/..")).getText());

        //Cart
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[3]/a")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[3]/a")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[3]/a")).getText());

        //Signup / Login
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[4]/a")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[4]/a")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[4]/a")).getText());

        //Test cases
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[5]/a")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[5]/a")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[5]/a")).getText());

        //API Testing
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[6]/a")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[6]/a")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[6]/a")).getText());

        //Video Tutorials
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[7]/a")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[7]/a")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[7]/a")).getText());

        //Contact Us
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[8]/a")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[8]/a")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[8]/a")).getText());

        Driver.quitDriver();


    }
}
