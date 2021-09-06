package webpages;

import java.awt.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

//import Reusablecomponent.ExtentTestManager;
import Reusablecomponent.ExtentTestManager;
import Reusablecomponent.Log;
import Reusablecomponent.PropertiesReading;
import Reusablecomponent.SeleniumCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends SeleniumCommon {

    @FindBy(xpath = "//input[@id='identifierId']")
    public static WebElement email;
    @FindBy(xpath = "//input[@type='password']")
    public static WebElement passwd;
    @FindBy(xpath = "//div[text()='Use another account']")
    WebElement UseAnotherAccount;
    @FindBy(xpath = "//div[@class='VfPpkd-RLmnJb']")
    WebElement nextButton;
    @FindBy(xpath = "//img[@class='gb_uc']")
    WebElement gmailLogo;
    @FindBy(xpath = "//img[@class='gb_Da gbii']")
    WebElement userName;
    @FindBy(xpath = "//div[@class='gb_ob']")
    WebElement userEmail;



    public Loginpage() throws IOException  // Constructor to initialize Web elements using Page factory
    {

        driver = SeleniumCommon.getDriverInstance();
        Log.info("yes");
        ExtentTestManager.reporterLog("Chrome Invoked");
        PageFactory.initElements(driver, this);
        ExtentTestManager.reporterLog("URL Opened");
    }


    public static void checktitle(){
        CompareAnyTitle("Gmail");

        ExtentTestManager.reporterLog("Title Checked");
    }
    public static void login() throws AWTException, IOException {
        String url = PropertiesReading.getProperty("Config", "baseURL");
        String username;
        String password;
        username = PropertiesReading.getProperty("Config", "qa_username");
        password = PropertiesReading.getProperty("Config", "qa_password");
        Log.info("Username: " + username);
        Log.info("Password: " + password);
        SeleniumCommon.findElement("xpath", "//input[@id='identifierId']").sendKeys(username);
        SeleniumCommon.waitForSecond(5);
        ExtentTestManager.reporterLog("Email-ID Sent :" +username );
        SeleniumCommon.findElement("xpath", "//*[@id=\"identifierNext\"]").click();
        Log.info("Clicking on next Button");
        ExtentTestManager.reporterLog("Clicked On Next");

        SeleniumCommon.waitForSecond(5);
        SeleniumCommon.findElement("xpath", "//input[@type='password']").sendKeys(password);
        ExtentTestManager.reporterLog("Password Sent :" +password);
        Log.info("Entered username and password");
        SeleniumCommon.findElement("xpath", "//*[@id=\"passwordNext\"]").click();
        Log.info("Clicking on next Button");
        ExtentTestManager.reporterLog("Clicked on Next Button");

       /* try {

        WebDriverWait wait=new WebDriverWait(driver,30);
        if(wait.until(ExpectedConditions.alertIsPresent())==null)
        {
            System.out.println("Alert Not Present");
            Log.info("Alert Not Present");

            }
        else {
            driver.switchTo().alert().accept();
            driver.switchTo().alert().dismiss();
        }
        }catch (NoAlertPresentException a){

        a.printStackTrace();
        }/


      /*  SeleniumCommon.waitForSecond(5);
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        Log.info("Again openend");
        SeleniumCommon.waitForSecond(5);
        driver.switchTo().frame(9);
        Log.info("Switched to frame");
        driver.findElement(By.xpath("//button[@aria-label=\"Close\"]")).click();
        Log.info("Closed Popup");*/

    }


    public static void BrokenLinks() throws IOException {


           //String homePage = "http://www.zlti.com";
        String webURL = PropertiesReading.getProperty("Config","baseURL1");
           HttpURLConnection huc = null;
            int respCode = 200;
            List<WebElement> links = driver.findElements(By.tagName("a"));
            Iterator<WebElement> it = links.iterator();
            while(it.hasNext()){
                String url = it.next().getAttribute("href");
                System.out.println(url);
                if(url == null || url.isEmpty()){
                    System.out.println("URL is either not configured for anchor tag or it is empty");
                    continue;
                }

                if(!url.startsWith(webURL)){
                    System.out.println("URL belongs to another domain, skipping it.");
                    continue;
                }

                try {
                    huc = (HttpURLConnection)(new URL(url).openConnection());
                    huc.setRequestMethod("HEAD");
                    huc.connect();
                    respCode = huc.getResponseCode();
                    if(respCode >= 400){
                        System.out.println(url+" is a broken link");
                    }
                    else{
                        System.out.println(url+" is a valid link");
                    }

                } catch (MalformedURLException e) {
// TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
// TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }


        }


    public static void sendmail() {
        String ActualTitle=driver.getTitle();
        Log.info("Actual title:" +ActualTitle);
        String ExceptedTitle = "Inbox - ouchdemo1@gmail.com - Gmail";
        ExtentTestManager.reporterLog("Expected Title:" + ExceptedTitle);
        ExtentTestManager.reporterLog("Actual Title:" +ActualTitle);
        Log.info("Title verified");
        ExtentTestManager.reporterLog("Step 1 Pass");
        SeleniumCommon.switchtowindow();
        driver.findElement(By.xpath("//div[@class = 'T-I T-I-KE L3']")).click();
        Log.info("Click on Compose button");
        //SeleniumCommon.switchtodifferenttab(0);
       /* String ActualTitle1 = driver.getTitle();
        ExtentTestManager.reporterLog("ActualTitle"+ActualTitle1);
        String ExceptedTitle1 = "Inbox - ouchdemo1@gmail.com - Gmail";
        ExtentTestManager.reporterLog("Expected Title:"+ExceptedTitle1);
        if (ActualTitle1.equals(ExceptedTitle1)) {
            Log.info("Open New mail");
            ExtentTestManager.reporterLog("New mail");
        } else {
            // Assert.fail();
            ExtentTestManager.reporterLog("No New mail");
            Log.info("No new Email");
        }*/
        SeleniumCommon.waitForSecond(5);
        WebElement E1=driver.findElement(By.xpath("//textarea[@name=\"to\"]"));
        SeleniumCommon.waitForSecond(2);
        E1.sendKeys("trunal.thakre@gmail.com");
        SeleniumCommon.waitForSecond(2);
        E1.sendKeys(Keys.ENTER);

        Log.info("Entered Receiver mail ID trunal.thakre@gmail.com");
        SeleniumCommon.waitForSecond(10);
        /*WebElement E1 = driver.findElement(By.xpath("//div[@class = 'fX aiL']"));
        SeleniumCommon.waitForWebElement(E1);
        E1.sendKeys("trunal.thakre@gmail.com");*/

        ExtentTestManager.reporterLog("Receiver mailid");
        Log.info("Enter Subject Testmail");
        //driver.findElement(By.xpath("//div[@id = ':9']")).sendKeys("TestMail");
        driver.findElement(By.xpath("//input[@name=\"subjectbox\"]")).sendKeys("TestMail");
        ExtentTestManager.reporterLog("Subject TestMail");
        Log.info("Descrition send");
        SeleniumCommon.waitForSecond(5);
       // driver.findElement(By.xpath("//div[@id = ':aq']")).sendKeys("Testing mail");
        driver.findElement(By.xpath("//div[@class=\"Am Al editable LW-avf tS-tW\"]")).sendKeys("Testing mail");
        SeleniumCommon.waitForSecond(2);
        ExtentTestManager.reporterLog("Description content");
        Log.info("Click on Send Buttom");
        //driver.findElement(By.xpath("//div[@id = ':9a']")).click();
        driver.findElement(By.xpath("//div[@aria-label=\"Send \u202A(Ctrl-Enter)\u202C\"]")).click();

        ExtentTestManager.reporterLog("Mail sent");

    }
}
