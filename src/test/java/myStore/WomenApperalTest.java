package myStore;

import myStorePageObjects.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import baseTest.BaseTest;

public class WomenApperalTest extends BaseTest {

    @Test
    public void selectWomenOption() throws InterruptedException {
//        MainPage women = new MainPage(driver);
        MainPage store = new MainPage(driver);

        store.selectWomen();
        Assert.assertTrue(store.isSubcategoriesDisplayed());
        store.selectTops();
        Assert.assertEquals(store.productTextVerification(), "There are 2 products.");
        store.selectShirts();
        Assert.assertEquals(store.tshirtsProductTextVerification(), "There is 1 product");

//        driver.findElement(By.linkText("Delivery")).click();
//        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/h2")).isDisplayed());
//        driver.findElement(By.xpath("//*[@id=\"header\"]//b")).click();

//        driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("praveena@gmail.com");
//        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
//        driver.findElement(By.id("customer_firstname")).sendKeys("Praveena");
//        driver.findElement(By.id("customer_lastname")).sendKeys("Testing");
//        driver.findElement(By.id("passwd")).sendKeys("Walle@2019");
//       // driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
        //Assert.assertTrue(driver.findElement(By.id("my-account")).isDisplayed());


//          driver.findElement(By.xpath("/html/body//tr[2]/td[2]/input")).sendKeys("sbramadi");
//          driver.findElement(By.xpath("/html/body//tr[3]/td[2]/input")).sendKeys("Walle@2019");
//          driver.findElement(By.xpath("/html/body//tr[4]/td[2]/div/input")).click();
//          Assert.assertTrue(driver.findElement(By.xpath("/html/body//tr[1]/td/h3")).isDisplayed());
//          driver.findElement(By.xpath("/html/body//tr/td[4]/a")).click();
//          driver.findElement(By.xpath("/html/body//tr[4]/td/a/img")).click();
    }

}
