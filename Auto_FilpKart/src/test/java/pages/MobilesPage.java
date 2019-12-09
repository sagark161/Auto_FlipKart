package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobilesPage extends BasePage{
	public MobilesPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h1[contains(text(),'Mobiles')]") WebElement catTitle;
	
	public String getCategory(){
		String cat_title = catTitle.getText();
		cat_title = cat_title.trim();
		return cat_title;
	}
}
