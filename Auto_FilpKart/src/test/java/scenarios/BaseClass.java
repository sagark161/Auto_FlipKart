package scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import pages.BasePage;
import pages.BrowserRepository;
import pages.LoginPopUp;

public class BaseClass {
	public WebDriver driver;
	BasePage home;
	SoftAssert softAssert = new SoftAssert();
	
	@BeforeMethod
	public void setup(){
		driver = BrowserRepository.startAppliaction(driver, "chrome", "https://www.flipkart.com/");		
		home = PageFactory.initElements(driver, BasePage.class);
		LoginPopUp popUp = PageFactory.initElements(driver, LoginPopUp.class);		
		popUp.closePopUp();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
