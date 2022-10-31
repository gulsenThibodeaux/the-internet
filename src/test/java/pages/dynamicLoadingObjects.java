package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.browserUtil;

public class dynamicLoadingObjects extends browserUtil {
    public dynamicLoadingObjects(){
        PageFactory.initElements(getDriver(),this);
      //  Test clicks the start button and uses explicit wait.
         //       + Test asserts that “Hello World!” text is displayed.


    }
    @FindBy(css = "[id = 'start'] button")
    WebElement startButton;

    @FindBy(css = "[id='finish'] h4")
    WebElement helloWorld;

    public void clickStartButton() {
        this.startButton.click();
    }
    public String getHelloWorld(){
        waitForPresenceOfElement(helloWorld);
        return helloWorld.getText();
    }
}
