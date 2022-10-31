package testSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.iframeObjects;

public class iframeTestSteps extends iframeObjects {
    String iframeEndPoint = "iframe";

    @Test(description = "User wants to handle iframes ")
    public void handleIframe() {
        getDriver().get(getProperties("baseURL") + iframeEndPoint);
        setWaitTime();
        Assert.assertTrue(iframeObject());
        tearDown();

    }
}