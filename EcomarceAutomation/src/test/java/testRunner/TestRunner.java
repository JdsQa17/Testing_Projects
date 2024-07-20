package testRunner;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utilities.CommonMethods;
import utilities.WindowHandler;
import utilities.logIn;

public class TestRunner {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		logIn log= new logIn();
		WebDriver driver1=log.LogIn();
		CommonMethods commonMethod = new CommonMethods(driver1);
		driver1.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("home appliances",Keys.ENTER);
		Thread.sleep(3000);
		WindowHandler winhandle= new WindowHandler();
		WebDriver driver3=winhandle.windowHandle(driver1, 1);
		int priceInt1=winhandle.price;
		
		winhandle.windowHandle(driver3, 6);
		int priceInt2=winhandle.price;
		int priceInt3=winhandle.cartPrice;
		
		
		
		
		
		Thread.sleep(2000);
		
		int comPrice= priceInt1+priceInt2;
		if(comPrice==priceInt3) {
			System.out.println("Total Price: Rs. "+priceInt3);
			System.out.println("Result- Successfull");
		}
		else {
			System.out.println("Total Price: Rs. "+priceInt3);
			System.out.println("Result- unSuccessfull");
			System.out.println("Please remove all items from cart and then run the program");
		}
		commonMethod.closeWindow();
		
		
	}
	

}

