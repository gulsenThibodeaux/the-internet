package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.browserUtil;
import utils.driver;

public class javaScriptAlertObjects extends browserUtil {
    public javaScriptAlertObjects(){
      PageFactory.initElements(getDriver(),this);
//        Test Clicks on JS Alert Button.
//        + Test asserts alert message.
//                - Test clicks on JS confirm Button and clicks ok on alert.
//    * Test asserts the alert message.
//                + Test clicks on JS Prompt Button and types a message on Prompt.
//                - Test asserts that the alert message contains the typed message.
    }
    @FindBy(xpath = "//*[@id='content']/div/ul/li[2]/button")
    public WebElement confirm;
    @FindBy(xpath = "//*[@id='content']/div/ul/li[1]/button")
    public WebElement jsAlert;

    @FindBy(xpath = "//*[@id='content']/div/ul/li[3]/button")
    public WebElement jsPrompt;
    @FindBy(xpath = "//*[@id='result']")
    public WebElement result;

    public void jsAlertAccept(){
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].click()",jsAlert);
        Alert promptAlert  = getDriver().switchTo().alert();
        String actualResult="I am a JS Alert";
        String expectedResult=promptAlert.getText();
        try{
            Assert.assertEquals(actualResult,expectedResult,"test failed");
        }catch (AssertionError e){
            System.out.println("Not equal");
        }System.out.println(actualResult+" = "+expectedResult);
        promptAlert.accept();
    }
    public void jsConfirm(){
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].click()",confirm);
        Alert promptAlert  = getDriver().switchTo().alert();
        //staticWait(2);
        promptAlert.accept();
    }


    public void jsPromptMessage()  {

        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].click()",jsPrompt);
        Alert promptAlert  = getDriver().switchTo().alert();
        promptAlert.sendKeys("Happy halloween");
        staticWait(3);
        promptAlert.accept();
        String actualResult="You entered: Happy halloween";
        String expectedResult=result.getText();
        try{
            Assert.assertEquals(actualResult,expectedResult,"test failed");
        }catch (AssertionError e){
            System.out.println("Not equal");
        }
        System.out.println(actualResult+" = "+expectedResult);
    }

}
