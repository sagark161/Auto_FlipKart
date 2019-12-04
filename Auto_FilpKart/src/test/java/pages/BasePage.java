package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	
	WebDriver driver;
	Actions act;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath="//span[text()='Electronics']") WebElement electronics;
	@FindBy(xpath="//a[@title='Mi'][contains(@href,'mobiles')]") WebElement mi;
	@FindBy(xpath="//a[@title='LG'][contains(@href,'television')]") WebElement lg;
	
	public void hoverAndClick(){
		act = new Actions(driver);
		act.moveToElement(electronics).perform();
		mi.click();
	}
	
	public String pageTitle(){
		return driver.getTitle();
	}
}
