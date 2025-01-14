package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MehlikaPage extends BasePage {


    @FindBy(xpath = "(//img[@alt='Logo'])")               // <-- home page
    public WebElement homePageLogo;
    @FindBy(xpath = "(//span[text()='Make an'])")
    public WebElement makeAnAppointmentButton;

    @FindBy(xpath = "//h2[text()='Make an Appointment']")
    public WebElement makeAppoinmentTitle;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameInputBox;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameInputBox;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnInputBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneInputBox;

    @FindBy(xpath = "//input[@name='appoDate']")
    public WebElement dateTimeInputBox;

    @FindBy(xpath = "//button/span[text()='Send an Appointment Request']")
    public WebElement appointmentRequestButton;

    @FindBy(id = "app-view-container")
    public WebElement appointmentSavedToast;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenu;
    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement signInButton;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement signInUsername;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement signInPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmit;

    @FindBy(xpath = "//span[text()='Sign out']")
    public WebElement signOut;

    @FindBy(xpath = "//span[text()='Melinda Patient']")    // -->verify sign in is successfully
    public WebElement melindaPatientAccount;

}
