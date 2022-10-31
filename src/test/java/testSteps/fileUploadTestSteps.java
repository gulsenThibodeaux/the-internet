package testSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.fileUploadObjects;

public class fileUploadTestSteps extends fileUploadObjects {
    String upLoadEndPoint = "upload";
    String expectedResult="File Uploaded!";
    @Test(description = "User wants to upload a file ")
    public void uploaded() {
        getDriver().get(getProperties("baseURL") + upLoadEndPoint);
        Assert.assertEquals(chosenFile(),expectedResult);
        tearDown();

    }
}