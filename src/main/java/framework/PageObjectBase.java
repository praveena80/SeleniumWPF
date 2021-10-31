package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    JavascriptExecutor js;

    public PageObjectBase(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 1);
        js = (JavascriptExecutor) driver;
    }

    public void waitForVisibilityOfElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public String getElementText(WebElement e) {
        return (e.getText());
    }

    public void waitUntilElementClickable (WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollDown(WebElement elementName) {
        js.executeScript("arguments[0].scrollIntoView();", elementName);
    }

    public void waitForElement () throws InterruptedException {
        wait.wait(10000);
    }
}
