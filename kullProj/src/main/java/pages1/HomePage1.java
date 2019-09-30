package pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage1 extends ParentPages1{

    public HomePage1(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "side-menu")
    private WebElement leftSideBarMenu;

    public boolean isLeftSideBarIsPresent() {

//        try {
//          return  leftSideBarMenu.isDisplayed();
//
//        } catch (Exception e) {
//          return false;
//        }

        return  actionsWithElements.isElementPresent(leftSideBarMenu);

    }


}
