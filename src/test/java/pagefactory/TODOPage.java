package pagefactory;

import Actions.Actions;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//a[@href=\"#/active\"]")
    WebElement btn_active;

    @FindBy(xpath = "//a[@href=\"#/completed\"]")
    WebElement btn_completed;

    @FindBy(xpath = "//input[@type=\"checkbox\" and @class=\"toggle\"]")
    WebElement cb_task;

    @FindBy(xpath = "//button[@class=\"destroy\"]")
    WebElement btn_clear;

    public TODOPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterTaskAndEnter(String task) {
        enter(txt_Todo, task);
        pressEnterKey(txt_Todo);
    }

    public void verifyTaskIsAdded() {
        verifyIfElementDisplayed(lbl_task);
    }

    public void clickActiveButton() {
        click(btn_active);
    }

    public void clickCompletedButton() {
        click(btn_completed);
    }

    public void clickCheckBox() {
        click(cb_task);
    }

    public void clearTask() {
        org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(driver);
        actions.moveToElement(lbl_task).perform();
        click(btn_clear);

    }

    public Boolean verifyTaskIsNotDisplayed() throws Exception {
       if(driver.findElements(By.xpath("/html/body/section/section/ul/li/div/label")).size() > 0){
           throw new Exception("Value is displayed");
        } else
            return true;
    }

    public int getTheCountOfLabel() {
        return driver.findElements(By.xpath("/html/body/section/section/ul/li/div/label")).size();
    }

}