import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.Check;
import pages.Search;
import pages.SelectProduct;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;


public class Amazon_Test extends TestBase{


    @Test
    public void Test1(){

        Search SerachTest= new Search();
        SerachTest.StartSearch();

        SelectProduct select= new SelectProduct();
        select.ProductSelection();

        select.CheckPriceAmount();





    }
}
//        String str=ConfigurationReader.get("search");
//        System.out.println("str = " + str);
//        WebElement inputbox= driver.findElement(By.cssSelector("#twotabsearchtextbox"));
//        inputbox.sendKeys(ConfigurationReader.get("search"));
//        WebElement click= driver.findElement(By.cssSelector("#nav-search-submit-button"));
//        click.click();
//        List<WebElement> elements = driver.findElements(By.xpath("//img[@class='s-image']"));
//        System.out.println("elements = " + elements.size());
//        System.out.println("elements.get(0).getText() = " + elements.get(0).getText());
//        elements.get(0).click();

//        WebElement elements1 = driver.findElement(By.cssSelector("#quantity"));
//        WebElement productTitle = driver.findElement(By.cssSelector("#titleSection"));
//        System.out.println("productTitle.getText() = " + productTitle.getText());
//        //  elements1.click();
//        Select quantity= new Select(elements1);
//
//        List<WebElement> elements2 = quantity.getOptions();
//
//       System.out.println("elements2.size() = " + elements2.size());
//
//       System.out.println("elements2.get(0) = " + elements2.get(1).getText());
//
//        // 3. Add the first hat appearing to Cart with quantity 2
//       elements2.get(1).click();

//       WebElement price=driver.findElement(By.xpath("//*[@class='a-span12']"));
//        String Price=price.getText();
//        System.out.println("Price = " + Price);

//4. Open cart and assert that the total price and quantity are correct
//   WebElement cart=driver.findElement(By.cssSelector("#add-to-cart-button"));
//  cart.click();

//        WebElement Check=driver.findElement(By.cssSelector("#nav-flyout-ewc"));
//        System.out.println("Check.getText() = " + Check.getText());
//
//       String SubTotal= Check.getText();
//       WebElement confirmation = driver.findElement(By.cssSelector("#add-to-cart-confirmation-image"));
//        System.out.println("confirmation.getText() = " + confirmation.getText());
//        confirmation.click();