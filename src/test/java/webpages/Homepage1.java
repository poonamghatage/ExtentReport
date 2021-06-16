package webpages;

import Reusablecomponent.ExtentTestManager;
import Reusablecomponent.Log;
import Reusablecomponent.SeleniumCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.ArrayList;

public class Homepage1 extends SeleniumCommon {

    public static void new_meeting(){
        SeleniumCommon.waitForSecond(5);

          driver.findElement(By.xpath("//span[@class=\"nU false\"]//*[contains(text(),'New meeting')]")).sendKeys(Keys.CONTROL + "n");
      try{
            SeleniumCommon.waitForSecond(5);
            for(String winHandle:driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
                SeleniumCommon.waitForSecond(5);

            }
            driver.get("https://meet.google.com/getalink?hs=202&authuser=0");
            SeleniumCommon.waitForSecond(5);

        }catch (Exception e)
        {}
       /* driver.findElement(By.xpath("//span[@class=\\\"nU false\\\"]//*[contains(text(),'New meeting')]")).click();
        ArrayList<String> allTabs = new ArrayList<>(driver.getWindowHandles());
        SeleniumCommon.waitForSecond(3);
        Log.info("Open link in new tab");
        ExtentTestManager.reporterLog("Link Opened in new tab");
        driver.switchTo().window(allTabs.get(1));
        String ActualTitle1 = driver.getTitle(); */


        ExtentTestManager.reporterLog("Clicked On New meeting ");
        driver.findElement(By.xpath("//*[contains(text(),'Send invitation')]")).click();
        ExtentTestManager.reporterLog("Clicked on Send invitation");
        driver.findElement(By.xpath("//*[contains(text(),'Share via email')]")).click();
        ExtentTestManager.reporterLog("Clicked on Share via email");
        SeleniumCommon.waitForSecond(5);


        for(String winHandle:driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        driver.findElement(By.xpath("//textarea[@name=\"to\"]")).sendKeys("poonamghatage8@gmail.com");
        SeleniumCommon.waitForSecond(15);
        driver.findElement(By.xpath("//div[@id=\":oy\"]")).click();
        SeleniumCommon.waitForSecond(10);


        ArrayList<String> allTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allTabs.get(0));
        //driver.navigate().back();

    }


    public static void draft_move_into_inbox() {
        SeleniumCommon.waitForSecond(5);
        driver.findElement(By.xpath("//a[@href=\"https://mail.google.com/mail/u/0/#drafts\"]")).click();
        SeleniumCommon.waitForSecond(5);
        driver.findElement(By.xpath("(//tr[@class=\"zA yO\"]//td[@class=\"oZ-x3 xY\"] //div[@class=\"oZ-jc T-Jo J-J5-Ji\"])[1]")).click();
        SeleniumCommon.waitForSecond(5);
        driver.findElement(By.xpath("//div[@aria-label=\"Move to Inbox\"]")).click();
        SeleniumCommon.waitForSecond(5);
        driver.findElement(By.xpath("//span[@class=\"nU n1\"] //*[contains(text(),'Inbox')]")).click();


    }


    public static void LogOut() {

        SeleniumCommon.findElement("xpath", "//img[@class=\"gb_Ca gbii\"]").click();
        Log.info("Clicking on User name for Log out");
        ExtentTestManager.reporterLog("clicked on Profile Icon");
        SeleniumCommon.waitForSecond(2);
        SeleniumCommon.findElement("xpath", "(//*[contains(text(),'Sign out')])[2]").click();
        ExtentTestManager.reporterLog("Clicked On Signout Option");
        Log.info("Clicked on logout button");
        SeleniumCommon.waitForSecond(2);
        SeleniumCommon.driver.quit();
        Log.info("browser is closed successfully");
        ExtentTestManager.reporterLog("Browser closed");
    }



}
