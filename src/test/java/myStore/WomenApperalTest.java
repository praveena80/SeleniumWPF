package myStore;

import myStorePageObjects.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import petStore.BaseTest;

public class WomenApperalTest extends BaseTest {

    @Test
    public void selectWomenOption() throws InterruptedException {
        MainPage women = new MainPage(driver);

        women.selectWomen();
        Assert.assertTrue(women.subCategoryIsDisplayed());
        women.clickQuickView();
        women.clickAddToCart();
        Assert.assertEquals(women.textVerification(), "There is 1 item in your cart.");
    }

}
