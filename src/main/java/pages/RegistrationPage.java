package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.DriverUtils;
import utils.WebElementUtils;


public class RegistrationPage {

    // untuk jalanin register perlu di edit email nama dan expected baru

    public RegistrationPage(){
        PageFactory.initElements(DriverUtils.getDriver(),this); // this ini bisa di ganti dengan xxx.class
    }
    @FindBy(xpath = "//h1[.='Create an account']")
    WebElement txtCreateAccountPage;

    @FindBy(xpath ="//input[@id='id_gender1']")
    WebElement genderRadioButton;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement fieldFirstName;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement fieldLastName;

    @FindBy(xpath = "//input[@id='email']")
    WebElement fieldEmail;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement fieldPassword;

    @FindBy(xpath = "//select[@id='days']")
    WebElement dropDownDays;

    @FindBy(xpath = "//select[@id='months']")
    WebElement dropDownMonths;

    @FindBy(xpath = "//select[@id='years']")
    WebElement dropDownYears;

    @FindBy(xpath = "//button[@id='submitAccount']")
    WebElement btnRegister;

    @FindBy(xpath = "//label[.='Sign up for our newsletter!']")
    WebElement txtNewsletter;

    @FindBy(xpath = "//label[.='Receive special offers from our partners!']")
    WebElement txtSpecialOffer;

    @FindBy(xpath = "//span[.='*Required field']")
    WebElement txtGuideFillForm;


    public static String expectedEmail = "coba11@gmail.com";
    public static String expectedNewsletter = "Sign up for our newsletter!";
    public static String expectedSpecialOffer = "Receive special offers from our partners!";
    public static String expectedGuideFillForm = "*Required field";

    public boolean registrationPageDisplayed(){
        WebElementUtils.waitForVisibleElement(txtCreateAccountPage);
        return txtCreateAccountPage.isDisplayed();
    }

    public void fillRegistration (String email, String firstName, String lastName, String pswd, String days, String months, String years) throws InterruptedException {
        genderRadioButton.click();
        fieldFirstName.sendKeys(firstName);
        fieldLastName.sendKeys(lastName);
        fieldEmail.clear();
        fieldEmail.sendKeys(email);
        fieldPassword.sendKeys(pswd);
        selectDaysBirth(days);
        Thread.sleep(1000);
        selectMonthBirth(months);
        Thread.sleep(1000);
        selectYearBirth(years);
    }

    public void selectDaysBirth(String days){
        Select dropDay = new Select(dropDownDays);
        dropDay.selectByValue(days);
    }

    public void selectMonthBirth(String month){
        Select dropMonth = new Select(dropDownMonths);
        dropMonth.selectByValue(month);
    }

    public void selectYearBirth(String years){
        Select dropYear = new Select(dropDownYears);
        dropYear.selectByValue(years);
    }

    public void clickRegisterForm (){
        btnRegister.click();
    }

    public String verifyNewsLetter(){
//        Assert.assertEquals(txtNewsletter.getText(),expectedNewsletter);
        return txtNewsletter.getText();
    }

    public String verifySpecialOffer(){
//        Assert.assertEquals(txtSpecialOffer.getText(),expectedSpecialOffer);
        return txtSpecialOffer.getText();
    }

    public String verifyWarningFillForm(){
//        Assert.assertEquals(txtGuideFillForm.getText(),expectedGuideFillForm);
        return txtGuideFillForm.getText();
    }


}
