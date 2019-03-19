package com.task.stepdefs;

import com.task.steps.serenity.N11Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;


public class Stepdefs {

    @Managed(driver = "chrome")
    public static WebDriver driver;

    @Steps
    N11Steps n11steps;


    @Given("^I am on \"([^\"]*)\" page$")
    public void i_am_on_page(String url) {
        n11steps = new N11Steps();
        n11steps.goToHomePage(url);

    }

    @Then("^I should display \"([^\"]*)\" on the home page")
    public void i_should_display_on_the_home_page(String header) {

        assertTrue(n11steps.checkHomePageHeaderText(header));
    }

    @When("^I click the Uye Ol button$")
    public void i_click_the_Uye_Ol_button() {

        n11steps.clickSignUpButton();
    }

    @Then("^I should display \"([^\"]*)\" on the enrolment page$")
    public void i_should_display_on_the_enrolment_page(String header) {
        assertTrue(n11steps.checkEnrolPageHeaderText(header));
    }

    @When("^I click the membership contract checkbox$")
    public void i_click_the_membership_contract_checkbox() {
        n11steps.clickContractButton();
    }

    @When("^I click the Facebook Login button$")
    public void i_click_the_Facebook_Login_button() {
        n11steps.clickFacebookButton();
    }

    @Then("^\"([^\"]*)\" should be displayed on the Facebook pop up page$")
    public void should_be_displayed_on_the_Facebook_pop_up_page(String header) {
        assertTrue(n11steps.checkFacebookPopUpPageHeaderText(header));
    }

    @When("^I enter the \"([^\"]*)\" as email address$")
    public void i_enter_the_as_email_address(String email) {
        n11steps.enterEmailAddress(email);
    }

    @When("^I enter the \"([^\"]*)\" as password$")
    public void i_enter_the_as_password(String password) {
        n11steps.enterPassword(password);
    }

    @When("^I click the Log In button$")
    public void i_click_the_Log_In_button() {
        n11steps.clickLoginButton();
    }

    @Then("^\"([^\"]*)\" should be checked on the Facebook pop up page$")
    public void should_be_checked_on_the_Facebook_pop_up_page(String arg1) {
        n11steps.checkButtonIsDisplayed(arg1);
    }

    @When("^that I enter the devam et button$")
    public void that_I_enter_the_devam_et_button() {
        n11steps.clickMoveOnButton();
    }

    @Then("^\"([^\"]*)\" should be checked on the home page as an username$")
    public void should_be_checked_on_the_home_page_as_a_username(String username) {
        assertTrue(n11steps.checkUserNameText(username));
    }

    @Then("^I click the username$")
    public void i_click_the_username() {
        n11steps.clickUserNameButton();
    }

    @Then("^I click the Uyelik Iptali Link$")
    public void i_click_the_Uyelik_Iptali_Link() {
        n11steps.clickCancelAccountLink();
    }

    @Then("^I click the Uyeligimi Iptal Et button$")
    public void i_click_the_Uyeligimi_Iptal_Et_button() {
        n11steps.clickCancelAccountButton();
    }

    @Then("^\"([^\"]*)\" warning message should be displayed$")
    public void warning_message_should_be_displayed(String warningMessageText) {
        assertTrue(n11steps.checkWarningMessageText(warningMessageText));
    }

    @When("^I click the confirm button$")
    public void i_click_the_confirm_button() {
        n11steps.clickConfirmButton();
    }

    @Then("^\"([^\"]*)\" message should be displayed$")
    public void message_should_be_displayed(String confirmationText) {
        assertTrue(n11steps.checkConfirmationMessageText(confirmationText));
    }

    @Then("^Home Page button should be displayed$")
    public void home_page_button_should_be_displayed() {
        assertTrue(n11steps.checkMainPageButtonIsDisplayed());
    }

}