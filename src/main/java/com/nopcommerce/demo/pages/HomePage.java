package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()]")
    WebElement selectMenu;

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(@class, 'ico-register')]")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='Log in'])[1]")
    WebElement verifyLoginLink;

    @CacheLookup
    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement desktopLink;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public String getLoginLink() {
        return getTextFromElement(verifyLoginLink);
    }

    public void selectMenu(String menu) {
        mouseHoverToElementAndClick(selectMenu);
    }

    public void clickOnDesktop() {
        mouseHoverToElementAndClick(desktopLink);
    }



}
