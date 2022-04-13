package COM.ddt;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadingDataFromExceTest {
	
	@Test
	public void ReadingDatafromPropertyExcel() throws Throwable
	{
		//Step-1 convert the physical file into java object
		FileInputStream fis=new FileInputStream("./Propertiesexcelfile.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		System.out.println("Hii");
		Sheet sh=book.getSheet("Sheet1");
		Row ro=sh.getRow(1);
		Cell ce=ro.getCell(2);
		String str=ce.getStringCellValue();
		System.out.println(str);
		

	}

}
