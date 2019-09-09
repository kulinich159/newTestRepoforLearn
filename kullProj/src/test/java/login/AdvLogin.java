package login;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class AdvLogin {

    @Test

    public void validLogin() {

        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        webDriver.get("https://172.20.136.120/#/login");

        webDriver.findElement(By.id("email")).sendKeys("o.kulinich@codiv.io");
        webDriver.findElement(By.id("password")).sendKeys("D_orian1234");
        webDriver.findElement(By.id("loginButton")).click();

        Assert.assertTrue("Logo is not present",webDriver.findElement(By.xpath(".//*[@src='assets/img/logo2.png']")).isDisplayed());
        webDriver.quit();

    }
}


