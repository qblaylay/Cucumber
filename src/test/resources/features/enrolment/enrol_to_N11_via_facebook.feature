Feature: Create a membership on N11 with Facebook
  As a User,

  I want to create a membership on website with Facebook account,

  so that the membership is created.

  Background: Go to the N11 Website Successfully
    Given I am on "http://www.n11.com" page
    Then I should display "alışverişin uğurlu adresi" on the home page

  Scenario: Enrol to the N11 via Facebook account
    When I click the Uye Ol button
    Then I should display "n11.com'a Üye Olun" on the enrolment page
    When I click the membership contract checkbox
    And  I click the Facebook Login button
    Then "Log in to use your Facebook" should be displayed on the Facebook pop up page
    When I enter the "cakalqb@hotmail.com" as email address
    And I enter the "123456987" as password
    And I click the Log In button
    Then "Tuz Buz" should be checked on the home page as an username
    Then I click the username
    And  I click the Uyelik Iptali Link
    And  I click the Uyeligimi Iptal Et button
    Then "Hesabınızın silinmesini onaylıyor musunuz?" warning message should be displayed
    When I click the confirm button
    Then "Üyeliğiniz silindi" message should be displayed
    Then Home Page button should be displayed
