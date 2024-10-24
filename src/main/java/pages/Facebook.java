package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class Facebook extends BaseClass {

	@FindBy(id = "email")
	WebElement user;
	
	@FindBy(id = "pass")
	WebElement passw;
	
	public Facebook(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getUser(String s, String s1) {
		user.sendKeys(s);
		passw.sendKeys(s1);
		
	}
	
}
