package scenarios;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.*;

public class SearchQueriesProviderClass {
	static FileInputStream fis;
	static Workbook wb;
	static Sheet s;
	static Row r;
	static int j = 0;
	@DataProvider(name = "SearchQueriesProvider")
	public static Object[][] SearchQueriesProvider() {
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\SearchQueries1.xlsx";
		File f = new File(path);
		System.out.println(path+"\\src\\main\\java\\SearchQueries1.xlsx");
		try {
			fis = new FileInputStream(f);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		s = wb.getSheet("Sheet1");
		System.out.println(s.getLastRowNum());
		Object[][] data_arr = new Object[s.getLastRowNum()-s.getFirstRowNum()][1] ;
		
		for(int i=(s.getFirstRowNum()+1); i<=s.getLastRowNum(); i++){
			r = s.getRow(i);
			data_arr[j][0] = r.getCell(1).getStringCellValue();
			j++;
		}
		return data_arr;
	}
	
}
