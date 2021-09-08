package testscript;

import org.testng.annotations.Test;
import webpages.Drive;
import webpages.Form;
import webpages.Homepage1;

import java.io.IOException;

public class FormTest {

    @Test(priority = 1,description = "Verified user can able Submit the form")
    public static void Testcase1_SubmitForm() throws IOException {
        Form.submitform();
    }

    @Test(priority = 2,description = "verified Logout")
    public void Logout(){
        Homepage1.LogOut();
    }
}
