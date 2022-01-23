package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;

public class SelectProduct {

    public SelectProduct(){  PageFactory.initElements(Driver.get(),this); }
    @FindBy(xpath = "//img[@class='s-image']")
    List<WebElement> product;
    @FindBy(id = "quantity")
    public WebElement quantitiy;
    @FindBy(xpath = "//*[@class='a-span12']")
    public WebElement UniquePrice;
    @FindBy(id = "add-to-cart-button")
    public WebElement AddCart;
    @FindBy(xpath = "//span[@class='ewc-subtotal-amount']")
    public WebElement CheckPrice;
    @FindBy(xpath = "//*[@class='a-color-base ewc-quantity-text']")
    public WebElement CheckAmount;
   String OneProductPrice;



public void ProductSelection(){

       for (int i=0;i<product.size();i++){
        product.get(i).click();
        Select amount= new Select(quantitiy);
        List<WebElement> elements2 = amount.getOptions();
        if(elements2.size()>=2){
            System.out.println("UniquePrice.getText() = " + UniquePrice.getText());
            OneProductPrice=UniquePrice.getText();
            elements2.get(1).click();
            break;
        }

    }
    AddCart.click();

    // int UnitPrice= Integer.parseInt(array[1]);
   // System.out.println("UnitPrice = " + UnitPrice);



}

     public void CheckPriceAmount(){
         System.out.println("CheckPrice.getText() = " + CheckPrice.getText());

         System.out.println("CheckAmount.getText() = " + CheckAmount.getText());

         String[] array=OneProductPrice.split("\\$");
         String[] array2=CheckPrice.getText().split("\\$");
         double y=Double.parseDouble(array2[1]);
         double x=Double.parseDouble(array[1]);
         double expectedPrice=2*x;
     ;

         Assert.assertTrue(CheckAmount.getText().contains("2"),"Amount is true");
         Assert.assertEquals(y,expectedPrice,"Esittir");

     }




}



