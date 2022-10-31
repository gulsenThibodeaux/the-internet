package testSteps;

import org.testng.annotations.Test;
import pages.dragAndDropObjects;

public class dragAndDropSteps extends dragAndDropObjects {

    String dragdropEndPoint="drag_and_drop";

    @Test(description = "User wants to drag And Drop")
    public void dragAndDrops() throws Exception{
        getDriver().get(getProperties("baseURL")+dragdropEndPoint);
        setWaitTime();
        dragDrop();
       // tearDown();

}



}
