package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By enterStoreLink = By.linkText("Enter the Store");
    By signInLink = By.linkText("Sign In");
    By registerLink = By.linkText("Register Now!");

    public void selectStoreLink() {
        driver.findElement(enterStoreLink).click();
    }

    public void selectSignInLink() {
        driver.findElement(signInLink).click();
    }

    public void selectRegisterLink() {
        driver.findElement(registerLink);
    }

    public void landOnRegisterPage() {
        selectStoreLink();
        selectSignInLink();
        selectRegisterLink();
    }
}
