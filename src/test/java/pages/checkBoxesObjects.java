package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.browserUtil;


public class checkBoxesObjects extends browserUtil {
    public checkBoxesObjects(){
        PageFactory.initElements(getDriver(),this);
    }
//    Test checks and unchecks checkboxes.
//   + Test uses assertions to make sure boxes were properly checked and unchecked.

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    private WebElement checkBox1;
    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    private WebElement checkBox2;
    public WebElement getCheckBox1(){
        return checkBox1;
    }
    public WebElement getCheckBox2(){
        return checkBox2;
    }
    public void clickCheckBox(WebElement element){
        int i = element.toString().indexOf('/')-2;
        if(element.isSelected()){
            System.out.println(element.toString().substring(i)+" is checked.");
        }else {
            System.out.println(element.toString().substring(i)+" is unchecked.");
        }
        element.click();
        if(element.isSelected()){
            System.out.println(element.toString().substring(i)+" was unchecked. We checked");
        }else{
            System.out.println(element.toString().substring(i)+" was checked. We unchecked");
        }
    }
}


