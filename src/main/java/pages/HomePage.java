package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;
import utils.WebElementUtils;

import java.util.List;


public class HomePage {

    public WebDriver driver;

    //initialization
    public HomePage(){
        PageFactory.initElements(DriverUtils.getDriver(),this);
    }

    //Page Factory - Obj rep :
    @FindBy(xpath = "//p[@class='header-desc-welcome']")
    WebElement textWelcomeHomePage;
    @FindBy(xpath = "//li[@class='active']/a[contains(.,'Sign in')]")
    WebElement btnTextSignIn;
    @FindBy(xpath = "//h2[@class='page-heading']")
    WebElement bookingCartPage;
    @FindBy(xpath = "//div[@class='shopping_cart']/a[@href='http://qa.cilsy.id:8080/quick-order']")
    WebElement cartElement;
    @FindBy(xpath = "//input[@id='hotel_location']")
    WebElement btnHotelLocation;
    @FindBy(xpath = "(//div[@class='dropdown'])[1]/ul/li[1]")
    WebElement chooseHotelLocation;
    @FindBy(xpath = "//button[@id='id_hotel_button']")
    WebElement btnHotelName;
    @FindBy(xpath = "//ul[@class='dropdown-menu hotel_dropdown_ul']/li")
    WebElement chooseHotelName;
    @FindBy(xpath = "//input[@id='check_in_time']")
    WebElement btnCheckIn;
    @FindBy(xpath = "//input[@id='check_out_time']")
    WebElement btnCheckOut;
    @FindBy(xpath = "//a[@href='http://qa.cilsy.id:8080/the-hotel-prime/2-super-delux-rooms.html']")
    WebElement btnBookSampleRoom;
    @FindBy(xpath = "//div[@class='hotel_name_block']/span[1]")
    WebElement detailRoomPage;


    //date calendar
    @FindBy(xpath = "//div[@id='ui-datepicker-div']")
    WebElement containerDatePicker;
    @FindBy(xpath = "//span[@class='ui-datepicker-month']")
    WebElement monthPick;
    @FindBy(xpath = "//span[@class='ui-datepicker-year']")
    WebElement yearPick;
    @FindBy(xpath = "//a[.='Next']")
    WebElement nextCalendar;
    @FindBy(xpath = "//a[@class='ui-state-default']")
    List<WebElement> dateListPick;
    @FindBy(xpath = "//button[@id='search_room_submit']")
    WebElement btnSearchHotel;
    @FindBy(xpath = "//div[@id='header_logo']")
    WebElement appsLogoHomePage;
    @FindBy(xpath = "//button[@class='nav_toggle']")
    WebElement hamburgerNav;
    @FindBy(xpath = "//div[@id='menu_cont']//div[@class='col-xs-12 col-sm-12']")
    WebElement menuListApps;
    @FindBy(xpath = "//i[@class='icon-close']")
    WebElement closeButtonHamburgerMenuList;
    @FindBy(xpath = "//ul[@class='nav nav-pills nav-stacked wk-nav-style']/li/a[.='Home']")
    WebElement btnHomeNavList;
    @FindBy(xpath = "//ul[@class='nav nav-pills nav-stacked wk-nav-style']/li/a[.='Interior']")
    WebElement btnInteriorNavList;
    @FindBy(xpath = "//ul[@class='nav nav-pills nav-stacked wk-nav-style']/li/a[.='Amenities']")
    WebElement btnAmenitiesNavList;
    @FindBy(xpath = "//ul[@class='nav nav-pills nav-stacked wk-nav-style']/li/a[.='Rooms']")
    WebElement btnRoomsNavList;
    @FindBy(xpath = "//ul[@class='nav nav-pills nav-stacked wk-nav-style']/li/a[.='Testimonials']")
    WebElement btnTestimonialsNavList;
    @FindBy(xpath = "//ul[@class='nav nav-pills nav-stacked wk-nav-style']/li/a[.='Legal Notice']")
    WebElement btnLegalNoticeNavList;
    @FindBy(xpath = "//ul[@class='nav nav-pills nav-stacked wk-nav-style']/li/a[.='About us']")
    WebElement btnAbtUsNavList;
    @FindBy(xpath = "//ul[@class='nav nav-pills nav-stacked wk-nav-style']/li/a[.='Contact']")
    WebElement btnContactNavList;
    @FindBy(xpath = "//p[.='Interior']")
    WebElement sectionInterior;
    @FindBy(xpath = "//p[.='Amenities']")
    WebElement sectionAmenities;
    @FindBy(xpath = "//p[.='Our Rooms']")
    WebElement sectionOurRoom;
    @FindBy(xpath = "//p[.='What our Guest say?']")
    WebElement sectionTestimonial;
    @FindBy(xpath = "//div[@class='rte']/h2[.='Legal']")
    WebElement pageLegalNotice;
    @FindBy(xpath = "//div[@class='rte']/h1[.='About us']")
    WebElement pageAboutUs;
    @FindBy(xpath = "//p[.='Contact Us']")
    WebElement pageContactUs;
    @FindBy(xpath = "//div[@class='owl-nav']/div[@class='owl-next']//div[@class='nav-direction-secondary']")
    WebElement nextButtonInterior;

    @FindBy(xpath = "//div[@class='owl-carousel owl-theme owl-loaded owl-drag']//div[7]" +
            "/div[@class='interiorImgWrapper']/div[1]")
    WebElement dummy1NextPicture;


    // Properties
    public String hotelLocation="United States";
    public String wrongHotelLocation="@1abc";
    public String checkInDate = "20-October-2022";
    public String checkOutDate = "21-October-2022";

    //function
    public void clickNextOnInterior() throws InterruptedException {
        Thread.sleep(2000);
        nextButtonInterior.click();
        Thread.sleep(1000);
    }

    public boolean dummyPicture01Displayed(){
        return dummy1NextPicture.isDisplayed();
    }

    public boolean onInteriorSection() {
        return sectionInterior.isDisplayed();
    }

    public boolean onAmenitiesSection() {
        return sectionAmenities.isDisplayed();
    }

    public boolean onRoomSection() {
        return sectionOurRoom.isDisplayed();
    }

    public boolean onTestimonialsSection() {
        return sectionTestimonial.isDisplayed();
    }

    public boolean onLegalPage(){
        WebElementUtils.waitForVisibleElement(pageLegalNotice);
        return pageLegalNotice.isDisplayed();
    }

    public boolean onAboutUsPage(){
        WebElementUtils.waitForVisibleElement(pageAboutUs);
        return pageAboutUs.isDisplayed();
    }

    public boolean onContactPage(){
        WebElementUtils.waitForVisibleElement(pageContactUs);
        return pageContactUs.isDisplayed();
    }

    public boolean homePageDisplayed(){
        WebElementUtils.waitForVisibleElement(textWelcomeHomePage);
        return textWelcomeHomePage.isDisplayed();
    }

    public void clickButtonSignIn() throws InterruptedException {
        Thread.sleep(1000);
        btnTextSignIn.click();
    }

    public boolean bookinCartIsDisplayed(){
        WebElementUtils.waitForVisibleElement(bookingCartPage);
        return bookingCartPage.isDisplayed();
    }

    public void clickBookingCart(){
        cartElement.click();
    }

    public HomePage setHotelLocation(){
        btnHotelLocation.click();
        btnHotelLocation.sendKeys(hotelLocation);
        WebElementUtils.waitForVisibleElement(chooseHotelLocation);
        chooseHotelLocation.click();
        return this;
    }

    public HomePage setWrongHotelLocation(){
        btnHotelLocation.click();
        btnHotelLocation.sendKeys(wrongHotelLocation);
        return this;
    }

    public HomePage setHotelName() throws InterruptedException {
        Thread.sleep(1000);
        btnHotelName.click();
        WebElementUtils.waitForVisibleElement(chooseHotelName);
        chooseHotelName.click();
        return this;
    }

    public void clickDateUtil(String date) throws InterruptedException {
        String expectedDate = date;
        String edate = expectedDate.split("-")[0];
        String emonth = expectedDate.split("-")[1];
        String eyear = expectedDate.split("-")[2];

        String pmonth = monthPick.getText().trim(); //trim untuk memotong space depan dan belakang karakter
        String pyear = yearPick.getText().trim();

        while ((!pmonth.equals(emonth))||(!pyear.equals(eyear))){
            Thread.sleep(1000);
            nextCalendar.click();
            Thread.sleep(1000);
            pmonth = monthPick.getText().trim();
            pyear = yearPick.getText().trim();
        }
        for(WebElement e : dateListPick){
            if (e.getText().trim().equals(edate)){
                e.click();
                break;
            }
        }
    }

    public HomePage setCheckInDate() throws InterruptedException {
        btnCheckIn.click();
        WebElementUtils.waitForVisibleElement(containerDatePicker);
        clickDateUtil(checkInDate);
        return this;
    }

    public HomePage setCheckOutDate() throws InterruptedException {
        btnCheckOut.click();
        WebElementUtils.waitForVisibleElement(containerDatePicker);
        clickDateUtil(checkOutDate);
        return this;
    }

    public void clickSearchHotel(){
        btnSearchHotel.click();
    }

    public void clickBookSampleRoom(){
        btnBookSampleRoom.click();
    }

    public void clickHomeOnNavList(){
        btnHomeNavList.click();
    }
    public void clickInteriorOnNavList() {
        btnInteriorNavList.click();
    }
    public void clickAmenitiesOnNavList(){
        btnAmenitiesNavList.click();
    }
    public void clickRoomsOnNavList(){
        btnRoomsNavList.click();
    }
    public void clickTestimonialsOnNavList(){
        btnTestimonialsNavList.click();
    }
    public void clickLegalNoticeOnNavList(){
        btnLegalNoticeNavList.click();
    }
    public void clickAboutUsOnNavList(){
        btnAbtUsNavList.click();
    }
    public void clickContactOnNavList(){
        btnContactNavList.click();
    }
    public boolean detailRoomDisplayed(){
        driver.switchTo().frame(1);
        return detailRoomPage.isDisplayed();
    }

    public void clickLogoApps(){
        appsLogoHomePage.click();
    }

    public void clickHumburgerNav(){
        hamburgerNav.click();
    }

    public void menuListDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        menuListApps.isDisplayed();
    }

    public void clickCloseHamburgerMenuList(){
        closeButtonHamburgerMenuList.click();
    }

}
