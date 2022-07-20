Feature: Manage the TODO list

  @add
  Scenario: Add new task in TODO list
    Given User is on the TODO application page
    When User adds new task
    Then New task is added to TODO list