package COM.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class bluestone {
	
	
	@Test
	public void BlueStone() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C:\\Shaa-Selenium\\Selenium driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bluestone.com/");
		WebElement ele=driver.findElement(By.xpath("//a[text()='Rings ']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='Diamond Rings']")).click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		
		driver.findElement(By.xpath("//span[text()=' Popular ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();
		//driver.findElement(By.className("link-overlay")).click();
		//WebElement we=driver.findElement(By.id("discountedPriceSpan"));
		//System.out.println(we);
		
		//WebElement ele = driver.findElement(By.xpath("//a[text()='Rings ']"));
		//ele.click();
		//Actions act=new Actions(driver);
		//act.moveToElement(ele).perform();
		
		//Thread.sleep(3000);

	//driver.findElement(By.xpath("//a[text()='Diamond Rings']")).click();
		//String defaultprice = driver.findElement(By.id("discountedPriceSpan")).getText();
		  //WebElement ele1 = driver.findElement(By.xpath("//section[@class='block sort-by pull-right']"));	
			// act.moveToElement(ele1).perform();
			  //driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();
		  
		//driver.findElement(By.className("hc img-responsive center-block")).getText();
		
			
			 
		
	}

}
