package Reusablecomponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class Performance {
    @Test
    public static void main() throws IOException {
        String s1="//*[@type=\"email\"]";
        SeleniumCommon.timerequiredtofindelement(s1);
    }
}

