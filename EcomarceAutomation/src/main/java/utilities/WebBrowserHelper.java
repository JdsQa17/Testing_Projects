package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebBrowserHelper{


	public static WebDriver setDriver(String browserName) throws IOException {
		
		WebDriver driver = null;
		switch(browserName) {
		case "firefox" :
			WebDriverManager.firefoxdriver().driverVersion("97.0.1").setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
			
		}

		return driver;
		
	}
}
	

