package Stepdefs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.base;
//import DriverInitiation.driverfactory;
import Utility.utility;
//import cucumber.api.java.en.And;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
//import cucumber.api.java.en.Given;

public class Loginpage extends base{


	@FindBy(name="q")
	WebElement first;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="passwd")
	WebElement Password;
	
	@FindBy(id="SubmitLogin")
	WebElement btnlogin;
	

	WebDriver driver;


	public Loginpage(WebDriver driver)
	{
		this.driver = driver;
		System.out.println(driver+"000000000000000");
		PageFactory.initElements(driver, this);
	}
	

	
	public  void launchbrowserandgetURL() throws IOException {
		driver.get(readconfigfile("URL"));
	}
	
	
	public void login() throws IOException
	{
		email.sendKeys(readconfigfile("username"));
		Password.sendKeys(readconfigfile("password"));
		btnlogin.click();
	}




}
