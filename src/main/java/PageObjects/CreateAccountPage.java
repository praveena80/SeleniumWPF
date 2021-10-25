package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CreateAccountPage {
    WebDriver driver;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

   By userNameTextBox = By.name("username");
   By passwordTextBox = By.name("password");
   By repeatPasswordTextBox = By.name("repeatedPassword");
   String pwd = "Testing";

   //Method to type username
   public void setUserName() {
       driver.findElement(userNameTextBox).sendKeys("Automation");
   }
   public void setPassword() {
       driver.findElement(passwordTextBox).sendKeys(pwd);
   }
   public void setRepeatPassword() {
       driver.findElement(repeatPasswordTextBox).sendKeys(pwd);
   }

   public void setUserNameAndPassword() {
       setUserName();
       setPassword();
       setRepeatPassword();
   }

   public Boolean isUserNameTextBoxDisplayed() {
       return driver.findElement(userNameTextBox).isDisplayed();
   }
}
