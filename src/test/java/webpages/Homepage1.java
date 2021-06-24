package webpages;

import Reusablecomponent.ExtentTestManager;
import Reusablecomponent.Log;
import Reusablecomponent.SeleniumCommon;
import org.openqa.selenium.Alert;
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
           ArrayList<String> allTabs = new ArrayList<>(driver.getWindowHandles());
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
        driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]")).click();
        Log.info("Clicked on Google apps");
        SeleniumCommon.waitForSecond(10);
        driver.switchTo().frame(1);
        System.out.println("Switched to different frame");
        SeleniumCommon.waitForSecond(15);

        WebElement w1=driver.findElement(By.xpath("//*[contains(text(),\"Chat\")]"));
        SeleniumCommon.waitForWebElement(w1);
        SeleniumCommon.ClickOnWebElement(w1);
        SeleniumCommon.waitForSecond(30);

        for(String winHandle:driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        driver.findElement(By.xpath("//*[contains(text(),'Not now')]")).click();
        Log.info("Clicked on Not now");
        SeleniumCommon.waitForSecond(5);
        driver.findElement(By.xpath("//div[@aria-label=\"Start a chat\"]")).click();
        SeleniumCommon.waitForSecond(5);
        Log.info("Clicked on start a chat");
        driver.switchTo().frame("talk_flyout");
        Log.info("Switched to iframe");
        SeleniumCommon.waitForSecond(5);
        driver.findElement(By.xpath("//input[@class=\"whsOnd zHQkBf\"]")).sendKeys("poonamghatage21@gmail.com");
        SeleniumCommon.waitForSecond(10);
        Log.info("Sent Receiver emailId ");
        driver.findElement(By.xpath("//span[@class=\"njhDLd\"]")).click();
        Log.info("Opened in new tab");
        SeleniumCommon.waitForSecond(10);
        Log.info("Clicked on trunal.thakre@gmail.com from suggestion");
        Log.info("Current Title:"+driver.getTitle());
        Log.info("Current URL:"+driver.getCurrentUrl());

        String currenturl=driver.getCurrentUrl();
        SeleniumCommon.waitForSecond(5);
        Log.info("Opened new tab");
        driver.get(currenturl);
        SeleniumCommon.waitForSecond(15);
        driver.switchTo().frame("hostFrame1");
        Log.info("Switched to required frame ");
        SeleniumCommon.waitForSecond(5);
        driver.findElement(By.xpath("//div[@aria-label=\"Message poonamghatage21@gmail.com. History is on.\"]")).sendKeys("Hi,Good Evening");
        SeleniumCommon.waitForSecond(5);
        WebElement elem = driver.findElement(By.xpath("//div[contains(text(),\"Hi,Good Evening\")]"));
        elem.sendKeys(Keys.ENTER);
        Log.info("Entered message ");
        SeleniumCommon.waitForSecond(5);

        for(String winHandle:driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        driver.findElement(By.xpath("//button[contains(text(),\"No, thanks\")]")).click();
        Log.info("Clicked on No,thanks");
        SeleniumCommon.waitForSecond(5);
        Log.info("Presses enter key");

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
