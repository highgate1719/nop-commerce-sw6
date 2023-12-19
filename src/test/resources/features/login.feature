@regression
Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  Background: User should click on login link on home page
    Given I am on homepage
    When I click on login link

  @sanity @smoke
  Scenario: User should navigate to login page successfully
    Then I should navigate to login page successfully

  @smoke
  Scenario: User should get error message with invalid credentials
    And I enter email "chint@gmail.com"
    And I enter password "abc123"
    And I click on login button
    Then I should get error message

  Scenario: User should log in successfully with valid credentials
    And I enter email "chintu@gmail.com"
    And I enter password "chintu500"
    And I click on login button
    Then I should login successfully
    Then I can see logout link

  Scenario: User should logout successfully
    And I enter email "chintu@gmail.com"
    And I enter password "chintu500"
    And I click on login button
    And I should login successfully
    And I click on logout link
    Then I should logout successfully
    Then I can see login link