package pageObjects;

import framework.PageObjectBase;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CreateAccountPage extends PageObjectBase {
//    WebDriver driver;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

   By userNameTextBox = By.name("username");
   By passwordTextBox = By.name("password");
   By repeatPasswordTextBox = By.name("repeatedPassword");
   By selectLanguage = By.name("account.languagePreference");

//   //Another way of declaring a variable
//   WebElement pwdTextBox1 = driver.findElement(By.name("password"));
//
//   //Page Factory way of declaring elements
//   @FindBy (name = "password")
//    WebElement pwdTextBox;

   String pwd = generateRandomString(5);

   //Method to type username
   public void setUserName(String name) {
       driver.findElement(userNameTextBox).sendKeys(name);
   }
   public void setPassword() {
       driver.findElement(passwordTextBox).sendKeys(pwd);
////       pwdTextBox1.sendKeys(pwd);
//       pwdTextBox.sendKeys(pwd);
   }
   public void setRepeatPassword() {
       driver.findElement(repeatPasswordTextBox).sendKeys(pwd);
   }

    public String generateRandomString(int length){
        return RandomStringUtils.randomAlphabetic(length);
    }

   public void setUserNameAndPassword() {
       setUserName(generateRandomString(6));
       setPassword();
       setRepeatPassword();
   }

   public Boolean isUserNameTextBoxDisplayed() {
       return driver.findElement(userNameTextBox).isDisplayed();
   }

//   public void setSelectLanguage() {
//       driver.
//   }
}
