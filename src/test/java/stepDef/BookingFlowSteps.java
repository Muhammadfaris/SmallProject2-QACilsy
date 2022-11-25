package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;

import static pages.OrderPage.emailLogin;
import static pages.OrderPage.nameLogin;
import static pages.PayConfirmationPage.bankWire;
import static pages.PayConfirmationPage.cekPayment;

public class BookingFlowSteps {
    HomePage homePage = new HomePage();
    ResultSearchHotelPage resultSearchHotelPage = new ResultSearchHotelPage();
    OrderPage orderPage = new OrderPage();
    PayConfirmationPage payConfirmationPage = new PayConfirmationPage();
    SuccessPayPage successPayPage = new SuccessPayPage();
    public String initRoom;
    public String initPrice;
    public String orderPrice;
    public String orderRoom;

    @Given("User fills some data for searching hotel on Homepage")
    public void userFillDataSearchHotel() throws InterruptedException {
        Assert.assertTrue(homePage.homePageDisplayed());
        homePage
                .setHotelLocation()
                .setHotelName()
                .setCheckOutDate()
                .setCheckInDate()
                .clickSearchHotel();
    }
    @And("User navigate to the hotel result preference")
    public void userNavigateHotelResult() throws InterruptedException {
        Assert.assertTrue(resultSearchHotelPage.hotelResultDisplayed());
    }
    @When("User chooses the preferred hotel")
    public void userChooseHotel(){
        Assert.assertTrue(resultSearchHotelPage.roomAvaliable());
        initRoom = resultSearchHotelPage.getRoomName();
        initPrice = resultSearchHotelPage.getClearInitialPrice();
        resultSearchHotelPage.clickBookRoom();
        Assert.assertTrue(resultSearchHotelPage.successAddRoomToCart());
        resultSearchHotelPage.clickProceedToCheckout();
    }
    @Then("Verify user successfully proceed checkout with Bank Wire payment method")
    public void verfySuccessCheckoutHotelWithBank(){
        orderPage.verifyPageInfoRoomCheckout();
        orderRoom= orderPage.getOrderRoomName();
        orderPrice = orderPage.getClearOrderPrice();
        Assert.assertEquals(initPrice,orderPrice);
        Assert.assertEquals(initRoom,orderRoom);
        orderPage.clickProceedToGuestDetail();
        Assert.assertEquals(emailLogin,orderPage.verifyEmailOrder());
        Assert.assertEquals(nameLogin,orderPage.verifyNameOrder());
        orderPage.clickProceesToAuthDetail();
        orderPage.clickAuthCheck();
        orderPage.clickBankWireMethods();
        Assert.assertEquals(bankWire,payConfirmationPage.getTxtMethodPayment());
        payConfirmationPage.verifyPayWithBankWire();
        payConfirmationPage.clickConfirmOrder();
        successPayPage.successBookingPay();
        Assert.assertEquals(orderRoom,successPayPage.getAfterOrderProductName());
        Assert.assertEquals(orderPrice,successPayPage.clearAfterPrice());

        System.out.println("yeay berhasil bayar");
    }

    @Then("Verify user successfully proceed checkout with Check payment method")
    public void verifySuccessCheckoutHotelWithCheck(){
        orderPage.verifyPageInfoRoomCheckout();
        orderRoom= orderPage.getOrderRoomName();
        orderPrice = orderPage.getClearOrderPrice();
        Assert.assertEquals(initPrice,orderPrice);
        Assert.assertEquals(initRoom,orderRoom);
        orderPage.clickProceedToGuestDetail();
        Assert.assertEquals(emailLogin,orderPage.verifyEmailOrder());
        Assert.assertEquals(nameLogin,orderPage.verifyNameOrder());
        orderPage.clickProceesToAuthDetail();
        orderPage.clickAuthCheck();
        orderPage.clickCheckMethods();
        Assert.assertEquals(cekPayment,payConfirmationPage.getTxtMethodPayment());
        payConfirmationPage.verifyPayWithCheck();
        payConfirmationPage.clickConfirmOrder();
        successPayPage.successBookingPay();
        Assert.assertEquals(orderRoom,successPayPage.getAfterOrderProductName());
        Assert.assertEquals(orderPrice,successPayPage.clearAfterPrice());

        System.out.println("yeay berhasil bayar");
    }


}
