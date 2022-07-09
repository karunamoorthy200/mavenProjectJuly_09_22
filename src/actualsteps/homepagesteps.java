package actualsteps;

import java.io.IOException;

import Base.base;
import Stepdefs.Homepage;
import io.cucumber.java.en.And;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;

public class homepagesteps extends base {
	
	Homepage homepage= new Homepage(driver);
	
	@And("Verify the my account is displayed")
	public void Launch_URL() throws IOException {
		System.out.println("vvvvvvvv");
//		launchdriver();	
//		getloginpage().launchbrowserandgetURL();
		homepage.verify_myaccount();
	}

}
