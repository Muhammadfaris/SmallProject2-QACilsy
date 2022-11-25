package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

import static pages.LoginPage.*;

public class LoginSteps {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();

    @Given("User on the login page")
    public void userOnLoginPage() throws InterruptedException {
        homePage.clickButtonSignIn();
        Assert.assertTrue(loginPage.loginPageDisplayed());
    }
    @When("User fills Email {string} and Password {string}")
    public void userFillsLoginCredentials (String email,String password){
        loginPage.loginFunction(email, password);
    }

    @Then("Verify user successfully login")
    public void verifyUserSuccessLogin(){
        myAccountPage.myAccountPageDisplayed();
    }

    @And("User navigate to Homepage")
    public void navigateToHomepage(){
        myAccountPage.backToHomePage();
    }

    @Then("Verify error message for invalid credentials {string}")
    public void verifyUserGetLoginErrorMessage(String status){
        if (status == expectederrorMessagePasswordRequired){
         Assert.assertEquals(expectederrorMessagePasswordRequired,loginPage.getErrorPasswordRequired());
        } else if (status == expectederrorMessageEmailRequired){
            Assert.assertEquals(expectederrorMessageEmailRequired,loginPage.getErrorEmailRequired());
        } else if (status == expectederrorAuthFailed){
            Assert.assertEquals(expectederrorAuthFailed,loginPage.getErrorAuthRequired());
        } else if (status == expectederrorInvalidPassword){
            Assert.assertEquals(expectederrorInvalidPassword,loginPage.getErrorInvalidPassword());
        }
    }
}
