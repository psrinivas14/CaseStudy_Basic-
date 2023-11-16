package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PandaHomePage extends BasePage {
	@FindBy(xpath = "/html/body/div[1]/header/div/nav/div/ul/li[3]/a")
    private WebElement contactLink;

    public PandaHomePage(WebDriver driver) {
        super(driver);
    }

    public void clickContactLink() {
        contactLink.click();
    }

}