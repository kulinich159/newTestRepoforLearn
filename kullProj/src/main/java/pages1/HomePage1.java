package pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage1 extends ParentPages1{

    public HomePage1(WebDriver webDriver) {
        super(webDriver);
    }


    public boolean isLeftSideBarIsPresent() {

        try {
          return  webDriver.findElement(By.id("side-menu")).isDisplayed();

        }catch (Exception e) {
          return false;
        }


    }
}
