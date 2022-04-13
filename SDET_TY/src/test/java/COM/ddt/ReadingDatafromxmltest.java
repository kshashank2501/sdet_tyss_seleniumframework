package COM.ddt;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadingDatafromxmltest {
	
	@Test()
	
	public void readingdatafromxmltest(XmlTest xml)//xmlTest comes from Testng
	{
		String url = xml.getParameter("URL");
		String un = xml.getParameter("UN");
		String password = xml.getParameter("PWD");
		
		System.out.println(url);
		System.out.println(un);
		System.out.println(password);
		   
		
	}

}
