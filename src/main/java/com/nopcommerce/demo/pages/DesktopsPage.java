package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {

    private static final Logger log = Logger.getLogger(DesktopsPage.class);
    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement desktopText;

    @CacheLookup
    @FindBy(linkText = "Build your own computer")
    WebElement buildYourOwnComputer;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a")
    WebElement clickOnDesktopsLink;

    public void clickOnDesktopsLink(){
        clickOnElement(clickOnDesktopsLink);
        log.info("click on desktop link" + clickOnDesktopsLink);
    }

    public String getDeskTopsText() {
        log.info("Get desktops text" + desktopText.toString());
        return getTextFromElement(desktopText);
    }

    public void clickOnBuildYourOwnComputer() {
        clickOnElement(buildYourOwnComputer);
        log.info("click on build your own computer product" + buildYourOwnComputer.toString());
    }
}
