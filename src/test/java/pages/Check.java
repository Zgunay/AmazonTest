package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Check extends SelectProduct {

   public Check(){         PageFactory.initElements(Driver.get(),this);     }

public void Price(){
       SelectProduct obj= new SelectProduct();
    System.out.println("obj.CheckPrice = " + obj.CheckPrice.getText());
    System.out.println("obj.CheckAmount = " + obj.CheckAmount.getText());

}



}
