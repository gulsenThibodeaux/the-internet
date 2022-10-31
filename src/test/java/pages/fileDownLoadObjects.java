package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.browserUtil;



public class fileDownLoadObjects extends browserUtil {
    public fileDownLoadObjects() {
        PageFactory.initElements(getDriver(), this);
    }
          @FindBy(linkText = "some-file.txt")
         private WebElement fileDownLoad;
          public void clickFile(){
           fileDownLoad.click();

           Assert.assertTrue(fileDownLoad.isDisplayed(),"Failed to download");

    }


        // * Test clicks on the file.
        // + Test asserts that the file is downloaded.
    }
