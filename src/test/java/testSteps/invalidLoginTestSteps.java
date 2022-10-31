package testSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.loginObjects;

public class invalidLoginTestSteps extends loginObjects {
    String loginEndPoint="login";
    String verifyString="Secure Area";
    @Test(description = "User wants to enter invalid credentials")
    public void invalidCredentialsTest(){
        getDriver().get(getProperties("baseURL")+loginEndPoint);
        setWaitTime();
        login("gulsen","thibodeaux");
        waitElementVisible(getLoginVerify());
        Assert.assertTrue(getLoginVerify().getText().contains(verifyString));
        tearDown();
    }
}
