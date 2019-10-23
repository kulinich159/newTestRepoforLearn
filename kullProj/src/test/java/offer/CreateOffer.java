package offer;

import org.junit.After;
import org.junit.Test;
import parentTest1.ParentTest1;

public class CreateOffer extends ParentTest1 {

    @Test
    public void createNewOfferWithValidData() {

        homePage1.goToOfferListPage();
        homePage1.deleteTestOfferIfThisOfferPresent();
        homePage1.clickOnCreateOfferButton();

        createOfferPage.openCreateOfferPage();
        createOfferPage.enterOffertTitleText("NEw Offer Title");
        createOfferPage.selectStatusFromDD("2");
        createOfferPage.clickOnButtonCreate();


    }

    @After
    public void deleteTestOffer() {
        homePage1.deleteTestOfferIfThisOfferPresent();
    }
}
