package actualsteps;

import java.io.IOException;

import Base.base;
import Stepdefs.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;

public class loginpagesteps	 extends base {
	
	public static Loginpage getloginpage()
	{		
		Loginpage login = new Loginpage(driver);
		return login;		
	}
	
	@Given("Launch URL")
	public void Launch_URL() throws IOException {
		System.out.println("gggggggg");
		launchdriver();	
		getloginpage().launchbrowserandgetURL();
//		Thread.currentThread().getStackTrace()[2].g
//		login.launchbrowserandgetURL();
	}
	
	@And("User successfully logged in")
	public void login() throws IOException
	{
		getloginpage().login();
//		login.login();
	}
	
	
	
	
}
