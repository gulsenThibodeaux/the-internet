package testSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.contextMenuObjects;

public class contexMenuSteps extends contextMenuObjects {
       String contextMenuEndPoint="context_menu";
       String expectedText="You selected a context menu";
        @Test(description = "User wants to right click")
        public void rightClickContextMenu(){
        getDriver().get(getProperties("baseURL")+contextMenuEndPoint);
        setWaitTime();
        rightClickMenu();
        Assert.assertEquals(getAlertText(),expectedText,"Assertion is failed");
        tearDown();


}}
