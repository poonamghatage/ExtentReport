package testscript;

import org.testng.annotations.Test;
import webpages.Homepage1;

public class Homepage1test {

  /*  @Test(description = "Verified newm metting link shared or not")
    public void Homepage1_Testcase1(){
        Homepage1.new_meeting();

    }*/


    @Test(description ="Verified draft message moved into inbox or not" )
    public static void Homepage1_Testcase2(){
        Homepage1.draft_move_into_inbox();
    }

  /*  @Test(description = "verified Logout")
    public void Homepage1_Testcase3(){
        Homepage1.LogOut();
        }*/



}
