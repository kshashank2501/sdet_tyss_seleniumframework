package COM.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class autoPractice {
	@Test
	public void autpractice() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Shaa-Selenium\\Selenium driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/");
		
		
		//login
		driver.findElement(By.cssSelector("a[title='Log in to your customer account']")).click();
		driver.findElement(By.id("email")).sendKeys("kalyanshaan25@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("shaanraj527");
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']")).click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		driver.switchTo().alert().dismiss();
	}

}
