package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class SamsungClass extends BaseClass {

	
	@FindBy(xpath = "(//span[contains(text() , 'Samsung Galaxy M55s 5G')])[1]//ancestor::div[@data-cy='title-recipe']/following-sibling::div[2]//button")
	WebElement samsungM55s;
	
	@FindBy(xpath = "//a[@id='nav-cart']")
	WebElement addTocart;
	
	public SamsungClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getSamsungM55s() {
		samsungM55s.click();
		addTocart.click();
		
	}
	
}
