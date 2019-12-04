package scenarios;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.BrowserRepository;
import pages.LoginPopUp;

public class ToTest extends BaseClass{

	@Test
	public void test1(){
		BasePage basePage = PageFactory.initElements(driver, BasePage.class);
		basePage.hoverAndClick();
	}

}
