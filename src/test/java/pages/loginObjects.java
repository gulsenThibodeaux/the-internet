package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.browserUtil;

public class loginObjects extends browserUtil {
    public loginObjects(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(id = "username")
    private WebElement userNameBox;
    @FindBy(id = "password")
    private WebElement passwordBox;
    @FindBy(css = "[type='submit'] i")
    private WebElement loginButton;
    @FindBy(css = "h4[class='subheader']")
    private WebElement loginVerify;

    public void login(String username,String password){
        userNameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }
    public WebElement getLoginVerify(){
        return loginVerify;
    }
}
