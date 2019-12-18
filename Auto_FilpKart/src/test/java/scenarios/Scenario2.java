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
	@Test(dataProvider="SearchQueriesProvider", dataProviderClass=SearchQueriesProviderClass.class)
	public void testSearch(String query){
		home.searchProduct(query);
	}
}
