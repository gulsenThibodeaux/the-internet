package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.browserUtil;

public class MouseHoverObjects extends browserUtil {
    public void MouseHoverObjects() {
        PageFactory.initElements(getDriver(), this);
    }
             //Test does a mouse hover on each image.
            // Test asserts that additional information is displayed for each image.

    @FindBy(xpath = "(//div[@class='figure'])[1]")
    private WebElement images1;
    @FindBy(xpath = "((//div[@class='figure'])[2]")
    private WebElement images2;
    @FindBy(xpath = "(//div[@class='figure'])[3]")
    private WebElement images3;
    @FindBy(xpath = "(//*[@id='content']/div/div[1]/div/h5")
    private WebElement information1;
    @FindBy(xpath = "//*[@id='content']/div/div[2]/div/h5")
    private WebElement information2;
    @FindBy(xpath = "//*[@id='content']/div/div[3]/div/h5")
    private WebElement information3;

    public String hoverOver(String image){
       Actions action=new Actions(getDriver());
       if(image.contains("1")){
           action.moveToElement(images1).perform();
           staticWait(2);
           return information1.getText();
       } else if (image.contains("2")) {
           action.moveToElement(images2).perform();
           staticWait(2);
           return information2.getText();
       } else if (image.contains("3")) {
           action.moveToElement(images3).perform();
           staticWait(2);
           return information3.getText();
       }else{
           return "Error";
       }
    }




    }

