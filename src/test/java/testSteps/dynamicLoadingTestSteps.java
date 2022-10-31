package testSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dynamicLoadingObjects;

public class dynamicLoadingTestSteps extends dynamicLoadingObjects {
    String dynamicLoadingEndPoint = "dynamic_loading/2";
    String expectedResult="Hello World!";
    @Test(description = "User wants to dynamic Loading")
    public void dynamicLoader() {
        getDriver().get(getProperties("baseURL") + dynamicLoadingEndPoint);
        setWaitTime();
        clickStartButton();
        Assert.assertEquals(getHelloWorld(),expectedResult);

        //tearDown();
    }
}