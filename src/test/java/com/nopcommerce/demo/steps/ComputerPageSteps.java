package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * computerpage.feature
 * Inside computerpage.feature create following scenarios
 * 1. verifyUserShouldNavigateToComputerPageSuccessfully
 * Click on Computer tab
 * Verify "Computer" text
 * 2. verifyUserShouldNavigateToDesktopsPageSuccessfully
 * Click on Computer tab
 * Click on Desktops link
 * Verify "Desktops" text
 * 3. verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
 * Click on Computer tab
 * Click on Desktops link
 * Click on product name "Build your own computer"
 * Select processor "processor"
 * Select RAM "ram"
 * Select HDD "hdd"
 * Select OS "os"
 * Select Software "software"
 * Click on "ADD TO CART" Button
 * Verify message "The product has been added to your shopping cart"
 * DATA SET
 * | processor | ram | hdd | os | software |
 * | 2.2 GHz Intel Pentium Dual-Core E2200 | 2 GB | 320 GB | Vista Home [+$50.00] |
 * Microsoft Office [+$50.00] |
 * | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] |
 * Vista Premium [+$60.00] | Acrobat Reader [+$10.00] |
 * | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB | Vista
 * Home [+$50.00] | Total Commander [+$5.00] |
 */

public class ComputerPageSteps {
    @When("I click on computer tab")
    public void iClickOnComputerTab() {
        new HomePage().selectMenu("Computers");
    }

    @And("I should navigate to computer page successfully")
    public void iShouldNavigateToComputerPageSuccessfully() {
    }

    @Then("I should get computer text {string}")
    public void iShouldGetComputerText(String computerText) {
        Assert.assertEquals(new ComputerPage().getComputerText(), computerText, "Incorrect text");
    }

    @And("I click on desktop tab")
    public void iClickOnDesktopTab() {
        new HomePage().clickOnDesktop();
    }

    @And("I should navigate to desktop page successfully")
    public void iShouldNavigateToDesktopPageSuccessfully() {
    }

    @Then("I should get a desktop text {string}")
    public void iShouldGetADesktopText(String desktopText) {
        Assert.assertEquals(new DesktopsPage().getDesktopsText(), desktopText, "Incorrect text");
    }

    @And("I click on product name {string}")
    public void iClickOnProductName(String productName) {
        new DesktopsPage().clickBuildOnComputer();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRAM(ram);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("I select  OS {string}")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("I select  Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("I click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartLink();
    }

    @Then("I should get message {string}")
    public void iShouldGetMessage(String message) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getMessageText(), message, "Incorrect Message");
    }


}
