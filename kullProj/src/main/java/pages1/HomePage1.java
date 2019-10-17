package pages1;

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


}
