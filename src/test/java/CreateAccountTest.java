import PageObjects.CreateAccountPage;
import PageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseTest{
    LoginPage loginPO = new LoginPage(driver);
    CreateAccountPage createAccountPO = new CreateAccountPage(driver);

    @Test
    public void createAccount() {
        Assert.assertEquals("Enter the Store", loginPO.getEnterTheStoreText());
        Assert.assertTrue(loginPO.enterTheStoreLinkIsDisplayed());
        loginPO.landOnRegisterPage();
        Assert.assertTrue(loginPO.registerLinkDisplayed());
        Assert.assertEquals("Register Now!", loginPO.getRegisterLinkText());
        loginPO.selectRegisterLink();
        createAccountPO.setUserNameAndPassword();
    }
}
