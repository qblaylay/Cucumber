package com.task.pages.myAccount;

import com.task.utils.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    private WebDriver driver;

    @FindBy(xpath = "//a[@href='https://www.n11.com/hesabim/uyelik-iptali']")
    private WebElement cancelAccountLink;

    @FindBy(id = "withdrawMembershipBtn")
    private WebElement cancelAccountButton;

    @FindBy(css = "div.popupContent > p")
    private WebElement cancelAccountWarningMessageText;

    @FindBy(id = "confirm")
    private WebElement confirmButton;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean checkWarningMessageText(String text) {
        return Helper.checkText(cancelAccountWarningMessageText, text);
    }

    public void clickCancelAccountLink() {
        cancelAccountLink.click();
    }

    public void clickCancelAccountButton() {
        cancelAccountButton.click();
    }

    public void clickConfirmButton() {
        confirmButton.click();
    }
}
