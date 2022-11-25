package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;
import utils.WebElementUtils;


public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(DriverUtils.getDriver(),this);
    }
    @FindBy(xpath = "//h1[.='Authentication']")
    WebElement txtAuthLoginPage;

    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailCreateAccount;

    @FindBy(xpath = "//span[contains(.,'Create an account')]")
    WebElement btnCreateAccount;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailLogin;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordLogin;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement btnSignIn;
    @FindBy(xpath = "//li[.='An email address required.']")
    WebElement errorMessageEmailRequired;

    @FindBy(xpath = "//li[.='Password is required.']")
    WebElement errorMessagePasswordRequired;

    @FindBy(xpath = "//li[.='Invalid password.']")
    WebElement errorMessageInvalidPassword;

    @FindBy(xpath = "//li[.='Authentication failed.']")
    WebElement errorMessageAuthFailed;

    public static String expectederrorMessageEmailRequired = "An email address required.";
    public static String expectederrorMessagePasswordRequired = "Password is required.";
    public static String expectederrorInvalidPassword = "Invalid password.";
    public static String expectederrorAuthFailed = "Authentication failed.";

    public boolean loginPageDisplayed(){
        WebElementUtils.waitForVisibleElement(txtAuthLoginPage);
        return txtAuthLoginPage.isDisplayed();
    }

    public void inputEmailCreate(String email){
        emailCreateAccount.sendKeys(email);
    }

    public void submitEmailCreate(){
        btnCreateAccount.click();
    }

    public void loginFunction(String email, String password){
        emailLogin.sendKeys(email);
        passwordLogin.sendKeys(password);
        btnSignIn.click();
    }

    public String getErrorEmailRequired(){
        return errorMessageEmailRequired.getText();
    }
    public String getErrorPasswordRequired(){
        return errorMessagePasswordRequired.getText();
    }
    public String getErrorAuthRequired(){
        return errorMessageAuthFailed.getText();
    }
    public String getErrorInvalidPassword(){
        return errorMessageInvalidPassword.getText();
    }




}
