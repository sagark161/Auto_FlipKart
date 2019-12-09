package scenarios;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.MobilesPage;

public class Scenario1 extends BaseClass {
		
	@Test(priority=1)
	public void pageTitle(){
		softAssert.assertTrue(home.pageTitle().equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
		softAssert.assertAll();
	}	
	@Test(priority=2)
	public void menubarClick(){
		MobilesPage mobilesPage = PageFactory.initElements(driver, MobilesPage.class);
		home.hoverAndClick();
		Assert.assertEquals("Mi Mobiles", mobilesPage.getCategory());
	}
}
