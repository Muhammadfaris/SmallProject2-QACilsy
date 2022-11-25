package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;
import utils.WebElementUtils;

public class ResultSearchHotelPage {


    public ResultSearchHotelPage(){
        PageFactory.initElements(DriverUtils.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='filter_header']/p[.='Search Rooms']")
    WebElement hotelResultPage;

    @FindBy(xpath = "(//div[@class='col-sm-8'])[1]/p[1]")
    WebElement hotelFirstList;

    @FindBy(xpath = "//div[@id='category_data_cont']/div[1]//span[.='Book Now']")
    WebElement btnBookList;

    @FindBy(xpath = "//h2[contains(.,'Room successfully added to your cart')]")
    WebElement successAddToCart;

    @FindBy(xpath = "//span[contains(.,'Proceed to checkout')]")
    WebElement btnProceedToCheckout;

    @FindBy(xpath = "(//span[@class='pull-left rm_price_val '])[1]")
    WebElement initialPrice;


    //func
    public boolean hotelResultDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        return hotelResultPage.isDisplayed();
    }

    public boolean roomAvaliable(){
        return hotelFirstList.isDisplayed();
    }

    public String getRoomName(){
        return hotelFirstList.getText().trim();
    }

    public void clickBookRoom(){
        btnBookList.click();
    }

    public boolean successAddRoomToCart(){
        WebElementUtils.waitForVisibleElement(successAddToCart);
        return successAddToCart.isDisplayed();
    }

    public void clickProceedToCheckout(){
        WebElementUtils.waitForVisibleElement(btnProceedToCheckout);
        btnProceedToCheckout.click();
    }

    public String getClearInitialPrice(){
        String getPrice = initialPrice.getText().trim();
        return getPrice.replace("$","").replace(".00","").replace(",","");
    }



}
