package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class utility {
	
	
	
	
	
	public String getenvironmentvariable()
	{
		String finalvalue = "";
		try {
			Class c1 = Class.forName(System.getProperty("user.dir")+"src/EnvironmentVariables/environmentvariable.java");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(runorder1);
		return finalvalue;
	}
	
	public static String getvaluefrompropertyfile(String key, String Path) {
		String finalvalue ="";
		try {
			Properties po = new Properties();
			File file = new File(Path);
			InputStream inp = new FileInputStream(file);
			po.load(inp);
			finalvalue = po.getProperty(key);
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return finalvalue;
		}

	

}
