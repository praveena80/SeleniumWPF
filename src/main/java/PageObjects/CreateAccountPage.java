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

   public void setUserName() {
       driver.findElement(userNameTextBox).sendKeys("Automation");
   }
   public void setPassword() {
       driver.findElement(passwordTextBox).sendKeys("Testing");
   }
   public void setRepeatPassword() {
       driver.findElement(repeatPasswordTextBox).sendKeys("Testing");
   }

   public void setUserNameAndPassword() {
       setUserName();
       setPassword();
       setRepeatPassword();
   }
}
