package suits1;

import login_1.LoginWithPageObject;
import offer.CreateOffer;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



@RunWith(Suite.class)
@Suite.SuiteClasses(

        {
                LoginWithPageObject.class,
                CreateOffer.class
        }
)

public class SmokeSuit {
}
