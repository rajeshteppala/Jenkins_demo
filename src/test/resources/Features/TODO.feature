Feature: Manage the TODO list

  Background: Navigate to TODO application page
    Given I am navigated to  TODO application page
    When I add new task 'meeting'

  @add
  Scenario: Add new task in TODO list
     And New task is added to TODO list

  @validateActiveSection
  Scenario: Check the newly added task displayed under active section
     And I click on Active option
     Then Newly added task is displayed under active section

  @ValidateCompletedSection
    Scenario: Check the newly added task is not displayed in completed section
       When I click on Completed option
       Then Newly added task is not  under completed section

  @completeTheTask
    Scenario: Complete the task and validate active & completed section
      When I click on check box
      Then Task is displayed under completed
      When I click on Active option
      Then Task is not displayed under Active

  @clearTheTask
    Scenario: Clear the task
      When I click on checkbox and clear the task
      Then Task is not displayed in the list

  @addMultipleTask
    Scenario: Add multiple task
    When I add more than one <task>
      |meeting|
      |Write test case|
      |Regression     |
    Then All the task is displayed in the TODO list
