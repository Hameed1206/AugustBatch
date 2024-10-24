package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class IphoneClass extends BaseClass {

	@FindBy(xpath = "(//span[text() = 'Apple iPhone 15 (128 GB) - Black'])[1]//ancestor::div[@data-cy='title-recipe']/following-sibling::div[2]//button")
	WebElement iphone15;
	
	@FindBy(xpath = "//span[text() = 'Apple iPhone 16 (128 GB) - Teal']//ancestor::div[@data-cy='title-recipe']/following-sibling::div[2]//button")
	WebElement iphone16;
	
	@FindBy(xpath = "(//span[text() = 'Apple iPhone 15 (128 GB) - Green'])[3]")
	WebElement iphone;
	
	public IphoneClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    public void getIphoneNew() {
    	iphone.click();
    }
	public void getIphone() {
		iphone15.click();
		iphone16.click();
		
	}
	
	
}
