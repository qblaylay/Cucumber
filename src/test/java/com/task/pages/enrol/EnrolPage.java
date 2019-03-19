package com.task.pages.enrol;

import com.task.stepdefs.Stepdefs;
import com.task.utils.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnrolPage {

    private WebDriver driver;

    @FindBy(css = "h1.hTitle")
    private WebElement enrolPageHeader;

    @FindBy(css = "div.facebook_large.medium.facebookBtn.btnSignUp")
    private WebElement facebookButton;

    @FindBy(id = "acceptContract")
    private WebElement acceptContract;


    public EnrolPage(WebDriver driver) {

        this.driver = Stepdefs.driver;
        PageFactory.initElements(driver, this);
    }

    public boolean checkHeaderText(String text) {
        return Helper.checkText(enrolPageHeader, text);

    }

    public void clickFacebookButton() {
        facebookButton.click();
    }

    public void clickContractButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(acceptContract).click().perform();
    }


}
