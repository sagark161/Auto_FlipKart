package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPopUp {
	WebDriver driver;
	public LoginPopUp(WebDriver ldriver){
		this.driver = ldriver;		
	}
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']") WebElement close;
	
	public void closePopUp(){
		if(close.isDisplayed()){
		close.click();
		}
	}
}
