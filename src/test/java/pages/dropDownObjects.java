package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.browserUtil;

public class dropDownObjects extends browserUtil {
    public dropDownObjects() {
        PageFactory.initElements(getDriver(), this);
    }
    @FindBy(xpath = "//*[@id='dropdown']")
    public WebElement dropDownBox;
    @FindBy(xpath = "//*[@id='dropdown']/option[2]")
    public WebElement selectDown1;
    @FindBy(xpath = "//*[@id='dropdown']/option[3]")
     public WebElement selectDown2;

    //  * Test selects Option 1 and Option 2 from the drop down menu.
    public String dropDown(String text){
        Select select=new Select(dropDownBox);
        String firstSelected = select.getFirstSelectedOption().getText();
        System.out.println("Selected option is "+firstSelected);
        dropDownBox.click();
        select.selectByVisibleText(text);
        return select.getAllSelectedOptions().get(0).getText();
    }



    }

