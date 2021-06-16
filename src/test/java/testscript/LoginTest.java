package testscript;


import Reusablecomponent.SeleniumCommon;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webpages.Homepage;
import webpages.Homepage1;
import webpages.Loginpage;

import java.awt.*;
import java.io.IOException;

@Test
public class LoginTest {



    @BeforeClass
    public void beforeClass() throws IOException {
        SeleniumCommon.launchBrowser();
        SeleniumCommon.openWebSite();

    }
    @Test(description = "verified valid user can able to login or not")
    public void Login_Testcase1() throws IOException {
       Loginpage.checktitle();
       Loginpage.login();
       SeleniumCommon.waitForSecond(5);
    }


}



