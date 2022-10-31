package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.browserUtil;


public class dragAndDropObjects extends browserUtil {
    public dragAndDropObjects(){ PageFactory.initElements(getDriver(),this);}
        @FindBy(xpath = "//*[@id='column-a']")
        private WebElement columnA;
        @FindBy(xpath = "//*[@id='column-b']")
        private WebElement columnB;
        @FindBy(xpath ="//*[@id='column-a']/header")
        private WebElement headerA;
        @FindBy(xpath ="//*[@id='column-b']/header")
         private WebElement headerB;

        public void dragDrop()  {
            Actions action=new Actions(getDriver());
            String header1=headerA.getText();
            System.out.println("header1 = " + header1);
            String header2=headerB.getText();
            System.out.println("header2 = " + header2);
            action.dragAndDrop(columnA,columnB);
        }
    }

