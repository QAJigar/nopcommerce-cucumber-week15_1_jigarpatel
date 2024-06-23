package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should see the {string} Message ondispleyd")
    public void iShouldSeeTheMessageOndispleyd(String expectedMessage) {
        Assert.assertEquals(new RegisterPage().getRegisterText(),expectedMessage,"Register Text Not not Displayed");
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("{string} errorMessage should display FirstName mandatory field")
    public void errormessageShouldDisplayFirstNameMandatoryField(String firstNameErrMsg) {
        Assert.assertEquals(new RegisterPage().getFirstNameFieldErrorMessage(), firstNameErrMsg, "Error Message is not displayed");
    }

    @And("{string} errorMessage should display LastName mandatory field")
    public void errormessageShouldDisplayLastNameMandatoryField(String lastNameErrMsg) {
        Assert.assertEquals(new RegisterPage().getLastNameFieldErrorMessage(),lastNameErrMsg,"Error Message is not displayed");
    }

    @And("{string} errorMessage should display Email mandatory field")
    public void errormessageShouldDisplayEmailMandatoryField(String emailErrMsg) {
            Assert.assertEquals(new RegisterPage().getEmailFieldErrorMessage(), emailErrMsg, "Error Message is not displayed");
        }

    @And("{string} errorMessage should display Password mandatory field")
    public void errormessageShouldDisplayPasswordMandatoryField(String passwordErrMsg) {
        Assert.assertEquals(new RegisterPage().getPasswordFieldErrorMessage(), passwordErrMsg, "Error Message is not displayed");
    }

    @When("I select 'female' from gender option")
    public void iSelectFromGenderOption() {
        new RegisterPage().clickOnFemaleGenderRadioButton();
    }

    @And("I enter firstname {string}")
    public void iEnterFirstname(String firstNameTxt) {
        new RegisterPage().enterTextToFirstName(firstNameTxt);
    }

    @And("I enter lastname {string}")
    public void iEnterLastname(String lastNameTxt) {
        new RegisterPage().enterTextToLastName(lastNameTxt);
    }

    @And("I select day {string} from day dropdowm field")
    public void iSelectDayFromDayDropdowmField(String dayTxt) {
        new RegisterPage().selectDayFromDateOfBirthDropdown(dayTxt);
    }

    @And("I select month {string} from month dropdown field")
    public void iSelectMonthFromMonthDropdownField(String montTxt) {
        new RegisterPage().selectMonthFromDateOfBirthDropdown(montTxt);
    }

    @And("I select year {string} from year dropdown field")
    public void iSelectYearFromYearDropdownField(String yearTxt) {
        new RegisterPage().selectYearFromDateOfBirthDropdown(yearTxt);
    }

    @And("I enter email {string} to email field")
    public void iEnterEmailToEmailField(String emailTxt) {
        new RegisterPage().enterTextToEmail(emailTxt);
    }

    @And("I enter password {string} to password field")
    public void iEnterPasswordToPasswordField(String passwordTxt) {
        new RegisterPage().enterTextToPassword(passwordTxt);
    }

    @And("I enter confirm password {string} to confirm password field")
    public void iEnterConfirmPasswordToConfirmPasswordField(String confPassTxt) {
        new RegisterPage().enterTextToConfirmPassword(confPassTxt);
    }

    @Then("I see the message {string}")
    public void iSeeTheMessage(String expTxt) {
        Assert.assertEquals(new RegisterPage().getRegisterSuccessMessage(),expTxt,"Registration not successfully");
    }
}
