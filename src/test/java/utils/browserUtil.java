package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.configurationReader;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class browserUtil extends configurationReader {

    public  void setWaitTime(){
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void waitElementVisible(WebElement element){
        WebDriverWait wait=new WebDriverWait(getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForPresenceOfElement(WebElement element) {
        int timeout = Integer.parseInt(configurationReader.getProperties("waitTimeOut"));
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void staticWait(int second){
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
