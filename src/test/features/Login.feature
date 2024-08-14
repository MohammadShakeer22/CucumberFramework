@Regression
Feature: Login Action

  Description: This feature will test a LogIn and LogOut functionality
  Background:
    Given User is on Home Page

  #Simple Scenario example
  @Scenario
  Scenario: Successful Login with Valid Credentials
    When User enters "standard_user" and "secret_sauce"
    Then Message displayed Login Successfully

  #Scenario Outline example
  @ScenarioOutline
  Scenario Outline: Successful Login with Valid Credentials using examples
    When User enters username <Username> and password <Password>
    Then Message displayed Login Successfully

    Examples:
    |Username     |Password     |
    |standard_user|secret_sauce |
    |problem_user |secret_sauce |

     #Scenario Datatable example
  @DataTable
  Scenario: Successful Login with Valid Credentials using data tables
    When User enters username and password
      |username     |password     |
      |standard_user|secret_sauce |
    Then Message displayed Login Successfully


