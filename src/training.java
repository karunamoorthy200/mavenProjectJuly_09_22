import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class training {
	
	
	public static void main(String [] args) throws InterruptedException, IOException
	{
		String path= "C:\\Users\\Karun\\eclipse-workspace\\KarunaJune22firsttry\\src\\runorders\\datafetch.xlsx";
		FileInputStream ip = new FileInputStream(path);eeeeeeeeeeeeee
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		XSSFSheet sheet1 = wb.getSheet("Sheet1");
		WebDriverManager.chromedriver().setup();eeeeeeeeeeeeeeeeeeeeeeee
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();eeeeeee
		driver.get("https://www.naukri.com/");		
		Thread.sleep(2000);rrrrrrrrrrrrrrrrreeeeeeeeeeeeeeeeeee
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);eeeeeeeeeeee
		driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("karunamoorthy200@gmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'password')]")).sendKeys("@Karuna200@");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Jobs' and @class ='mTxt']")).click();
		ArrayList<String> newsessionid = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(newsessionid.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'qp' and @class = 'sugInp']")).seneeeeeeeeedKeys("selenium");
		driver.findElement(By.xpath("//input[@name = 'ql' and @class = 'sugInp w135']")).sendKeys("chennai");
		driver.findElement(By.xpath("//button[@id ='qsbFormBtn']")).click();
		Thread.sleep(2000);eeeeeeeeeeee
		driver.findElement(By.xpath("//p[text()='Recommended']")).click();
		driver.findElement(By.xpath("//li[text()='Date']")).click();
	
		
		for(int i=1;i<=10;i++)
		{
			Thread.sleep(3000);	
			for(int j=1;j<=20;j++)
			{
				try
				{
//					Thread.sleep(5000);
					String jobheader = "";
					String compamnyname ="";
					String Experience= "";
					String description= "";
					String daysago= "";
					String skill= "";
					String link="";
					try{jobheader = driver.findElement(By.xpath("(//div[@class='jobTupleHeader']/div/a[1])["+j+"]")).getText();}catch(Exception e){System.out.println(e);}
					try{link = driver.findElement(By.xpath("(//div[@class='jobTupleHeader']/div/a[1])["+j+"]")).getAttribute("href");}catch(Exception e){System.out.println(e);}
					try{compamnyname = driver.findElement(By.xpath("(//div[@class='jobTupleHeader']/div/a[1]/following-sibling::div)["+j+"]")).getText();}catch(Exception e){System.out.println(e);}
					try{Experience= driver.findElement(By.xpath("(//div[@class='jobTupleHeader']/div/a[1]/following-sibling::ul)["+j+"]")).getText();}catch(Exception e){System.out.println(e);}
					try{description= driver.findElement(By.xpath("(//div[@class='jobTupleHeader']/following-sibling::div[1])["+j+"]")).getText();}catch(Exception e){System.out.println(e);}
					try{daysago= driver.findElement(By.xpath("(//div[@class='jobTupleHeader']/following-sibling::div[2])["+j+"]")).getText();}catch(Exception e){System.out.println(e);}
					try{skill= driver.findElement(By.xpath("(//div[@class='jobTupleHeader'])["+j+"]/following-sibling::ul")).getText();}catch(Exception e){System.out.println(e);}
					System.out.println(j+20*(i-1));
					XSSFRow row = sheet1.createRow(j+20*(i-1));
					Cell cell1= row.createCell(0);
					cell1.setCellValue(jobheader);
					Cell cell2= row.createCell(1);
					cell2.setCellValue(compamnyname);
					Cell cell3= row.createCell(2);
					cell3.setCellValue(Experience);
					Cell cell4= row.createCell(3);
					cell4.setCellValue(description);
					Cell cell5= row.createCell(4);
					cell5.setCellValue(daysago);
					Cell cell6= row.createCell(5);
					cell6.setCellValue(skill);	
					Cell cell7= row.createCell(6);
					cell7.setCellValue(link);
				
					if(j==20)
					{
						driver.findElement(By.xpath("//span[text()='Next']")).click();
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
			}
			System.out.println("karuna");
		}
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		wb.close();
		fos.close();
			
		
	}

//	private static void extractDatAndStoreinExcel() {
//		
//		
//	}

}
