package testSteps;

import org.testng.annotations.Test;
import pages.checkBoxesObjects;

public class checkBoxesTestSteps extends checkBoxesObjects {
    //

    String checkboxEndPoint="checkboxes";


    @Test(description = "User wants to checkBoxes")
    public void CheckBoxesSelection(){
        getDriver().get(getProperties("baseURL")+checkboxEndPoint);
        setWaitTime();
        clickCheckBox(getCheckBox1());
        clickCheckBox(getCheckBox2());

       // tearDown();
    }
}


