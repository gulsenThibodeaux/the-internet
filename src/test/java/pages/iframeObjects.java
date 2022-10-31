package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.browserUtil;

public class iframeObjects extends browserUtil {


    @FindBy(xpath = "//*[@id='tinymce']")
    public WebElement contentText;


    public boolean iframeObject() {
        PageFactory.initElements(getDriver(), this);
      //  Test switches to Iframe and types some text.
        // Test asserts that the typed text is as expected.
        getDriver().switchTo().frame(0);
        contentText.clear();
        staticWait(2);
        contentText.sendKeys("Happy Halloweeen");
        return contentText.isDisplayed();




    }
}