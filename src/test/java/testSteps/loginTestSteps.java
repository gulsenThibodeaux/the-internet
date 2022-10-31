package testSteps;


import org.testng.Assert;
import org.testng.annotations.*;
import pages.loginObjects;


public class loginTestSteps extends loginObjects {
    String loginEndPoint="login";
    String verifyString="Secure Area";

    @Test(description = "User wants to enter valid credentials")
    public void validCredentialsTest(){
        getDriver().get(getProperties("baseURL")+loginEndPoint);
        setWaitTime();
        login(getProperties("userName"),getProperties("password"));
        waitElementVisible(getLoginVerify());
        Assert.assertTrue(getLoginVerify().getText().contains(verifyString));
        tearDown();
    }

}
