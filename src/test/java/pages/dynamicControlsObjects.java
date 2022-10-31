package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.browserUtil;

public class dynamicControlsObjects extends browserUtil {
    public dynamicControlsObjects() {
        PageFactory.initElements(getDriver(), this);
    }
//     Test clicks on the Remove Button and uses explicit wait.
//     + Test asserts that the checkbox is gone.
//    - Test clicks on Add Button and uses explicit wait.
//   * Test asserts that the checkbox is present.
//     + Test clicks on the Enable Button and uses explicit wait.
//     * Test asserts that the text box is enabled.
//     + Test clicks on the Disable Button and uses explicit wait.
//     - Test asserts that the text box is disabled.
    @FindBy(xpath = "//button[normalize-space()='Remove']")
    private WebElement removeButton;
    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement addButton;
    @FindBy(xpath = "//button[normalize-space()='Disable']")
    private WebElement disableButton;
    @FindBy(xpath = "//button[normalize-space()='Enable']")
    private WebElement enableButton;
    @FindBy(css = "[id='message']")
    private WebElement result;

    public void clickRemoveButton(){
        removeButton.click();
    }

    public void clickAddButton() {
        addButton.click();
    }public void clickDisableButton() {
        disableButton.click();
    }public void clickEnableButton() {
        enableButton.click();
    }

    public String result(){
        waitForPresenceOfElement(result);
        return result.getText();
    }



    }

