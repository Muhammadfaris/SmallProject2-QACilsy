package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class SuccessPayPage {

    public SuccessPayPage(){
        PageFactory.initElements(DriverUtils.getDriver(),this);
    }

    @FindBy(xpath = "//p[.='Your order on Sekolah QA is complete.']")
    WebElement successPay;

    @FindBy(xpath = "//td[@class='cart_description']/p")
    WebElement afterOrderProductName;

    @FindBy(xpath = "//span[@class='product_original_price ']")
    WebElement afterOrderPriceProduct;

    public boolean successBookingPay(){
        return successPay.isDisplayed();
    }

    public String getAfterOrderProductName(){
        return afterOrderProductName.getText().trim();
    }

    public String clearAfterPrice(){
        String getPrice = afterOrderPriceProduct.getText().trim();
        return getPrice.replace("$","").replace(".00","").replace(",","");
    }

}
