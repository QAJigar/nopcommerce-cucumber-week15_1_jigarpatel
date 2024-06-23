package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/child::ul[1]/li/a")
    List<WebElement> topMenuList;

    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computerTab;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logOutLink;

    public void clickOnComputerTab() {
        clickOnElement(computerTab);
        Reporter.log("Click on computer tab" + computerTab.toString());
        log.info("Click on computer tab" + computerTab.toString());
    }

    public String getLogOutText() {
        Reporter.log("Get logout text" + logOutLink.toString());
        log.info("Get logout text" + logOutLink.toString());
        return getTextFromElement(logOutLink);
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }
    public String getTexOnLoginLink(){
      return  getTextFromElement(loginLink);

    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on register link : " + registerLink.toString());
    }

    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuList) {
            if (menu.getText().contains(tab)) {
                clickOnElement(menu);
                break;
            }
        }
    }
}