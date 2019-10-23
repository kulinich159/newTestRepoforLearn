package login_1;

import libs.ExcelDriver;
import org.junit.Test;
import parentTest1.ParentTest1;

import java.io.IOException;
import java.util.Map;

public class LoginWithDataExel extends ParentTest1 {

    @Test
    public void validLogin() throws IOException {

        ExcelDriver excelDriver = new ExcelDriver();
        Map dataForValidLogin = excelDriver.getData(configProperties.DATA_FILE(),"validLogOn");

        loginPage1.openPage();
        loginPage1.enterTextInToInputLogin("tpanfilova@codiv.io");
        loginPage1.enterTextInToInputPass("BqBZ7mth6Bor");
        loginPage1.clickOnSubmitButton();

        checkExpectedResult("Left side bar was not found", homePage1.isLeftSideBarIsPresent());
    }
}
