package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerPageSteps {
    @When("I click on computer tab")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputerTab();
    }

    @Then("I should see {string} text on Computer Page")
    public void iShouldSeeTextOnComputerPage(String computerText) {
        Assert.assertEquals(new ComputerPage().getComputerText(),computerText,"Computer text not match");
    }

    @And("I click on desktop link")
    public void iClickOnDesktopLink() {
        new ComputerPage().clickOnDesktopsLink();
    }

    @Then("I should see {string} text on Desktop Page")
    public void iShouldSeeTextOnDesktopPage(String desktopText) {
        Assert.assertEquals(new DesktopsPage().getDeskTopsText(),desktopText,"Desktop text not match");
    }

    @And("I click on desktops link")
    public void iClickOnDesktopsLink() {
        new DesktopsPage().clickOnDesktopsLink();
    }


    @And("I select processor {string}")
    public void iSelectProcessor(String processorValue) {
        new BuildYourOwnComputerPage().selectOptionFromProcessorDropDown(processorValue);
    }

    @And("I select RAM {string}")
    public void iSelectRAM(String ramValue) {
        new BuildYourOwnComputerPage().selectOptionFromRamDropDown(ramValue);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String optionsHDD) {
        new BuildYourOwnComputerPage().selectHddOption(optionsHDD);
    }

    @And("I select OS {string}")
    public void iSelectOS(String optionsOS) {
        new BuildYourOwnComputerPage().selectOsOption(optionsOS);
    }

    @And("I select Software {string}")
    public void iSelectSoftware(String optionsSoftware) {
        new BuildYourOwnComputerPage().selectSoftwareOption(optionsSoftware);
    }

    @And("I click on product name build your own computer")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new DesktopsPage().clickOnBuildYourOwnComputer();
    }

    @And("I click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("Verify message product added {string} should displayed")
    public void verifyMessageProductAddedShouldDisplayed(String message) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getNotificationMessage(),message,"Message not displayed");
    }
}
