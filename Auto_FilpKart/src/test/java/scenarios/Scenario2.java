package scenarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.*;

public class Scenario2 extends BaseClass{
	@Test
	public void testSearch(){
		//home.searchProduct("shoes");		
		try {
			File f = new File("SearchQueries.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet s = wb.getSheet("Sheet1");
			Row r = s.getRow(3);
			System.out.println(r.getCell(2).getStringCellValue());
		} catch (Exception e) {
			//System.out.println("Failed to read excel");
			System.out.println(e.getMessage());;			
		}
	}
}
