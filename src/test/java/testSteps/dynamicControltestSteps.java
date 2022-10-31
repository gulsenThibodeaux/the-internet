package testSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dynamicControlsObjects;

public class dynamicControltestSteps extends dynamicControlsObjects {

    String dynamicControlEndPoint = "dynamic_controls";
    String checkBoxRemoveExpected = "It's gone!";
    String checkBoxAddExpected = "It's back!";
    String inputBoxEnableExpected = "It's enabled!";
    String inputBoxDisableExpected = "It's disabled!";


    @Test(description = "User wants to do dynamic control")
    public void dynamic() {
        getDriver().get(getProperties("baseURL") + dynamicControlEndPoint);
        setWaitTime();
        clickRemoveButton();
        Assert.assertEquals(result(),checkBoxRemoveExpected);
        clickAddButton();
        Assert.assertEquals(result(),checkBoxAddExpected);
        clickEnableButton();
        Assert.assertEquals(result(),inputBoxEnableExpected);
        clickDisableButton();
        Assert.assertEquals(result(),inputBoxDisableExpected);

    }
}