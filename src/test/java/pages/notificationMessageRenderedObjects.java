package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.browserUtil;

public class notificationMessageRenderedObjects extends browserUtil {
    public notificationMessageRenderedObjects(){
        PageFactory.initElements(getDriver(),this);

       // Test clicks on the Click Here link a multiple times.
     //   + Test asserts that one of the “Action Successful”, “Action unsuccessful,
     //   please try again” and “Action Unsuccessful” messages show on click.
    }
    @FindBy(xpath = "//*[@id='content']/div/p/a")
    public WebElement clickButton;
    @FindBy(xpath = "//*[@id='flash']")
    public WebElement messageheader;
    public void messageBoard(){
        clickButton.click();
        System.out.println("messageheader.getText() = " + messageheader.getText());
        staticWait(2);
        clickButton.click();
        System.out.println("messageheader.getText() = " + messageheader.getText());

    }
}
