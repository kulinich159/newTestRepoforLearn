package libs1;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    private void preintErrorAndStopTest(Exception e) {

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
}
