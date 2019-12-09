package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPopUp {
	WebDriver driver;
	public LoginPopUp(WebDriver ldriver){
		this.driver = ldriver;		
	}
		
	public void closePopUp(){
		
		try{
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		}
		catch(NoSuchElementException e){
			System.out.println("No pop-up");
		}
	}
}
