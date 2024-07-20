package utilities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logIn {
	public WebDriver LogIn() throws IOException, InterruptedException {

		PropertiesReader prop= new PropertiesReader();
		String browserName = prop.getBrowser();
		WebDriver driver = WebBrowserHelper.setDriver(browserName);
    
		
		String urlpage = prop.getUrl();
		
		
		driver.get(urlpage);
		

		Thread.sleep(3000);
		driver.findElement(By.cssSelector("._2IX_2-.VJZDxU[type='text']")).sendKeys("9735959425");
		driver.findElement(By.cssSelector("._2IX_2-._3mctLh.VJZDxU")).sendKeys("Joydeep@70315");
		driver.findElement( By.cssSelector("._2KpZ6l._2HKlqd._3AWRsL")).click();
		Thread.sleep(3000);
		return driver;
	}
}
