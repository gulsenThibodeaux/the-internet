package testSteps;

import org.testng.annotations.Test;
import pages.notificationMessageRenderedObjects;

public class notificationMessagerenderedTestSteps extends notificationMessageRenderedObjects {

    String messageNotificationEndPoint = "notification_message_rendered";

    @Test(description = "User wants get new message notification")
    public void messageNotification() {
        getDriver().get(getProperties("baseURL") + messageNotificationEndPoint);
        setWaitTime();
        messageBoard();
       // tearDown();

    }
}