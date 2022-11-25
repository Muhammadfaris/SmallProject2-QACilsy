package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class PayConfirmationPage {
    public PayConfirmationPage(){
        PageFactory.initElements(DriverUtils.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='box cheque-box']/h3")
    WebElement txtMethodPayment;

    @FindBy(xpath = "//button[@class='btn pull-right button button-medium']")
    WebElement btnConfirmMyOrder;

    public static String bankWire = "BANK-WIRE PAYMENT";
    public static String cekPayment = "CHECK PAYMENT";


    public String getTxtMethodPayment(){
        return txtMethodPayment.getText().trim();
    }

    public void verifyPayWithBankWire(){
        txtMethodPayment.isDisplayed();
    }


    public void verifyPayWithCheck(){
        txtMethodPayment.isDisplayed();
    }

    public void clickConfirmOrder(){
        btnConfirmMyOrder.click();
    }


}
