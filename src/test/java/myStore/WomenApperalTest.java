package myStore;

import myStorePageObjects.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import baseTest.BaseTest;

public class WomenApperalTest extends BaseTest {


    @Test
    public void selectWomenOption() throws InterruptedException {
        MainPage women = new MainPage(driver);

        women.selectWomen();
        Assert.assertTrue(women.subCategoryIsDisplayed());
        women.clickQuickView();
        women.clickAddToCart();
        Assert.assertEquals(women.textVerification(), "There is 1 item in your cart.");
        women.clickOnProceedCheckOut();
    }

    @Test
    public void setProceedCheckout () {
        MainPage women = new MainPage(driver);

        women.selectWomen();
        Assert.assertTrue(women.subCategoryIsDisplayed());
        women.clickQuickView();
        women.clickAddToCartToAddTwo();
        Assert.assertTrue(women.textVerificationForSecondItem());
        women.clickOnProceedCheckOut();
    }

}
