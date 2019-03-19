package com.task.pages.home;

import com.task.utils.Helper;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageObject {

    private WebDriver driver;

    @FindBy(css = "span.hLogoT")
    private WebElement homePageHeader;

    @FindBy(css = "a.btnSignUp")
    private WebElement signUpButton;

    @FindBy(css = "a.menuLink.user")
    private WebElement loginUserName;

    @FindBy(css = "div.formContainer.fieldsetContainer > h3")
    private WebElement confirmationMessage;

    @FindBy(css = "a.button.medium.black")
    private WebElement mainPageButton;

    public HomePage(WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public void goToHomePage(String url) {
        driver.get(url);
    }

    public boolean checkHeaderText(String checkText) {
        return Helper.checkText(homePageHeader, checkText);
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public boolean checkUserNameText(String checkText) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(loginUserName));
        return Helper.checkText(loginUserName, checkText);
    }

    public void clickUserNameButton() {
        loginUserName.click();
    }

    public boolean checkConfirmationMessageText(String checkText) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(confirmationMessage));
        if (confirmationMessage.getText().contains(checkText))
            return true;
        return false;

    }

    public boolean checkMainPageButtonIsDisplayed() {
        if (mainPageButton.isDisplayed())
            return true;
        else
            return false;

    }
}
