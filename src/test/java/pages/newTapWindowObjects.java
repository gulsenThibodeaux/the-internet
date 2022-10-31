package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.browserUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class newTapWindowObjects extends browserUtil {
    public newTapWindowObjects() {
        PageFactory.initElements(getDriver(), this);
        //Test clicks on the Click Here link.
               // + Test asserts that a new tab is opened with text New Window.
    }
    @FindBy(xpath = "//*[@id='content']/div/a")
    public WebElement newWindow;
    public void newTab(){
        newWindow.click();
        Set<String> allTabs = getDriver().getWindowHandles();
        List<String> tabsList=new ArrayList<>();
        for(String newTab:allTabs){
            tabsList.add(newTab);
            getDriver().switchTo().window(newTab);
            System.out.println("Current window tab = "+getDriver().getTitle());
        }
        getDriver().switchTo().window(tabsList.get(1));
        System.out.println("New tab = "+getDriver().getTitle());

    }
}