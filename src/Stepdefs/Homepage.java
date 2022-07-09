package Stepdefs;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	
	@FindBy(xpath="//*[@id='center_column']/h1")
	WebElement myaccount;
	

	WebDriver driver;


	public Homepage(WebDriver driver)
	{
		this.driver = driver;
		System.out.println(driver+"000000000000000");
		PageFactory.initElements(driver, this);
	}
	

	
	public  void verify_myaccount() throws IOException {
		Boolean karuna = myaccount.isDisplayed();
		System.out.println(karuna+"ooooooooo");
	}
	
	
	
	

}
