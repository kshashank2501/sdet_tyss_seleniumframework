package COM.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Shaa-Selenium\\Selenium driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
	//	driver.findElement(((Object) By.id("username")).sendkeys("admin",Keys.TAB,"admin",Keys.TAB,Keys.SPACE,Keys.ENTER));

	}

}
