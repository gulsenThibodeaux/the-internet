package testSteps;

import org.testng.annotations.Test;
import pages.fileDownLoadObjects;

public class fileDownLoadTestSteps extends fileDownLoadObjects {
    String fileDownLoadEndPoint = "download";

    @Test(description = "User wants to download a file ")
    public void fileDownload() {
        getDriver().get(getProperties("baseURL") + fileDownLoadEndPoint);
        clickFile();


        }
    }
