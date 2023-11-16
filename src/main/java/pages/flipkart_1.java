package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class flipkart_1 {

	WebDriver driver;
	public flipkart_1(WebDriver driver) {
		this.driver=driver;
	}
	
	public boolean isElementPresent(WebDriver driver, By by){
		  try{
			  driver.findElement(by);
		    return true;
		  }catch(Throwable t){
		    return false;
		  }
		}
}