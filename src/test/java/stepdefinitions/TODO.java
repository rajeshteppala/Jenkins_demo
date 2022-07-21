package stepdefinitions;

import pagefactory.TODOPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TODO {

    WebDriver driver = null;
    TODOPage todo;

    @Given("I am navigated to  TODO application page")
    public void todoApplicationPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/test/java/driver/chromedriver.exe" );
        driver = new ChromeDriver();
        System.out.println("open application page");
        driver.navigate().to("https://todomvc.com/examples/vue/");
        driver.manage().window().maximize();
        Thread.sleep(200);
    }

    @When("I add new task {string}")
    public void addNewTask(String task){
        todo = new TODOPage(driver);
        todo.enterTaskAndEnter(task);
    }

    @And("New task is added to TODO list")
    public void verifyNewTaskAdded(){
        todo.verifyTaskIsAdded();
    }
}
