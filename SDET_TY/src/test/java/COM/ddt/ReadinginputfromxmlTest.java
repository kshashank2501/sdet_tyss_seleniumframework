package COM.ddt;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadinginputfromxmlTest {
	@Test
	public void readinginputfromxlfile() throws Throwable
	{
		File f=new File("C:\\Users\\Kalyankar Shashank\\eclipse-workspace\\SDET_TY\\Propertiesexcelfile.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		
		String cellvalue00=sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellvalue00+" ");
		
		String cellvalue10=sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(cellvalue10);
		
		String cellvalue01=sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(cellvalue01+" ");
		
		String cellvalue11=sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(cellvalue11);
		
		String cellvalue02=sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(cellvalue02+" ");
		
		long cellvalue12=(long) sh.getRow(1).getCell(2).getNumericCellValue();
		System.out.println(cellvalue12);
		
		wb.close();
		fis.close();
		
		
		
	}

}
