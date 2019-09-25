package pages1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 extends ParentPages1 {

    public LoginPage1(WebDriver webDriver) {
        super(webDriver);
    }


    public void openPage() {

        try {

            webDriver.get("https://stage-board.advendor.net/");
            System.out.println("Login page was opened");

        }catch (Exception e) {

            System.out.println("Can't open Login Page " + e);
            Assert.fail("Can't open Login Page " + e);

        }

    }

    public void enterTextInToInputLogin(String login) {

        try {

            webDriver.findElement(By.id("email")).clear();
            webDriver.findElement(By.id("email")).sendKeys(login);
            System.out.println(login + " was sated ");

        } catch (Exception e) {

            System.out.println("Can't work with element " + e);
            Assert.fail("Can't work with element " + e);
        }

    }

    public void enterTextInToInputPass(String pass) {

        try {

            webDriver.findElement(By.id("password")).clear();
            webDriver.findElement(By.id("password")).sendKeys(pass);
            System.out.println(pass + " was sated ");

        } catch (Exception e) {

            System.out.println("Can't work with element " + e);
            Assert.fail("Can't work with element " + e);
        }

    }

    public void clickOnSubmitButton(){

        try {

            webDriver.findElement(By.id("loginButton")).click();
            System.out.println("Submit Button was clicked");

        } catch (Exception e) {

            System.out.println("Can't work with element " + e);
            Assert.fail("Can't work with element " + e);
        }

    }

}
