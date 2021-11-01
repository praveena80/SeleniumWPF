package petStore;

import baseTest.BaseTest;
import pageObjects.CreateAccountPage;
import pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseTest {

    @Test
    public void createAccount() {
        LoginPage loginPO = new LoginPage(driver);
        CreateAccountPage createAccountPO = new CreateAccountPage(driver);

        Assert.assertEquals("Enter the Store", loginPO.getEnterTheStoreText());
        Assert.assertTrue(loginPO.enterTheStoreLinkIsDisplayed());
        loginPO.landOnRegisterPage();
        Assert.assertTrue(loginPO.registerLinkDisplayed());
        Assert.assertEquals("Register Now!", loginPO.getRegisterLinkText());
        loginPO.selectRegisterLink();
        createAccountPO.setUserNameAndPassword();
    }
}
