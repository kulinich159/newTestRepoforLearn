package libs1;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ActionsWithElements {

    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());

    public ActionsWithElements(WebDriver webDriver) {

        this.webDriver = webDriver;

    }

    public void enterInToElement(WebElement element,String text) {

        try {
            element.clear();
            element.sendKeys(text);
            logger.info(text + " was input into element ");

        }catch (Exception e){
            preintErrorAndStopTest(e);
        }
    }

    public void preintErrorAndStopTest(Exception e) {

        logger.error("Can't work with element" + e );
        Assert.fail("Can't work with element" + e);
    }

    public void clickOnElement(WebElement element) {

        try {

            element.click();
            logger.info("Element was clicked");

        }catch(Exception e){

            preintErrorAndStopTest(e);
        }
    }

    public boolean isElementPresent(WebElement webElement){
        try{
            boolean isDisplayed = webElement.isDisplayed();
            logger.info("Element is displayed -> " + isDisplayed);
            return isDisplayed;

        }catch (Exception e) {
            logger.info("Element id displayed -> false");
            return  false;
        }

    }

    public void selectValueInDropDown(WebElement element, String value){ //выбор значения не совсем как в UI но для скорости обработки используем его

        try {
            Select select = new Select(element);
            select.selectByValue(value);
            logger.info(value + " was selected in DD");

        } catch (Exception e) {
            preintErrorAndStopTest(e);
        }


    }
}
