package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
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


    @Then("I should see the error Message {string}")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals(new LoginPage().getErrorMessage(),errorMessage,"Error Message Not Displayed");
    }

    @Then("I should see the Welcom Message {string}")
    public void iShouldSeeTheWelcomMessage(String welcomMessage) {
        Assert.assertEquals(new LoginPage().getWelcomeText(), welcomMessage,"Welcom Message Not Displayed");
    }


    @Then("I should see the error Message <ErrorMessage>")
    public void iShouldSeeTheErrorMessageErrorMessage(String expErrorMessage) {
        Assert.assertEquals(new LoginPage().getErrorMessage(),expErrorMessage,"Error Message Not Displayed");
    }

    @Then("I should see the logOut link is display")
    public void iShouldSeeTheLogOutLinkIsDisplay() {

    }

    @And("I click on logout link")
    public void iClickOnLogoutLink() {
        new LoginPage().clickOnLogOutLink();

    }

    @Then("I should see the LogIn Link Display")
    public void iShouldSeeTheLogInLinkDisplay(String loginLink) {
        Assert.assertEquals(new HomePage().getTexOnLoginLink(),loginLink,"Log in link not displayed");

    }
}
