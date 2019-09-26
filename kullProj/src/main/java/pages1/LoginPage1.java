package pages1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage1 extends ParentPages1 {

    public LoginPage1(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "email")
    private WebElement inputLogin;

    @FindBy(id = "password")
    private WebElement inputPass;

    @FindBy(id = "loginButton")
    private WebElement loginButtom;



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

            inputLogin.clear();
            inputLogin.sendKeys(login);
            System.out.println(login + " was sated ");

        } catch (Exception e) {

            System.out.println("Can't work with element " + e);
            Assert.fail("Can't work with element " + e);
        }

    }

    public void enterTextInToInputPass(String pass) {

        try {

            inputPass.clear();
            inputPass.sendKeys(pass);
            System.out.println(pass + " was sated ");

        } catch (Exception e) {

            System.out.println("Can't work with element " + e);
            Assert.fail("Can't work with element " + e);
        }

    }

    public void clickOnSubmitButton(){

        try {

            loginButtom.click();
            System.out.println("Submit Button was clicked");

        } catch (Exception e) {

            System.out.println("Can't work with element " + e);
            Assert.fail("Can't work with element " + e);
        }

    }

}
