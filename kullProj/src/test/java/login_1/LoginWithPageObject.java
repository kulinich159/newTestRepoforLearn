package login_1;

import org.junit.Test;
import parentTest1.ParentTest1;

public class LoginWithPageObject extends ParentTest1 {

    @Test
    public void validLogin(){

        loginPage1.openPage();
        loginPage1.enterTextInToInputLogin("tpanfilova@codiv.io");
        loginPage1.enterTextInToInputPass("BqBZ7mth6Bor");
        loginPage1.clickOnSubmitButton();

        checkExpectedResult("Left side bar was not found", homePage1.isLeftSideBarIsPresent());
    }

    @Test
    public void loginWithInvalidCredentials(){
        loginPage1.loginWithInvalidCred("asdasdasd","sssasdasd");
        checkExpectedResult("Left side bar menu should not be present", !homePage1.isLeftSideBarIsPresent());

    }


}
