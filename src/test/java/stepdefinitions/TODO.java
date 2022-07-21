package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.TODOPage;

public class TODO {

   public WebDriver driver = null;

   TODOPage todo;

    @Given("I am navigated to  TODO application page")
    public void todoApplicationPage() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/test/java/driver/chromedriver.exe" );
        driver = new ChromeDriver();
        System.out.println("open application page");
        driver.navigate().to("https://todomvc.com/examples/vue/");
        driver.manage().window().maximize();
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

    @And("I click on Active option")
    public void clickActiveButton(){
        todo.clickActiveButton();
    }

    @Then("Newly added task is displayed under active section")
    public void verifyTaskInActiveSection() throws InterruptedException {
        Thread.sleep(2000);
        todo.verifyTaskIsAdded();
    }

    @When("I click on Completed option")
    public void clickCompletedButton() {
        todo.clickCompletedButton();
    }

    @Then("Newly added task is not  under completed section")
    public void verifyTaskNotDisplayedInCompletedSection() {

    }

    @When("I click on check box")
    public void clickCheckBox() {
        todo.clickCheckBox();
    }

    @Then("Task is displayed under completed")
    public void task_is_displayed_under_completed() {
        todo.clickCompletedButton();
        todo.verifyTaskIsAdded();
    }

    @Then("Task is not displayed under Active")
    public void task_is_not_displayed_under_active() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click on checkbox and clear the task")
    public void i_click_on_checkbox_and_clear_the_task() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Task is not displayed in the list")
    public void task_is_not_displayed_in_the_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I add more than one <task>")
    public void i_add_more_than_one_task(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @Then("All the task is displayed in the TODO list")
    public void all_the_task_is_displayed_in_the_todo_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
