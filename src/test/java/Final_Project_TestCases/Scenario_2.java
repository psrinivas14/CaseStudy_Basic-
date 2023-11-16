package Final_Project_TestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.flipkart_1;
import pages.Waits;
import pages.flipkart_3;

public class Scenario_2 {

	public WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println("Landing Page title is: "+driver.getTitle());
		Assert.assertEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", driver.getTitle());	
	}
	
	@Test
	public void srchItm() throws InterruptedException {
		flipkart_3 flpkrtPg=new flipkart_3(driver);
		flipkart_1 flkrtSrch=new flipkart_1(driver);
		Waits wait=new Waits(driver);
		
		//Checking for Sign In Pop up for to close
		Thread.sleep(4000);
		if (flkrtSrch.isElementPresent(driver,flpkrtPg.sgnClsBtnn())) {
			flpkrtPg.sgnClsBtn().click();
		}
		
		//Checking Flipkart text at left side top of the page
		if (flkrtSrch.isElementPresent(driver,flpkrtPg.flktTxtLogo())) {
			System.out.println("Flipkart Logo is displayed at the top left of the page.");
		}
		
		flpkrtPg.srchBox().sendKeys("iphone 14");
		flpkrtPg.srchIcon().click();
		wait.ExpcitWtClck(flpkrtPg.frstItm(), 10);
		System.out.println("Total "+flpkrtPg.itmsCunt().size()+" items are displaying in this page.");
		Thread.sleep(5000);
		System.out.println("First item name is: "+flpkrtPg.frstPrdtNme().getText());
		String productName=flpkrtPg.frstPrdtNme().getText();
		flpkrtPg.frstPrdtNme().click();
		Thread.sleep(15000);
		System.out.println("Title of the page: "+driver.getTitle());
		Assert.assertEquals("Iphone 14- Buy Products Online at Best Price in India - All Categories | Flipkart.com", driver.getTitle());
	}
	
	@AfterSuite
	public void cls() {
		driver.quit();
	}
}