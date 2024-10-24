package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class HomePage extends BaseClass {

	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBox;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getSearchBox11(String mobile) {
		searchBox.sendKeys(mobile, Keys.ENTER);
		
			}
	public IphoneClass getSearchBox(String mobile) {
		searchBox.sendKeys(mobile, Keys.ENTER);
		
		return new IphoneClass(driver);
	}
	public SamsungClass getSearchBox2(String mobile) {
		searchBox.sendKeys(mobile, Keys.ENTER);
		return new SamsungClass(driver);
	}
}
