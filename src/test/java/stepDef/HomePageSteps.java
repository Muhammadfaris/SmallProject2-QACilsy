package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @When("User click cart symbol")
    public void userClickCart(){
        homePage.clickBookingCart();
    }

    @Then("Verify user navigates to cart page")
    public void userOnCartPage(){
        Assert.assertTrue(homePage.bookinCartIsDisplayed());
    }

    @When("User click logo apps on the Homepage")
    public void userClickLogoApps() {
        homePage.clickLogoApps();
    }

    @When("User click Book Now on the Homepage in our room section")
    public void userClickRoomInHomePage(){
        homePage.clickBookSampleRoom();
    }

    @Then("User navigates to detail room page")
    public void userOnDetailRoom(){
        Assert.assertTrue(homePage.detailRoomDisplayed());
    }


    @When("User click hamburger navigation button")
    public void userClickHamburgerNavigationButton() {
        homePage.clickHumburgerNav();
    }

    @Then("User must see list menu")
    public void userMustSeeListMenu() throws InterruptedException {
        homePage.menuListDisplayed();
    }

    @When("User click close button")
    public void userClickCloseButton() {
        homePage.clickCloseHamburgerMenuList();
    }

    @When("User click Home on Nav Menu")
    public void userClickHomeOnNavMenu() {
        homePage.clickHomeOnNavList();
    }

    @When("User click Interior on Nav Menu")
    public void userClickInteriorOnNavMenu() {
        homePage.clickInteriorOnNavList();
    }

    @Then("User navigate to Interior section on Homepage")
    public void userNavigateToInteriorSectionOnHomepage() throws InterruptedException {
        Assert.assertTrue(homePage.onInteriorSection()); // hanya assert isDisplayed, kalau pake scroolto element gabisa jadinya
    }

    @When("User click Amenities on Nav Menu")
    public void userClickAmenitiesOnNavMenu() {
        homePage.clickAmenitiesOnNavList();
    }

    @Then("User navigate to Amenities section on Homepage")
    public void userNavigateToAmenitiesSectionOnHomepage() throws InterruptedException {
        Assert.assertTrue(homePage.onAmenitiesSection());
    }

    @When("User click Rooms on Nav Menu")
    public void userClickRoomsOnNavMenu() {
        homePage.clickRoomsOnNavList();
    }

    @Then("User navigate to Rooms section on Homepage")
    public void userNavigateToRoomsSectionOnHomepage() throws InterruptedException {
        Assert.assertTrue(homePage.onRoomSection());
    }

    @When("User click Testimonials on Nav Menu")
    public void userClickTestimonialsOnNavMenu() {
        homePage.clickTestimonialsOnNavList();
    }

    @Then("User navigate to Testimonials section on Homepage")
    public void userNavigateToTestimonialsSectionOnHomepage() throws InterruptedException {
        Assert.assertTrue(homePage.onTestimonialsSection());
    }

    @When("User click Legal Notice on Nav Menu")
    public void userClickLegalNoticeOnNavMenu() {
        homePage.clickLegalNoticeOnNavList();
    }

    @Then("User navigate to Legal Notice section on Homepage")
    public void userNavigateToLegalNoticeSectionOnHomepage() {
        Assert.assertTrue(homePage.onLegalPage());
    }

    @When("User click About Us on Nav Menu")
    public void userClickAboutUsOnNavMenu() {
        homePage.clickAboutUsOnNavList();
    }

    @Then("User navigate to About Us section on Homepage")
    public void userNavigateToAboutUsSectionOnHomepage() {
        Assert.assertTrue(homePage.onAboutUsPage());
    }

    @When("User click Contact on Nav Menu")
    public void userClickContactOnNavMenu() {
        homePage.clickContactOnNavList();
    }

    @Then("User navigate to Contact Notice section on Homepage")
    public void userNavigateToContactNoticeSectionOnHomepage() {
        Assert.assertTrue(homePage.onContactPage());
    }

    @When("User click next navigation slider on Interior section")
    public void userClickNextNavigationSliderOnInteriorSection() throws InterruptedException {
        homePage.clickNextOnInterior();
    }

    @Then("Verify user can see next picture")
    public void verifyUserCanSeeNextPicture() {
        Assert.assertTrue(homePage.dummyPicture01Displayed());
    }

    @When("User click search button on hotel search function")
    public void userClickSearchButtonOnHotelSearchFunction() {
        homePage.clickSearchHotel();
    }

    @Then("Verify user can't navigate to result search hotel")
    public void verifyUserCanTNavigateToResultSearchHotel() {
        Assert.assertTrue(homePage.homePageDisplayed());
    }

    @When("User fills correct hotel location only")
    public void userFillsCorrectHotelNameOnly() throws InterruptedException {
        homePage.setHotelLocation();
        homePage.clickSearchHotel();
    }

    @When("User fills hotel name only")
    public void userFillsHotelNameOnly() throws InterruptedException {
        homePage.setHotelName();
        homePage.clickSearchHotel();
    }

    @When("User fills check in date only")
    public void userFillsCheckInDateOnly() throws InterruptedException {
        homePage.setCheckInDate();
        homePage.clickSearchHotel();
    }

    @When("User fills check out date only")
    public void userFillsCheckOutDateOnly() throws InterruptedException {
        homePage.setCheckOutDate();
        homePage.clickSearchHotel();
    }

    @When("User fills wrong hotel location")
    public void userFillsWrongHotelName() throws InterruptedException {
        homePage
                .setWrongHotelLocation()
                .setHotelName()
                .setCheckOutDate()
                .setCheckInDate()
                .clickSearchHotel();
    }
}
