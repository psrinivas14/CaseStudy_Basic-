package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PandaContactPage extends BasePage {
    @FindBy(id = "g3-name")
    private WebElement nameInput;

    @FindBy(id = "g3-email")
    private WebElement emailInput;

    @FindBy(id = "contact-form-comment-g3-message")
    private WebElement commentInput;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/article/div/div[1]/form/div/div[4]/button")
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/article/div/div[1]/div/h4")
    private WebElement messageSentMessage;

    public PandaContactPage(WebDriver driver) {
        super(driver);
    }

    public void fillContactForm(String name, String email, String comment) {
        nameInput.sendKeys(name);
        emailInput.sendKeys(email);
        commentInput.sendKeys(comment);
        submitButton.click();
    }

    public String getMessageSentMessage() {
        return messageSentMessage.getText();
    }
}