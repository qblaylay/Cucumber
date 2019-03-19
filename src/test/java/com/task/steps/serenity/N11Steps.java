package com.task.steps.serenity;

import com.task.pages.enrol.EnrolPage;
import com.task.pages.facebook.FacebookPopUpPage;
import com.task.pages.home.HomePage;
import com.task.pages.myAccount.MyAccountPage;
import com.task.stepdefs.Stepdefs;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class N11Steps {

    private WebDriver driver;
    private String mainWindow;
    private HomePage homePage;
    private FacebookPopUpPage facebookPopUpPage;
    private MyAccountPage myAccountPage;
    private EnrolPage enrolPage;

    public N11Steps() {
        driver = Stepdefs.driver;
        homePage = new HomePage(driver);
        facebookPopUpPage = new FacebookPopUpPage(driver);
        myAccountPage = new MyAccountPage(driver);
        enrolPage = new EnrolPage(driver);
    }

    @Step
    public void goToHomePage(String url) {
        homePage.goToHomePage(url);
    }

    @Step
    public boolean checkHomePageHeaderText(String header) {

        return homePage.checkHeaderText(header);
    }

    @Step
    public void clickSignUpButton() {
        homePage.clickSignUpButton();
    }

    @Step
    public boolean checkUserNameText(String username) {
        return homePage.checkUserNameText(username);
    }

    @Step
    public void clickUserNameButton() {
        homePage.clickUserNameButton();
    }

    @Step
    public boolean checkConfirmationMessageText(String confirmationText) {
        return homePage.checkConfirmationMessageText(confirmationText);
    }

    @Step
    public boolean checkMainPageButtonIsDisplayed() {
        return homePage.checkMainPageButtonIsDisplayed();
    }

    @Step
    public boolean checkEnrolPageHeaderText(String text) {
        return enrolPage.checkHeaderText(text);
    }

    @Step
    public void clickFacebookButton() {
        enrolPage.clickFacebookButton();
    }

    @Step
    public void clickContractButton() {
        enrolPage.clickContractButton();
    }

    @Step
    public boolean checkFacebookPopUpPageHeaderText(String text) {
        setCurrentWindows();
        return facebookPopUpPage.checkHeaderText(text);
    }

    @Step
    public void enterEmailAddress(String email) {
        facebookPopUpPage.enterEmailAddress(email);
    }

    @Step

    public void enterPassword(String pass) {
        facebookPopUpPage.enterPassword(pass);
    }

    @Step
    public void clickLoginButton() {
        facebookPopUpPage.clickLoginButton();
        driver.switchTo().window(mainWindow);
    }

    @Step
    public boolean checkButtonIsDisplayed(String text) {
        return facebookPopUpPage.checkButtonIsDisplayed(text);
    }

    @Step
    public void clickMoveOnButton() {
        facebookPopUpPage.clickMoveOnButton();
    }

    @Step
    public boolean checkWarningMessageText(String text) {
        setCurrentWindows();
        return myAccountPage.checkWarningMessageText(text);
    }

    @Step
    public void clickCancelAccountLink() {
        myAccountPage.clickCancelAccountLink();
    }

    @Step
    public void clickCancelAccountButton() {
        myAccountPage.clickCancelAccountButton();
    }

    @Step
    public void clickConfirmButton() {
        setCurrentWindows();
        myAccountPage.clickConfirmButton();
        driver.switchTo().window(mainWindow);
    }

    public void setCurrentWindows() {
        this.mainWindow = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()) {
            String popUp = iterator.next();
            driver.switchTo().window(popUp);
        }
    }
}