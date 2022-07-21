package Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Actions {


    public void enter(WebElement element,String value){
        element.sendKeys(value);
    }

    public void pressEnterKey(WebElement element){
        element.sendKeys(Keys.ENTER);
    }

    public void verifyIfElementDisplayed(WebElement element){
        element.isDisplayed();
    }

    public void click(WebElement element){
        element.click();
    }

    public void verifyIfElementNotDisplayed(WebElement element){
        if(!element.isDisplayed()){

        };
    }
}
