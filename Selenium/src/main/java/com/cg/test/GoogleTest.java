package com.cg.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\artpatel\\Downloads\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver.get("https://www.facebook.com/");
//		
//		WebElement login = driver.findElement(By.name("email"));
//		
//		login.sendKeys("fake");
//		
//		WebElement pass = driver.findElement(By.name("pass"));
//		
//		pass.sendKeys("pass");
//		
//		
//		WebElement button = driver.findElement(By.id("u_0_b"));
//		
//		button.click();
		
		
//		WebElement search = driver.findElement(By.name("q"));
				
//		driver.get("http://www.google.com");
//		search.sendKeys("Artificial Intelligence");
		
//		search.submit();
//		driver.quit();
		
//		WebElement images = driver.findElement(By.linkText("Images"));
//		images.click(); 
		
		
		
		
		driver.get("https://filebin.net/");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement search = driver.findElement(By.id("fileField"));
		search.sendKeys("C:\\Users\\artpatel\\Downloads\\adminmenu.html");
		search.submit();
//		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://www.amazon.com/");
		search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Ice cream");
		search.submit();
		WebElement choc = driver.findElement(By.partialLinkText("Chocolate"));
		choc.click();
		WebElement specific = driver.findElement(By.partialLinkText("Ice Cubes"));
		specific.click();
		
		WebElement cart = driver.findElement(By.partialLinkText("Add to Cart"));
		cart.click();
		
		WebElement buy = driver.findElement(By.id("hlb-ptc-btn-native"));
		buy.click();
		
		WebElement name = driver.findElement(By.name("email"));
		name.sendKeys("arth.r.patel@gmail.com");
		name.submit();
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("password");
		pass.submit();
		
		
		
		
		
		
		
		
		
		
	}
}
