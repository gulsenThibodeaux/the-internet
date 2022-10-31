package testSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dynamicContectObjects;

public class dynamicContectTestSteps extends dynamicContectObjects {
    String dynamicContentEndPoint = "dynamic_content";

    @Test(description = "User wants to refresh the page ")
    public void dynamic() {
        getDriver().get(getProperties("baseURL") + dynamicContentEndPoint);
        Assert.assertFalse(refresh());
        Assert.assertFalse(refresh());
        Assert.assertFalse(refresh());
    }
}