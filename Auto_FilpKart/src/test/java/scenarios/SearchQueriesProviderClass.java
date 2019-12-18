package scenarios;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.*;

public class SearchQueriesProviderClass {
	
	@DataProvider(name = "SearchQueriesProvider")
	public static Object[][] SearchQueriesProvider() {
		return new Object[][]{{"Shoes"}};
	}
}
