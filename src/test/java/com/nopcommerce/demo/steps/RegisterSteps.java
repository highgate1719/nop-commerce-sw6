package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * 2. register.feature
 * Insideregister.feature create following scenarios
 * 1. verifyUserShouldNavigateToRegisterPageSuccessfully
 * Click on Register Link
 * Verify "Register" text
 * 2.
 * verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
 * Click on Register Link
 * Click on "REGISTER" button
 * Verify the error message "First name is required."
 * Verify the error message "Last name is required."
 * Verify the error message "Email is required."
 * Verify the error message "Password is required."
 * Verify the error message "Password is required."
 *
 * 2. verifyThatUserShouldCreateAccountSuccessfully
 * Click on Register Link
 * Select gender "Female"
 * Enter firstname
 * Enter lastname
 * Select day
 * Select month
 *
 * Select year
 * Enter email
 * Enter password
 * Enter Confirm Password
 * Click on "REGISTER" button
 * Verify message "Your registration completed"
 */


public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should navigate to register page successfully")
    public void iShouldNavigateToRegisterPageSuccessfully() {
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("Verify the First name error message {string}")
    public void verifyTheFirstNameErrorMessage(String firstNameError) {
        Assert.assertEquals(new RegisterPage().verifyFirstNameIsRequired(), firstNameError, "Error message Invalid!");
    }

    @Then("Verify the Last name error message {string}")
    public void verifyTheLastNameErrorMessage(String lastNameError) {
        Assert.assertEquals(new RegisterPage().verifyLastNameIsRequired(), lastNameError, "Error message Invalid!");
    }

    @Then("Verify the Email error message {string}")
    public void verifyTheEmailErrorMessage(String emailError) {
        Assert.assertEquals(new RegisterPage().verifyEmailIdIsRequired(), emailError, "Error message Invalid!");
    }

    @Then("Verify the Password error message {string}")
    public void verifyThePasswordErrorMessage(String passwordError) {
        Assert.assertEquals(new RegisterPage().verifyPasswordIsRequired(), passwordError, "Error message Invalid!");
    }

    @Then("Verify the Confirm Password error message {string}")
    public void verifyTheConfirmPasswordErrorMessage(String confirmPasswordError) {
        Assert.assertEquals(new RegisterPage().verifyConfirmPasswordIsRequired(), confirmPasswordError, "Error message Invalid!");
    }

    @And("I select gender")
    public void iSelectGender() {
        new RegisterPage().clickOnRadioButton();
    }

    @And("I enter first name")
    public void iEnterFirstName() {
        new RegisterPage().enterFirstName("Michel");
    }

    @And("I enter last name")
    public void iEnterLastName() {
        new RegisterPage().enterLastName("jackson");
    }

    @And("I select day of birthdate")
    public void iSelectDayOfBirthdate() {
        new RegisterPage().enterDayOfBirth("5");
    }

    @And("I select month of birthdate")
    public void iSelectMonthOfBirthdate() {
        new RegisterPage().enterMonthOfBirth("May");
    }

    @And("I select year of birthdate")
    public void iSelectYearOfBirthdate() {
        new RegisterPage().enterYearOfBirth("1995");
    }

    @And("I enter email")
    public void iEnterEmail() {
        new RegisterPage().enterEmail();
    }

    @And("I enter password")
    public void iEnterPassword() {
        new RegisterPage().enterPassword("m123456");
    }

    @And("I enter confirm password")
    public void iEnterConfirmPassword() {
        new RegisterPage().enterConfirmPassword("m123456");
    }

    @Then("I should register successfully")
    public void iShouldRegisterSuccessfully() {
    }

    @Then("I should get message {string}.")
    public void iShouldGetMessage(String message) {
        Assert.assertEquals(new RegisterPage().verifyRegistrationCompleteText(), message, "Error message Invalid!");
    }



}
