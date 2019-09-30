package pages1;

import libs1.ActionsWithElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ParentPages1 {

    WebDriver webDriver;
    ActionsWithElements actionsWithElements;

    public ParentPages1(WebDriver webDriver) { //ALt+Insert Constructor
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        actionsWithElements = new ActionsWithElements(webDriver);
    }
}
