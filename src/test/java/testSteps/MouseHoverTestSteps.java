package testSteps;

import org.testng.annotations.Test;
import pages.MouseHoverObjects;

public class MouseHoverTestSteps extends MouseHoverObjects {
    String mouseHoverEndPoint = "hovers";

    @Test(description = "User wants to hover over on elements ")
    public void moveToElement() {
        getDriver().get(getProperties("baseURL") + mouseHoverEndPoint);
        setWaitTime();
        System.out.println(hoverOver("1"));
        System.out.println(hoverOver("2"));
        System.out.println(hoverOver("3"));
        tearDown();

    }
}