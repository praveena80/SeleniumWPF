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
    By tops = By.linkText("Tops");
    By shirts = By.linkText ("T-shirts");
    By delivery = By.linkText("Delivery");
    By subCategory = By.id("subcategories");
    By product = By.linkText("Faded Short Sleeve T-shirts");
    //Below observe for different types of xpaths
    By cart = By.xpath("//*[@id=\"header\"]//b");
    By block_top_menu = By.xpath("\"//*[@id=\\\"block_top_menu\\\"]/ul/li[2]/ul/li[1]/a\"");
    By special_block_right = By.xpath("\"//*[@id=\\\"special_block_right\\\"]//a/span\"");
    By firstImage = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img");
    By quickView = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[2]");
    By compare = By.xpath("//*[@id=\"center_column\"]/div[3]/div[2]/form/button");
    By addToCart = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]");
    By subcategories= By.xpath("//*[@id='subcategories']/p");
    //xpath using contains
    By cartItem = By.xpath("//*[@id=\"layer_cart\"]//span[contains(text(), 'There is 1 item in your cart.')]");
    By productsCount = By.xpath("//*[@id=\"center_column\"]//span[contains(text(),'There are 2 products')]");
    By tshirtsProductCount = By.xpath("//*[@id='center_column']//span[contains(text(),'There is 1 product')]\"]");

    public void selectWomen() {
        waitForVisibilityOfElement(driver.findElement(women));
        driver.findElement(women).click();
    }

    public void selectTops() {
        waitForVisibilityOfElement(driver.findElement(tops));
        driver.findElement(tops).click();
    }

    public void selectShirts() {
        waitForVisibilityOfElement(driver.findElement(shirts));
        driver.findElement(shirts).click();
    }
    public void selectDelivery() {
        waitForVisibilityOfElement(driver.findElement(delivery));
        driver.findElement(delivery).click();
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
    public void selectCart() {
        waitForVisibilityOfElement(driver.findElement(cart));
        driver.findElement(cart).click();
    }
    public void selectBlock_top_menu() {
        waitForVisibilityOfElement(driver.findElement(block_top_menu));
        driver.findElement(block_top_menu).click();
    }
    public void selectSpecial_block_right() {
        waitForVisibilityOfElement(driver.findElement(special_block_right));
        driver.findElement(special_block_right).click();
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

    public String productTextVerification(){
        return driver.findElement(productsCount).getText();

    }
    public String tshirtsProductTextVerification(){
       return driver.findElement(tshirtsProductCount).getText();
    }

    public Boolean isSubcategoriesDisplayed(){
        return driver.findElement(subcategories).isDisplayed();
    }

}
