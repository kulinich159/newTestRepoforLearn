package pages1;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOfferPage extends ParentPages1 {

    @FindBy(id = "status")
    private WebElement statusInDD;


    public CreateOfferPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//*[@id='title']")
    private WebElement inputTitle;

    @FindBy(xpath = ".//button[@type='submit']")
    private WebElement createOfferButton;


    public void openCreateOfferPage() {

        try {

            webDriver.get("https://stage-board.advendor.net/#/create/offer");
            logger.info("Create Offer Page page was opened");

        }catch (Exception e) {

            logger.error("Can't open Create Offer Page " + e);
            Assert.fail("Can't open Create Offer Page " + e);

        }

    }

    public void enterOffertTitleText(String nEw_offer_titile) {

         actionsWithElements.enterInToElement(inputTitle , nEw_offer_titile);
    }


    public void clickOnButtonCreate() {

        actionsWithElements.clickOnElement(createOfferButton);
    }

    public void selectStatusFromDD(String status) {

        actionsWithElements.selectValueInDropDown(statusInDD , status);
    }
}
