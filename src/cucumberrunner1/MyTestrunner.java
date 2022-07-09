package cucumberrunner1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
//import com.cucumber.listener.Reporter;
//import managers.*;

//import Utility.utility;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//import dataProviders.ConfigFileReader;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/Fetaures"},
		glue = {"actualsteps"},
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		
//				
//				,"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"
//				com.cucumber.listener.ExtentCucumberFormatter:
		monochrome = true
//		,publish = true
		
		)

public class MyTestrunner {
	
//	@AfterClass
//	public static void writeExtentReport() {
////		Reporter.loadXMLConfig(utility.getvaluefrompropertyfile("reportConfigPath", System.getProperty("user.dir")+"/src/propertyfiles/config.properties"));
//		Reporter.loadXMLConfig(new File("C:/Users/Karun/eclipse-workspace/KarunaJune22firsttry/src/extent-config.xml"));
////		Reporter.loadXMLConfig(new File(""));
//	}
//	
	
	
	

}
