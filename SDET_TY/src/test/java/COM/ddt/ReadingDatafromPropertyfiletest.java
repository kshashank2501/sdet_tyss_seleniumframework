package COM.ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingDatafromPropertyfiletest {

	@Test
	public void readdatafrompropertyfile() throws Throwable
	{
		FileInputStream fis= new FileInputStream("./Common.properties");
		//create object for properties class & load the file 
		Properties p=new Properties();
		p.load(fis);
		//Step=3 read the common dta 
		String url=p.getProperty("url");
	String username=p.getProperty("un");
		String password=p.getProperty("pwd");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);

	}

}
