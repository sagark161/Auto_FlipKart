package scenarios;

import org.testng.annotations.*;

public class Scenario1 extends BaseClass {
		
	@Test(priority=1)
	public void pageTitle(){
		softAssert.assertTrue(home.pageTitle().equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
		softAssert.assertAll();
	}
	@BeforeGroups("MobilePages")
	public void mobilesPageInit(){
		System.out.println("Before groups executed");
	}
	
	@Test(priority=2,groups={"MobilePages"})
	public void menuBarClick(){
		home.hoverAndClick();
	}
	
}
