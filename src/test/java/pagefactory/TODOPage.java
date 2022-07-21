package pagefactory;

import Actions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TODOPage extends Actions {
    WebDriver driver;
    @FindBy(xpath = "//input[@autofocus=\"autofocus\"]")
    WebElement txt_Todo;

    @FindBy(xpath = "/html/body/section/section/ul/li/div/label")
    WebElement lbl_task;

    public TODOPage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);
    }

    public void enterTaskAndEnter(String task){
        enter(txt_Todo,task);
        pressEnterKey(txt_Todo);
    }

    public void verifyTaskIsAdded(){
        verifyIfElementDisplayed(lbl_task);
    }
}
