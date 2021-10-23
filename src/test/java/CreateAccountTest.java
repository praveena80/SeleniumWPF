import PageObjects.CreateAccountPage;
import PageObjects.LoginPage;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseTest{

    @Test
    public void createAccount() {
        LoginPage loginPO = new LoginPage(driver);
        CreateAccountPage createAccountPO = new CreateAccountPage(driver);

        loginPO.landOnRegisterPage();
        createAccountPO.setUserNameAndPassword();
    }
}
