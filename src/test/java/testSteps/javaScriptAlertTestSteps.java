package testSteps;

import org.testng.annotations.Test;
import pages.javaScriptAlertObjects;

public class javaScriptAlertTestSteps extends javaScriptAlertObjects {
    String javaScriptAlertEndPoint = "javascript_alerts";

    @Test(description = "User wants to handle javaScriptAlerts")
    public void javaScriptHandle() {
        getDriver().get(getProperties("baseURL") + javaScriptAlertEndPoint);
        setWaitTime();
        jsAlertAccept();
        setWaitTime();
        jsConfirm();
        setWaitTime();
        jsPromptMessage();
        tearDown();
    }
}