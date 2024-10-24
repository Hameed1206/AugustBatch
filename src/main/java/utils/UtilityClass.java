package utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {

	public static WebDriver driver;
	public static void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public static String captureScreenshot() throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		File file = tk.getScreenshotAs(OutputType.FILE);
		//long timeMillis = System.currentTimeMillis();
		//String title = driver.getTitle();
		//String snapPath = "C:\\Users\\91936\\eclipse-workspace\\CURA_Healthcare_Service\\Snaps\\"+title+"-"+timeMillis+".jpg";
		String path = "C:\\Users\\91936\\eclipse-workspace\\TestNextGen\\Reports\\snap.jpg";
		File path1 = new File(path);
		Files.copy(file, path1);
		return path;
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
}
