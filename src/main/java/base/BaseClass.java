package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.github.dockerjava.api.model.Driver;

import utils.UtilityClass;

public class BaseClass extends UtilityClass {

	@BeforeMethod
	public void startUp() {
	  launch();	
	}
	
	@AfterMethod
	public void tearDown() {
		closeBrowser();
	}
}
