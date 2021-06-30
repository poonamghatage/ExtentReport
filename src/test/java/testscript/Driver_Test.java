package testscript;

import org.testng.annotations.Test;
import webpages.Driver;

import java.io.IOException;

public class Driver_Test {


    @Test(priority = 1,description = "Verified user can able to upload document on drive")
    public static void Testcase1_uploadfile() throws IOException {
        Driver.uploaddocument();

    }


}
