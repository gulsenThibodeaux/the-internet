package testSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dropDownObjects;

public class dropDownTestSteps extends dropDownObjects {
    String loginEndPoint="dropdown";

    @Test(description = "User wants to select dropdown")
    public void SelectDropDown(){
        getDriver().get(getProperties("baseURL")+loginEndPoint);
        setWaitTime();
        String option1="Option 1";
        Assert.assertEquals(dropDown(option1),option1);
        String option2="Option 2";
        Assert.assertEquals(dropDown(option2),option2);
        tearDown();
    }


}
