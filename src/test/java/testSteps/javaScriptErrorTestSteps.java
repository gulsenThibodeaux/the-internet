package testSteps;

import org.testng.annotations.Test;
import pages.javaScriptErrorObjects;

public class javaScriptErrorTestSteps extends javaScriptErrorObjects {
    String javaScriptErrorEndPoint = "javascript_error";

    @Test(description = "User wants handle javaScriptError ")
    public void scriptError() {
        getDriver().get(getProperties("baseURL") + javaScriptErrorEndPoint);
        setWaitTime();
    }
}