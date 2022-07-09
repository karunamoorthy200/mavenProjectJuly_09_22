package Base;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	public static WebDriver driver;
	
	
	
	
	public String readconfigfile(String key) throws IOException
	{
		String finalvalue="";
		File file = new File("C:\\Users\\Karun\\eclipse-workspace\\KarunaJune22firsttry\\src\\propertyfiles\\config.properties");
		InputStream ip = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(ip);	
		finalvalue=prop.getProperty(key);
		return finalvalue;
	}


	public void launchdriver() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("11111111134511EEEEEEEEE11eeeeeeeeee111111"+driver);
	}
	
	
	
	
	 

	
	
	
	
	
	
	

}
