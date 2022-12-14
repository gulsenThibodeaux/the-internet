package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.browserUtil;

public class floatingMenuObjects extends browserUtil {
    public floatingMenuObjects() {
        PageFactory.initElements(getDriver(), this);
        // Test scrolls the page.
        // Test asserts that the floating menu is still displayed.
    }
    @FindBy(xpath = "//*[@id='content']/div/h3")
    private WebElement floatingMenu;

    public boolean scrollDown(){
        JavascriptExecutor js=(JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,3000)");
        return floatingMenu.isDisplayed();
    }


}

