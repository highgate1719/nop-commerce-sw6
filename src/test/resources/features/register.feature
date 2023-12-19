@regression
Feature: Register Feature
  In Order to perform successful registration
  As a User
  I have to enter mandatory details

  Background: User should click on register link on home page
    Given I am on homepage
    When I click on register link

  @sanity @smoke
  Scenario: User should navigate to register page successfully
    Then I should navigate to register page successfully

  @smoke
  Scenario: User should get error message to fill all the mandatory fields
    And I should navigate to register page successfully
    And I click on register button
    Then Verify the First name error message "First name is required."
    Then Verify the Last name error message "Last name is required."
    Then Verify the Email error message "Email is required."
    Then Verify the Password error message "Password is required."
    Then Verify the Confirm Password error message "Password is required."

  Scenario: User should create an account successfully
    And I select gender
    And I enter first name
    And I enter last name
    And I select day of birthdate
    And I select month of birthdate
    And I select year of birthdate
    And I enter email
    And I enter password
    And I enter confirm password
    And I click on register button
    Then I should register successfully
    Then I should get message "Your registration completed".