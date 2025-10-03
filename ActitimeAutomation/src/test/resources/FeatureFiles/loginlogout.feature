# Feature Name:
# User Story Name:
# Testcase Name:
# Description:

@Execute
Feature: Verify Login and Logout functionality
  Scenario: Verify Login Functionality
    Given I launch chrome Browser
    And I navigate application url
    And I find the login Page
    When I enter username in username text field
    And I enter password in password text field
    And I click on Login Button in login page
    Then I find the home Page
    And I minimize the flyout window
  Scenario: Verify Logout Functionality
    Given I find the home Page
    When I click on Logout Link
    Then I find the login Page
    And I close chrome browser

