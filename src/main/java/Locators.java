/**
 * Created by galina on 24.04.15.
 */
import org.openqa.selenium.By;

public interface Locators {

    By LOGIN = By.id("mailbox_login");
    By PASSWORD = By.id("mailbox_password");
    By AUTH_BUTTON = By.id("mailbox_auth_button");
    By LOGOUT = By.id("PH_logoutLink");
    By MBPASSWORD = By.id("mailbox__password");
    By LOGOUTLINK = By.id("PH_logoutLink");
}

  /*  private final By value;

    Locators(By value) {

        this.value = value;
    }

    public By getValue() {
        return value;
*/


