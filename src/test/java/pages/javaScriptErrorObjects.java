package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.browserUtil;

public class javaScriptErrorObjects extends browserUtil {
    public javaScriptErrorObjects() {
        PageFactory.initElements(getDriver(), this);
        // Test finds the JavaScript error on the page.
        // Test asserts that the page contains error: Cannot read property 'xyz' of undefined
    }
        @FindBy(xpath = "/html/body")
         private WebElement errorMessage;
       public void jsError(){
        System.out.println("errorMessage.getText() = " + errorMessage.getText());

    }


    }

