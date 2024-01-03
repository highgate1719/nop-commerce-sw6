package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * 1.loginpage.feature
 * Inside loginpage.feature create following scenarios
 * 1.userShouldNavigateToLoginPageSuccessFully.
 * Click on login link
 * verify that "Welcome, Please Sign In!" message display
 * 2. verifyTheErrorMessageWithInValidCredentials.
 * Click on login link
 *
 * Enter EmailId
 * Enter Password
 * Click on Login Button
 * Verify that the Error message
 * 3. verifyThatUserShouldLogInSuccessFullyWithValidCredentials.
 * Click on login link
 * Enter EmailId
 * Enter Password
 * Click on Login Button
 * Verify that LogOut link is display
 * 4. VerifyThatUserShouldLogOutSuccessFully
 * Click on login link
 * Enter EmailId
 * Enter Password
 * Click on Login Button
 * Click on LogOut Link
 * Verify that LogIn Link Display
 */



public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String exceptedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualMessage, exceptedMessage, "Login page not display");
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should get error message")
    public void iShouldGetErrorMessageForInvalidCredentials() {
        String exceptedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect";
        String actualMessage = new LoginPage().getErrorMessage();
        Assert.assertEquals(actualMessage, exceptedMessage, "Error message not displayed");
    }

    @Then("I should login successfully")
    public void iShouldLoginSuccessfully() {
    }

    @Then("I can see logout link")
    public void iCanSeeLogoutLink() {
        String exceptedMessage = "Log out";
        String actualMessage = new LoginPage().logOutLink();
        Assert.assertEquals(actualMessage, exceptedMessage, "Logout link is not displayed");
    }

    @And("I click on logout link")
    public void iClickOnLogoutLink() {
        new LoginPage().clickOnLogOutLink();
    }

    @Then("I should logout successfully")
    public void iShouldLogoutSuccessfully() {
    }

    @Then("I can see login link")
    public void iCanSeeLoginLink() {
        String exceptedMessage = "Log in";
        String actualMessage = new HomePage().getLoginLink();
        Assert.assertEquals(actualMessage, exceptedMessage, "Login link is not displayed");
    }

}
