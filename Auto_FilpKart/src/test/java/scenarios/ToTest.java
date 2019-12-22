package scenarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.BrowserRepository;
import pages.LoginPopUp;

public class ToTest {
	@Test
	public static void test1() {
		String s = "Showing 1 – 40 of 12,05,193 results for \"shoes\"";
		String[] splitted = s.split("\\s",7);
		for (String str : splitted) {
			System.out.print(str+"**");
		}
		System.out.println();
		int n = splitted.length;
		System.out.println(splitted[n-2]);
	}
}
