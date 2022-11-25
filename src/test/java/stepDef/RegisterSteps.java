package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.RegistrationPage;

import static pages.MyAccountPage.expectedSuccessRegistered;
import static pages.RegistrationPage.expectedNewsletter;
import static pages.RegistrationPage.expectedSpecialOffer;
import static pages.RegistrationPage.expectedGuideFillForm;

public class RegisterSteps {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    MyAccountPage myAccountPage = new MyAccountPage();

    @Given("User is on the Homepage of the application")
    public void userOnHomePage(){
        Assert.assertTrue(homePage.homePageDisplayed());
    }

    @And("User navigates to login page")
    public void navigateToLoginPage() throws InterruptedException {
        homePage.clickButtonSignIn();
    }

    @Then("Verify user on login page")
    public void verifyOnTheLoginPage(){
        Assert.assertTrue(loginPage.loginPageDisplayed());
    }

    @When("User fills Email {string} to create account")
    public void userFillsEmailCreate (String email){
        loginPage.inputEmailCreate(email);
        loginPage.submitEmailCreate();
    }

    @Then("Verify user on registration page")
    public void verifyOnTheRegisterPage(){
        Assert.assertTrue(registrationPage.registrationPageDisplayed());
    }

    @When("User fills registration details : {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void fillsRegistrationForm(String email, String firstName, String lastName, String password, String days, String months,String years) throws InterruptedException {
        registrationPage.fillRegistration(email,firstName,lastName,password,days,months,years);
        Assert.assertEquals(expectedNewsletter,registrationPage.verifyNewsLetter());
        Assert.assertEquals(expectedSpecialOffer,registrationPage.verifySpecialOffer());
        Assert.assertEquals(expectedGuideFillForm,registrationPage.verifyWarningFillForm());
        registrationPage.clickRegisterForm();

    }

    @Then("Verify user successfully registered")
    public void verifyUserRegistered(){
        myAccountPage.myAccountPageDisplayed();
        Assert.assertEquals(expectedSuccessRegistered,myAccountPage.verifySuccessRegisteredUser());

    }

}
