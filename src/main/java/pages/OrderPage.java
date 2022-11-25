package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;
import utils.WebElementUtils;

public class OrderPage {
    public OrderPage(){
        PageFactory.initElements(DriverUtils.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='order-detail-content']/p[1]")
    WebElement txtRoomInfoProceedToCheckout;

    @FindBy(xpath = "//div[@class='col-sm-12 proceed_btn_block']/a[contains(.,'Proceed')]")
    WebElement btnProceedRoomInfo;

    @FindBy(xpath = "(//div[@class='col-sm-9 col-xs-7 info-value'])[1]")
    WebElement nameGuestInfo;

    @FindBy(xpath = "(//div[@class='col-sm-9 col-xs-7 info-value'])[2]")
    WebElement emailGuestInfo;

    @FindBy(xpath = "//div[@id='collapse-guest-info']//a[contains(.,'Proceed')]")
    WebElement btnProceedGuestInfo;

    @FindBy(xpath = "//p[@class='cart_final_total_block']/span[@class='cart_total_values']")
    WebElement orderPrice;

    @FindBy(xpath = "//div[@class='room-xs-info']/p[@class='product-name']")
    WebElement orderRoomName;

    @FindBy(xpath = "//input[@id='cgv']")
    WebElement checkAuth;

    @FindBy(xpath = "//p[@class='payment_module']/a[@class='bankwire']")
    WebElement methodBankWirePayment;

    @FindBy(xpath = "//p[@class='payment_module']/a[@class='cheque']")
    WebElement methodCheckPayment;

    public static String emailLogin = "coba@gmail.com";
    public static String nameLogin = "Faris imaduddin";

    public void verifyPageInfoRoomCheckout(){
        txtRoomInfoProceedToCheckout.isDisplayed();
    }

    public String getClearOrderPrice(){
        String getPrice = orderPrice.getText().trim();
        return getPrice.replace("$","").replace(".00","").replace(",","");
    }

    public String getOrderRoomName(){
        return orderRoomName.getText().trim();
    }

    public void clickProceedToGuestDetail(){
        btnProceedRoomInfo.click();
    }

    public void clickProceesToAuthDetail(){
        btnProceedGuestInfo.click();
    }

    public String verifyEmailOrder (){
//        Assert.assertEquals(emailLogin,emailGuestInfo.getText().trim());
        return emailGuestInfo.getText().trim();
    }

    public String verifyNameOrder (){
//        Assert.assertEquals(nameLogin,nameGuestInfo.getText().trim());
        return nameGuestInfo.getText().trim();
    }

    public void clickAuthCheck(){
        checkAuth.click();
    }

    public void clickBankWireMethods(){
        WebElementUtils.waitForVisibleElement(methodBankWirePayment);
        methodBankWirePayment.click();
    }

    public void clickCheckMethods(){
        WebElementUtils.waitForVisibleElement(methodCheckPayment);
        methodCheckPayment.click();
    }


}
