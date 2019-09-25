package login_1;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Login {

    @Test
    public void validLogIn(){

        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        webDriver.get("https://stage-board.advendor.net/");
        System.out.println("Site was opened");
        webDriver.findElement(By.id("email")).sendKeys("tpanfilova@codiv.io");
        webDriver.findElement(By.id("password")).sendKeys("BqBZ7mth6Bor");
        webDriver.findElement(By.id("loginButton")).click();

        Assert.assertTrue("Left side bar was not found", webDriver.findElement(By.id("side-menu")).isDisplayed());
        System.out.println("Valid Login was successful");
        webDriver.quit();

    }

}
