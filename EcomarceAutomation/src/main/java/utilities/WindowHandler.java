package utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowHandler {
	
	public int price,cartPrice;
	
	public WebDriver windowHandle(WebDriver driver, int eleNum) throws InterruptedException {
		
		Thread.sleep(3000);
		String xpathVal="(//a[@class='s1Q9rs'])["+eleNum+"]";
		driver.findElement(By.xpath(xpathVal)).click();
		
		
		
		Thread.sleep(2000);
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String pWindow= iterator.next();
		String cWindow= iterator.next();
		
		driver.switchTo().window(cWindow);
		
		String price1= driver.findElement(By.cssSelector("._30jeq3._16Jk6d")).getText().toString();
		int priceInt1 = Integer.parseInt(price1.replaceAll("[^0-9]", ""));
		this.price=priceInt1;
		System.out.println("Price of No."+eleNum+" selected product: " +priceInt1);
		
		driver.findElement(By.cssSelector("._2KpZ6l._2U9uOA._3v1-ww")).click();
		Thread.sleep(2000);
		String price2= driver.findElement(By.cssSelector("div[class='Ob17DV _3X7Jj1'] span")).getText().toString();
		int priceInt2 = Integer.parseInt(price2.replaceAll("[^0-9]",""));
		this.cartPrice=priceInt2;
		Thread.sleep(4000);
		driver.close();					//error(Websocket related error) is coming here only in firefox browser. No error is coming in Chrome
		driver.switchTo().window(pWindow);
		
		return driver;
		
		
		
	}
	
	

}
