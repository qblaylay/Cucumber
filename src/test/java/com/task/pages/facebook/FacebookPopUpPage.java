package com.task.pages.facebook;

import com.task.utils.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookPopUpPage {

    private WebDriver driver;

    @FindBy(id = "email")
    private WebElement emailAddress;

    @FindBy(id = "content")
    private WebElement facebookPageHeader;

    @FindBy(id = "pass")
    private WebElement password;

    @FindBy(id = "loginbutton")
    private WebElement loginButton;

    @FindBy(css = "[name=\"__CONFIRM__\"]")
    private WebElement moveOnButton;

    public FacebookPopUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean checkHeaderText(String text) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(facebookPageHeader));
        if (facebookPageHeader.getText().contains(text))
            return true;
        return false;
    }

    public void enterEmailAddress(String email) {
        emailAddress.sendKeys(email);
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public boolean checkButtonIsDisplayed(String text) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(moveOnButton));
        return Helper.checkText(moveOnButton, text);
    }

    public void clickMoveOnButton() {
        moveOnButton.click();
    }
}
