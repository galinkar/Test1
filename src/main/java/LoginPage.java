/**
 * Created by galina on 27.04.15.
 */
public class LoginPage {
    public TextInput loginField = new TextInput(Locators.LOGIN);
    public TextInput passwordField = new TextInput(Locators.PASSWORD);
    public TextInput authButton = new TextInput(Locators.AUTH_BUTTON);

    public LoginPage fillinLoginField(String login);
    loginField.sendKeys(login);
    return this;

    public LoginPage fillinPasswordField(String password);
    passwordField.sendKeys(password);
    return this;

    public LoginPage clickAuth(){
        authButton.click();
        return this;
    }
    public LoginPage fillinLoginForm(String login, String password) {
        return fillinLoginField(login);
        fillinPasswordField(password);
        clickAuth();

    }
    public String getPageTitle(){
        return ConfigurationManager;
    }
}
