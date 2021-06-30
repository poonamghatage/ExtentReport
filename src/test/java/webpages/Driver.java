package webpages;

import Reusablecomponent.ExtentTestManager;
import Reusablecomponent.Log;
import Reusablecomponent.SeleniumCommon;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

public class Driver extends SeleniumCommon {



    public static void uploaddocument() throws IOException {
        driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]")).click();
        Log.info("Clicked on Google apps");
        ExtentTestManager.reporterLog("Clicked on Google apps");
        SeleniumCommon.waitForSecond(3);

        //switchto frame by passing index
        SeleniumCommon.switchtoframebyindex(1);


        System.out.println("Switched to different frame");
        SeleniumCommon.waitForSecond(5);
        driver.findElement(By.xpath("//div[@class=\"CgwTDb\"] //span[@pid=\"49\"]")).click();
        ExtentTestManager.reporterLog("Clicked On Driver");

        //switchtodifferenttab by passing index
        SeleniumCommon.switchtodifferenttab(1);


        SeleniumCommon.waitForSecond(5);
        driver.findElement(By.xpath("//button[@guidedhelpid=\"new_menu_button\"]")).click();
        ExtentTestManager.reporterLog("Clicked On New");
        driver.findElement(By.xpath("//div[@aria-label=\"File upload\"]")).click();
        ExtentTestManager.reporterLog("Clicked On File upload");
        Runtime.getRuntime().exec("E:\\Myproject\\fileupload.exe");
        Log.info("Image uploaded");

    }

}
