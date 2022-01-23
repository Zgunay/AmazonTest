package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Search  {

    public Search(){
        PageFactory.initElements(Driver.get(),this);
    };
    @FindBy(id = "twotabsearchtextbox")
    public WebElement inputbox;
    @FindBy(id = "nav-search-submit-button")
    public WebElement click;


    public void StartSearch(){
        String str=ConfigurationReader.get("search");
        System.out.println("str = " + str);
        inputbox.sendKeys(ConfigurationReader.get("search"));
        click.click();
    }

}
