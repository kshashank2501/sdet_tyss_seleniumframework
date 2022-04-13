package COM.ddt;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadingDatafromjsontest {
	
	@Test
	public void readingdatajson() throws Throwable
	{
		//Step-1 converting json file into json object
		FileReader fr=new FileReader("./Mine.json");
		
		//Step 2 jason object to java object by using jsonparser(comes from json dependency)
		JSONParser jp=new JSONParser();
		Object jobj=jp.parse(fr);
		
		//Step3 read the data by upcasting hashmap
		HashMap hm=(HashMap)jobj;
		String value = (String) hm.get("status");
		System.out.println(value);
	}

}
