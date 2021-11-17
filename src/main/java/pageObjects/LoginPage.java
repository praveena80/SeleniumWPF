package pageObjects;

import framework.PageObjectBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageObjectBase {
//    WebDriver driver;

    // Constructor
    // Gets called when object of this page is created in MainClass.java
    public LoginPage(WebDriver driverFromConstructor) {
        // "this" keyword is used here to distinguish global and local variable "driver"
        //gets driver as parameter from MainClass.java and assigns to the driver instance in this class
//        this.driver = driverFromConstructor;
        super(driverFromConstructor);
    }

    //Locators
    By enterStoreLink = By.linkText("Enter the Store");
    By signInLink = By.linkText("Sign In");
    By registerLink = By.linkText("Register Now!");

    WebElement enterstore = driver.findElement(By.linkText("Enter the Store"));

    //Method to click link
    public void selectStoreLink() {
        driver.findElement(enterStoreLink).click();
    }

    public void selectSignInLink() {
        driver.findElement(signInLink).click();
    }

    public void selectRegisterLink() {
        driver.findElement(registerLink).click();
    }

    public String getRegisterLinkText() {
//        return driver.findElement(registerLink).getText();
        return enterstore.getText();
    }

    public String getEnterTheStoreText() {
        return driver.findElement(enterStoreLink).getText();

    }

    public Boolean enterTheStoreLinkIsDisplayed() {

        return driver.findElement(enterStoreLink).isDisplayed();
    }

    public Boolean registerLinkDisplayed() {
        return driver.findElement(registerLink).isDisplayed();
    }

    public void landOnRegisterPage() {
        selectStoreLink();
        selectSignInLink();
    }
}
