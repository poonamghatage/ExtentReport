package webpages;

import Reusablecomponent.ExtentTestManager;
import Reusablecomponent.Log;
import Reusablecomponent.SeleniumCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

    public static void chat(){
        SeleniumCommon.waitForSecond(10);
        driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]")).click();
        Log.info("Clicked on Google apps");
        SeleniumCommon.waitForSecond(5);
        //driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[9]/a/span")).sendKeys(Keys.CONTROL + "n");
        driver.findElement(By.xpath("//*[contains(text(),\"Chat\")]")).sendKeys(Keys.CONTROL + "n");
        Log.info("Chat Window opened in new tab");

        ArrayList<String> allTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allTabs.get(1));


    }


    public static  void draft_move_into_inbox() {
        ExtentTestManager.reporterLog("Invalid Test case");
         /*
        SeleniumCommon.waitForSecond(10);
        driver.findElement(By.xpath("//a[@href=\"https://mail.google.com/mail/u/0/#drafts\"]")).click();
        SeleniumCommon.waitForSecond(5);
        Log.info("Clicked on Drafts");
        SeleniumCommon.waitForSecond(30);


        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//img[@class=\"gb_Ca gbii\"]")));
        a.contextClick().build().perform();

      WebElement element= driver.findElement(By.xpath("//tr[@class ='zA yO'] // div[@class=\"oZ-jc T-Jo J-J5-Ji \"] //div"));
        SeleniumCommon.waitForSecond(5);
        Log.info("Return:" +element.isDisplayed());*/
        /*SeleniumCommon.IsElementVisible(element);
        Log.info("Element is visible");*/


        /*SeleniumCommon.waitForSecond(5);
        int timeout = 50;
        WebDriverWait t = new WebDriverWait(driver, timeout);
        t.until(ExpectedConditions.visibilityOf(element));
        Log.info("Elment is visible");
        t.until(ExpectedConditions.elementToBeClickable(element));
        Log.info("Element is clickable");
        element.click();
        SeleniumCommon.waitForSecond(5);
        Log.info("Email Selected");*/
        /*driver.findElement(By.xpath("//div[@aria-label=\"Move to Inbox\"]")).click();
        SeleniumCommon.waitForSecond(5);
        driver.findElement(By.xpath("//span[@class=\"nU n1\"] //*[contains(text(),'Inbox')]")).click();*/




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
