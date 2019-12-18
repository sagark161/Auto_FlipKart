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
			ClassLoader classloader = getClass().getClassLoader();
			File f = new File(classloader.getResource("SearchQueries.xlsx").getFile());
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet s = wb.getSheet("Sheet1");
			for(int i=(s.getFirstRowNum()+1); i<=s.getLastRowNum();i++){
			Row r = s.getRow(i);
			String query = r.getCell(1).getStringCellValue();
			home.searchProduct(query);
			}
		} catch (Exception e) {
			//System.out.println("Failed to read excel");
			System.out.println(e.getMessage());			
		}
	}
}
