import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ConfigurationReader;
import utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setUp(){
        driver = Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actions = new Actions(driver);
        wait = new WebDriverWait(driver,10);
        driver.get(ConfigurationReader.get("url"));
//        String str=ConfigurationReader.get("search");
//        //   System.out.println("str = " + str);
//        WebElement inputbox= driver.findElement(By.cssSelector("#twotabsearchtextbox"));
//        inputbox.sendKeys(ConfigurationReader.get("search"));
//        WebElement click= driver.findElement(By.cssSelector("#nav-search-submit-button"));
//        click.click();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }

}