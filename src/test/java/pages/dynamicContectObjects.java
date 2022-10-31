package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.browserUtil;

public class dynamicContectObjects extends browserUtil {
    public dynamicContectObjects() {
        PageFactory.initElements(getDriver(), this);
//        Test refreshes the page a couple of times.
//        + Test asserts that the content changes on each refresh.
    }
        @FindBy(xpath = "//*[@id='content']/div/p[2]/a")
    public WebElement clickButton;
    @FindBy(xpath = "//*[@id='content']/div[3]/div[2]")
    public WebElement column;
    public boolean refresh(){
        String columnBefore =column.getText();
        clickButton.click();
        String columnAfter = column.getText();
        return columnBefore.equalsIgnoreCase(columnAfter);
    }


       //Test refreshes the page a couple of times.
        // Test asserts that the content changes on each refresh.


    }

