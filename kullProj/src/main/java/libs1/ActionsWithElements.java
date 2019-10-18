package libs1;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsWithElements {

    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    WebDriverWait wait10, wait15;

    public ActionsWithElements(WebDriver webDriver) {

        this.webDriver = webDriver;
        wait10 = new WebDriverWait(webDriver, 10);
        wait15 = new WebDriverWait(webDriver, 15);
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

        logger.error("Can't work with element " + e );
        Assert.fail("Can't work with element " + e);
    }

    public void clickOnElement(WebElement element) {

        try {
            wait10.until(ExpectedConditions.elementToBeClickable(element));
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

    public boolean isElementPresent (By xpath) {
        try {
            return isElementPresent(webDriver.findElement(xpath));
        } catch (Exception e) {
            return false;
        }

    }

    public void  clickOnElement(By xpath){

            try{
             clickOnElement(webDriver.findElement(xpath));

            } catch (Exception e){
                preintErrorAndStopTest(e);

            }
    }

    public  void  setStatustoCheckBox(WebElement element, String neededState){
        if ("check".equals(neededState) || "uncheck".equals(neededState)){
            try{
                if (element.isSelected() && "check".equals(neededState)){
                    logger.info("Already check");
                }else if (!element.isSelected() && "check".equals(neededState)){
                    element.click();
                    logger.info("check box checked");
                }else if (element.isSelected() && "uncheck".equals(neededState)){
                    element.click();
                    logger.info("check box deselected");
                }else if (!element.isSelected() && "uncheck".equals(neededState)){
                    logger.info("checkbox is already unchecked");
                }

            }catch (Exception e){
                preintErrorAndStopTest(e);
            }
        }else {
            logger.error("State should be 'check'or 'uncheck'");
            Assert.fail("State should be 'check'or 'uncheck'");
        }

    }



}
