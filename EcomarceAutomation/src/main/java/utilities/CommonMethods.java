package utilities;

import org.openqa.selenium.WebDriver;

public class CommonMethods {
	private WebDriver driver;
	
	public CommonMethods(WebDriver driver) {
		this.driver=driver;
	}
	
	public void closeWindow() {
		driver.close();
		driver.quit();
	}
	
	

}
