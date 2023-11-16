package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartHomePage extends BasePage {
	
	@FindBy(xpath = "//img[@title='Flipkart']")
	private WebElement flipkartlogo;
	
	@FindBy(name="q")
	WebElement srchBox;
		
	//Search icon
	@FindBy(xpath="//button[@type='submit']")
	WebElement srchIcn;
		
	//List of items
	@FindBy(xpath="//div[starts-with(@class,'_1AtVbE')]//div[starts-with(@class,'_13oc-S')]")
	List<WebElement> itemsCount;
		
	//First Product
	@FindBy(xpath="//div[starts-with(@class,'_1AtVbE')][2]//div[starts-with(@class,'_13oc-S')]/div/div/a")
	WebElement frstItm;
		
	//First Product Name 
	@FindBy(xpath="//div[starts-with(@class,'_1AtVbE')][2]//div[starts-with(@class,'_13oc-S')]/div/div/a/div[2]/div[1]/div[1]")
	WebElement frstItmNme;
		
	//Product Name
	@FindBy(xpath="//div[starts-with(@class,'_1AtVbE')]/div/div[1]/h1/span")
	WebElement prdtNme;
		
//	public sgnClsBtnn() {
//		return SgnClsBtnn;
//	}
//		
//	public WebElement sgnClsBtn() {
//		return sgnClsBtn;
//	}
//		
//	public WebElement flktTxt() {
//		return flipkartTxtLg;
//	}
//	
//	public flktTxtLogo() {
//		return flipkartTxtLogo;
//	}
//		
//	public WebElement srchBox() {
//		return srchBox;
//	}
//		
//	public WebElement srchIcon() {
//		return srchIcn;
//	}
//		
//	public List<WebElement> itmsCunt() {
//		return itemsCount;
//	}
//		
//	public WebElement frstItm() {
//		return frstItm;
//	}
//		
//	public WebElement frstPrdtNme() {
//		return frstItmNme;
//	}
//		
//	public WebElement prdtNme() {
//		return prdtNme;
//	}
//}
	
	
	public boolean isFlipkartLogoPresent() {
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/header/div[1]/div[1]/a[1]/img[1]"));
		String typevalue = logo.getAttribute("type");
		
		System.out.println(typevalue);
//		Boolean logo = flipkartlogo.isDisplayed();
//		if (logo == true) {
//			
//		}return true;
//			
//		}
		return true;
	}	
}

