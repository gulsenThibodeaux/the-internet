package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.browserUtil;

public class fileUploadObjects extends browserUtil {
    public fileUploadObjects() {
        PageFactory.initElements(getDriver(), this);
    }
//    Test uses Upload Button or Drag and Drop to upload a file.
//            + Test asserts that the file is uploaded.
//
    @FindBy(xpath = "//*[@id='file-upload']")
    private WebElement chooseFile;
    @FindBy(id = "file-submit")
    private WebElement uploadButton;
    @FindBy(xpath = "//*[@id='content']/div/h3")
    private WebElement fileUploaded;
    public String chosenFile(){
        String path="C:UsersgulseDownloadssome-file (4).txt";
        chooseFile.sendKeys(path);
        uploadButton.click();
        return fileUploaded.getText();
    }


    }
