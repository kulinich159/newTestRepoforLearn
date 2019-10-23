package parentTest1;

import libs.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages1.CreateOfferPage;
import pages1.HomePage1;
import pages1.LoginPage1;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest1 {

    WebDriver webDriver;
    protected static ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class);

    protected LoginPage1 loginPage1;
    protected HomePage1 homePage1;
    protected CreateOfferPage createOfferPage;
    String browser = System.getProperty("browser");

    @Before
    public void setUp(){

        initDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage1 = new LoginPage1(webDriver);
        homePage1 = new HomePage1(webDriver);
        createOfferPage = new CreateOfferPage(webDriver);
    }

    @After
    public void tearDown(){

        webDriver.quit();

    }

    protected void checkExpectedResult(String massage, boolean actualResult){

        Assert.assertEquals( massage,true,  actualResult);

    }

    private void initDriver () {

        if (browser == null || "chrome".equals(browser.toLowerCase())) {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        webDriver = new ChromeDriver();

        }
    }
}
