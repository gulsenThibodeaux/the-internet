package testSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.floatingMenuObjects;

public class floatingMenuTestSteps extends floatingMenuObjects {
    String floatingMenuEndPoint = "floating_menu";

    @Test(description = "User wants to handle floating menu")
    public void floating() {
        getDriver().get(getProperties("baseURL") + floatingMenuEndPoint);
        setWaitTime();
        Assert.assertTrue(scrollDown());

        tearDown();

    }
}