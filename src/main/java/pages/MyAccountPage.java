package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class MyAccountPage{

    public MyAccountPage(){
        PageFactory.initElements(DriverUtils.getDriver(),this); // this ini bisa di ganti dengan xxx.class
    }

    @FindBy(xpath = "//h1[.='My account']")
    WebElement txtMyAccountPage;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    WebElement txtSuccessRegister;

    @FindBy(xpath = "//span[contains(.,'Home')]")
    WebElement btnBackToHome;


    public static String expectedSuccessRegistered = "Your account has been created.";

    public String verifySuccessRegisteredUser(){
        return txtSuccessRegister.getText();
    }

    public void myAccountPageDisplayed(){
        txtMyAccountPage.isDisplayed();
    }

    public void backToHomePage(){
        btnBackToHome.click();
    }

}
