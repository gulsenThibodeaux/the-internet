package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.browserUtil;

import javax.swing.*;

import static utils.driver.getDriver;

public class contextMenuObjects extends browserUtil{
    public contextMenuObjects(){
        PageFactory.initElements(getDriver(),this);
    }
//    * Test right-clicks on the context menu.
//   + Test asserts the alert menu text.
    @FindBy(xpath = "//*[@id='hot-spot']")
    public WebElement box;
    public void rightClickMenu(){
        Actions action=new Actions(getDriver());
        action.contextClick(box).build().perform();

    }
    public String getAlertText(){
        Alert alert = browserUtil.getDriver().switchTo().alert();
        return alert.getText();
}}
