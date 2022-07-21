Feature: Manage the TODO list

  @add
  Scenario: Add new task in TODO list
    Given I am navigated to  TODO application page
    When I add new task 'meeting'
     And New task is added to TODO list
    When I click on Active option
    Then Newly added task is displayed
    When I click on Completed option
    Then Newly added task is not displayed
    When I click on check box
    Then Task is displayed under completed
    When I click on check box
    Then Task is not displayed under Active
    When I click on checkbox and clear the task
    Then Task is not displayed in the list
    When I add more than one task
    Then All the task is displayed
