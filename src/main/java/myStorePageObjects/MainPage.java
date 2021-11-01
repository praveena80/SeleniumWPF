package myStorePageObjects;

import framework.PageObjectBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MainPage extends PageObjectBase {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);

    By women = By.linkText("WOMEN");
    By subCategory = By.id("subcategories");
    By product = By.linkText("Faded Short Sleeve T-shirts");
    //Below observe for different types of xpaths
    By firstImage = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img");
    By quickView = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[2]");
    By compare = By.xpath("//*[@id=\"center_column\"]/div[3]/div[2]/form/button");
    By addToCart = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]");
    //xpath using contains
    By cartItem = By.xpath("//*[@id=\"layer_cart\"]//span[contains(text(), 'There is 1 item in your cart.')]");
    By secondItem = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/h2/span[1]");
    By proceedToCheckOutBtn = By.xpath("//*[@id=\"layer_cart\"]//div[4]/a/span");

    public void selectWomen() {
        waitForVisibilityOfElement(driver.findElement(women));
        driver.findElement(women).click();
    }

    public Boolean subCategoryIsDisplayed() {
        waitForVisibilityOfElement(driver.findElement(subCategory));
        return driver.findElement(subCategory).isDisplayed();
    }

    public void clickQuickView() {
        scrollDown(driver.findElement(compare));
        actions.moveToElement(driver.findElement(firstImage)).moveToElement(driver.findElement(addToCart)).perform();
        System.out.println("Mouse moved to the window");
        waitForVisibilityOfElement(driver.findElement(addToCart));
    }

    public void clickAddToCart() {
        driver.findElement(addToCart).click();
        waitForVisibilityOfElement(driver.findElement(cartItem));
    }

    public void clickAddToCartToAddTwo() {
        driver.findElement(addToCart).click();
        waitForVisibilityOfElement(driver.findElement(secondItem));
    }

//    public String verifyCartItem () throws InterruptedException {
//        String cartText = getElementText(driver.findElement(cartItem));
//        waitForElement();
//        return cartText;
//    }

    public String textVerification () {
        String cartText = driver.findElement(cartItem).getText();
        return cartText;
    }

    public boolean textVerificationForSecondItem () {
        return driver.findElement(secondItem).isDisplayed();
    }

    public void clickOnProceedCheckOut () {
        driver.findElement(proceedToCheckOutBtn).click();
    }
}
