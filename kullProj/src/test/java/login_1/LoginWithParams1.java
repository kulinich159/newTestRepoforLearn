package login_1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest1.ParentTest1;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LoginWithParams1 extends ParentTest1 {

    private String login ;
    private String pass ;

    @Parameterized.Parameters
    public  static Collection testData(){

        return Arrays.asList (new Object[][]{

                {"tpanfilova@codiv.io" , "BqBZ7mth6Bor"},
                {"asdasdas@asasda.ss" , "sfs11dfsd"},
                {"asdasdas@as1asda.ss" , "sfsdf11asdassd"},
                {"asdasdas@asasda.ss" , "sfsdf11sd"}
        });

    }

    public LoginWithParams1(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    @Test
    public void unvalidLofin() {

        loginPage1.openPage();
        loginPage1.enterTextInToInputLogin(login);
        loginPage1.enterTextInToInputPass(pass);
        loginPage1.clickOnSubmitButton();

        checkExpectedResult("Side Bar should be not present", !homePage1.isLeftSideBarIsPresent());


    }

}
