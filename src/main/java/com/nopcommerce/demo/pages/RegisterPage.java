package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import net.bytebuddy.utility.RandomString;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.Random;
/*
    Register Text, male female radio, Firstname, lastname, Date of Birth drop down, email, Password, Confirm Password,
     Register Button, "First name is required.","Last name is required.", "Email is required.","Password is required.",
      "Password is required." error message,
"Your registration completed" message, "CONTINUE" button
Locators and it's actions
     */

public class RegisterPage extends Utility {

        private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameError;

    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameError;

    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailIdError;

    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordError;

    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmationPasswordError;

    @CacheLookup
    @FindBy(xpath = "//button[text()= 'Register']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement radioButton;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement enterFirstName;

    @CacheLookup
    @FindBy(name = "LastName")
    WebElement enterLastName;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDay;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement dateOfBirthMonth;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement dateOfBirthYear;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement enterEmailId;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement enterConfirmationPassword;

    @CacheLookup
    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement registerCompleteText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButton;

    public String verifyRegisterText() {
        String register = getTextFromElement(registerText);
        log.info("Getting text from : " + registerText.toString());
        return register;
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("click on register button : " + registerButton.toString());
    }

    public String verifyFirstNameIsRequired() {
        String fNameError = getTextFromElement(firstNameError);
        log.info("Getting error message from : " + firstNameError.toString());
        return fNameError;
    }

    public String verifyLastNameIsRequired() {
        String lNameError = getTextFromElement(lastNameError);
        log.info("Getting error message from : " + lastNameError.toString());
        return lNameError;
    }

    public String verifyEmailIdIsRequired() {
        String emailError = getTextFromElement(emailIdError);
        log.info("Getting error message from : " + emailIdError.toString());
        return emailError;
    }

    public String verifyPasswordIsRequired() {
        String pError = getTextFromElement(passwordError);
        log.info("Getting error message from : " + passwordError.toString());
        return pError;
    }

    public String verifyConfirmPasswordIsRequired() {
        String confirmPasswordError = getTextFromElement(confirmationPasswordError);
        log.info("Getting error message from : " + confirmationPasswordError.toString());
        return confirmPasswordError;
    }

    public void clickOnRadioButton() {
        clickOnElement(radioButton);
        log.info("click on radio button : " + radioButton.toString());
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(enterFirstName, firstName);
        log.info("Enter first name :" + firstName + " in first name field " + enterFirstName.toString());
    }

    public void enterLastName(String lastName) {
        sendTextToElement(enterLastName, lastName);
        log.info("Enter last name :" + lastName + " in last name field " + enterLastName.toString());

    }

    public void enterDayOfBirth(String day) {
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
        log.info("Enter day of birthdate :" + day + " in day field " + dateOfBirthDay.toString());
    }

    public void enterMonthOfBirth(String month) {
        selectByVisibleTextFromDropDown(dateOfBirthMonth, month);
        log.info("Enter month of birthdate :" + month + " in month field " + dateOfBirthMonth.toString());
    }

    public void enterYearOfBirth(String year) {
        selectByVisibleTextFromDropDown(dateOfBirthYear, year);
        log.info("Enter year of birthdate :" + year + " in year field " + dateOfBirthYear.toString());
    }

    public static String generatedEmail;

    public void enterEmail() {
        Random randomPartOfEmailGenerator = new Random(5000);
        int randomNumberInEmail = randomPartOfEmailGenerator.nextInt();
        //random string generator - to use in email
        RandomString randomString = new RandomString(5);
        String randomStringInEmailGenerator = randomString.nextString();
        generatedEmail = "michel" + randomNumberInEmail + randomStringInEmailGenerator + "mouse@gmail.com";
        sendTextToElement(enterEmailId, generatedEmail);
        log.info("Enter email :" + generatedEmail + " in email field " + enterEmailId.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(enterPassword, password);
        log.info("Enter password :" + password + " in password field " + enterPassword.toString());
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(enterConfirmationPassword, confirmPassword);
        log.info("Enter confirm password :" + confirmPassword + " in confirm password field " + enterConfirmationPassword.toString());
    }

    public String verifyRegistrationCompleteText() {
        String text = getTextFromElement(registerCompleteText);
        log.info("Getting registration complete text from : " + registerCompleteText.toString());
        return text;
    }

    public void clickOnContinue() {
        clickOnElement(continueButton);
        log.info("click on continue button : " + continueButton.toString());
    }


}
