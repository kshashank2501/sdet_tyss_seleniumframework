package COM.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutomationPractice {
	
	
	
	@Test
	public void automationtestscript() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C:\\Shaa-Selenium\\Selenium driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php");
		
		//Sign-in
		driver.findElement(By.cssSelector("a[title='Log in to your customer account']")).click();
		  driver.findElement(By.id("email_create")).sendKeys("kalyanshaan25@gmail.com");
		  driver.findElement(By.xpath("//i[@class='icon-user left']")).click();
		  Thread.sleep(3000);
		  
		  //Your Personal Information 
		 driver.findElement(By.xpath("//input[@type='radio']")).click();
		 driver.findElement(By.id("customer_firstname")).sendKeys("shashank");
		 driver.findElement(By.id("customer_lastname")).sendKeys("kalyankar");
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shaanraj527");
		 driver.findElement(By.id("days")).sendKeys("25");
		// driver.findElement(By.id("months")).sendKeys("01");
		 Thread.sleep(3000);

		 WebElement ele = driver.findElement(By.id("months"));
		 Select s1= new Select(ele);
		 s1.selectByIndex(01);
		 
		 WebElement ele1 = driver.findElement(By.id("years"));
		 Select s=new Select(ele1);
		 s.selectByIndex(25);
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		 //Your Addres
		 Thread.sleep(3000);
		 driver.findElement(By.id("company")).sendKeys("IBM");
		 driver.findElement(By.id("address1")).sendKeys("Streetno-1");
		 driver.findElement(By.id("address2")).sendKeys("house-4");
		 driver.findElement(By.id("city")).sendKeys("texas");
		 
		 WebElement ele2 = driver.findElement(By.id("id_state"));
		 Select s2=new Select(ele2);
		 s2.selectByIndex(10);
		 driver.findElement(By.id("postcode")).sendKeys("50006");
		 driver.findElement(By.id("other")).sendKeys("9030983509");
		 driver.findElement(By.id("phone")).sendKeys("100");
		 driver.findElement(By.id("phone_mobile")).sendKeys("108");
		 driver.findElement(By.id("alias")).sendKeys("usa");
		 driver.findElement(By.id("submitAccount")).click();
		 				
		 				
		 
		  
	}

}
