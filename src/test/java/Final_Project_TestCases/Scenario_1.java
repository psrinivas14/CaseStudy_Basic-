package Final_Project_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
import pages.*;

public class Scenario_1 {
    private WebDriver driver;
    private PandaHomePage homePage;
    private PandaContactPage contactPage;

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    @Test
    public void testScenario1() {
        driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");
        homePage = new PandaHomePage(driver);
        contactPage = new PandaContactPage(driver);

        // Verify the title of the homepage
        Assert.assertEquals(driver.getTitle(), "Want to practice test automation? Try these demo sites! | Automation Panda");

        // Click on the Contact link
        homePage.clickContactLink();

        // Verify the title of the contact page
        Assert.assertEquals(driver.getTitle(), "Contact | Automation Panda");

        // Fill and submit the contact form
        contactPage.fillContactForm("Srinu", "srinu@example.com", "Test message");
        Assert.assertEquals(contactPage.getMessageSentMessage(), "Your message has been sent");
    }
}