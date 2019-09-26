package pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ParentPages1 {

    WebDriver webDriver;

    public ParentPages1(WebDriver webDriver) { //ALt+Insert Constructor
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
}
