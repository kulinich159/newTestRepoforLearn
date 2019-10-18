package login;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Login {

    @Test

    public void validLogin() {



//        1. Явное ожидание
//        2. implicitlyWait(5, TimeUnit.SECONDS);
//        3. Thread.sleep(1000);

        // .//*[@id='serchO']
        //  .//th[@name='headTeable']
        //  .//UL//LI[2]
        //  .//select//option[value='mercedes']
        //  .//*[@href='google.com']  //*[@id="side-menu"]/div/div[1]/img  assets/img/logo2.png
        //  .//input[@type='rafio' and @name='group1']
        //  .//input[@type='checkbox' and @value='a1']
        //  .//textarea[@name='textArea']
        //  .//*/b[text()='Just text'] - поиск по тектсу
        //  .//*/b[contains(text(),'Just')]
        //  .//*[contains(text(),'Sergei')]//..//td[2]

        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



        webDriver.get("http://v3.test.itpmgroup.com");
        System.out.println("Site was opened");


        webDriver.findElement(By.name("_username")).sendKeys("Student");

        webDriver.findElement(By.id("password")).sendKeys("909090");

        webDriver.findElement(By.tagName("button")).click();
        Assert.assertTrue("Avatar is not present",webDriver.findElement(By.xpath(".//*[@class='pull-left image']")).isDisplayed());

        webDriver.quit();
    }
}

