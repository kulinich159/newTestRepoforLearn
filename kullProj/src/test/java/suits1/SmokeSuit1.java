package suits1;

import login_1.TestAssured;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



@RunWith(Suite.class)
@Suite.SuiteClasses(

        {
               // LoginWithPageObject.class,
               // CreateOffer.class,
                TestAssured.class
        }
)

public class SmokeSuit1 {
}
