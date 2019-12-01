package pages;

import org.openqa.selenium.WebDriver;

public class BrowserRepository {
	WebDriver driver;
	
	public BrowserRepository(WebDriver driver){
		this.driver = driver;
	}
}
