package Actions;

import io.cucumber.java.sk.Tak;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Actions {


    public void enter(WebElement element, String value) {
        element.sendKeys(value);
    }

    public void pressEnterKey(WebElement element) {
        element.sendKeys(Keys.ENTER);
    }

    public void verifyIfElementDisplayed(WebElement element) {
        element.isDisplayed();
    }

    public void click(WebElement element) {
        element.click();
    }

    public void takeScreenShot(WebElement element, String desPath) throws IOException {
        TakesScreenshot srcShot = ((TakesScreenshot) element);
        File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(desPath);
        FileUtils.copyFile(srcFile,destFile);
    }


}
