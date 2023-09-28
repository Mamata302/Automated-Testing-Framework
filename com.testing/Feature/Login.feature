#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Login
  
  Scenario: Verify User is able to login with valid credentials
    Given User Launch Chrome Browser
    When User opens url "https://www.saucedemo.com/"
    And User enter Username as "standard_user" and Password as "secret_sauce"
    And Click on Login
    Then Page url should be "https://www.saucedemo.com/inventory.html"
    And Close the Browser


