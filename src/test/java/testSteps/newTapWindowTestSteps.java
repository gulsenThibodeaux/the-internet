package testSteps;

import org.testng.annotations.Test;
import pages.newTapWindowObjects;

public class newTapWindowTestSteps extends newTapWindowObjects {

    String newTapWindowEndPoint = "windows";

    @Test(description = "User wants to open a window on a new tap ")
    public void openNewWindow() {
        getDriver().get(getProperties("baseURL") + newTapWindowEndPoint);
        setWaitTime();
        newTab();
        tearDown();

    }
}