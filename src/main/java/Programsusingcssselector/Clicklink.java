package Programsusingcssselector;

import Reusablecomponent.SeleniumCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Clicklink {
@Test
    public static void main() {

        System.setProperty("webdriver.chrome.driver","E:\\Newreport\\src\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pypi.org/project/selenium/");

       /* driver.findElement(By.cssSelector("a[href='https://github.com/SeleniumHQ/Selenium']")).click();
        System.out.println("Clicked on Dev Link");

        SeleniumCommon.waitForSecond(5);
        driver.findElement(By.cssSelector("a[href='http://www.seleniumhq.org']")).click();
        System.out.println("Clicked on Home Link");*/


        SeleniumCommon.waitForSecond(5);
        driver.findElement(By.cssSelector("a[href='#description']")).click();
        System.out.println("Clicked on Project description Button");

    }
}
