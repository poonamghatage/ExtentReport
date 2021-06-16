package testscript;

import Reusablecomponent.SeleniumCommon;
import org.testng.annotations.Test;
import webpages.Homepage;

import java.awt.*;

public class Homepagetest {


    @Test(description = "Verify Correct User Logged In or Not")
    public void HomePage_Testcase1(){
        SeleniumCommon.waitForSecond(5);
        Homepage.verifyUser();
    }

    @Test(description = "Verified user can abe to search email ID")

    public void
    HomePage_Testcase2() throws AWTException {
        Homepage.searchByID();
    }

    @Test(description = "verified user can able to open searched emailId")
    public void Homepage_Testcase3() throws AWTException {
        Homepage.checkMail();
    }


   @Test(description = "verified icon is displayed or not")
    public void Homepage_Testcase4() throws AWTException {
    Homepage.verifyicon();
    }

    @Test(description = "verified tooltip is displayed as per expectation or not")
    public void Homepage_Testcase5() throws AWTException {
        Homepage.veriftooltip();
    }

    @Test(description = "verified dropdown")
    public void Homepage_Testcase6() throws AWTException {
   Homepage.verifydropdown();
    }




}


