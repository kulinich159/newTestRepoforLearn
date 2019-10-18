package pages1;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage1 extends ParentPages1{


    public HomePage1(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//*[@href='#/create/offer']")
    private WebElement createOfferButton;

    @FindBy(id = "side-menu")
    private WebElement leftSideBarMenu;

    @FindBy(xpath = ".//*[@id='title']")
    private WebElement inputTitle;

    @FindBy(xpath = ".//*[@class='fa fa-trash']")
    private WebElement deleteOfferButton;

    @FindBy(xpath = ".//*[@title='NEw Offer Title']")
    private WebElement testOfferTitle;

    @FindBy(xpath = ".//*[@class='swal2-confirm swal2-styled']")
    private WebElement confirmDeletingButton;

    public boolean isLeftSideBarIsPresent() {

//        try {
//          return  leftSideBarMenu.isDisplayed();
//
//        } catch (Exception e) {
//          return false;
//        }

        return  actionsWithElements.isElementPresent(leftSideBarMenu);

    }


    public void goToOfferListPage() {

        LoginPage1 loginPage1 = new LoginPage1(webDriver);
        loginPage1.loginWithInvalidCred("tpanfilova@codiv.io","BqBZ7mth6Bor");
        Assert.assertEquals("Left sideBar menu is not present" , true , isLeftSideBarIsPresent());
    }

    public void clickOnCreateOfferButton (){

        actionsWithElements.clickOnElement(createOfferButton);
    }


    public void deleteTestOfferIfThisOfferPresent() {


        if (isOfferPresent()){
            clickOnDeleteButton(deleteOfferButton);
            ClickOnDeleteConfimingButton(confirmDeletingButton);

        } else {
            logger.info("Now in list no one offer with test name" );
        }

    }

    private void ClickOnDeleteConfimingButton(WebElement element) {
        try {

            element.click();
            logger.info("Element was clicked");

        }catch(Exception e){

            actionsWithElements.preintErrorAndStopTest(e);
        }

    }

    private void clickOnDeleteButton(WebElement element) {

        try {

            element.click();
            logger.info("Element was clicked");

        }catch(Exception e){

            actionsWithElements.preintErrorAndStopTest(e);
        }


    }

    private boolean isOfferPresent() {
        try {
            return actionsWithElements.isElementPresent(testOfferTitle);
        } catch (Exception e) {
            return false;
        }
    }


}
