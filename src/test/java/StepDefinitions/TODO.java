package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TODO {

    @Given("User is on the TODO application page")
    public void todoApplicationPage(){
        System.out.println("open application page");
    }

    @When("User adds new task")
    public void addNewTask(){
        System.out.println("add new task");
    }

    @Then("New task is added to TODO list")
    public void verifyNewTaskAdded(){
        System.out.println("New task added");
    }
}
